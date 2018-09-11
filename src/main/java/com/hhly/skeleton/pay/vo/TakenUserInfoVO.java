package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 提款第二步
 * @author xiongJinGang
 * @date 2017年4月18日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenUserInfoVO extends BaseBO {
	private static final long serialVersionUID = -6002622693576113997L;
	private String realName;// 实名
	// private String branchBankName;// 支行名称
	private String idNo;// 身份证号
	// private String bankCard;// 上一步中拿到的银行卡号
	// private String takenToken;// 每步的token，第一次提款成功了就清除
	private List<TakenBankCardVO> bankList;// 储蓄卡列表
	private TakenUserWalletVO userWallet;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public List<TakenBankCardVO> getBankList() {
		return bankList;
	}

	public void setBankList(List<TakenBankCardVO> bankList) {
		this.bankList = bankList;
	}

	public TakenUserWalletVO getUserWallet() {
		return userWallet;
	}

	public void setUserWallet(TakenUserWalletVO userWallet) {
		this.userWallet = userWallet;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

}
