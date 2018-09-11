package com.hhly.skeleton.pay.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.MessageCodeConstants;
import com.hhly.skeleton.base.constants.PayConstants;
import com.hhly.skeleton.base.constants.PayConstants.ChannelTypeEnum;
import com.hhly.skeleton.base.constants.PayConstants.TakenPlatformEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.NumberUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.util.RegularValidateUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.base.util.XmlUtil;
import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoBO;
import com.hhly.skeleton.lotto.base.order.vo.OrderQueryVo;
import com.hhly.skeleton.lotto.base.ordercopy.bo.OrderCopyPayInfoBO;
import com.hhly.skeleton.pay.trans.vo.ToPushPayVO;
import com.hhly.skeleton.pay.vo.PayInputParamVO;
import com.hhly.skeleton.pay.vo.PayParamVO;
import com.hhly.skeleton.pay.vo.RechargeInputParamVO;
import com.hhly.skeleton.pay.vo.RechargeParamVO;
import com.hhly.skeleton.pay.vo.TakenInputReqParamVO;
import com.hhly.skeleton.pay.vo.TakenReqParamVO;
import com.hhly.skeleton.pay.vo.TakenValidateTypeVO;
import com.hhly.skeleton.pay.vo.ToPayEndTimeVO;
import com.hhly.skeleton.pay.vo.ToPayInputParamVO;
import com.hhly.skeleton.pay.vo.ToPayParamVO;
import com.hhly.skeleton.pay.vo.ToRechargeParamVO;
import com.hhly.skeleton.pay.vo.TransParamVO;
import com.hhly.skeleton.pay.vo.TransRedVO;

