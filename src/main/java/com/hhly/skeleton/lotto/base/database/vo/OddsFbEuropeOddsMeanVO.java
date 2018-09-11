package com.hhly.skeleton.lotto.base.database.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.Date;

public class OddsFbEuropeOddsMeanVO extends BaseVO {
    /**
     * 赔率id
     */
    private Integer id;

    /**
     * 赛程编号
     */
    private Integer scheduleId;

    /**
     * 欧盘公司id
     */
    private Integer europeId;

    /**
     * 初盘主胜水位
     */
    private Double homewinF;

    /**
     * 初盘平水位
     */
    private Double drawF;

    /**
     * 初盘客胜水位
     */
    private Double guestwinF;

    /**
     * 实盘主胜水位
     */
    private Double homewinN;

    /**
     * 实盘平局水位
     */
    private Double drawN;

    /**
     * 实盘客胜水位
     */
    private Double guestwinN;

    /**
     * 初盘主胜率
     */
    private Double probabilityHF;

    /**
     * 初盘平局率
     */
    private Double probabilityDF;

    /**
     * 初盘客胜率
     */
    private Double probabilityGF;

    /**
     * 初盘返回率
     */
    private Double probabilityTF;

    /**
     * 实盘主胜率
     */
    private Double probabilityHN;

    /**
     * 实盘平局率
     */
    private Double probabilityDN;

    /**
     * 实盘客胜率
     */
    private Double probabilityGN;

    /**
     * 实盘返回率
     */
    private Double probabilityTN;

    /**
     * 类型; 1:胜平负;2:让球胜平负
     */
    private Integer type;

    /**
     * 让球数值
     */
    private Byte letBall;

    /**
     * 数据来源方id
     */
    private String sourceId;

    /**
     * 数据来源方类型1:一比分
     */
    private Integer sourceType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 后台操作员ID
     */
    private String modifyBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getEuropeId() {
        return europeId;
    }

    public void setEuropeId(Integer europeId) {
        this.europeId = europeId;
    }

    public Double getHomewinF() {
        return homewinF;
    }

    public void setHomewinF(Double homewinF) {
        this.homewinF = homewinF;
    }

    public Double getDrawF() {
        return drawF;
    }

    public void setDrawF(Double drawF) {
        this.drawF = drawF;
    }

    public Double getGuestwinF() {
        return guestwinF;
    }

    public void setGuestwinF(Double guestwinF) {
        this.guestwinF = guestwinF;
    }

    public Double getHomewinN() {
        return homewinN;
    }

    public void setHomewinN(Double homewinN) {
        this.homewinN = homewinN;
    }

    public Double getDrawN() {
        return drawN;
    }

    public void setDrawN(Double drawN) {
        this.drawN = drawN;
    }

    public Double getGuestwinN() {
        return guestwinN;
    }

    public void setGuestwinN(Double guestwinN) {
        this.guestwinN = guestwinN;
    }

    public Double getProbabilityHF() {
        return probabilityHF;
    }

    public void setProbabilityHF(Double probabilityHF) {
        this.probabilityHF = probabilityHF;
    }

    public Double getProbabilityDF() {
        return probabilityDF;
    }

    public void setProbabilityDF(Double probabilityDF) {
        this.probabilityDF = probabilityDF;
    }

    public Double getProbabilityGF() {
        return probabilityGF;
    }

    public void setProbabilityGF(Double probabilityGF) {
        this.probabilityGF = probabilityGF;
    }

    public Double getProbabilityTF() {
        return probabilityTF;
    }

    public void setProbabilityTF(Double probabilityTF) {
        this.probabilityTF = probabilityTF;
    }

    public Double getProbabilityHN() {
        return probabilityHN;
    }

    public void setProbabilityHN(Double probabilityHN) {
        this.probabilityHN = probabilityHN;
    }

    public Double getProbabilityDN() {
        return probabilityDN;
    }

    public void setProbabilityDN(Double probabilityDN) {
        this.probabilityDN = probabilityDN;
    }

    public Double getProbabilityGN() {
        return probabilityGN;
    }

    public void setProbabilityGN(Double probabilityGN) {
        this.probabilityGN = probabilityGN;
    }

    public Double getProbabilityTN() {
        return probabilityTN;
    }

    public void setProbabilityTN(Double probabilityTN) {
        this.probabilityTN = probabilityTN;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Byte getLetBall() {
        return letBall;
    }

    public void setLetBall(Byte letBall) {
        this.letBall = letBall;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}