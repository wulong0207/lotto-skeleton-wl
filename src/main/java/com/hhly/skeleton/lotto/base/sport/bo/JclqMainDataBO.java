package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @auth lgs on
 * @date 2017/2/26.
 * @desc 竞彩足球受注赛程页面BO
 * @compay 益彩网络科技有限公司
 */
public class JclqMainDataBO extends BaseBO {
    private static final long serialVersionUID = -3906186619282926037L;

    /**
     * 竞彩足球受注赛程
     */
    private List<JclqDataBO> data;

    /**
     * 对阵中的联赛杯赛
     */
    @JsonProperty("match_info")
    private List<MatchDataBO> matchInfo;

    /**
     * 服务器时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date serverTime = new Date();

    public List<JclqDataBO> getData() {
        return data;
    }

    public void setData(List<JclqDataBO> data) {
        this.data = data;
    }

    public List<MatchDataBO> getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(List<MatchDataBO> matchInfo) {
        this.matchInfo = matchInfo;
    }

    public Date getServerTime() {
        return serverTime;
    }

    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "data=" + data +
                ", matchInfo=" + matchInfo +
                ", serverTime=" + serverTime +
                '}';
    }
}
