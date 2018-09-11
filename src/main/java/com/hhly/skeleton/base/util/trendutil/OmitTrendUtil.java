package com.hhly.skeleton.base.util.trendutil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.springframework.util.CollectionUtils;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.util.ClassUtil;
import com.hhly.skeleton.base.util.NumberUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 遗漏走势工具类
 * @author huangb
 * @date 2017年3月9日
 * @company 益彩网络
 * @version v1.0
 */
public class OmitTrendUtil {

	/**
	 * 出现次数-字段名
	 */
	public static final String OCC_TIMES = "occTimes";
	/**
	 * 平均遗漏-字段名
	 */
	public static final String AVG_MISS = "avgMiss";
	/**
	 * 最大遗漏
	 */
	public static final String MAX_MISS = "maxMiss";
	/**
	 * 最大连续
	 */
	public static final String MAX_CONT = "maxCont";


	private static Logger logger = Logger.getLogger(OmitTrendUtil.class);

	/**
	 * @desc 彩种公共方法，通过类反射机制获取各种遗漏走势汇总信息:出现总次数/平均遗漏值
	 * @author huangb
	 * @date 2017年3月8日
	 * @param trendList
	 *            遗漏走势数据列表
	 * @param cls
	 *            具体彩种走势的类
	 * @return 彩种公共方法，获取遗漏走势汇总信息:出现总次数/平均遗漏值
	 * @throws Exception
	 */
	public static Map<String, TrendBaseBO> getTrendTotalInfo(List<TrendBaseBO> trendList, Class<?> cls)
			throws Exception {

		if (null == trendList || trendList.isEmpty()) {
			return null;
		}
		// 各统计信息
		Map<String, TrendBaseBO> totalMap = new HashMap<String, TrendBaseBO>();
		// 统计出现次数
		TrendBaseBO occTimes = (TrendBaseBO) cls.newInstance();
		// 统计平均遗漏
		TrendBaseBO avgMiss = (TrendBaseBO) cls.newInstance();
		// 统计最大遗漏
		TrendBaseBO maxMiss = (TrendBaseBO) cls.newInstance();
		//上次遗漏与统计期数无关，直接读取“trend_彩种_result表”
		//TrendBaseBO preMiss = (TrendBaseBO) cls.newInstance();
		totalMap.put(OCC_TIMES, occTimes);
		totalMap.put(AVG_MISS, avgMiss);
		totalMap.put(MAX_MISS, maxMiss);

		// 对应彩种遗漏数据的字段
		Field[] fields = cls.getDeclaredFields();
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		// 字段map化,剔除非int类型的字段并给统计对象初始化
		for (Field field : fields) {
			if (!field.getGenericType().toString().equals("class java.lang.Integer")
					&& !field.getGenericType().toString().equals("int")) {
				continue;
			}
			fieldMap.put(field.getName(), field);
			setField(occTimes, field, 0);
			setField(avgMiss, field, 0);
			setField(maxMiss, field, 0);
		}
		// 由于listBO可能涉及升序和降序，所以统一处理为升序方便处理
		long firstIssue = 0L;
		long lastIissue = 0L;
		if (!StringUtil.isBlank(trendList.get(0).getIssue())) {
			firstIssue = Long.parseLong(trendList.get(0).getIssue());
			lastIissue = Long.parseLong(trendList.get(trendList.size() - 1).getIssue());
		}
		if (firstIssue > lastIissue) {
			Collections.reverse(trendList);
		}
		// 遍历并填充数据
		TrendBaseBO tmpBO = null;
		TrendBaseBO tmpPreBO = null;
		for (int i = 0; i < trendList.size(); i++) {
			// 当前遍历对象
			tmpBO = trendList.get(i);
			// 上一个对象
			if (i > 0) {
				tmpPreBO = trendList.get(i - 1);
			}
		
			for (Entry<String, Field> entry : fieldMap.entrySet()) {
				// 当前对象字段值与上一个对象字段值
				Integer val = getField(tmpBO, entry.getValue());
				if (val == null) {
					continue;
				}
				Integer preVal = Constants.NUM_0;// 上一个对象字段值
				if (null != tmpPreBO) {
					preVal = getField(tmpPreBO, entry.getValue());
					preVal = (preVal == null) ? 0 : preVal;
				}
				if (val.intValue() == 0) {
					// occTimes统计-1：如果为0表示出现，则出现次数+1
					Integer curTimes = getField(occTimes, entry.getValue());
					setField(occTimes, entry.getValue(), ++curTimes);

					// avgMiss统计-1：如果为0表示遗漏统计数要加上上一次的值
					Integer curMiss = getField(avgMiss, entry.getValue());
					setField(avgMiss, entry.getValue(), curMiss + preVal);
					
			
					
				} else {
					// avgMiss统计-2：如果为最后一期，且最后一期未遗漏，则遗漏统计数也要加上当期的遗漏值
					if (i == trendList.size() - 1) {
						Integer curMiss = getField(avgMiss, entry.getValue());
						setField(avgMiss, entry.getValue(), curMiss + val);
					}
					// maxMiss统计-1：如果当期遗漏数更大，则保存当期为最大遗漏
					Integer curMaxMiss = getField(maxMiss, entry.getValue());
					if(curMaxMiss.intValue() < val.intValue()) {
						setField(maxMiss, entry.getValue(), val);
					}
					
				}
			}
		}
		// avgMiss统计-3：第二步已计算出统计期内的总遗漏数,然后根据公式计算平均遗漏，公式：平均遗漏＝统计期内的总遗漏数/(出现次数+1)
		for (Entry<String, Field> entry : fieldMap.entrySet()) {
			// 字段总遗漏数
			Integer totalMisses = getField(avgMiss, entry.getValue());
			// 字段总出现数
			Integer totalTimes = getField(occTimes, entry.getValue());
			Double avg = Math.floor(totalMisses / (totalTimes + 1));
			setField(avgMiss, entry.getValue(), avg.intValue()); // 平均数截取int
		}
		return totalMap;
	}

