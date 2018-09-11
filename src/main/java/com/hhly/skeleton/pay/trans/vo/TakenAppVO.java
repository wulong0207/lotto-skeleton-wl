package com.hhly.skeleton.pay.trans.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.pay.bo.TransTakenBO;

/**
 * @desc 用户提款信息记录表，给APP展示
 * @author xiongJinGang
 * @date 2017年12月20日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenAppVO extends BaseBO {

	private static final long serialVersionUID = 1728881085812204831L;
	/**
	*自定义用户充值流水编号
	*/
	@JsonProperty("t_t_c")
	private String transTakenCode;
	/**
	*提款金额
	*/
	@JsonProperty("e_a")
	private String extractAmount;
	/**
	*服务费
	*/
	@JsonProperty("s_c")
	private Double serviceCharge;
	/**
	*提款状态名称
	*/
	@JsonProperty("t_s_n")
	private String transStatusName;
	@JsonProperty("c_t_s")
	private String createTimeStr;// 给移动端的创建时间字符串
	@JsonProperty("s_r")
	private String showRemark;//

	public TakenAppVO(TransTakenBO transTakenBO) {
		super();
		this.transTakenCode = transTakenBO.getTransTakenCode();
		this.extractAmount = "-" + transTakenBO.getExtractAmount();
		this.serviceCharge = transTakenBO.getServiceCharge();
		this.transStatusName = transTakenBO.getTransStatusName();
		if (ObjectUtil.isBlank(transTakenBO.getBankCardNum())) {
			this.showRemark = "提款-" + transTakenBO.getTakenBankName();
		} else {
			this.showRemark = "提款-" + transTakenBO.getTakenBankName() + "：" + StringUtil.hideHeadString(transTakenBO.getBankCardNum());
		}
	}

	public String getTransTakenCode() {
		return transTakenCode;
	}

	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode;
	}

	public String getExtractAmount() {
		return extractAmount;
	}

	public void setExtractAmount(String extractAmount) {
		this.extractAmount = extractAmount;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getTransStatusName() {
		return transStatusName;
	}

	public void setTransStatusName(String transStatusName) {
		this.transStatusName = transStatusName;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getShowRemark() {
		return showRemark;
	}

	public void setShowRemark(String showRemark) {
		this.showRemark = showRemark;
	}

}