/**
 * @desc 支付公用方法
 * @author xiongJinGang
 * @date 2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayCommon {

	private static Logger logger = Logger.getLogger(PayCommon.class);

	private static Map<String, String> analyXmlMap = new HashMap<String, String>();// 返回的是xml格式的解析方式
	private static Map<String, String> analyFormMap = new HashMap<String, String>();// 返回的是form表单的解析方式
	private static Map<String, String> analyStreamMap = new HashMap<String, String>();// 返回的是流的解析方式
	private static Map<String, String> analyReqStringMap = new HashMap<String, String>();// 返回的是请求字符串

	static {
		// 返回的是xml格式的解析方式
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WECHAT_WEB.getChannel(), PayConstants.ChannelTypeEnum.WECHAT_WEB.getChannel());
		analyXmlMap.put(PayConstants.ChannelTypeEnum.XINGYE_WAP.getChannel(), PayConstants.ChannelTypeEnum.XINGYE_WAP.getChannel());
		analyXmlMap.put(PayConstants.ChannelTypeEnum.XINGYE_WEB.getChannel(), PayConstants.ChannelTypeEnum.XINGYE_WEB.getChannel());
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONG_WEB.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONG_WEB.getChannel());// 威富通web
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONG_WAP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONG_WAP.getChannel());// 威富通wap
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONG_APP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONG_APP.getChannel());// 威富通app
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONG_JSAPI.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONG_JSAPI.getChannel());// 威富通公众号

		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGGD_WEB.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGGD_WEB.getChannel());// 威富通光大web
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGGD_WAP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGGD_WAP.getChannel());// 威富通光大wap
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGGD_APP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGGD_APP.getChannel());// 威富通光大app
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGGD_JSAPI.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGGD_JSAPI.getChannel());// 威富通光大公众号

		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX1_WEB.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX1_WEB.getChannel());// 威富通中信1web
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX1_WAP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX1_WAP.getChannel());// 威富通中信1wap
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX1_APP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX1_APP.getChannel());// 威富通中信1app
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX1_JSAPI.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX1_JSAPI.getChannel());// 威富通中信1公众号

		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX2_WEB.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX2_WEB.getChannel());// 威富通中信2web
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX2_WAP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX2_WAP.getChannel());// 威富通中信2wap
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX2_APP.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX2_APP.getChannel());// 威富通中信2app
		analyXmlMap.put(PayConstants.ChannelTypeEnum.WEIFUTONGZX2_JSAPI.getChannel(), PayConstants.ChannelTypeEnum.WEIFUTONGZX2_JSAPI.getChannel());// 威富通中信2公众号
		analyXmlMap.put(PayConstants.ChannelTypeEnum.HONGYUE_WEB.getChannel(), PayConstants.ChannelTypeEnum.HONGYUE_WEB.getChannel());// 鸿粤微信扫码

		// 返回的是form表单的解析方式
		analyFormMap.put(PayConstants.ChannelTypeEnum.NOWPAY_APP.getChannel(), PayConstants.ChannelTypeEnum.NOWPAY_APP.getChannel());
		analyFormMap.put(PayConstants.ChannelTypeEnum.NOWPAY_WAP.getChannel(), PayConstants.ChannelTypeEnum.NOWPAY_WAP.getChannel());

		// 返回的是流的解析方式
		analyStreamMap.put(PayConstants.ChannelTypeEnum.LIANLIAN_WEB.getChannel(), PayConstants.ChannelTypeEnum.LIANLIAN_WEB.getChannel());
		analyStreamMap.put(PayConstants.ChannelTypeEnum.LIANLIAN_FAST.getChannel(), PayConstants.ChannelTypeEnum.LIANLIAN_FAST.getChannel());
		analyStreamMap.put(PayConstants.ChannelTypeEnum.LIANLIAN_WAP.getChannel(), PayConstants.ChannelTypeEnum.LIANLIAN_WAP.getChannel());
		analyStreamMap.put(PayConstants.ChannelTypeEnum.LIANLIAN_APP.getChannel(), PayConstants.ChannelTypeEnum.LIANLIAN_APP.getChannel());
		// 返回的是请求字符串
		analyReqStringMap.put(PayConstants.ChannelTypeEnum.DIVINEPAY_WAP.getChannel(), PayConstants.ChannelTypeEnum.DIVINEPAY_WAP.getChannel());
		analyReqStringMap.put(PayConstants.ChannelTypeEnum.DIVINEPAY_APP.getChannel(), PayConstants.ChannelTypeEnum.DIVINEPAY_APP.getChannel());
		analyReqStringMap.put(PayConstants.ChannelTypeEnum.HAODIANA_WAP.getChannel(), PayConstants.ChannelTypeEnum.HAODIANA_WAP.getChannel());
		analyReqStringMap.put(PayConstants.ChannelTypeEnum.HAODIANA_WEB.getChannel(), PayConstants.ChannelTypeEnum.HAODIANA_WEB.getChannel());
	}

	/**  
	* 方法说明: 验证跳转支付参数
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年4月25日 下午6:19:41
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateToPayParams(HttpServletRequest request) {
		ToPayParamVO toPayParam = new ToPayParamVO();
		String cId = request.getHeader("cId");// 头部传的渠道ID
		if (!ObjectUtil.isBlank(cId)) {
			toPayParam.setChannelId(cId);
		}
		if (ObjectUtil.isBlank(request.getParameter("token"))) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		toPayParam.setToken(trimSpace(request.getParameter("token")));

		if (ObjectUtil.isBlank(request.getParameter("orderCode"))) {
			return ResultBO.err(MessageCodeConstants.ORDER_CODE_IS_NULL_FIELD);
		}
		toPayParam.setOrderCode(trimSpace(request.getParameter("orderCode")));

		if (!ObjectUtil.isBlank(request.getParameter("channelId"))) {
			toPayParam.setChannelId(request.getParameter("channelId"));
		} else {
			toPayParam.setChannelId(PayConstants.ChannelEnum.UNKNOWN.getKey());
		}
		return ResultBO.ok(toPayParam);
	}

	public static ResultBO<?> validateToPayParams(ToPayInputParamVO toPayInputParamVO) {
		ToPayParamVO toPayParam = new ToPayParamVO();
		if (ObjectUtil.isBlank(toPayInputParamVO.getToken())) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		toPayParam.setToken(trimSpace(toPayInputParamVO.getToken()));

		String orderCode = toPayInputParamVO.getOrderCode();
		if (ObjectUtil.isBlank(orderCode)) {
			return ResultBO.err(MessageCodeConstants.ORDER_CODE_IS_NULL_FIELD);
		}
		String buyType = toPayInputParamVO.getBuyType();
		if (ObjectUtil.isBlank(buyType)) {
			return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
		}
		// 将中文逗号、顿号转换成英文逗号
		orderCode = StringUtil.replaceSign(orderCode);
		buyType = StringUtil.replaceSign(buyType);
		toPayParam.setOrderCode(orderCode);
		toPayParam.setBuyType(buyType);
		toPayParam.setChannelId(toPayInputParamVO.getChannelId());
		String[] orderCodes = orderCode.split(",");
		String[] buyTypes = buyType.split(",");
		if (orderCodes.length != buyTypes.length) {
			return ResultBO.err(MessageCodeConstants.PAY_ORDER_BUYTYPE_ERROR_SERVICE);
		}
		// 未支付订单数超限额
		if (orderCodes.length > Constants.BATCH_PAY_LARGEST_ORDER_NUM) {
			return ResultBO.err(MessageCodeConstants.ORDER_NOT_PAY_COUNT_BEYONG);
		}

		List<OrderQueryVo> orderQueryVoList = new ArrayList<OrderQueryVo>();
		OrderQueryVo orderQueryVo = null;
		for (int i = 0; i < buyTypes.length; i++) {
			String bt = trimSpace(buyTypes[i]);
			if (!NumberUtil.isDigits(bt)) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
			}
			Integer buyTypeInt = Integer.parseInt(bt);
			if (!PayConstants.BuyTypeEnum.containsKey(buyTypeInt)) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
			}
			orderQueryVo = new OrderQueryVo();
			orderQueryVo.setOrderCode(orderCodes[i]);
			orderQueryVo.setBuyType(buyTypeInt);
			orderQueryVoList.add(orderQueryVo);
			toPayParam.setOrderQueryVoList(orderQueryVoList);
		}
		return ResultBO.ok(toPayParam);
	}

	/**  
	* 方法说明: 验证推单支付请求参数
	* @auth: xiongJinGang
	* @param request
	* @time: 2018年1月11日 下午3:32:27
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateToPushParams(HttpServletRequest request) {
		ToPushPayVO toPushParam = new ToPushPayVO();
		if (ObjectUtil.isBlank(request.getParameter("token"))) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		toPushParam.setToken(trimSpace(request.getParameter("token")));

		if (ObjectUtil.isBlank(request.getParameter("issueId"))) {
			return ResultBO.err(MessageCodeConstants.ORDER_CODE_IS_NULL_FIELD);
		}
		toPushParam.setIssueId(trimSpace(request.getParameter("issueId")));

		if (!ObjectUtil.isBlank(request.getParameter("channelId"))) {
			toPushParam.setChannelId(request.getParameter("channelId"));
		} else {
			toPushParam.setChannelId(PayConstants.ChannelEnum.UNKNOWN.getKey());
		}
		return ResultBO.ok(toPushParam);
	}

	/**  
	* 方法说明: 验证跳转充值请求参数
	* @auth: xiongJinGang
	* @param request
	* @time: 2018年2月27日 下午6:21:40
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateToRechargeParams(HttpServletRequest request) {
		ToRechargeParamVO toRechargeParam = new ToRechargeParamVO();
		String token = request.getParameter("token");
		if (ObjectUtil.isBlank(request.getParameter("token"))) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		toRechargeParam.setToken(trimSpace(token));

		String channelId = request.getHeader("cId");// 渠道ID
		if (!ObjectUtil.isBlank(channelId)) {
			toRechargeParam.setChannelId(trimSpace(channelId));
		} else {
			toRechargeParam.setChannelId(PayConstants.ChannelEnum.UNKNOWN.getKey());
		}

		String browserType = request.getParameter("browserType");// 浏览器类型 【选填】1微信、2支付宝、3QQ。2018-02-27添加
		if (!ObjectUtil.isBlank(browserType)) {
			toRechargeParam.setBrowserType(trimSpace(browserType));
		}
		return ResultBO.ok(toRechargeParam);
	}

	/**  
	* 方法说明: 验证订单支付状态是否可以支付
	* @auth: xiongJingang
	* @param payParam
	* @time: 2017年3月16日 下午12:19:18
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateOrder(OrderBaseInfoBO orderInfo) {
		ToPayEndTimeVO toPayEndTimeVO = new ToPayEndTimeVO();
		// 获取用户订单详情
		if (ObjectUtil.isBlank(orderInfo)) {
			return ResultBO.err(MessageCodeConstants.TRANS_ORDER_CODE_IS_ERROR_SERVICE);
		}
		// 验证订单是否支付，不是等待支付状态的订单都不能支付
		if (ObjectUtil.isBlank(orderInfo.getPayStatus())
				|| (!orderInfo.getPayStatus().equals(Integer.valueOf(PayConstants.PayStatusEnum.WAITTING_PAYMENT.getKey() + "")) && !orderInfo.getPayStatus().equals(Integer.valueOf(PayConstants.PayStatusEnum.BEING_PAID.getKey() + "")))) {
			logger.info("订单【" + orderInfo.getOrderCode() + "】的当前支付状态【" + orderInfo.getPayStatus() + "】不是等待支付和支付中状态");
			return ResultBO.err(MessageCodeConstants.PAY_STATUS_ERROR_SERVICE);
		}
		toPayEndTimeVO.setOrderAmount(orderInfo.getOrderAmount());
		// 验证支付截止时间
		if (ObjectUtil.isBlank(orderInfo.getEndSaleTime())) {
			logger.info("订单【" + orderInfo.getOrderCode() + "】支付截止时间为空");
			return ResultBO.err(MessageCodeConstants.PAY_END_TIME_IS_NULL_FIELD_SERVICE);
		}
		int days = DateUtil.compare(orderInfo.getEndSaleTime(), new Date());
		if (days <= 0) {
			logger.info("订单【" + orderInfo.getOrderCode() + "】已过支付截止时间【" + orderInfo.getEndSaleTime() + "】");
			return ResultBO.err(MessageCodeConstants.PAY_DEADLINE_HAS_PASSED);
		}
		Long leavePayTime = DateUtil.compareAndGetSeconds(orderInfo.getEndSaleTime(), new Date());
		toPayEndTimeVO.setLeavePayTime(leavePayTime);
		toPayEndTimeVO.setOrderBaseInfo(orderInfo);
		return ResultBO.ok(toPayEndTimeVO);
	}

	public static ResultBO<?> validateOrder(List<OrderBaseInfoBO> list) {
		Double totalPayMoney = 0.0;
		ToPayEndTimeVO toPayEndTimeVO = new ToPayEndTimeVO();
		Date endSaleTime = null;
		String orderCode = null;
		int num = 0;
		for (OrderBaseInfoBO orderInfo : list) {
			// 批量支付不能有活动编号
			if (!ObjectUtil.isBlank(orderInfo.getActivityCode())) {
				logger.info("活动订单【" + orderInfo.getOrderCode() + "】不能批量支付");
				return ResultBO.err(MessageCodeConstants.BATCH_PAY_NOT_ALLOW_ACTIVITY_ORDER);
			}
			if (ObjectUtil.isBlank(orderInfo.getEndSaleTime())) {
				logger.info("订单【" + orderInfo.getOrderCode() + "】支付截止时间为空");
				return ResultBO.err(MessageCodeConstants.PAY_END_TIME_IS_NULL_FIELD_SERVICE);
			}
			int days = DateUtil.compare(orderInfo.getEndSaleTime(), new Date());
			if (days <= 0) {
				logger.info("订单【" + orderInfo.getOrderCode() + "】已过支付截止时间【" + orderInfo.getEndSaleTime() + "】");
				return ResultBO.err(MessageCodeConstants.PAY_DEADLINE_HAS_PASSED);
			}

			if (num == 0) {
				endSaleTime = orderInfo.getEndSaleTime();// 支付截止时间
				toPayEndTimeVO.setOrderBaseInfo(orderInfo);
			} else {
				// 取一个最短的时间
				int compareResult = DateUtil.compare(endSaleTime, orderInfo.getEndSaleTime());
				if (compareResult > 0) {
					orderCode = orderInfo.getOrderCode();
					endSaleTime = orderInfo.getEndSaleTime();
				}
			}

			// 验证订单是否支付，不是等待支付状态的订单都不能支付
			if (ObjectUtil.isBlank(orderInfo.getPayStatus())
					|| (!orderInfo.getPayStatus().equals(Integer.valueOf(PayConstants.PayStatusEnum.WAITTING_PAYMENT.getKey() + "")) && !orderInfo.getPayStatus().equals(Integer.valueOf(PayConstants.PayStatusEnum.BEING_PAID.getKey() + "")))) {
				logger.info("订单【" + orderInfo.getOrderCode() + "】的当前支付状态【" + orderInfo.getPayStatus() + "】不是等待支付和支付中状态");
				return ResultBO.err(MessageCodeConstants.PAY_STATUS_ERROR_SERVICE);
			}

			totalPayMoney = MathUtil.add(totalPayMoney, orderInfo.getOrderAmount());
			num++;
		}
		toPayEndTimeVO.setOrderAmount(totalPayMoney);
		int days = DateUtil.compare(endSaleTime, new Date());
		if (days <= 0) {
			logger.info("批量支付订单【" + orderCode + "】已过支付截止时间【" + endSaleTime + "】");
			return ResultBO.err(MessageCodeConstants.PAY_DEADLINE_HAS_PASSED);
		}

		Long leavePayTime = DateUtil.compareAndGetSeconds(endSaleTime, new Date());
		toPayEndTimeVO.setLeavePayTime(leavePayTime);
		return ResultBO.ok(toPayEndTimeVO);
	}

	/**  
	* 方法说明: 验证方案信息
	* @auth: xiongJinGang
	* @param orderInfo
	* @time: 2018年1月11日 下午3:52:03
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validatePushOrder(OrderCopyPayInfoBO orderInfo) {
		ToPayEndTimeVO toPayEndTimeVO = new ToPayEndTimeVO();
		// 获取用户订单详情
		if (ObjectUtil.isBlank(orderInfo)) {
			return ResultBO.err(MessageCodeConstants.TRANS_ORDER_CODE_IS_ERROR_SERVICE);
		}
		// 验证支付截止时间
		if (ObjectUtil.isBlank(orderInfo.getSaleEndDate())) {
			logger.info("方案【" + orderInfo.getIssueCode() + "】支付截止时间为空");
			return ResultBO.err(MessageCodeConstants.PAY_END_TIME_IS_NULL_FIELD_SERVICE);
		}
		int days = DateUtil.compare(orderInfo.getSaleEndDate(), new Date());
		if (days <= 0) {
			logger.info("方案【" + orderInfo.getIssueCode() + "】已过支付截止时间【" + orderInfo.getSaleEndDate() + "】");
			return ResultBO.err(MessageCodeConstants.PAY_DEADLINE_HAS_PASSED);
		}
		Long leavePayTime = DateUtil.compareAndGetSeconds(orderInfo.getSaleEndDate(), new Date());
		toPayEndTimeVO.setLeavePayTime(leavePayTime);
		return ResultBO.ok(toPayEndTimeVO);
	}

	/**  
	* 方法说明: 将request请求转成map
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年3月29日 上午11:07:51
	* @return: Map<String,String> 
	 * @throws Exception 
	*/
	@SuppressWarnings("rawtypes")
	public static Map<String, String> getReqParams(HttpServletRequest request, String encode) throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			// valueStr = new String(valueStr.getBytes(), "utf-8");
			if (!ObjectUtil.isBlank(encode)) {
				valueStr = new String(valueStr.getBytes(encode), "utf-8");
			}
			params.put(name, valueStr);
		}
		return params;
	}

	public static Map<String, String> getReqParams(HttpServletRequest request) throws Exception {
		return getReqParams(request, "");
	}

	/**
	 * 表单类型报文解析成数据映射表
	 * @param reportContent
	 * @param reportCharset --报文本身字符集
	 * @param targetCharset --目标字符集
	 * @return
	 */
	public static Map<String, String> parseFormDataPatternReportWithDecode(String reportContent, String reportCharset, String targetCharset) {
		if (reportContent == null || reportContent.length() == 0)
			return null;

		String[] domainArray = reportContent.split("&");

		Map<String, String> key_value_map = new HashMap<String, String>();
		for (String domain : domainArray) {
			String[] kvArray = domain.split("=");

			if (kvArray.length == 2) {
				try {
					String decodeString = URLDecoder.decode(kvArray[1], reportCharset);
					String lastInnerValue = new String(decodeString.getBytes(reportCharset), targetCharset);
					System.out.println("key:" + kvArray[0] + ",value:" + lastInnerValue);
					key_value_map.put(kvArray[0], lastInnerValue);
				} catch (Exception ex) {
					// ignore
				}

			}
		}

		return key_value_map;
	}

	/**  
	* 方法说明: 读取第三方返回的数据流
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年9月9日 上午11:22:17
	* @return: String 
	*/
	public static Map<String, String> readReqStream(HttpServletRequest request) {
		Map<String, String> key_value_map = new HashMap<String, String>();
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder();
		try {
			reader = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != reader) {
					reader.close();
				}
			} catch (IOException e) {

			}
		}
		key_value_map.put(Constants.PAY_RESPONSE_KEY_NAME, sb.toString());
		return key_value_map;
	}

	/**  
	* 方法说明: 读取request信息
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年10月19日 下午2:28:19
	* @return: Map<String,String> 
	*/
	public static String readRequest(HttpServletRequest request) {
		BufferedReader reader = null;
		String reportContent = null;
		try {
			reader = request.getReader();
			StringBuilder reportBuilder = new StringBuilder();
			String tempStr = "";
			while ((tempStr = reader.readLine()) != null) {
				reportBuilder.append(tempStr);
			}
			reportContent = reportBuilder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return reportContent;
	}

	/**  
	* 方法说明: 验证客户端的请求参数
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年3月29日 下午2:21:34
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateTransParams(HttpServletRequest request) {
		TransParamVO transParam = new TransParamVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		transParam.setToken(trimSpace(token));

		String moneyFlow = request.getParameter("moneyFlow");// token
		if (!ObjectUtil.isBlank(moneyFlow)) {
			try {
				transParam.setMoneyFlow(Short.parseShort(trimSpace(moneyFlow)));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.TRANS_MONEY_FLOW_FIELD);
			}
		}

		String tradeType = request.getParameter("tradeType");// 交易类型 【 1：充值；2：购彩；3：返奖；4：退款；5：提款；6：其它】
		if (!ObjectUtil.isBlank(tradeType)) {
			try {
				transParam.setTradeType(Short.parseShort(trimSpace(tradeType)));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.PAY_TRADE_TYPE_ERROR_SERVICE);
			}
		}

		String tradeStatus = request.getParameter("tradeStatus");// 交易状态 0：交易失败；1：交易成功；
		if (!ObjectUtil.isBlank(tradeStatus)) {
			try {
				transParam.setTransStatus(Short.parseShort(trimSpace(tradeStatus)));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.PAY_TRADE_STATUS_ERROR_SERVICE);
			}
		}

		String transCode = request.getParameter("transCode");//
		transParam.setTransCode(trimSpace(transCode));

		String timeType = request.getParameter("timeType");// 时间类型 【1创建时间、2交易时间。默认创建时间】
		if (!ObjectUtil.isBlank(timeType)) {
			try {
				transParam.setTimeType(Short.parseShort(trimSpace(timeType)));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_DATE_TYPE_ERROR_SERVICE);
			}
		}

		String startDate = request.getParameter("startDate");//
		if (!ObjectUtil.isBlank(startDate)) {
			startDate = trimSpace(startDate);
			boolean flag = validateDate(startDate);
			if (!flag) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_DATE_FORMAT_ERROR_SERVICE);
			}
			transParam.setStartDate(DateUtil.convertStrToDate(startDate, DateUtil.DATE_FORMAT));
		} else {
			// 无值，默认30天
			transParam.setStartDate(DateUtil.convertStrToDate(DateUtil.getBeforeOrAfterDate(30), DateUtil.DATE_FORMAT));
		}

		String endDate = request.getParameter("endDate");//
		if (!ObjectUtil.isBlank(endDate)) {
			endDate = trimSpace(endDate);
			boolean flag = validateDate(endDate);
			if (!flag) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_DATE_FORMAT_ERROR_SERVICE);
			}
			transParam.setEndDate(DateUtil.convertStrToDate(endDate, DateUtil.DATE_FORMAT));
		}

		String currentPage = request.getParameter("currentPage");//
		if (!ObjectUtil.isBlank(currentPage)) {
			currentPage = trimSpace(currentPage);
			if (!NumberUtil.isDigits(currentPage)) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_CURRENT_PAGE_ERROR_SERVICE);
			}
			transParam.setCurrentPage(Integer.parseInt(currentPage));
		}

		String showCount = request.getParameter("showCount");//
		if (!ObjectUtil.isBlank(showCount)) {
			showCount = trimSpace(showCount);
			if (!NumberUtil.isDigits(showCount)) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_SHOW_COUNT_ERROR_SERVICE);
			}
			Integer showCountInt = Integer.parseInt(showCount);
			if (Integer.compare(showCountInt, Constants.MAX_SHOW_NUM) > 0) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_SHOW_COUNT_LIMIT_ERROR_SERVICE);
			}
			transParam.setShowCount(showCountInt);
		}

		return ResultBO.ok(transParam);
	}

	public static ResultBO<?> validateAppTransParams(HttpServletRequest request) {
		TransParamVO transParam = new TransParamVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		transParam.setToken(trimSpace(token));

		String currentPage = request.getParameter("currentPage");//
		if (!ObjectUtil.isBlank(currentPage)) {
			currentPage = trimSpace(currentPage);
			if (!NumberUtil.isDigits(currentPage)) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_CURRENT_PAGE_ERROR_SERVICE);
			}
			transParam.setCurrentPage(Integer.parseInt(currentPage));
		}

		String showCount = request.getParameter("showCount");//
		if (!ObjectUtil.isBlank(showCount)) {
			showCount = trimSpace(showCount);
			if (!NumberUtil.isDigits(showCount)) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_SHOW_COUNT_ERROR_SERVICE);
			}
			Integer showCountInt = Integer.parseInt(showCount);
			if (Integer.compare(showCountInt, Constants.MAX_SHOW_NUM) > 0) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_SHOW_COUNT_LIMIT_ERROR_SERVICE);
			}
			transParam.setShowCount(showCountInt);
		}

		return ResultBO.ok(transParam);
	}

	private static boolean validateDate(String date) {
		boolean flag = false;
		String pat = "\\d{4}-\\d{2}-\\d{2}"; // 指定好正则表达式
		Pattern p = Pattern.compile(pat); // 实例化Pattern类
		Matcher m = p.matcher(date); // 实例化Matcher类
		if (m.matches()) { // 进行验证的匹配，使用正则
			flag = true;// 日期格式合法
		}
		return flag;
	}

	public static ResultBO<?> validatePayParams(HttpServletRequest request) {
		PayParamVO payParam = new PayParamVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		payParam.setToken(trimSpace(token));

		// 订单号
		String orderCode = request.getParameter("orderCode");
		if (ObjectUtil.isBlank(orderCode)) {
			return ResultBO.err(MessageCodeConstants.ORDER_CODE_IS_NULL_FIELD);
		}
		payParam.setOrderCode(trimSpace(orderCode));

		// 红包编号
		String redCode = request.getParameter("redCode");
		if (!ObjectUtil.isBlank(redCode)) {
			payParam.setRedCode(trimSpace(redCode));
		}

		// 账户余额
		String balance = request.getParameter("balance");
		if (!ObjectUtil.isBlank(balance)) {
			balance = trimSpace(balance);
			if (!NumberUtil.isDouble(balance)) {
				return ResultBO.err(MessageCodeConstants.PAY_BALANCE_ERROR_SERVICE);
			}
			payParam.setBalance(Double.parseDouble(balance));
		}

		// 银行ID为空，返回支付方式为空
		String bankId = request.getParameter("bankId");
		if (ObjectUtil.isBlank(bankId)) {
			if (ObjectUtil.isBlank(balance) && ObjectUtil.isBlank(redCode)) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_IS_NULL_FIELD);
			}
		} else {
			bankId = trimSpace(bankId);
			if (!NumberUtil.isDigits(bankId)) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
			}
			payParam.setBankId(Integer.parseInt(bankId));
			// 支付同步返回地址
			String returnUrl = request.getParameter("returnUrl");
			if (ObjectUtil.isBlank(returnUrl)) {
				return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_IS_NULL_FIELD);
			}
			if (!returnUrl.matches(RegularValidateUtil.REGULAR_URL)) {
				return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_ERROR_SERVICE);
			}
			payParam.setReturnUrl(trimSpace(returnUrl));
		}

		// 银行卡ID不为空
		String bankCardId = request.getParameter("bankCardId");
		if (!ObjectUtil.isBlank(bankCardId)) {
			bankCardId = trimSpace(bankCardId);
			if (!NumberUtil.isDigits(bankCardId)) {
				return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_ERROR_SERVICE);
			}
			payParam.setBankCardId(Integer.parseInt(bankCardId));
		}

		// 支付金额
		String payAmount = request.getParameter("payAmount");
		if (!ObjectUtil.isBlank(payAmount)) {
			payAmount = trimSpace(payAmount);
			if (!NumberUtil.isDouble(payAmount)) {
				return ResultBO.err(MessageCodeConstants.PAY_AMOUNT_ERROR_SERVICE);
			}
			payParam.setPayAmount(Double.parseDouble(payAmount));
		}
		return ResultBO.ok(payParam);
	}

	/**  
	* 方法说明: 验证支付参数
	* @auth: xiongJinGang
	* @param payInputParam
	* @param platform 客户端
	* @time: 2017年5月8日 下午4:01:31
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validatePayParams(PayInputParamVO payInputParam, TakenPlatformEnum platform) {
		PayParamVO payParam = new PayParamVO();
		if (ObjectUtil.isBlank(payInputParam.getToken())) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		payParam.setToken(trimSpace(payInputParam.getToken()));

		// 订单号
		String orderCode = payInputParam.getOrderCode();
		if (ObjectUtil.isBlank(orderCode)) {
			return ResultBO.err(MessageCodeConstants.ORDER_CODE_IS_NULL_FIELD);
		}
		payParam.setOrderCode(trimSpace(orderCode));
		if (orderCode.contains(",")) {
			// 批量支付
			payParam.setIsBatchPay(PayConstants.BatchPayEnum.BATCH.getKey());
			String buyType = payInputParam.getBuyType();
			if (ObjectUtil.isBlank(buyType) || !buyType.contains(",")) {
				return ResultBO.err(MessageCodeConstants.PAY_ORDER_BUYTYPE_ERROR_SERVICE);
			}
			String[] orderCodes = orderCode.split(",");
			String[] buyTypes = buyType.split(",");
			if (orderCodes.length != buyTypes.length) {
				return ResultBO.err(MessageCodeConstants.PAY_ORDER_BUYTYPE_ERROR_SERVICE);
			}
			// 未支付订单数超限额
			if (orderCodes.length > Constants.BATCH_PAY_LARGEST_ORDER_NUM) {
				return ResultBO.err(MessageCodeConstants.ORDER_NOT_PAY_COUNT_BEYONG);
			}
			payParam.setBuyType(buyType);
			List<OrderQueryVo> orderQueryVoList = new ArrayList<OrderQueryVo>();
			OrderQueryVo orderQueryVo = null;
			for (int i = 0; i < buyTypes.length; i++) {
				String bt = trimSpace(buyTypes[i]);
				if (!NumberUtil.isDigits(bt)) {
					return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
				}
				Integer buyTypeInt = Integer.parseInt(bt);
				if (!PayConstants.BuyTypeEnum.containsKey(buyTypeInt)) {
					return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
				}
				orderQueryVo = new OrderQueryVo();
				orderQueryVo.setOrderCode(trimSpace(orderCodes[i]));
				orderQueryVo.setBuyType(buyTypeInt);
				orderQueryVoList.add(orderQueryVo);
				payParam.setOrderQueryVoList(orderQueryVoList);
			}
		} else {
			// 单个支付
			payParam.setIsBatchPay(PayConstants.BatchPayEnum.SINGLE.getKey());
		}
		// 红包编号
		if (!ObjectUtil.isBlank(payInputParam.getRedCode())) {
			payParam.setRedCode(trimSpace(payInputParam.getRedCode()));
		}
		// 微信、支付宝的openId
		if (!ObjectUtil.isBlank(payInputParam.getoId())) {
			payParam.setOpenId(trimSpace(payInputParam.getoId()));
		}
		// 微信appId
		if (!ObjectUtil.isBlank(payInputParam.getaId())) {
			payParam.setAppId(trimSpace(payInputParam.getaId()));
		}
		// 推单ID
		if (!ObjectUtil.isBlank(payInputParam.getIssueId())) {
			payParam.setIssueId(trimSpace(payInputParam.getIssueId()));
		}
		// 账户余额
		String balance = payInputParam.getBalance();
		if (!ObjectUtil.isBlank(balance)) {
			balance = trimSpace(balance);
			if (!NumberUtil.isDouble(balance)) {
				return ResultBO.err(MessageCodeConstants.PAY_BALANCE_ERROR_SERVICE);
			}
			payParam.setBalance(Double.parseDouble(balance));
		}

		// 银行ID为空，返回支付方式为空
		String bankId = payInputParam.getBankId();
		if (ObjectUtil.isBlank(bankId)) {
			if (ObjectUtil.isBlank(balance) && ObjectUtil.isBlank(payInputParam.getRedCode())) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_IS_NULL_FIELD);
			}
		} else {
			bankId = trimSpace(bankId);
			try {
				payParam.setBankId(Integer.parseInt(bankId));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
			}
			// 支付同步返回地址
			String returnUrl = payInputParam.getReturnUrl();
			// 只有PC端需要传
			if (platform.equals(PayConstants.TakenPlatformEnum.WEB)) {
				if (ObjectUtil.isBlank(returnUrl)) {
					return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_IS_NULL_FIELD);
				}
			}
			if (!ObjectUtil.isBlank(returnUrl)) {
				if (!returnUrl.matches(RegularValidateUtil.REGULAR_URL)) {
					return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_ERROR_SERVICE);
				}
				payParam.setReturnUrl(trimSpace(returnUrl));
			}
		}

		// 银行卡ID不为空
		String bankCardId = payInputParam.getBankCardId();
		if (!ObjectUtil.isBlank(bankCardId)) {
			bankCardId = trimSpace(bankCardId);
			try {
				payParam.setBankCardId(Integer.parseInt(bankCardId));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_ERROR_SERVICE);
			}
		}

		// 支付金额
		String payAmount = payInputParam.getPayAmount();
		if (!ObjectUtil.isBlank(payAmount)) {
			payAmount = trimSpace(payAmount);
			try {
				payParam.setPayAmount(Double.parseDouble(payAmount));
			} catch (Exception e) {
				return ResultBO.err(MessageCodeConstants.PAY_AMOUNT_ERROR_SERVICE);
			}
		}
		// 渠道Id
		String channelId = payInputParam.getChannelId();
		if (!ObjectUtil.isBlank(channelId)) {
			payParam.setChannelId(channelId);
		} else {
			payParam.setChannelId(PayConstants.ChannelEnum.UNKNOWN.getKey());
		}
		// 网银、快捷是否切换，0不切换、1切换
		String change = payInputParam.getChange();
		// 不为空，并且等于1，表示切换，其它值不切换
		if (!ObjectUtil.isBlank(change) && change.equals("1")) {
			payParam.setChange(PayConstants.ChangeEnum.YES.getKey());
		} else {
			payParam.setChange(PayConstants.ChangeEnum.NO.getKey());
		}

		return ResultBO.ok(payParam);
	}

	/**  
	* 方法说明: 验证充值参数
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年4月8日 下午3:05:51
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateRechargeParams(HttpServletRequest request, boolean isTest) {
		RechargeParamVO rechargeParam = new RechargeParamVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		rechargeParam.setToken(trimSpace(token));

		String redCode = request.getParameter("redCode");// redCode
		if (!ObjectUtil.isBlank(redCode)) {
			rechargeParam.setRedCode(redCode);
		}

		// 银行ID为空，返回支付方式为空
		String bankId = request.getParameter("bankId");
		if (ObjectUtil.isBlank(bankId)) {
			return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_IS_NULL_FIELD);
		} else {
			bankId = trimSpace(bankId);
			if (!NumberUtil.isDigits(bankId)) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
			}
			rechargeParam.setBankId(Integer.parseInt(bankId));
			// 支付同步返回地址
			String returnUrl = request.getParameter("returnUrl");
			if (ObjectUtil.isBlank(returnUrl)) {
				return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_IS_NULL_FIELD);
			}
			if (!returnUrl.matches(RegularValidateUtil.REGULAR_URL)) {
				return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_ERROR_SERVICE);
			}
			rechargeParam.setReturnUrl(trimSpace(returnUrl));
		}

		// 银行卡ID不为空
		String bankCardId = request.getParameter("bankCardId");
		if (!ObjectUtil.isBlank(bankCardId)) {
			bankCardId = trimSpace(bankCardId);
			if (!NumberUtil.isDigits(bankCardId)) {
				return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_ERROR_SERVICE);
			}
			rechargeParam.setBankCardId(Integer.parseInt(bankCardId));
		}

		// 充值金额
		String rechargeAmount = request.getParameter("rechargeAmount");
		if (ObjectUtil.isBlank(rechargeAmount)) {
			return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_BALANCE_IS_NULL_FIELD);
		} else {
			rechargeAmount = trimSpace(rechargeAmount);
			if (!NumberUtil.isDouble(rechargeAmount)) {
				return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_BALANCE_ERROR_SERVICE);
			}
			Double rechargeAmountDou = Double.valueOf(rechargeAmount);
			// 正式环境才验证下面
			if (!isTest) {
				// 充值金额必须为整数
				if (!NumberUtil.isDouble(rechargeAmount)) {
					return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_BALANCE_ERROR_SERVICE);
				}
				// 判断充值金额是否低于最低充值金额
				if (MathUtil.compareTo(rechargeAmountDou, Constants.RECHARGE_LOWEST_AMOUNT) < 0) {
					return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_AMOUNT_ERROR_SERVICE);
				}
			}
			rechargeParam.setRechargeAmount(rechargeAmountDou);
		}
		return ResultBO.ok(rechargeParam);
	}

	public static ResultBO<?> validateRechargeParams(RechargeInputParamVO rechargeInputParam, boolean isTest, TakenPlatformEnum platform) {
		RechargeParamVO rechargeParam = new RechargeParamVO();
		if (ObjectUtil.isBlank(rechargeInputParam.getToken())) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		rechargeParam.setToken(trimSpace(rechargeInputParam.getToken()));

		if (!ObjectUtil.isBlank(rechargeInputParam.getRedCode())) {
			rechargeParam.setRedCode(rechargeInputParam.getRedCode());
		}

		// 微信、支付宝的openId
		if (!ObjectUtil.isBlank(rechargeInputParam.getoId())) {
			rechargeParam.setOpenId(trimSpace(rechargeInputParam.getoId()));
		}

		// 微信appId
		if (!ObjectUtil.isBlank(rechargeInputParam.getaId())) {
			rechargeParam.setAppId(trimSpace(rechargeInputParam.getaId()));
		}

		// 银行ID为空，返回支付方式为空
		String bankId = rechargeInputParam.getBankId();
		if (ObjectUtil.isBlank(bankId)) {
			return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_IS_NULL_FIELD);
		} else {
			bankId = trimSpace(bankId);
			if (!NumberUtil.isDigits(bankId)) {
				return ResultBO.err(MessageCodeConstants.TRANS_PAY_TYPE_ERROR_SERVICE);
			}
			rechargeParam.setBankId(Integer.parseInt(bankId));
			// 支付同步返回地址
			String returnUrl = rechargeInputParam.getReturnUrl();
			// 只有web的才需要支付同步地址
			if (platform.equals(PayConstants.TakenPlatformEnum.WEB)) {
				if (ObjectUtil.isBlank(returnUrl)) {
					return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_IS_NULL_FIELD);
				}
			}
			if (!ObjectUtil.isBlank(returnUrl)) {
				if (!returnUrl.matches(RegularValidateUtil.REGULAR_URL)) {
					return ResultBO.err(MessageCodeConstants.PAY_RETURN_URL_ERROR_SERVICE);
				}
				rechargeParam.setReturnUrl(trimSpace(returnUrl));
			}
		}

		// 银行卡ID不为空
		String bankCardId = rechargeInputParam.getBankCardId();
		if (!ObjectUtil.isBlank(bankCardId)) {
			bankCardId = trimSpace(bankCardId);
			if (!NumberUtil.isDigits(bankCardId)) {
				return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_ERROR_SERVICE);
			}
			rechargeParam.setBankCardId(Integer.parseInt(bankCardId));
		}
		ResultBO<?> resultBO = validateRechargeAmount(rechargeInputParam.getRechargeAmount(), isTest);
		if (resultBO.isError()) {
			return resultBO;
		}
		rechargeParam.setRechargeAmount((Double) resultBO.getData());

		// 渠道ID
		if (!ObjectUtil.isBlank(rechargeInputParam.getChannelId())) {
			rechargeParam.setChannelId(rechargeInputParam.getChannelId());
		} else {
			rechargeParam.setChannelId(PayConstants.ChannelEnum.UNKNOWN.getKey());
		}

		// 网银、快捷是否切换，0不切换、1切换
		// 不为空，并且等于1，表示切换，其它值不切换
		if (!ObjectUtil.isBlank(rechargeInputParam.getChange()) && rechargeInputParam.getChange().equals("1")) {
			rechargeParam.setChange(PayConstants.ChangeEnum.YES.getKey());
		} else {
			rechargeParam.setChange(PayConstants.ChangeEnum.NO.getKey());
		}

		// 是否活动页面充值 0或者空不是 、1是
		if (!ObjectUtil.isBlank(rechargeInputParam.getActivity()) && rechargeInputParam.getActivity().equals("1")) {
			rechargeParam.setActivity(rechargeInputParam.getActivity());
		} else {
			rechargeParam.setActivity("0");
		}

		if (!ObjectUtil.isBlank(rechargeInputParam.getHdCode())) {
			rechargeParam.setHdCode(rechargeInputParam.getHdCode());
		}

		return ResultBO.ok(rechargeParam);
	}

	/**  
	* 方法说明: 验证充值金额
	* @auth: xiongJinGang
	* @param rechargeAmount
	* @param isTest
	* @time: 2017年5月18日 上午10:08:04
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateRechargeAmount(String rechargeAmount, boolean isTest) {
		if (ObjectUtil.isBlank(rechargeAmount)) {
			return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_BALANCE_IS_NULL_FIELD);
		} else {
			rechargeAmount = trimSpace(rechargeAmount);
			if (!NumberUtil.isDouble(rechargeAmount)) {
				return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_BALANCE_ERROR_SERVICE);
			}
			Double rechargeAmountDou = Double.valueOf(rechargeAmount);
			// 正式环境才验证下面
			if (!isTest) {
				// 充值金额必须为整数
				if (!NumberUtil.isDouble(rechargeAmount)) {
					return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_BALANCE_ERROR_SERVICE);
				}
				// 判断充值金额是否低于最低充值金额
				if (MathUtil.compareTo(rechargeAmountDou, Constants.RECHARGE_LOWEST_AMOUNT) < 0) {
					return ResultBO.err(MessageCodeConstants.PAY_RECHARGE_AMOUNT_ERROR_SERVICE);
				}
			}
			return ResultBO.ok(rechargeAmountDou);
		}
	}

	/**  
	* 方法说明: 去除字符串左右空格
	* @auth: xiongJinGang
	* @param value
	* @time: 2017年4月13日 上午10:00:15
	* @return: String 
	*/
	private static String trimSpace(String value) {
		if (!ObjectUtil.isBlank(value)) {
			return value.trim();
		}
		return value;
	}

	/**  
	* 方法说明: 将对象转成string类型
	* @auth: xiongJinGang
	* @param resultBO
	* @time: 2017年4月11日 下午5:22:38
	* @return: String 
	*/
	public static String showString(ResultBO<?> resultBO) {
		return JSON.toJSONString(resultBO);
	}

	/**  
	* 方法说明: 根据支付类型返回相应结果
	* @auth: xiongJinGang
	* @param payWayCode
	* @time: 2017年4月17日 下午12:06:59
	* @return: String 
	*/
	public static String returnByPayWay(String payWayCode) {
		ChannelTypeEnum channelTypeEnum = PayConstants.ChannelTypeEnum.getEnum(payWayCode);
		String message = "SUCCESS";
		switch (channelTypeEnum) {
		case LIANLIAN_WEB:
			message = "{\"ret_code\":\"0000\",\"ret_msg\":\"交易成功\"}";
			break;
		case ALIPAY_APP:
			message = "success";
			break;
		case WECHAT_WEB:
			message = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";
			break;
		default:
			break;
		}
		return message;
	}

	/**  
	* 方法说明: 验证提款参数
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年4月20日 下午4:30:19
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateTakenParams(HttpServletRequest request) {
		TakenValidateTypeVO takenValidateType = new TakenValidateTypeVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		takenValidateType.setToken(trimSpace(token));

		String type = request.getParameter("type");// 验证类型
		if (ObjectUtil.isBlank(type)) {
			return ResultBO.err(MessageCodeConstants.TAKEN_VALIDATE_TYPE_ERROR_SERVICE);
		}
		type = trimSpace(type);
		if (!NumberUtil.isDigits(type)) {
			return ResultBO.err(MessageCodeConstants.TAKEN_VALIDATE_TYPE_ERROR_SERVICE);
		}
		takenValidateType.setType(Short.parseShort(type));

		String validateStr = request.getParameter("validateStr");// validateStr
		if (ObjectUtil.isBlank(validateStr)) {
			return ResultBO.err(MessageCodeConstants.TAKEN_VALIDATE_TYPE_ERROR_SERVICE);
		}
		takenValidateType.setValidateStr(validateStr);
		return ResultBO.ok(takenValidateType);
	}

	/**  
	* 方法说明: 验证提款请求金额
	* @auth: xiongJinGang
	* @param request
	* @time: 2017年4月20日 下午5:00:31
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateTakenAmount(HttpServletRequest request, boolean validateTakenIds) {
		TakenReqParamVO takenReqParamVO = new TakenReqParamVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		takenReqParamVO.setToken(trimSpace(token));

		String bankCardId = request.getParameter("bankCardId");// 银行卡Id
		if (ObjectUtil.isBlank(bankCardId)) {
			return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_IS_NULL_FIELD);
		}
		bankCardId = trimSpace(bankCardId);
		if (!NumberUtil.isDigits(bankCardId)) {
			return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_ERROR_SERVICE);
		}
		takenReqParamVO.setBankCardId(Integer.parseInt(bankCardId));

		/*		String takenToken = request.getParameter("takenToken");// takenToken
				if (ObjectUtil.isBlank(takenToken)) {
					return ResultBO.err(MessageCodeConstants.TAKEN_CONFIRM_TIME_OUT_ERROR_SERVICE);
				}
				takenReqParamVO.setTakenToken(takenToken);*/

		String takenAmount = request.getParameter("takenAmount");// 提款金额
		if (ObjectUtil.isBlank(takenAmount)) {
			return ResultBO.err(MessageCodeConstants.TAKEN_AMOUNT_IS_NULL_FIELD);
		}
		takenAmount = trimSpace(takenAmount);
		if (!NumberUtil.isDouble(takenAmount)) {
			return ResultBO.err(MessageCodeConstants.PAY_AMOUNT_ERROR_SERVICE);
		}
		takenReqParamVO.setTakenAmount(Double.parseDouble(takenAmount));

		if (validateTakenIds) {
			String takenIds = request.getParameter("takenIds");
			if (ObjectUtil.isBlank(takenIds)) {
				return ResultBO.err(MessageCodeConstants.TAKEN_CONFIRM_IS_NULL_FIELD);
			}
			takenIds = StringUtil.replaceSign(takenIds);
			String[] ids = takenIds.split(",");
			for (String id : ids) {
				id = StringUtil.trimSpace(id);
				if (!NumberUtil.isDigits(id)) {
					return ResultBO.err(MessageCodeConstants.TAKEN_CONFIRM_ERROR_SERVICE);
				}
			}
			takenReqParamVO.setTakenIds(takenIds);

		}
		return ResultBO.ok(takenReqParamVO);
	}

	/**  
	* 方法说明: 验证提款金额请求参数
	* @auth: xiongJinGang
	* @param TakenInputReqParamVO
	* @time: 2017年8月22日 下午6:33:44
	* @return: ResultBO<?> 
	*/
	public static ResultBO<?> validateTakenAmount(TakenInputReqParamVO TakenInputReqParamVO) {
		TakenReqParamVO takenReqParamVO = new TakenReqParamVO();
		String token = TakenInputReqParamVO.getToken();// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		takenReqParamVO.setToken(trimSpace(token));

		String takenAmount = TakenInputReqParamVO.getTakenAmount();// 提款金额
		if (ObjectUtil.isBlank(takenAmount)) {
			return ResultBO.err(MessageCodeConstants.TAKEN_AMOUNT_IS_NULL_FIELD);
		}
		takenAmount = trimSpace(takenAmount);
		if (!NumberUtil.isDouble(takenAmount)) {
			return ResultBO.err(MessageCodeConstants.PAY_AMOUNT_ERROR_SERVICE);
		}
		takenReqParamVO.setTakenAmount(Double.parseDouble(takenAmount));

		return ResultBO.ok(takenReqParamVO);
	}

	public static ResultBO<?> validateTakenAmount(TakenInputReqParamVO TakenInputReqParamVO, boolean validateTakenIds) {
		TakenReqParamVO takenReqParamVO = new TakenReqParamVO();
		String token = TakenInputReqParamVO.getToken();// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		takenReqParamVO.setToken(trimSpace(token));

		String bankCardId = TakenInputReqParamVO.getBankCardId();// 银行卡Id
		if (ObjectUtil.isBlank(bankCardId)) {
			return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_IS_NULL_FIELD);
		}
		bankCardId = trimSpace(bankCardId);
		if (!NumberUtil.isDigits(bankCardId)) {
			return ResultBO.err(MessageCodeConstants.PAY_BANK_CARD_ID_ERROR_SERVICE);
		}
		takenReqParamVO.setBankCardId(Integer.parseInt(bankCardId));

		/*		String takenToken = TakenInputReqParamVO.getTakenToken();// takenToken
				if (ObjectUtil.isBlank(takenToken)) {
					return ResultBO.err(MessageCodeConstants.TAKEN_CONFIRM_TIME_OUT_ERROR_SERVICE);
				}
				takenReqParamVO.setTakenToken(takenToken);*/

		String takenAmount = TakenInputReqParamVO.getTakenAmount();// 提款金额
		if (ObjectUtil.isBlank(takenAmount)) {
			return ResultBO.err(MessageCodeConstants.TAKEN_AMOUNT_IS_NULL_FIELD);
		}
		takenAmount = trimSpace(takenAmount);
		if (!NumberUtil.isDouble(takenAmount)) {
			return ResultBO.err(MessageCodeConstants.PAY_AMOUNT_ERROR_SERVICE);
		}
		takenReqParamVO.setTakenAmount(Double.parseDouble(takenAmount));

		if (validateTakenIds) {
			String takenIds = TakenInputReqParamVO.getTakenIds();
			if (ObjectUtil.isBlank(takenIds)) {
				return ResultBO.err(MessageCodeConstants.TAKEN_CONFIRM_IS_NULL_FIELD);
			}
			takenIds = StringUtil.replaceSign(takenIds);
			String[] ids = takenIds.split(",");
			for (String id : ids) {
				id = StringUtil.trimSpace(id);
				if (!NumberUtil.isDigits(id)) {
					return ResultBO.err(MessageCodeConstants.TAKEN_CONFIRM_ERROR_SERVICE);
				}
			}
			takenReqParamVO.setTakenIds(takenIds);
		} else {
			String bankName = TakenInputReqParamVO.getBankName();// bankName
			if (ObjectUtil.isBlank(bankName)) {
				return ResultBO.err(MessageCodeConstants.BANK_NAME_IS_NULL_FIELD);
			}
			takenReqParamVO.setBankName(bankName);
		}

		// 渠道ID
		String channelId = TakenInputReqParamVO.getChannelId();
		if (!ObjectUtil.isBlank(channelId)) {
			takenReqParamVO.setChannelId(channelId);
		} else {
			takenReqParamVO.setChannelId(PayConstants.ChannelEnum.UNKNOWN.getKey());
		}

		return ResultBO.ok(takenReqParamVO);
	}

	public static ResultBO<?> validateAppTransRedParams(HttpServletRequest request) {
		TransRedVO transParam = new TransRedVO();
		String token = request.getParameter("token");// token
		if (ObjectUtil.isBlank(token)) {
			return ResultBO.err(MessageCodeConstants.TOKEN_LOSE_SERVICE);
		}
		transParam.setToken(trimSpace(token));
		String redCode = request.getParameter("redCode");// 红包编号
		if (ObjectUtil.isBlank(redCode)) {
			return ResultBO.err(MessageCodeConstants.PAY_RED_CODE_IS_NULL_FIELD);
		}
		transParam.setRedCode(redCode);
		String currentPage = request.getParameter("currentPage");//
		if (!ObjectUtil.isBlank(currentPage)) {
			currentPage = trimSpace(currentPage);
			if (!NumberUtil.isDigits(currentPage)) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_CURRENT_PAGE_ERROR_SERVICE);
			}
			transParam.setCurrentPage(Integer.parseInt(currentPage));
		}

		String showCount = request.getParameter("showCount");//
		if (!ObjectUtil.isBlank(showCount)) {
			showCount = trimSpace(showCount);
			if (!NumberUtil.isDigits(showCount)) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_SHOW_COUNT_ERROR_SERVICE);
			}
			Integer showCountInt = Integer.parseInt(showCount);
			if (Integer.compare(showCountInt, Constants.MAX_SHOW_NUM) > 0) {
				return ResultBO.err(MessageCodeConstants.PAY_QUERY_SHOW_COUNT_LIMIT_ERROR_SERVICE);
			}
			transParam.setShowCount(showCountInt);
		}

		return ResultBO.ok(transParam);
	}

	// 0失败，1成功，-1异常
	public static String mockResult(int code, String msg) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", code);
		jsonObject.put("msg", msg);
		return jsonObject.toJSONString();
	}

	/**  
	* 方法说明: 根据页面传过来的平台，转成后台需要的平台
	* @auth: xiongJinGang
	* @param clientType
	* @time: 2017年7月11日 上午9:53:53
	* @return: TakenPlatformEnum 
	*/
	public static TakenPlatformEnum transPlatform(String clientType) {
		TakenPlatformEnum takenPlatformEnum = PayConstants.TakenPlatformEnum.WAP;
		if (ObjectUtil.isBlank(clientType)) {
			return takenPlatformEnum;
		}
		Short platform = Short.parseShort(clientType);
		TakenPlatformEnum takenPlatform = PayConstants.TakenPlatformEnum.getByKey(platform);
		if (ObjectUtil.isBlank(takenPlatform)) {
			return takenPlatformEnum;
		} else {
			return takenPlatform;
		}
	}

	/**  
	* 方法说明: 获了以异步通知
	* @auth: xiongJinGang
	* @param payWayCode
	* @param request
	* @time: 2017年10月19日 下午2:44:48
	* @return: Map<String,String> 
	*/
	@SuppressWarnings("unchecked")
	public static Map<String, String> getNotify(String payWayCode, HttpServletRequest request) {
		Map<String, String> notifyMap = new HashMap<String, String>();
		if (!ObjectUtil.isBlank(payWayCode)) {
			try {
				if (analyXmlMap.containsKey(payWayCode)) {
					// 微信、兴业获取异步回调
					notifyMap = XmlUtil.parseXml(request.getInputStream());// 从request中取得输入流
				} else if (analyFormMap.containsKey(payWayCode)) {
					// 现在支付获取异步回调
					String reportContent = PayCommon.readRequest(request);
					if (!ObjectUtil.isBlank(reportContent)) {
						String decodeReqStr = URLDecoder.decode(reportContent, "GBK");
						String[] reqArry = decodeReqStr.split("&");
						for (String reqItem : reqArry) {
							String[] reqItemArray = reqItem.split("=");
							if (reqItemArray.length != 1) {
								if (reqItemArray.length == 2) {
									notifyMap.put(reqItemArray[0], reqItemArray[1]);
								}
							}
						}
					}
				} else if (analyStreamMap.containsKey(payWayCode)) {
					// 连连网银支付返回的是流，将流转成字符串，然后通过map传递
					notifyMap = PayCommon.readReqStream(request);
				} else if (analyReqStringMap.containsKey(payWayCode)) {
					// 神州支付、好店啊支付获取异步回调
					String reportContent = PayCommon.readRequest(request);
					if (!ObjectUtil.isBlank(reportContent)) {
						notifyMap = JSON.parseObject(reportContent, Map.class);
					}
				} else {
					// 通用获取异步回调
					notifyMap = PayCommon.getReqParams(request);
				}
			} catch (Exception e) {
				logger.error("解析【" + payWayCode + "】异步通知参数异常。" + e.getMessage());
			}
		}
		return notifyMap;
	}
}
