package com.hhly.skeleton.lotto.base.sport.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @version 1.0
 * @auth lgs on
 * @date 2017/2/26.
 * @desc 竞彩足球受注赛程页面BO
 * @compay 益彩网络科技有限公司
 */
public class JczqMainDataBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    /**
     * 竞彩足球受注赛程
     */
    @JsonIgnore
    private List<JczqDaoBO> daoBOs;

    @JsonProperty("data")
    private List<JczqDataBO> resultBo;

    /**
     * 对阵中的联赛杯赛
     */
    @JsonIgnore
    private List<MatchDataBO> matchInfo = new ArrayList<>();

    /**
     * 服务器时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date serverTime = new Date();

    /**
     * 销售截止比赛数量
     */
    private Integer saleEndTotal;

    public List<JczqDaoBO> getDaoBOs() {
        return daoBOs;
    }

    public void setDaoBOs(List<JczqDaoBO> daoBOs) {
        this.daoBOs = daoBOs;
    }

    public List<MatchDataBO> getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(List<MatchDataBO> matchInfo) {
        this.matchInfo = matchInfo;
    }

    public List<JczqDataBO> getResultBo() {
        return resultBo;
    }

    public void setResultBo(List<JczqDataBO> resultBo) {
        this.resultBo = resultBo;
    }

    public Date getServerTime() {
        return serverTime;
    }

    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

    public Integer getSaleEndTotal() {
        return saleEndTotal;
    }

    public void setSaleEndTotal(Integer saleEndTotal) {
        this.saleEndTotal = saleEndTotal;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("daoBOs", daoBOs)
                .append("resultBo", resultBo)
                .append("matchInfo", matchInfo)
                .append("serverTime", serverTime)
                .append("saleEndTotal", saleEndTotal)
                .toString();
    }
}
