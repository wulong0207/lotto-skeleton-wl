package com.hhly.skeleton.base.issue.itf;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.hhly.skeleton.base.common.LotteryEnum.AdminCategory;
import com.hhly.skeleton.base.common.LotteryEnum.ConIssue;
import com.hhly.skeleton.base.common.LotteryEnum.IssueLastest;
import com.hhly.skeleton.base.common.LotteryEnum.LotIssueSaleStatus;
import com.hhly.skeleton.base.common.LotteryEnum.Lottery;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.AbstractIssue;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.model.SaleStatus;
import com.hhly.skeleton.base.util.DateUtil;

/**
 * @desc 彩期生成抽象实现类
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract class AbstractIssueBuilder extends AbstractIssue implements
		IIssueBuilder {

	private final String ISSUE_DEFAULT_REMARK = "系统自动生成彩期";

	protected final String YEAR_HEAD_WELFARE = "yyyy";

	protected final String YEAR_HEAD_SPOERT = "yy";

	protected final String YEAR_HEAD = "20";
	
	protected  final String TOMORROW  = "1";

	public AbstractIssueBuilder(NewIssueBO lastIssuePO,
			NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}
    
	@Override
	public NewIssueBO getLotteryIssuePO() {
		return this.issuePO;
	}

	@Override
	public void before() {
		issuePO.setLotteryCode(lotteryBO.getLotteryCode());
		issuePO.setLotteryName(lotteryBO.getLotteryName());
		issuePO.setRemark(ISSUE_DEFAULT_REMARK);
		// 设置为不是当前期
		issuePO.setCurrentIssue(ConIssue.NOT_CURRENT.getValue());
        //设置不是最新开奖
		issuePO.setIssueLastest(IssueLastest.NO.getCode());
		saleEndRule();

		saleStartRule();
		
		drawTimeRule();
		// 彩期期号格式统一处理
		handleIssueCodeBefore();
		//处理彩种后几位递增数
		handleLotteryEnd();
		//设置开奖详情
		setDrawCode();
		
	}
	
	@Override
	public void after() {
		// 彩期期号后置统一处理
		handleIssueCodeAfter();
		if(issuePO.getSaleEndTime().getTime() < System.currentTimeMillis()){
			issuePO.setSaleStatus(LotIssueSaleStatus.STOP_SALE.getValue());
		}
	}
	
	@Override
	public void computeIssueStatus() {
		short status;
		if (SaleStatus.STOP_SALE.getValue() == lotteryBO.getSaleStatus()) {
			// 停止销售
			status =  LotIssueSaleStatus.SUSPEND_SALE.getValue();
		} else {
			status = normalSale();
		}
		issuePO.setSaleStatus(status);
	}
	 
	/**
	 * 正常销售状态时彩期的销售状态获取
	 * 该方法正常销售统一状态为预售中
	 * 不同的彩种可以覆盖此方法以实现正常销售时的彩期状态设置
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午11:32:15
	 * @return
	 */
	protected short normalSale(){
		return LotIssueSaleStatus.PRE_SALING.getValue();
	}
	
	@Override
	public void computeSaleEndTime() {
		issuePO.setSaleEndTime(DateUtils.addSeconds(issuePO.getOfficialEndTime(),
				lotteryBO.getBuyEndTime()));
	}

	/**
	 * 彩期期号前置处理为统一格式年份格式yyyy（体彩yy,福彩yyyy）
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午11:03:40
	 */
	protected void handleIssueCodeBefore() {
		if (isSport()) {
			lastIssuePO.setIssueCode(YEAR_HEAD + lastIssuePO.getIssueCode());
		}
		
	}
	
	/**
	 * 彩期期号后置处理（体彩yy,福彩yyyy）
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午11:04:18
	 */
	protected void handleIssueCodeAfter() {
		if (isSport()) {
			lastIssuePO.setIssueCode(lastIssuePO.getIssueCode().substring(2));
			issuePO.setIssueCode(issuePO.getIssueCode().substring(2));
		}
	}

	
	
	protected void drawTimeRule() {
		if (CollectionUtils.isEmpty(lotteryBO.getDrawTimeRule())) {
			Map<String, String[]> drawTime = splitRule(lotteryBO.getDrawTime());
			lotteryBO.setDrawTimeRule(drawTime);
		}
	}
	
	

	/**
	 * 判断是体彩还是福彩
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午10:27:37
	 * @return true 体彩，false 福彩
	 */
	protected final boolean isSport() {
		return lotteryBO.getAdminCategory().intValue() == AdminCategory.SPROT_LOTTERY
				.getValue();
	}
    
	/**
	 * 获取有效日期
	 * 如果为休市日期就继续往下沿，直到日期为有效日期
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午11:13:59
	 * @param issueCodeDate
	 * @return
	 */
	protected final Date getRationalDate(String issueCodeDate) {
		Date date = DateUtil.convertStrToDate2(issueCodeDate,
				DateUtil.DATE_FORMAT_NO_LINE);
		while (true) {
			date = DateUtils.addDays(date, 1);
			if (isVacation(date)) {
				continue;
			}
			break;
		}
		return date;
	}

	/**
	 * 判断是否休市期
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午11:15:16
	 * @param date
	 * @return
	 */
	protected final boolean isVacation(Date date) {
        return StringUtils.hasText(lotteryBO.getVacations())
                && lotteryBO.getVacations().contains(
                DateUtil.convertDateToStr(date, DateUtil.DATE_FORMAT));
    }
	
	/**
	 * 设置官方可送票时间
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月1日 上午11:36:07
	 * @param date 日期
	 * @param time 时间格式（09:00）
	 * @return
	 */
	protected final Date setDateStartRule(Date date){
		String week = String.valueOf(DateUtil.dayForWeek(date));
		String []  startRule = lotteryBO.getStartRule().get(week);
		if (startRule == null) {
			throw new ServiceRuntimeException("官方可送票时间规则不存在,创建彩期失败");
		}
		String[] hm = startRule[1].split(SymbolConstants.COLON);
		Date saleTime = DateUtils.setHours(date,Integer.parseInt(hm[0]));
		saleTime = DateUtils.setMinutes(saleTime,Integer.parseInt(hm[1]));
		return saleTime;
	} 
	
	/**
	 * 处理期号格式
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年4月14日 上午10:51:55
	 */
	private void handleLotteryEnd() {
		// 判断后面的递增位
		if (!StringUtils.hasText(lotteryBO.getFormat())) {
			throw new ServiceRuntimeException("彩种格式不能为空");
		}
		char[] format = lotteryBO.getFormat().toUpperCase().toCharArray();
		int end = 0;
		for (char c : format) {
			if (c == 'X') {
				end++;
			}
		}
		lotteryBO.setEnd(end);
	}
	
	/**
	 * 官方开始销售时间规则计算
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午10:04:19
	 */
	private void saleStartRule() {
		if (CollectionUtils.isEmpty(lotteryBO.getStartRule())) {
			Map<String, String[]> startRule = splitRule(lotteryBO
					.getStartSailTime());
			lotteryBO.setStartRule(startRule);
		}
	}
	/**
	 * 官方结束销售时间规则计算
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午9:50:48
	 */
	private void saleEndRule() {
		if (CollectionUtils.isEmpty(lotteryBO.getEndRule())) {
			Map<String, String[]> endRule = splitRule(lotteryBO
					.getEndSailTime());
			lotteryBO.setEndRule(endRule);
		}
	}

	/**
	 * 截止销售规则解析
	 * 
	 * @param endRule
	 * @return key 星期几，value 数组（0信息，1时间，2是否跨天）
	 */
	private Map<String, String[]> splitRule(String endRule) {
		// 规则格式解析（2|20:00|0,4|20:00|0）
		if (!StringUtils.hasText(endRule)) {
			return null;
		}
		Map<String, String[]> ruleMap = new HashMap<String, String[]>();
		String rules[] = endRule.split(SymbolConstants.COMMA);
		for (int i = 0; i < rules.length; i++) {
			String str[] = StringUtils.tokenizeToStringArray(rules[i], SymbolConstants.VERTICAL_BAR);
			ruleMap.put(str[0], str);
		}
		return ruleMap;
	}
	/**
	 * 开奖明细
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年6月13日 下午5:29:13
	 */
	private void setDrawCode() {
		Lottery lottery = Lottery.getLottery(lotteryBO.getLotteryCode());
		String str = "";
		switch (lottery) {
		case SSQ:
			str = "一等奖|||0,二等奖|||0,三等奖||3000|0,四等奖||200|0,五等奖||10|0,六等奖||5|0";
			break;
		case QLC:
			str = "一等奖|||0,二等奖|||0,三等奖|||0,四等奖||200|0,五等奖||50|0,六等奖||10|0,七等奖||5|0,特别奖||5|0";
			break;
		case DLT:
			str = "一等奖||||,二等奖||||,三等奖||||,四等奖||200||100,五等奖||10||5,六等奖||5|0|0";
			break;
		case PL5:
			str ="直选||100000|0";
			break;
		case PL3:
		case F3D:
			str ="直选||1040|0,组三||346|0,组六||173|0";
			break;
		case QXC:
			str = "一等奖|||0,二等奖|||0,三等奖||1800|0,四等奖||300|0,五等奖||20|0,六等奖||5|0";
			break;
		case CQSSC:
		case JXSSC:
		case XJSSC:
		case YNSSC:
		case TJSSC:
			str = "五星直选|100000|0,五星通选|20440|0,三星直选|1000|0,三星组三|320|0,三星组六|160|0,二星直选|100|0,二星组选|50|0,一星|10|0,大小单双|4|0";
			break;
		case D11X5:
		case HB11X5:
		case JS11X5:
		case JX11X5:
		case LN11X5:
		case SD11X5:
		case XJ11X5:
		case GX11X5:
			str = "任二|6|0,任三|19|0,任四|78|0,任五|540|0,任六|90|0,任七|26|0,任八|9|0,前一|13|0,前二直选|130|0,前二组选|65|0,前三直选|1170|0,前三组选|195|0,乐二一等|201|0,乐二二等|71|0,乐二三等|6|0,乐三一等|1384|0,乐三二等|214|0,乐三三等|19|0,乐四一等|154|0,乐四二等|19|0,乐五一等|1080|0,乐五二等|90|0";
			break;
		case HNKL10:
			break;
		case DKL10:
		case CQKL10:
			str = "选一数投|25|0,选一红投|5|0,任选二|8|0,选二连组|31|0,选二连直|62|0,任选三|24|0,选三前组|1300|0,选三前直|8000|0,任选四|80|0,任选五|320|0";
			break;
		case GXK3:
		case AHK3:
		case JLK3:
		case JSK3:
		case JXK3:
			str = "和值3|240|0,和值4|80|0,和值5|40|0,和值6|25|0,和值7|16|0,和值8|12|0,和值9|10|0,和值10|9|0,和值11|9|0,和值12|10|0,和值13|12|0,和值14|16|0,和值15|25|0,和值16|40|0,和值17|80|0,和值18|240|0,三同号通选|40|0,三同号单选|240|0,三不同号|40|0,三连号通选|10|0,二同号复选|15|0,二同号单选|80|0,二不同号|8|0";
			break;
		case ZC6:
		case JQ4:
		case ZC_NINE:
			str = "一等奖|||0";
			break;
		case SFC:
			str = "一等奖|||0,二等奖|||0";
			break;
		case SDPOKER:
			str = "同花包选|22|0,同花单选|90|0,同花顺包选|535|0,同花顺单选|2150|0,顺子包选|33|0,顺子单选|400|0,豹子包选|500|0,豹子单选|6400|0,对子包选|7|0,对子单选|88|0,任选一|5|0,任选二|33|0,任选三|116|0,任选四|46|0,任选五|22|0,任选六|12|0";
			break;
		default:
			break;
		}
		issuePO.setDrawDetail(str);
	}
	/**
	 * 拆分中奖详情
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年5月26日 上午10:29:14
	 * @param drawDetail
	 *            格式 一等奖|2|10000000,二等奖|5|200000
	 * @param keyNum
	 *            表示奖项位数
	 * @param valueNum
	 *            金额位数
	 * @return
	 */
	public static Map<String, Integer> splitDrawDetail(String drawDetail, int keyNum, int valueNum) {
		Map<String, Integer> map = new HashMap<>();
		String[] details = drawDetail.split(SymbolConstants.COMMA);
		for (String detail : details) {
			String[] str = detail.split(SymbolConstants.DOUBLE_SLASH_VERTICAL_BAR);
			if (str.length < valueNum + 1) {
				continue;
			}
			if (str.length < keyNum + 1) {
				continue;
			}
			try {
				map.put(str[keyNum].trim(), Integer.parseInt(str[valueNum].trim()));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
}