	/**
	 * 区别getTrendTotalInfo,此种统计中包含对最大连出的统计
	 * @desc 
	 * @create 2018年3月31日
	 * @param trendList
	 * @param cls
	 * @return
	 * @throws Exception Map<String,TrendBaseBO>
	 */
	public static Map<String, TrendBaseBO> getTrendTotalInfoWithinLC(List<TrendBaseBO> trendList, Class<?> cls)
			throws Exception {

		if (null == trendList || trendList.isEmpty()) {
			return null;
		}
		// 各统计信息
		Map<String, TrendBaseBO> totalMap = new HashMap<String, TrendBaseBO>();
		// 统计出现次数
		TrendBaseBO occTimes = (TrendBaseBO) cls.newInstance();
		// 统计平均遗漏
		TrendBaseBO avgMiss = (TrendBaseBO) cls.newInstance();
		// 统计最大遗漏
		TrendBaseBO maxMiss = (TrendBaseBO) cls.newInstance();
		// 统计最大连出
		TrendBaseBO maxCont = (TrendBaseBO) cls.newInstance();
		// 统计当前最大连出
		TrendBaseBO curMaxCont = (TrendBaseBO) cls.newInstance();
		//上次遗漏与统计期数无关，直接读取“trend_彩种_result表”
		//TrendBaseBO preMiss = (TrendBaseBO) cls.newInstance();
		totalMap.put(OCC_TIMES, occTimes);
		totalMap.put(AVG_MISS, avgMiss);
		totalMap.put(MAX_MISS, maxMiss);
		totalMap.put(MAX_CONT, maxCont);

		// 对应彩种遗漏数据的字段
		Field[] fields = cls.getDeclaredFields();
		Map<String, Field> fieldMap = new HashMap<String, Field>();
		// 字段map化,剔除非int类型的字段并给统计对象初始化
		for (Field field : fields) {
			if (!field.getGenericType().toString().equals("class java.lang.Integer")
					&& !field.getGenericType().toString().equals("int")) {
				continue;
			}
			fieldMap.put(field.getName(), field);
			setField(occTimes, field, 0);
			setField(avgMiss, field, 0);
			setField(maxMiss, field, 0);
			setField(maxCont, field, 0);
			setField(curMaxCont, field, 0);
		}
		// 由于listBO可能涉及升序和降序，所以统一处理为升序方便处理
		long firstIssue = 0L;
		long lastIissue = 0L;
		if (!StringUtil.isBlank(trendList.get(0).getIssue())) {
			firstIssue = Long.parseLong(trendList.get(0).getIssue());
			lastIissue = Long.parseLong(trendList.get(trendList.size() - 1).getIssue());
		}
		if (firstIssue > lastIissue) {
			Collections.reverse(trendList);
		}
		// 遍历并填充数据
		TrendBaseBO tmpBO = null;
		TrendBaseBO tmpPreBO = null;
		for (int i = 0; i < trendList.size(); i++) {
			// 当前遍历对象
			tmpBO = trendList.get(i);
			// 上一个对象
			if (i > 0) {
				tmpPreBO = trendList.get(i - 1);
			}
		
			for (Entry<String, Field> entry : fieldMap.entrySet()) {
				// 当前对象字段值与上一个对象字段值
				Integer val = getField(tmpBO, entry.getValue());
				if (val == null) {
					continue;
				}
				Integer preVal = Constants.NUM_0;// 上一个对象字段值
				if (null != tmpPreBO) {
					preVal = getField(tmpPreBO, entry.getValue());
					preVal = (preVal == null) ? 0 : preVal;
				}
				if (val.intValue() == 0) {
					// occTimes统计-1：如果为0表示出现，则出现次数+1
					Integer curTimes = getField(occTimes, entry.getValue());
					setField(occTimes, entry.getValue(), ++curTimes);

					// avgMiss统计-1：如果为0表示遗漏统计数要加上上一次的值
					Integer curMiss = getField(avgMiss, entry.getValue());
					setField(avgMiss, entry.getValue(), curMiss + preVal);
					
					// curCont统计：如果为0表示遗漏统计中当前最大连出数值+1
					Integer curCont = getField(curMaxCont, entry.getValue());
					setField(curMaxCont, entry.getValue(), ++curCont);
					Integer maxContNum = getField(maxCont, entry.getValue());
					if(maxContNum<curCont){
						setField(maxCont, entry.getValue(), curCont);
					}
				} else {
					// avgMiss统计-2：如果为最后一期，且最后一期未遗漏，则遗漏统计数也要加上当期的遗漏值
					if (i == trendList.size() - 1) {
						Integer curMiss = getField(avgMiss, entry.getValue());
						setField(avgMiss, entry.getValue(), curMiss + val);
					}
					// maxMiss统计-1：如果当期遗漏数更大，则保存当期为最大遗漏
					Integer curMaxMiss = getField(maxMiss, entry.getValue());
					if(curMaxMiss.intValue() < val.intValue()) {
						setField(maxMiss, entry.getValue(), val);
					}
					//  如果遗漏不为0,那么当前最大连出置0
					setField(curMaxCont, entry.getValue(), 0);
				}
			}
		}
		// avgMiss统计-3：第二步已计算出统计期内的总遗漏数,然后根据公式计算平均遗漏，公式：平均遗漏＝统计期内的总遗漏数/(出现次数+1)
		for (Entry<String, Field> entry : fieldMap.entrySet()) {
			// 字段总遗漏数
			Integer totalMisses = getField(avgMiss, entry.getValue());
			// 字段总出现数
			Integer totalTimes = getField(occTimes, entry.getValue());
			Double avg = Math.floor(totalMisses / (totalTimes + 1));
			setField(avgMiss, entry.getValue(), avg.intValue()); // 平均数截取int
		}
		return totalMap;
	}
	/**
	 * @desc 设置目标对象对应字段的set值
	 * @author huangb
	 * @date 2017年3月9日
	 * @param target
	 *            目标对象
	 * @param field
	 *            字段
	 * @param fieldValue
	 *            字段值
	 * @param checkType
	 *            是否验证类型
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws Exception
	 */
	private static <T, B> void setField(T target, Field field, B fieldValue, boolean checkType)
			throws Exception {
		// 字段类型与B对应
		if (checkType) {
			if (!field.getGenericType().toString().equals(fieldValue.getClass().toString())) {
				return;
			}
		}
		Method m = target.getClass().getMethod("set" + getMethodName(field.getName()), field.getType());
		m.invoke(target, fieldValue);
	}

