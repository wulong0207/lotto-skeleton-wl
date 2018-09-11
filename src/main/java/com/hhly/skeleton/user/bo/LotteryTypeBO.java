package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * 彩种
 */
public class LotteryTypeBO extends BaseBO{
    
    private Integer count;
    /**
     * 低频：100开始；高频：200；竞技彩：300
     */
    private Integer id;

    /**
     * 固定彩种code。
     */
    private Integer lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 自动生成彩期数量，此数值为：开奖期号大于当前期的彩期总和。
     */
    private Short conIssueNum;

    /**
     * 0：停止生成彩期；1：正常生成彩期
     */
    private Short stopAddIssue;

    /**
     * 彩种logo URL地址
     */
    private String lotteryLogoUrl;

    /**
     * 1：福彩；2：体彩
     */
    private Short adminCategory;

    /**
     * 1：数字彩；2：高频彩；3：竞技彩
     */
    private Short lotteryCategory;

    /**
     * 0：暂停销售；1：正常销售；
     */
    private Short saleStatus;

    /**
     * 0：请选择；1：全国；2：华东六省；3：广东
     */
    private Short area;

    /**
     * 1：手动 ；2：自动
     */
    private Short autoType;

    /**
     * 0：否；1：是；若0，按照我们规则去生成彩期。若1，同步第三方彩期数据，包括彩期编号，官方截止时间。
     */
    private Short synIssue;

    /**
     * 官方开售时间距离的秒数。
     */
    private Integer saleTime;

    /**
     * 官方截止时间距离的秒数。
     */
    private Integer buyEndTime;

    /**
     * 彩票最大倍数
     */
    private Integer splitMaxNum;

    /**
     * 官方检票时间距离的秒数。
     */
    private Integer endCheckTime;

    /**
     * 彩票最大金额
     */
    private Integer splitMaxAmount;

    /**
     * 官方开售时间(即官方可送票时间)；
若为数字彩,高频彩：1|8:00,2|8:00,3|8:00,4|8:00,5|8:00,6|8:00,7|8:00;
代表星期几的第一期的官方开售时间
若为竞彩彩：格式为 1|09:00,2|09:00,3|07:30,4|07:30,5|09:002|09:00,6|09:00,7|09:00  ；
代表周一，周二，周五每天9点，周三到周四每天7点30开售。
(不包括老足彩，北京单场，胜负过关彩种，
这些彩种为人工在彩期中录入或数据抓取)
     */
    private String startSailTime;

    /**
     * 官方截止销售时间；
1）数字彩：例如 ：2|20:00|0,4|20:00|0,7|20:00|0
2）高频彩：此值为第一期截止销售时间。
   例如：1|09:10|0,2|09:10|0,3|09:10|0,4|09:10|0,5|09:10|0,6|09:10|0,7|09:10|0;  9点10分第一期截止销售；
。
3）竞技彩；格式为 1|24:00|0,2|24:00|0,3|24:00|0,4|24:00|0,5|24:00|0,6|01:00|1,7|01:00|1；表示周一到周五24点
当天截止。周六到周日第二日的凌晨1点前截止销售。
4）不包括老足彩，北京单场，胜负过关彩种，
这些彩种为人工在彩期中录入或数据抓取
     */
    private String endSailTime;

    /**
     * 销售日销售周期；只针对高频彩；例如：1-30|300,31-60|600, 1到30期，时间间隔为300秒，31到60期时间间隔为600秒。其它彩种为空
1-30为每5分钟一期，31-60为每10分钟一期；
     */
    private String sailDayCycle;

    /**
     * 休市时间，用‘,’分隔；例如：2017-01-27,2017-01-28
     */
    private String vacations;

    /**
     * 真实姓名
     */
    private String createBy;

    /**
     * 真实姓名
     */
    private String modifyBy;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * null
     */
    private Date updateTime;

    /**
     * null
     */
    private Date createTime;

    /**
     * null
     */
    private String remark;

