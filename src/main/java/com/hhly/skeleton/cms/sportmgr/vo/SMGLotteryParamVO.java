package com.hhly.skeleton.cms.sportmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;
import java.util.List;

/**
 * Created by lgs on 2016/12/1.
 * 竞彩查询参数VO
 */
@SuppressWarnings("serial")
public class SMGLotteryParamVO extends PageVO{
    private String lotteryIssue; //彩期
    //下拉框彩期 如果下拉框彩期不为空则查询下拉框的彩期。如果下拉框的彩期为空则查询文本框的彩期。这个在lotteryIssue 的get方法中实现
    private String lotteryIssueSelect;
    private Integer lotteryCode; //彩种
    private String systemCode;    //系统编号
    private Integer issueStatus;  //彩期状态
    private Integer matchStatus;  //比赛状态
    private String officialId;  //官方id
    private String officialNum;  //官方编号 等于week周几加上编号 在get方法里面有处理
    private String analysisId;  //分析id
    private Date matchBeginTime; //比赛开始时间
    private Date matchEndTime;   //比赛结束时间
    private Date saleStartTime;  //销售开始时间
    private Date saleEndTime;    //销售结束时间
    private String week;        //周几
    private List<Integer> lotteryCodeList;//彩种列表

    public String getLotteryIssueSelect() {
        return lotteryIssueSelect;
    }

    public void setLotteryIssueSelect(String lotteryIssueSelect) {
        this.lotteryIssueSelect = lotteryIssueSelect;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }



    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null || systemCode.equals("") ? null : systemCode.trim();
    }

    public Integer getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(Integer issueStatus) {
        this.issueStatus = issueStatus;
    }

    public Integer getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getOfficialId() {
        return officialId;
    }

    public void setOfficialId(String officialId) {
        this.officialId = officialId == null || officialId.equals("") ? null : officialId.trim();
    }

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId == null || analysisId.equals("") ? null : analysisId.trim();
    }

    public Date getMatchBeginTime() {
        return matchBeginTime;
    }

    public void setMatchBeginTime(Date matchBeginTime) {
        this.matchBeginTime = matchBeginTime;
    }

    public Date getMatchEndTime() {
        return matchEndTime;
    }

    public void setMatchEndTime(Date matchEndTime) {
        this.matchEndTime = matchEndTime;
    }

    public String getOfficialNum() {
       return this.officialNum;
    }

    public void setOfficialNum(String officialNum) {
        this.officialNum = officialNum == null || officialNum.equals("") ? null : officialNum.trim();
    }

    public Date getSaleStartTime() {
        return saleStartTime;
    }

    public void setSaleStartTime(Date saleStartTime) {
        this.saleStartTime = saleStartTime;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

   

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryIssue() {
        if(lotteryIssueSelect!=null&&!lotteryIssueSelect.equals("")){
            this.lotteryIssue = this.lotteryIssueSelect;
        }
        return lotteryIssue;
    }

    public void setLotteryIssue(String lotteryIssue) {
        this.lotteryIssue = lotteryIssue == null || lotteryIssue.equals("") ? null : lotteryIssue.trim();
    }

	public List<Integer> getLotteryCodeList() {
		return lotteryCodeList;
	}

	public void setLotteryCodeList(List<Integer> lotteryCodeList) {
		this.lotteryCodeList = lotteryCodeList;
	}
    
}
