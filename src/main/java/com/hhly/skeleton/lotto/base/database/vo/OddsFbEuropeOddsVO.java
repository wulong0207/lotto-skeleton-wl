package com.hhly.skeleton.lotto.base.database.vo;

import com.hhly.skeleton.lotto.base.sport.vo.JcParamVO;

public class OddsFbEuropeOddsVO extends JcParamVO {


    /**
     * 赛程编号
     */
    private Integer scheduleId;

    /**
     * 欧盘公司id
     */
    private Integer europeId;


    /**
     * 类型; 1:胜平负;2:让球胜平负
     */
    private Integer type;


    /**
     * 数据来源方id
     */
    private String sourceId;

    /**
     * 数据来源方类型1:一比分
     */
    private Integer sourceType;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }
}