	private static <T, B> void setField(T target, Field field, B fieldValue)
			throws Exception {
		setField(target, field, fieldValue, true);
	}
	
	/**
	 * @desc 获取目标对象对应字段的get值
	 * @author huangb
	 * @param <B>
	 * @date 2017年3月9日
	 * @param target
	 *            目标对象
	 * @param field
	 *            目标字段
	 * @param cls
	 *            返回的字段类型
	 * @param checkType
	 *            是否验证类型
	 * @return 获取目标对象对应字段的get值
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private static <T, B> B getField(T target, Field field, Class<B> cls, boolean checkType)
			throws Exception {
		// 字段类型是B,对应cls类型
		if (checkType) {
			if (!field.getGenericType().toString().equals(cls.toString())) {
				return null;
			}
		}
		Method m = target.getClass().getMethod("get" + getMethodName(field.getName()));
		return (B) m.invoke(target);
	}

	private static <T> Integer getField(T target, Field field)
			throws Exception {
		return getField(target, field, Integer.class, true);
	}

	/**
	 * @desc 对象中是否包含指定字段的get方法
	 * @author huangb
	 * @param <T>
	 * @date 2017年3月9日
	 * @param target
	 *            目标对象
	 * @param field
	 *            字段对象
	 * @return 对象中是否包含指定字段
	 */
	private static <T> boolean containGetMethod(T target, Field field) {
		try {
			Method m = target.getClass().getMethod("get" + getMethodName(field.getName()));
            return null != m;
        } catch (Exception e) {
			return false;
		}
	}

