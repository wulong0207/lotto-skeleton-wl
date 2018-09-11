package com.hhly.skeleton.task.drawgrab.vo;

/**
 * @desc 供应商下的彩种开奖信息
 * @author lidecheng
 * @date 2017年1月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CurrenVO {
    /**
     * 彩种号码
     */
    private Integer lotCode;
    /**
     * 开奖号码
     */
    private String drawCode;
    /**
     * 开奖期号
     */
    private String issue;
    
    private String lotteryName;
     
    private boolean isNewDrawCode;
    
	public CurrenVO(){
    	
    }
    
    
    
    public String getLotteryName() {
		return lotteryName;
	}



	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}



	public CurrenVO(String issue){
    	this.issue = issue;
    }
	
	public CurrenVO(String issue,String drawCode){
    	this.issue = issue;
    	this.drawCode = drawCode;
    }
	
    public Integer getLotCode() {
        return lotCode;
    }

    public void setLotCode(Integer lotCode) {
        this.lotCode = lotCode;
    }

    public String getDrawCode() {
        return drawCode;
    }

    public void setDrawCode(String drawCode) {
        this.drawCode = drawCode;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "CurrenVO [lotCode=" + lotCode + ", drawCode=" + drawCode
                + ", issue=" + issue + "]";
    }



	/**
	 * @return the isNewDrawCode
	 */
	public boolean isNewDrawCode() {
		return isNewDrawCode;
	}



	/**
	 * @param isNewDrawCode the isNewDrawCode to set
	 */
	public void setNewDrawCode(boolean isNewDrawCode) {
		this.isNewDrawCode = isNewDrawCode;
	}

}
