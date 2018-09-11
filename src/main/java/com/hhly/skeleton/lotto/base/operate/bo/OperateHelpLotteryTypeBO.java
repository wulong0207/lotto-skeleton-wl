package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.List;

import com.hhly.skeleton.lotto.base.lottery.bo.LotteryTypeBO;

/**
 * 帮助中心彩种
 *
 * @author huangchengfang1219
 * @date 2018年2月22日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpLotteryTypeBO extends LotteryTypeBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 571935771668953314L;

	private String typeCode;

	/**
	 * 子栏目
	 */
	private List<OperateHelpTypeBO> childNode;

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public List<OperateHelpTypeBO> getChildNode() {
		return childNode;
	}

	public void setChildNode(List<OperateHelpTypeBO> childNode) {
		this.childNode = childNode;
	}

}
