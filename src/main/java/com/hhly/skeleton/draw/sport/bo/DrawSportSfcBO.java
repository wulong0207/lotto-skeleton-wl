package com.hhly.skeleton.draw.sport.bo;

import java.util.List;

import com.hhly.skeleton.draw.issue.bo.DrawDetailBO;
import com.hhly.skeleton.draw.issue.bo.DrawLotteryIssueBO;

/**
 * @desc 胜负彩开奖详情
 * @author huangchengfang1219
 * @date 2017年10月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawSportSfcBO extends DrawSportOldBO {

	private static final long serialVersionUID = -4122276063860397133L;

	public DrawSportSfcBO() {

	}

	public DrawSportSfcBO(DrawLotteryIssueBO bo) {
		super(bo);
	}

	/**
	 * 任9开奖详情
	 */
	private List<DrawDetailBO> drawDetailNineList;

	/**
	 * 任9奖池金额
	 */
	private Long jackpotAmountNine;

	/**
	 * 任9本期销售金额
	 */
	private Long salesAmountNine;

	public List<DrawDetailBO> getDrawDetailNineList() {
		return drawDetailNineList;
	}

	public void setDrawDetailNineList(List<DrawDetailBO> drawDetailNineList) {
		this.drawDetailNineList = drawDetailNineList;
	}

	public Long getJackpotAmountNine() {
		return jackpotAmountNine;
	}

	public void setJackpotAmountNine(Long jackpotAmountNine) {
		this.jackpotAmountNine = jackpotAmountNine;
	}

	public Long getSalesAmountNine() {
		return salesAmountNine;
	}

	public void setSalesAmountNine(Long salesAmountNine) {
		this.salesAmountNine = salesAmountNine;
	}

}
