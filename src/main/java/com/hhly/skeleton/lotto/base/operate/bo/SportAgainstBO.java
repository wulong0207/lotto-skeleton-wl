package com.hhly.skeleton.lotto.base.operate.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 赛事加奖活动实体类
 * @date 2017/8/16
 * @company 益彩网络科技公司
 */
public class SportAgainstBO extends BaseBO {
	
	private Integer id;

    /**
     * 官方赛事编号
     */
    private String officialMatchCode;

    /**
     * 赛事系统编号
     */
    private String systemCode;

    /**
     * 赛事名称
     */
    private String matchName;

    /**
     * 主队名
     */
    private String homeName;

    /**
     * 客队名
     */
    private String visitiName;

    /**
     * 比赛开始时间
     */
    private String startTime;

    /**
     * 销售截止时间
     */
    private String saleEndTime;

    /**
     * 销售状态
     */
    private String matchStatus;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOfficialMatchCode() {
        return officialMatchCode;
    }

    public void setOfficialMatchCode(String officialMatchCode) {
        this.officialMatchCode = officialMatchCode;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getVisitiName() {
        return visitiName;
    }

    public void setVisitiName(String visitiName) {
        this.visitiName = visitiName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(String saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }
}
