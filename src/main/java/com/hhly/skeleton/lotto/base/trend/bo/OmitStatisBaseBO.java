package com.hhly.skeleton.lotto.base.trend.bo;

/**
 * @desc    遗漏统计类
 * @author  Tony Wang
 * @date    2017年3月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OmitStatisBaseBO {
	/** 彩种ID*/
    private Integer lotteryCode;

    /**
     * 不同的彩种有不同的父类型，如十一选五： 
     * 父类型 qx2(前二直选)，qx3(前三直选),qz2(前2组选),qz3(前3组选),dw0(定位)
     *  rx2(任选2)，rx3(任选3)..rx8(任选8)
     */
    private String faType;

    /**
     * 不同的彩种有不同的子类型，如十一选五：
     * 父类型 qx2(前二直选)，qx3(前三直选),qz2(前2组选),qz3(前3组选),dw0(定位)
     *  子类型m2(二码),m3(三码)..m9(九码),ds(单式),w1(第一位),w2....w5(第五位)
     */
     private String sonType;

    /** 遗漏号码*/
    private String ylCode;

    /** 出现次数*/
    private Long occurNum;

    /** 最大遗漏*/
    private Long maxOmit;

    /** 最大连出*/
    private Long maxOccur;

    /** 上次遗漏*/
    private Long preOmit;

    /** 当前遗漏*/
    private Long lastOmit;

    /** 平均遗漏*/
    private Long aveOmit;

    /** 历史开奖率*/
    private Double prOccu;

    /** 欲出概率*/
    private Double occuPro;

    /** 当前连开次数*/
    private Long lastOccur;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getFaType() {
		return faType;
	}

	public void setFaType(String faType) {
		this.faType = faType;
	}

	public String getSonType() {
		return sonType;
	}

	public void setSonType(String sonType) {
		this.sonType = sonType;
	}

	public String getYlCode() {
		return ylCode;
	}

	public void setYlCode(String ylCode) {
		this.ylCode = ylCode;
	}

	public Long getOccurNum() {
		return occurNum;
	}

	public void setOccurNum(Long occurNum) {
		this.occurNum = occurNum;
	}

	public Long getMaxOmit() {
		return maxOmit;
	}

	public void setMaxOmit(Long maxOmit) {
		this.maxOmit = maxOmit;
	}

	public Long getMaxOccur() {
		return maxOccur;
	}

	public void setMaxOccur(Long maxOccur) {
		this.maxOccur = maxOccur;
	}

	public Long getPreOmit() {
		return preOmit;
	}

	public void setPreOmit(Long preOmit) {
		this.preOmit = preOmit;
	}

	public Long getLastOmit() {
		return lastOmit;
	}

	public void setLastOmit(Long lastOmit) {
		this.lastOmit = lastOmit;
	}

	public Long getAveOmit() {
		return aveOmit;
	}

	public void setAveOmit(Long aveOmit) {
		this.aveOmit = aveOmit;
	}

	public Double getPrOccu() {
		return prOccu;
	}

	public void setPrOccu(Double prOccu) {
		this.prOccu = prOccu;
	}

	public Double getOccuPro() {
		return occuPro;
	}

	public void setOccuPro(Double occuPro) {
		this.occuPro = occuPro;
	}

	public Long getLastOccur() {
		return lastOccur;
	}

	public void setLastOccur(Long lastOccur) {
		this.lastOccur = lastOccur;
	}
}