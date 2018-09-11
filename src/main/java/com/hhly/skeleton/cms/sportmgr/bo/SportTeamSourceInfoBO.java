package com.hhly.skeleton.cms.sportmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class SportTeamSourceInfoBO extends BaseBO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 球队ID
     */
    private Integer teamId;

    /**
     * 球队全称
     */
    private String teamName;

    /**
     * 球队简称
     */
    private String teamAbbrName;

    /**
     * 球队类型:1足球;2篮球
     */
    private Short teamType;

    /**
     * 渠道的赛事id
     */
    private Integer sourceId;

    /**
     * 来源:1:sporttery官网;2:500W;3:爱波网
     */
    private Short source;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 球队ID
     * @return team_id 球队ID
     */
    public Integer getTeamId() {
        return teamId;
    }

    /**
     * 球队ID
     * @param teamId 球队ID
     */
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    /**
     * 球队全称
     * @return team_name 球队全称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 球队全称
     * @param teamName 球队全称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * 球队简称
     * @return team_abbr_name 球队简称
     */
    public String getTeamAbbrName() {
        return teamAbbrName;
    }

    /**
     * 球队简称
     * @param teamAbbrName 球队简称
     */
    public void setTeamAbbrName(String teamAbbrName) {
        this.teamAbbrName = teamAbbrName == null ? null : teamAbbrName.trim();
    }

    /**
     * 球队类型:1足球;2篮球
     * @return team_type 球队类型:1足球;2篮球
     */
    public Short getTeamType() {
        return teamType;
    }

    /**
     * 球队类型:1足球;2篮球
     * @param teamType 球队类型:1足球;2篮球
     */
    public void setTeamType(Short teamType) {
        this.teamType = teamType;
    }

    /**
     * 渠道的赛事id
     * @return source_id 渠道的赛事id
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * 渠道的赛事id
     * @param sourceId 渠道的赛事id
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 来源:1:sporttery官网;2:500W;3:爱波网
     * @return source 来源:1:sporttery官网;2:500W;3:爱波网
     */
    public Short getSource() {
        return source;
    }

    /**
     * 来源:1:sporttery官网;2:500W;3:爱波网
     * @param source 来源:1:sporttery官网;2:500W;3:爱波网
     */
    public void setSource(Short source) {
        this.source = source;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}