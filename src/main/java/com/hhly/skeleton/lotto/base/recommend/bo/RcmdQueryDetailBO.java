package com.hhly.skeleton.lotto.base.recommend.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
import java.util.List;

/**
 * @Description 新版推单列表BO
 * @Author longguoyou
 * @Date 2018/8/10 10:10
 * @Since 1.8
 */

public class RcmdQueryDetailBO extends BaseBO {
    /**
     * 推单表主键
     */
    private Integer id;
    /**
     * 推单编号
     */
    private String rcmdCode;
    /**
     * 用户头像
     */
    private String headUrl;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 级别：1：分析师2：初级分析师3：高级分析师4：竞彩专家5：社区名人6：媒体记者7：足球评论员8：足坛名宿
     */
    private Integer levelType;
    /**
     * 最近战况
     */
    private String recentRecord;
    /**
     * 连续命中
     */
    private String continutHit;
    /**
     * 返奖率
     */
    private Double returnRate;
    /**
     * 标题
     */
    private String title;
    /**
     * 投注内容
     */
    private String planContent;
    /**
     * 过关方式
     */
    private Integer passway;
    /**
     * 购买场次编号
     */
    private String screens;
    /**
     * 购买截止时间，比比赛时间早五分钟
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    /**
     * 付费金额
     */
    private Double payAmount;

    /**
     * 解析对阵信息
     */
    private List<MatchsBO> listMatchsBO;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date rcmdTime;

    /**
     * 购买人数
     */
    private Integer payCount;

    /**
     * 浏览人数
     */
    private Integer click;

    /**
     * 中奖状态 中奖状态；1：未中；2：命中；
     */
    private Integer winningStatus;

    /**
     * 销售截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date saleEndTime;

    /**
     * 发单人USERid
     */
    @JsonIgnore
    private Integer userId;

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
        this.rcmdCode = rcmdCode;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getLevelType() {
        return levelType;
    }

    public void setLevelType(Integer levelType) {
        this.levelType = levelType;
    }

    public String getRecentRecord() {
        return recentRecord;
    }

    public void setRecentRecord(String recentRecord) {
        this.recentRecord = recentRecord;
    }

    public String getContinutHit() {
        return continutHit;
    }

    public void setContinutHit(String continutHit) {
        this.continutHit = continutHit;
    }

    public Double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(Double returnRate) {
        this.returnRate = returnRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public Integer getPassway() {
        return passway;
    }

    public void setPassway(Integer passway) {
        this.passway = passway;
    }

    public String getScreens() {
        return screens;
    }

    public void setScreens(String screens) {
        this.screens = screens;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public List<MatchsBO> getListMatchsBO() {
        return listMatchsBO;
    }

    public void setListMatchsBO(List<MatchsBO> listMatchsBO) {
        this.listMatchsBO = listMatchsBO;
    }

    public Date getRcmdTime() {
        return rcmdTime;
    }

    public void setRcmdTime(Date rcmdTime) {
        this.rcmdTime = rcmdTime;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
