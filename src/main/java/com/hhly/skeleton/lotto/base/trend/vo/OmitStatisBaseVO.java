package com.hhly.skeleton.lotto.base.trend.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    遗漏统计VO
 * @author  Tony Wang
 * @date    2017年3月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OmitStatisBaseVO extends BaseBO{
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
    private  String sonType;

    /**
     * 查询的期号数量
     */
    private Integer qryCount;

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

	public Integer getQryCount() {
		return qryCount;
	}

	public void setQryCount(Integer qryCount) {
		this.qryCount = qryCount;
	}

}