package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.constants.PayConstants.PayBankCodeEnum;
import com.hhly.skeleton.base.constants.PayConstants.PayTypeEnum;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.pay.bo.PayBankBO;

/**
 * @desc 充值、交易相关
 * @author xiongJinGang
 * @date 2017年10月27日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RechargeConstants {
	/**  
	* 方法说明: 获取第三方支付的支付类型
	* @auth: xiongJinGang
	* @param payBankBO
	* @time: 2017年10月11日 上午11:41:25
	* @return: String 
	*/
	public static String getThirdPayType(PayBankBO payBankBO) {
		PayBankCodeEnum payBankCodeEnum = PayBankCodeEnum.getEnum(payBankBO.getCode());
		if (!ObjectUtil.isBlank(payBankCodeEnum)) {
			switch (payBankCodeEnum) {
			case WECHAT:
				return PayConstants.PayTypeThirdEnum.WEIXIN_PAYMENT.getKey();
			case ALIPAY:
				return PayConstants.PayTypeThirdEnum.ALIPAY_PAYMENT.getKey();
			case QQ:
				return PayConstants.PayTypeThirdEnum.QQ_PAYMENT.getKey();
			case CARD:
				return PayConstants.PayTypeThirdEnum.RECHARGE_CARD_PAYMENT.getKey();
			case JD:
				return PayConstants.PayTypeThirdEnum.JD_PAYMENT.getKey();
			case TA:
				return PayConstants.PayTypeThirdEnum.TA_PAYMENT.getKey();
			default:
				break;
			}
		}
		return null;
	}

	public static Short getThirdTradeType(PayBankBO payBankBO) {
		PayBankCodeEnum payBankCodeEnum = PayBankCodeEnum.getEnum(payBankBO.getCode());
		if (!ObjectUtil.isBlank(payBankCodeEnum)) {
			switch (payBankCodeEnum) {
			case WECHAT:
				return PayConstants.PayTypeEnum.WECHART_PAYMENT.getKey();
			case ALIPAY:
				return PayConstants.PayTypeEnum.ALIPAY_PAYMENT.getKey();
			case QQ:
				return PayConstants.PayTypeEnum.QQ_PAYMENT.getKey();
			case CARD:
				return PayConstants.PayTypeEnum.CARD_PAYMENT.getKey();
			case JD:
				return PayConstants.PayTypeEnum.JD_PAYMENT.getKey();
			case TA:
				return PayConstants.PayTypeEnum.TA_PAYMENT.getKey();
			default:
				return PayConstants.PayTypeEnum.THIRD_PAYMENT.getKey();
			}
		}
		return null;
	}

	/**  
	* 方法说明: 根据我们平台的支付类型，获取第三方的支付类型（前期没有定义好，导致需要转换）
	* @auth: xiongJinGang
	* @param payType
	* @time: 2017年12月16日 上午10:50:04
	* @return: String 
	*/
	public static String getThirdTypeByPayType(Short payType) {
		PayTypeEnum payTypeEnum = PayConstants.PayTypeEnum.getEnum(payType);

		if (!ObjectUtil.isBlank(payTypeEnum)) {
			switch (payTypeEnum) {
			case BANK_PAYMENT:
				return PayConstants.PayTypeThirdEnum.BANK_DEBIT_CARD_PAYMENT.getKey();
			case QUICK_PAYMENT:
				return PayConstants.PayTypeThirdEnum.QUICK_DEBIT_CARD_PAYMENT.getKey();
			case ALIPAY_PAYMENT:
				return PayConstants.PayTypeThirdEnum.ALIPAY_PAYMENT.getKey();
			case WECHART_PAYMENT:
				return PayConstants.PayTypeThirdEnum.WEIXIN_PAYMENT.getKey();
			case QQ_PAYMENT:
				return PayConstants.PayTypeThirdEnum.QQ_PAYMENT.getKey();
			case CARD_PAYMENT:
				return PayConstants.PayTypeThirdEnum.RECHARGE_CARD_PAYMENT.getKey();
			case JD_PAYMENT:
				return PayConstants.PayTypeThirdEnum.JD_PAYMENT.getKey();
			case TA_PAYMENT:
				return PayConstants.PayTypeThirdEnum.TA_PAYMENT.getKey();
			// case THIRD_PAYMENT:
			// return PayConstants.PayTypeThirdEnum.QQ_PAYMENT.getKey();
			// case HAND_PAYMENT:
			// return PayConstants.PayTypeThirdEnum.JD_PAYMENT.getKey();
			// case AGENT_PAYMENT:
			// return PayConstants.PayTypeThirdEnum.JD_PAYMENT.getKey();
			default:
				return PayConstants.PayTypeThirdEnum.JD_PAYMENT.getKey();
			}
		}
		return null;
	}

}
