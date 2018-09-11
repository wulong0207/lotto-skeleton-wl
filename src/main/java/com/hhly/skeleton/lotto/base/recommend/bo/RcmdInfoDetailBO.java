package com.hhly.skeleton.lotto.base.recommend.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
import java.util.List;

/**
 * @Description 推单详情 BO
 * @Author longguoyou
 * @Date  2018/8/14 11:14
 * @Since 1.8
 */

public class RcmdInfoDetailBO extends BaseBO{

    /**
     * 标题
     */
    private String title;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 彩种名称
     */
    private String lotteryName;
    /**
     *  子玩法
     */
    private Integer lotteryChildCode;
    /**
     * 彩种
     */
    private Integer lotteryCode;

    /**
     * 赛事编号
     */
    private String screens;

    /**
     * 推荐理由
     */
    private String reason;

    /**
     * 方案状态
     */
    private Integer status;

    /**
     * 是否命中
     */
    private Integer winningStatus;

    /**
     * 是否锁住：1=锁住；0=不锁
     */
    private Integer locker;

    /**
     * 投注内容
     */
    private String planContent;

    /**
     * 对阵内容信息集
     */
    private List<MatchsBO> listMatchsBO;

    /**
     * 销售截止时间
     */
    private Date endTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getScreens() {
        return screens;
    }

    public void setScreens(String screens) {
        this.screens = screens;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Integer getLocker() {
        return locker;
    }

    public void setLocker(Integer locker) {
        this.locker = locker;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public List<MatchsBO> getListMatchsBO() {
        return listMatchsBO;
    }

    public void setListMatchsBO(List<MatchsBO> listMatchsBO) {
        this.listMatchsBO = listMatchsBO;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
