package com.hhly.skeleton.cms.sportmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class SportMatchSourceInfoBO extends BaseBO {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 赛事信息id
     */
    private Integer matchId;

    /**
     * 赛事中文全称
     */
    private String matchName;

    /**
     * 赛事中文简写
     */
    private String matchAbbrName;

    /**
     * 赛事类型1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；12：水球
     */
    private Short matchType;

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
     * 赛事信息id
     * @return match_id 赛事信息id
     */
    public Integer getMatchId() {
        return matchId;
    }

    /**
     * 赛事信息id
     * @param matchId 赛事信息id
     */
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    /**
     * 赛事中文全称
     * @return match_name 赛事中文全称
     */
    public String getMatchName() {
        return matchName;
    }

    /**
     * 赛事中文全称
     * @param matchName 赛事中文全称
     */
    public void setMatchName(String matchName) {
        this.matchName = matchName == null ? null : matchName.trim();
    }

    /**
     * 赛事中文简写
     * @return match_abbr_name 赛事中文简写
     */
    public String getMatchAbbrName() {
        return matchAbbrName;
    }

    /**
     * 赛事中文简写
     * @param matchAbbrName 赛事中文简写
     */
    public void setMatchAbbrName(String matchAbbrName) {
        this.matchAbbrName = matchAbbrName == null ? null : matchAbbrName.trim();
    }

    /**
     * 赛事类型1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；12：水球
     * @return match_type 赛事类型1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；12：水球
     */
    public Short getMatchType() {
        return matchType;
    }

    /**
     * 赛事类型1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；12：水球
     * @param matchType 赛事类型1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；12：水球
     */
    public void setMatchType(Short matchType) {
        this.matchType = matchType;
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