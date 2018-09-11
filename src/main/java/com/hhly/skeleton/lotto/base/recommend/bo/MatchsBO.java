package com.hhly.skeleton.lotto.base.recommend.bo;


import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @Description 对阵内容
 * @Author longguoyou
 * @Date  2018/8/10 14:13 
 * @Since 1.8
 */

public class MatchsBO extends BaseBO{

    /**
     * 赛事名称
     */
    private String matchName;
    /**
     * 主队名称
     */
    private String homeName;
    /**
     * 客队名称
     */
    private String visitName;

    /**
     * 主队图像
     */
    private String homeUrl;

    /**
     * 客队图像
     */
    private String visitUrl;

    /**推单详情字段开始*/

    /**
     * 官方赛事编号
     */
    private String officialMatchCode;
    /**
     * 截止时间
     */
    private String endTime;

    /**
     * 是否命中
     */
    private Integer winningStatus;

    /**
     * 对阵让球、赔率信息集合
     */
    private List<MatchSpInfo> listMatchsSpInfo;
    /**推单详情字段结束*/

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

    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName;
    }

    public String getOfficialMatchCode() {
        return officialMatchCode;
    }

    public void setOfficialMatchCode(String officialMatchCode) {
        this.officialMatchCode = officialMatchCode;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public List<MatchSpInfo> getListMatchsSpInfo() {
        return listMatchsSpInfo;
    }

    public void setListMatchsSpInfo(List<MatchSpInfo> listMatchsSpInfo) {
        this.listMatchsSpInfo = listMatchsSpInfo;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl;
    }
}