	/**
	 * @desc 获取字段对应的方法名
	 * @author huangb
	 * @date 2017年3月9日
	 * @param fildeName
	 *            字段名
	 * @return 获取字段对应的方法名
	 */
	private static String getMethodName(String fildeName) {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}

	/**
	 * @desc 计算出号概率（出号概率=号码当前遗漏值/号码历史平均遗漏值）
	 * @author huangb
	 * @date 2017年3月9日
	 * @param curMiss
	 *            当前遗漏值
	 * @param avgMiss
	 *            平均遗漏值
	 * @param cls
	 *            具体出号概率的类型
	 * @return 计算出号概率（出号概率=号码当前遗漏值/号码历史平均遗漏值）
	 * @throws Exception
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	public static TrendBaseBO getProbability(TrendBaseBO curMiss, TrendBaseBO avgMiss, Class<?> cls)
			throws Exception {
		if (null == curMiss || null == avgMiss) {
			return null;
		}
		// 统计出号概率
		TrendBaseBO probability = (TrendBaseBO) cls.newInstance();
		// 对应彩种需要计算概率数据的字段
		Field[] fields = curMiss.getClass().getDeclaredFields();
		for (Field field : fields) {
			// 如果标记为"忽略"，则不参与计算
			if(field.isAnnotationPresent(TrendIgnore.class))
				continue;
			// 如果当前遗漏值和平均遗漏值中都包含该字段，则计算该字段的概率
			if (containGetMethod(curMiss, field) && containGetMethod(avgMiss, field)) {
				Integer curMissVal = getField(curMiss, field);
				Integer avgMissVal = getField(avgMiss, field);
				if(null == curMissVal || null == avgMissVal) {
					setField(probability, field, Constants.NUM_0, false);   // 20170907 为0的情况直接处理
				} else {
					// 由于概率是小数（乘以100，保存为整数），所以这里不验证类型获取值
					BigDecimal val = NumberUtil.div(curMissVal, avgMissVal, 2, BigDecimal.ROUND_HALF_DOWN)
							.multiply(new BigDecimal(Constants.NUM_100));
					setField(probability, field, val.intValue(), false);
				}
			}
		}
		return probability;
	}

	public  static <T> void  assemble(List<T> trends) {
		if(CollectionUtils.isEmpty(trends))
			return;
		for(T t : trends) {
			assemble(t);
		}
	}

	public static <T> void assemble(T t) {
		if(t == null) return;
		for(Field field : t.getClass().getDeclaredFields()) {
			Annotation[] anns = field.getDeclaredAnnotations();
	        if(anns.length < 1)
	          continue; // 属性上没有注解
	        // 遍历注解
	        for(Annotation ann : anns) {
	        	// 只处理注解com.hhly.skeleton.base.util.trendutil.Assemble
	        	if(!(ann instanceof Assemble))
	        		continue;
	        	// 只能标记在集合中
        		Assemble assemble = (Assemble)ann;
        		
				// 要收集的字段集合
        		List<Object> assembleFields = new ArrayList<>();
        		// 要收集的字段名集合
        		List<String> needToAssemble = new ArrayList<>();
        		
    			for(Field fieldReg : t.getClass().getDeclaredFields()){
    				// 只匹配没有@Assemble的字段
    				if(fieldReg.isAnnotationPresent(Assemble.class)) 
    					continue;
					// 如果有配置正则表达式
					String[] regexes = assemble.regex();
	        		if(regexes.length > 0) {
	        			for(String reg : regexes) {
	        				if(Pattern.matches(reg,fieldReg.getName())) {
    	        				// 记录匹配到的字段
	        					// 如果允许重复,直接添加，否则去重
	        					String regField = fieldReg.getName();
	                			if(assemble.repeat()) {
	                				needToAssemble.add(regField);
	                			} else {
	                				if(needToAssemble.indexOf(regField) == -1) {
	                					needToAssemble.add(regField);
	                				}
	                			}
    	        			}
	        			}
	        		}

    			}
  	        	
        		// 收集要匹配的字段
        		String[] includes = assemble.include();
        		if(includes.length > 0) {
        			//System.out.println(field.getGenericType().getClass());
    		        //ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
    		        //Class<?> elementClass = (Class<?>) parameterizedType.getActualTypeArguments()[0];
            		for(String includeField : includes) {
            			// 如果允许重复,直接添加，否则去重
            			if(assemble.repeat()) {
            				needToAssemble.add(includeField);
            			} else {
            				if(needToAssemble.indexOf(includeField) == -1) {
            					needToAssemble.add(includeField);
            				}
            			}
            		}
        		}
        		
        		// 如果有要过滤的字段
    			// 循环所有字段后，若有要收集的字段
				String[] excludes = assemble.exclude();
				
				if(excludes.length > 0) {
					for(String exclude : excludes) {
						while(needToAssemble.indexOf(exclude) != -1) {
							needToAssemble.remove(exclude);
						}
					}
				}
				
				// 经过各种条件后，若有要收集的字段，则添加
				if(!CollectionUtils.isEmpty(needToAssemble)) {
					for(String needField : needToAssemble) {
						Object f = ClassUtil.getField(t, needField, Object.class);
						// 字段不为空才添加
						if(f != null) {
							assembleFields.add(f);
							if(assemble.setNull()) {
			    				try {
									setField(t, getField(t,needField), null, false);
								} catch (Exception e) {
									logger.error(e);
								}
			    			}
						}
					}
					if(!CollectionUtils.isEmpty(assembleFields)) {
						try {
							setField(t, field, assembleFields, false);
						} catch (Exception e) {
							logger.error(e);
						}
					}
				}
	        }
		}
	}

	private static <T> Field getField(T t, String myField) {
		for(Field field : t.getClass().getDeclaredFields()) {
			if(field.getName().equals(myField))
				return field;
		}
		return null;
	}
}
