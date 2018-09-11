package com.hhly.skeleton.lotto.base.sport.vo;

import java.util.Date;

import com.hhly.skeleton.cms.sportmgr.vo.SportDataBaseVO;

/**
 * Created by lgs on 2016/12/8.
 * 老足彩VO
 */
public class OldDataVO extends SportDataBaseVO{
    private static final long serialVersionUID = -3197313749052375410L;

    private Long drawOldInfoId;
    private String fourGoal; //4场进球

    private String sixHfWdf; //6场半全场

    private String fourteenWdf;//胜平负

    private Date drawTime;   //开奖时间

    public Long getDrawOldInfoId() {
        return drawOldInfoId;
    }

    public void setDrawOldInfoId(Long drawOldInfoId) {
        this.drawOldInfoId = drawOldInfoId;
    }

    public String getFourGoal() {
        return fourGoal;
    }

    public void setFourGoal(String fourGoal) {
        this.fourGoal = fourGoal;
    }

    public String getSixHfWdf() {
        return sixHfWdf;
    }

    public void setSixHfWdf(String sixHfWdf) {
        this.sixHfWdf = sixHfWdf;
    }

    public String getFourteenWdf() {
        return fourteenWdf;
    }

    public void setFourteenWdf(String fourteenWdf) {
        this.fourteenWdf = fourteenWdf;
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }
}
