package com.hhly.skeleton.draw.issue.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.util.LotUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.draw.lottery.bo.DrawCodeTypeBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueDrawBO;

public class DrawLotteryIssueBO extends IssueDrawBO {

	private static final long serialVersionUID = -5432828118690154535L;

	@JsonIgnore
	@Override
	public String getDrawDetail() {
		return super.getDrawDetail();
	}

	/**
	 * 开奖详情列表
	 */
	private List<DrawDetailBO> drawDetailList;

	/**
	 * 用于列表页显示开奖详情(一等奖)
	 */
	private DrawDetailBO drawDetailView;

	/**
	 * 用于显示开奖号码的形态（组三、组六、和值等）
	 */
	private DrawCodeTypeBO drawCodeType;

	public List<DrawDetailBO> getDrawDetailList() {
		return drawDetailList;
	}

	public void setDrawDetailList(List<DrawDetailBO> drawDetailList) {
		this.drawDetailList = drawDetailList;
	}

	public DrawDetailBO getDrawDetailView() {
		return drawDetailView;
	}

	public void setDrawDetailView(DrawDetailBO drawDetailView) {
		this.drawDetailView = drawDetailView;
	}

	public DrawCodeTypeBO getDrawCodeType() {
		return drawCodeType;
	}

	public void setDrawCodeType(DrawCodeTypeBO drawCodeType) {
		this.drawCodeType = drawCodeType;
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

	@JsonIgnore
	public String[] getDrawCodeTestArr() {
		return LotUtil.split(this.getDrawCodeTest());
	}
}
