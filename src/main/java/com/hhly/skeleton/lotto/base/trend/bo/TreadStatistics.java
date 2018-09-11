package com.hhly.skeleton.lotto.base.trend.bo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 用户走势的统计
 * 
 * @desc
 * @author chenghougui
 * @Date 2017年11月10日
 * @Company 益彩网络科技公司
 * @version
 */
@SuppressWarnings("serial")
public class TreadStatistics extends BaseVO{
	//彩种ID
	private int lotteryCode;
	// 父类型
	private String fatype;
	// 子类型
	private String sontype;
	// 号码
	private String ylCode;
	// 出现次数
	private int occurNum;
	// 最大遗漏
	private int maxOmit;
	// 最大连出
	private int maxOccur;
	// 上次遗漏
	private int preOmit;
	// 当前遗漏
	private int lastOmit;
	// 平均遗漏
	private int aveOmit;
	// 历史开奖率
	private double proccu;
	// 欲出概率
	private double occupro;
	// 当前连开次数
	private int lastOccur;

	public int getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(int lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getFatype() {
		return fatype;
	}

	public void setFatype(String fatype) {
		this.fatype = fatype;
	}

	public String getSontype() {
		return sontype;
	}

	public void setSontype(String sontype) {
		this.sontype = sontype;
	}

	public String getYlCode() {
		return ylCode;
	}

	public void setYlCode(String ylCode) {
		this.ylCode = ylCode;
	}

	public int getOccurNum() {
		return occurNum;
	}

	public void setOccurNum(int occurNum) {
		this.occurNum = occurNum;
	}

	public int getMaxOmit() {
		return maxOmit;
	}

	public void setMaxOmit(int maxOmit) {
		this.maxOmit = maxOmit;
	}

	public int getMaxOccur() {
		return maxOccur;
	}

	public void setMaxOccur(int maxOccur) {
		this.maxOccur = maxOccur;
	}

	public int getPreOmit() {
		return preOmit;
	}

	public void setPreOmit(int preOmit) {
		this.preOmit = preOmit;
	}

	public int getLastOmit() {
		return lastOmit;
	}

	public void setLastOmit(int lastOmit) {
		this.lastOmit = lastOmit;
	}

	public int getAveOmit() {
		return aveOmit;
	}

	public void setAveOmit(int aveOmit) {
		this.aveOmit = aveOmit;
	}

	public double getProccu() {
		return proccu;
	}

	public void setProccu(double proccu) {
		this.proccu = proccu;
	}

	public double getOccupro() {
		return occupro;
	}

	public void setOccupro(double occupro) {
		this.occupro = occupro;
	}

	public int getLastOccur() {
		return lastOccur;
	}

	public void setLastOccur(int lastOccur) {
		this.lastOccur = lastOccur;
	}

}
