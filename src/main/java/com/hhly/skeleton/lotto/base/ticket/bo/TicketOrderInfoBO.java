package com.hhly.skeleton.lotto.base.ticket.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 出票明细页面 BO
 * @date 2017/11/1 14:42
 * @company 益彩网络科技公司
 */
public class TicketOrderInfoBO extends BaseBO {

    private static final long serialVersionUID = 1347097701870146419L;

    /**
     * 开奖号码
     */
    private String drawCode;

    /**
     * 彩期
     */
    private String issueCode;

    /**
     * 彩种编号
     */
    private Integer lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 中奖状态
     */
    private Integer winningStatus;

    /**
     * 总条数
     */
    private Integer total;

    /**
     * 竞彩票结果集
     */
    private List<SportTicketDetailInfoBO> sportList;

    /**
     * 数字彩票结果集
     */
    private List<NumTicketDetailInfoBO> numList;

    public String getDrawCode() {
        return drawCode;
    }

    public void setDrawCode(String drawCode) {
        this.drawCode = drawCode;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
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
        this.lotteryName = lotteryName;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<SportTicketDetailInfoBO> getSportList() {
        return sportList;
    }

    public void setSportList(List<SportTicketDetailInfoBO> sportList) {
        this.sportList = sportList;
    }

    public List<NumTicketDetailInfoBO> getNumList() {
        return numList;
    }

    public void setNumList(List<NumTicketDetailInfoBO> numList) {
        this.numList = numList;
    }
}
