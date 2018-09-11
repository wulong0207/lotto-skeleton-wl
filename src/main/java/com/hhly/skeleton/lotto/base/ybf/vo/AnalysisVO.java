package com.hhly.skeleton.lotto.base.ybf.vo;

import com.hhly.skeleton.base.vo.BaseVO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author lgs on
 * @version 1.0
 * @desc 分析页面查询VO
 * @date 2017/11/2.
 * @company 益彩网络科技有限公司
 */
public class AnalysisVO extends BaseVO {

    private static final long serialVersionUID = 1L;

    /**
     * 对阵id
     */
    private Integer matchId;
    /**
     * 联赛id
     */
    private Integer leagueId;
    /**
     * 语言 默认zh
     */
    private String lang = "zh";
    /**
     * 主队id
     */
    private Integer homeId;
    /**
     * 客队id
     */
    private Integer guestId;
    /**
     * 统计最近几场 默认10场
     */
    private int countNum = 10;

    /**
     * 球队标识 0，不区分主客；1，主 ；2，客；默认0 不区分主客
     */
    private int teamFlag = 0;

    /**
     * 是否是本赛事 默认全赛事
     */
    private int sclassFlag = 0;

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public int getCountNum() {
        return countNum;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    public int getTeamFlag() {
        return teamFlag;
    }

    public void setTeamFlag(int teamFlag) {
        this.teamFlag = teamFlag;
    }

    public int getSclassFlag() {
        return sclassFlag;
    }

    public void setSclassFlag(int sclassFlag) {
        this.sclassFlag = sclassFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("matchId", matchId)
                .append("leagueId", leagueId)
                .append("lang", lang)
                .append("homeId", homeId)
                .append("guestId", guestId)
                .append("countNum", countNum)
                .append("teamFlag", teamFlag)
                .append("sclassFlag", sclassFlag)
                .toString();
    }
}
