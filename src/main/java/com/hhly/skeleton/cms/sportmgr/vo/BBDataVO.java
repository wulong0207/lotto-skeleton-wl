package com.hhly.skeleton.cms.sportmgr.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.MatchPattern;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.cms.sportmgr.bo.SportDataBbSSSBO;
import com.hhly.skeleton.cms.sportmgr.bo.SportDataBbWFBO;

/**
 * Created by lgs on 2016/12/16.
 * 篮球数据VO
 */
public class BBDataVO extends  SportDataBaseVO{
    private static final long serialVersionUID = -9127085448555882781L;
    private Long sportDrawBbId;

    @Group("upd")
    //@NotNull(msg="第一节比分")
    @Pattern(value= MatchPattern.SCORE,msg="第一节比分")
    private String firstScore;

    @Group("upd")
    //@NotNull(msg="第二节比分")
    @Pattern(value= MatchPattern.SCORE,msg="第二节比分")
    private String secondScore;

    @Group("upd")
    //@NotNull(msg="第三节比分")
    @Pattern(value= MatchPattern.SCORE,msg="第三节比分")
    private String thirdScore;

    @Group("upd")
    //@NotNull(msg="第四节比分")
    @Pattern(value= MatchPattern.SCORE,msg="第四节比分")
    private String fourthScore;

    @Group("upd")
    @Pattern(value= MatchPattern.SCORE,msg="加时比分")
    private String outTimeScore;


    @Group("upd")
    @Pattern(value= MatchPattern.SCORE,msg="半场比分")
    private String halfScore;

    private Short fullWf;

    private String letWf;

    private String sizeScore;

    private String winScore;

    private Date drawTime;

    private Long sportStatusBbId;

    private Short statusWf;

    private Short statusLetWf;

    private Short statusBigSmall;

    private Short statusScoreWf;

    private String notSalePay;

    private List<SportDataBbWFBO> letSportDataBbWFBOs;

    private List<SportDataBbSSSBO> sportDataBbSSSBOs;

    public List<SportDataBbWFBO> getLetSportDataBbWFBOs() {
        return letSportDataBbWFBOs;
    }

    public void setLetSportDataBbWFBOs(List<SportDataBbWFBO> letSportDataBbWFBOs) {
        this.letSportDataBbWFBOs = letSportDataBbWFBOs;
    }

    public List<SportDataBbSSSBO> getSportDataBbSSSBOs() {
        return sportDataBbSSSBOs;
    }

    public void setSportDataBbSSSBOs(List<SportDataBbSSSBO> sportDataBbSSSBOs) {
        this.sportDataBbSSSBOs = sportDataBbSSSBOs;
    }

    @Override
    public String getHalfScore() {
        return halfScore;
    }

    @Override
    public void setHalfScore(String halfScore) {
        this.halfScore = halfScore;
    }

    public Long getSportDrawBbId() {
        return sportDrawBbId;
    }

    public void setSportDrawBbId(Long sportDrawBbId) {
        this.sportDrawBbId = sportDrawBbId;
    }

    public String getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(String firstScore) {
        this.firstScore = firstScore;
    }

    public String getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(String secondScore) {
        this.secondScore = secondScore;
    }

    public String getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(String thirdScore) {
        this.thirdScore = thirdScore;
    }

    public String getFourthScore() {
        return fourthScore;
    }

    public void setFourthScore(String fourthScore) {
        this.fourthScore = fourthScore;
    }

    public String getOutTimeScore() {
        return outTimeScore;
    }

    public void setOutTimeScore(String outTimeScore) {
        this.outTimeScore = outTimeScore;
    }

    public Short getFullWf() {
        return fullWf;
    }

    public void setFullWf(Short fullWf) {
        this.fullWf = fullWf;
    }

    public String getLetWf() {
        return letWf;
    }

    public void setLetWf(String letWf) {
        this.letWf = letWf;
    }

    public String getSizeScore() {
        return sizeScore;
    }

    public void setSizeScore(String sizeScore) {
        this.sizeScore = sizeScore;
    }

    public String getWinScore() {
        return winScore;
    }

    public void setWinScore(String winScore) {
        this.winScore = winScore;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    public Long getSportStatusBbId() {
        return sportStatusBbId;
    }

    public void setSportStatusBbId(Long sportStatusBbId) {
        this.sportStatusBbId = sportStatusBbId;
    }

    public Short getStatusWf() {
        return statusWf;
    }

    public void setStatusWf(Short statusWf) {
        this.statusWf = statusWf;
    }

    public Short getStatusLetWf() {
        return statusLetWf;
    }

    public void setStatusLetWf(Short statusLetWf) {
        this.statusLetWf = statusLetWf;
    }

    public Short getStatusBigSmall() {
        return statusBigSmall;
    }

    public void setStatusBigSmall(Short statusBigSmall) {
        this.statusBigSmall = statusBigSmall;
    }

    public Short getStatusScoreWf() {
        return statusScoreWf;
    }

    public void setStatusScoreWf(Short statusScoreWf) {
        this.statusScoreWf = statusScoreWf;
    }

    public String getNotSalePay() {
        return notSalePay;
    }

    public void setNotSalePay(String notSalePay) {
        this.notSalePay = notSalePay;
    }
}
