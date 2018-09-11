package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants;

/**
 * @desc 提款请求验证
 * @author xiongJinGang
 * @date 2017年11月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TakenCountValidateVO extends BaseBO {
	private Integer count;
	private Integer haveBankCard = PayConstants.IsDefaultEnum.FALSE.getKey();// 是否有储蓄卡，0没有，1有
	private List<TakenProcessVO> list;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<TakenProcessVO> getList() {
		return list;
	}

	public void setList(List<TakenProcessVO> list) {
		this.list = list;
	}

	public Integer getHaveBankCard() {
		return haveBankCard;
	}

	public void setHaveBankCard(Integer haveBankCard) {
		this.haveBankCard = haveBankCard;
	}

}