    /**
     * 官方开奖时间:格式为：2|21:15,4|21:15,7|21:15   代表周二，周四，周日的21:15分开奖,目前仅低频彩用，其它类型彩种为空
     */
    private String drawTime;

    /**
     * 彩期生成格式。
     */
    private String format;

    /**
     * 出票时间段 例如：1|09:00-20:00,2|08:00-22:00 代表周一9点到20点为出票时间，周二8点到22点为出票时间
     */
    private String comeOutTime;
    
    /**根据彩种类型、彩种的消息描述*/
    private String messageDesc;
    
    public String getMessageDesc () {
        return messageDesc;
    }
    
    public void setMessageDesc (String messageDesc) {
        this.messageDesc = messageDesc;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public Short getConIssueNum() {
        return conIssueNum;
    }

    public void setConIssueNum(Short conIssueNum) {
        this.conIssueNum = conIssueNum;
    }

    public Short getStopAddIssue() {
        return stopAddIssue;
    }

    public void setStopAddIssue(Short stopAddIssue) {
        this.stopAddIssue = stopAddIssue;
    }

    public String getLotteryLogoUrl() {
        return lotteryLogoUrl;
    }

    public void setLotteryLogoUrl(String lotteryLogoUrl) {
        this.lotteryLogoUrl = lotteryLogoUrl == null ? null : lotteryLogoUrl.trim();
    }

    public Short getAdminCategory() {
        return adminCategory;
    }

    public void setAdminCategory(Short adminCategory) {
        this.adminCategory = adminCategory;
    }

    public Short getLotteryCategory() {
        return lotteryCategory;
    }

    public void setLotteryCategory(Short lotteryCategory) {
        this.lotteryCategory = lotteryCategory;
    }

    public Short getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Short saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Short getArea() {
        return area;
    }

    public void setArea(Short area) {
        this.area = area;
    }

    public Short getAutoType() {
        return autoType;
    }

    public void setAutoType(Short autoType) {
        this.autoType = autoType;
    }

    public Short getSynIssue() {
        return synIssue;
    }

    public void setSynIssue(Short synIssue) {
        this.synIssue = synIssue;
    }

    public Integer getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Integer saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getBuyEndTime() {
        return buyEndTime;
    }

    public void setBuyEndTime(Integer buyEndTime) {
        this.buyEndTime = buyEndTime;
    }

    public Integer getSplitMaxNum() {
        return splitMaxNum;
    }

    public void setSplitMaxNum(Integer splitMaxNum) {
        this.splitMaxNum = splitMaxNum;
    }

    public Integer getEndCheckTime() {
        return endCheckTime;
    }

    public void setEndCheckTime(Integer endCheckTime) {
        this.endCheckTime = endCheckTime;
    }

    public Integer getSplitMaxAmount() {
        return splitMaxAmount;
    }

    public void setSplitMaxAmount(Integer splitMaxAmount) {
        this.splitMaxAmount = splitMaxAmount;
    }

    public String getStartSailTime() {
        return startSailTime;
    }

    public void setStartSailTime(String startSailTime) {
        this.startSailTime = startSailTime == null ? null : startSailTime.trim();
    }

    public String getEndSailTime() {
        return endSailTime;
    }

    public void setEndSailTime(String endSailTime) {
        this.endSailTime = endSailTime == null ? null : endSailTime.trim();
    }

    public String getSailDayCycle() {
        return sailDayCycle;
    }

    public void setSailDayCycle(String sailDayCycle) {
        this.sailDayCycle = sailDayCycle == null ? null : sailDayCycle.trim();
    }

    public String getVacations() {
        return vacations;
    }

    public void setVacations(String vacations) {
        this.vacations = vacations == null ? null : vacations.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(String drawTime) {
        this.drawTime = drawTime == null ? null : drawTime.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getComeOutTime() {
        return comeOutTime;
    }

    public void setComeOutTime(String comeOutTime) {
        this.comeOutTime = comeOutTime == null ? null : comeOutTime.trim();
    }
    
    public Integer getCount () {
        return count;
    }
    
    public void setCount (Integer count) {
        this.count = count;
    }
}