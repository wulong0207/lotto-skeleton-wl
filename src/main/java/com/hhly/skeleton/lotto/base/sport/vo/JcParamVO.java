package com.hhly.skeleton.lotto.base.sport.vo;

import java.util.Arrays;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @auth lgs on
 * @date 2017/2/24.
 * @desc 竞彩请求参数
 * @compay 益彩网络科技有限公司
 * @vsersion 1.0
 */
public class JcParamVO extends BaseVO {
    private static final long serialVersionUID = 6075333125883044046L;
    /**
     * 赛事类别
     */
    private Short matchType;

    private String lotteryCode;

    private String issueCode;

    private String systemCode;
    /**
     * 玩法标识
     */
    private String[] playFlag;

    private String matchStatus;

    /**
     * 是否暂停销售
     */
    private String isEnd;

    /**
     * 渠道
     */
    private String channel;

    public Short getMatchType() {
        return matchType;
    }

    public void setMatchType(Short matchType) {
        this.matchType = matchType;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String[] getPlayFlag() {
        return playFlag;
    }

    public void setPlayFlag(String[] playFlag) {
        this.playFlag = playFlag;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(String isEnd) {
        this.isEnd = isEnd;
    }


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("JcParamVO{").append("lotteryCode='").append(lotteryCode).append('\'').append(", issueCode='").append(issueCode).append('\'').append(", playFlag=").append(Arrays.toString(playFlag)).append(", isEnd='").append(isEnd).append('\'').append(", channel='").append(channel).append('\'').append('}').toString();
    }
}
