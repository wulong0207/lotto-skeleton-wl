package com.hhly.skeleton.draw.home.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.hhly.skeleton.base.util.LotUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.draw.lottery.bo.DrawCodeTypeBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueDrawBO;
import com.hhly.skeleton.lotto.base.issue.bo.draw.DrawOtherBO;

/**
 * @desc 开奖主页各彩种最新一期开奖信息
 * @author huangchengfang1219
 * @date 2017年10月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawHomeLotteryIssueBO extends IssueDrawBO {

	private static final long serialVersionUID = -6394875854215629756L;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 彩种名称
	 */
	private String lotteryName;

	/**
	 * 彩种图标
	 */
	private String lotteryLogoUrl;

	/**
	 * 彩种销售描述
	 */
	private String lotteryDrawText;

	/**
	 * 关键字
	 */
	private String lotteryKey;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public String getLotteryDrawText() {
		return lotteryDrawText;
	}

	public void setLotteryDrawText(String lotteryDrawText) {
		this.lotteryDrawText = lotteryDrawText;
	}

	public String getLotteryKey() {
		return lotteryKey;
	}

	public void setLotteryKey(String lotteryKey) {
		this.lotteryKey = lotteryKey;
	}

	@JsonIgnore
	public String[] getDrawCodeArr() {
		return LotUtil.split(this.getDrawCode());
	}

	@JsonIgnore
	public String[][] getDrawCodeArr2() {
		return LotUtil.split2(this.getDrawCode());
	}

	@Override
	public void setDrawCode(String drawCode) {
		if (!ObjectUtil.isBlank(drawCode)) {
			super.setDrawCode(drawCode);
		}
	}

	@JsonDeserialize(as = DrawCodeTypeBO.class)
	public DrawOtherBO getOther() {
		return super.getOther();
	}

}
