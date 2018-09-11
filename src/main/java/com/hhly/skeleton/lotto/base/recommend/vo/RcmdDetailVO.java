package com.hhly.skeleton.lotto.base.recommend.vo;

import com.hhly.skeleton.base.vo.PageVO;

public class RcmdDetailVO extends PageVO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6466396588879456282L;

	/**
     * 
     */
    private Integer id;

    /**
     * 推单编号；关联rcmd_info表	
     */
    private String rcmdCode;

    /**
     * 玩法编号
     */
    private Integer lotteryChildCode;

    /**
     * 玩法名称
     */
    private String lotteryChildName;

    /**
     * 过关方式；1：单关 2：2串1
     */
    private Short passWay;

    /**
     * 方案最小场次编号
     */
    private String minScreen;

    /**
     * 方案最大场次编号
     */
    private String maxScreen;

    /**
     * 实际开奖结果；标识规则自定
     */
    private String actualResult;

    /**
     * 方案内容
     */
    private String planContent;
    
    /**
     * 金额
     */
    private Integer planNumber;
    /**
     * 注数
     */
    private Double planAmount;

    /**
     * 场次编号列表，逗号分隔
     */
    private String screens;
    
    public Integer getPlanNumber() {
		return planNumber;
	}

	public void setPlanNumber(Integer planNumber) {
		this.planNumber = planNumber;
	}

	public Double getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(Double planAmount) {
		this.planAmount = planAmount;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRcmdCode() {
        return rcmdCode;
    }

    public void setRcmdCode(String rcmdCode) {
        this.rcmdCode = rcmdCode == null ? null : rcmdCode.trim();
    }

    public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }

    public String getLotteryChildName() {
        return lotteryChildName;
    }

    public void setLotteryChildName(String lotteryChildName) {
        this.lotteryChildName = lotteryChildName == null ? null : lotteryChildName.trim();
    }

    public Short getPassWay() {
        return passWay;
    }

    public void setPassWay(Short passWay) {
        this.passWay = passWay;
    }

    public String getMinScreen() {
        return minScreen;
    }

    public void setMinScreen(String minScreen) {
        this.minScreen = minScreen == null ? null : minScreen.trim();
    }

    public String getMaxScreen() {
        return maxScreen;
    }

    public void setMaxScreen(String maxScreen) {
        this.maxScreen = maxScreen == null ? null : maxScreen.trim();
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult == null ? null : actualResult.trim();
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent == null ? null : planContent.trim();
    }

    public String getScreens() {
        return screens;
    }

    public void setScreens(String screens) {
        this.screens = screens == null ? null : screens.trim();
    }
}