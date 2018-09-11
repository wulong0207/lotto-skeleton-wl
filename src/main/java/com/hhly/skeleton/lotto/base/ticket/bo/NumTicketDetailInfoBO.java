package com.hhly.skeleton.lotto.base.ticket.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 数字彩票明细
 * @date 2017/11/1 14:58
 * @company 益彩网络科技公司
 */
public class NumTicketDetailInfoBO extends BaseBO {
    private static final long serialVersionUID = 3018751077988319190L;

    /**
     * 注数
     */
    private Integer betNum;

    /**
     * 票金额
     */
    private Double money;

    /**
     * 票倍数
     */
    private Integer multiple;

    /**
     * 投注内容
     */
    private String planContent;

    /**
     * 投注类型
     * '1：单式；2：复式；3：胆拖；4：混合；5：上传；6：和值'
     */
    private Integer playType;

    /**
     * 税前奖金
     */
    private Double preBonus;

    /**
     * 出票状态
     * -2出票失败;-1送票失败;0不出票;1待分配;2已分配;3已送票;4已出票
     */
    private Integer ticketStatus;

    /**
     * 中奖状态
     * 1：未开奖；2：未中奖；3：已中奖；4：已派奖
     */
    private Integer winningStatus;

    /**
     * 子玩法编号
     */
    private Integer childCode;

    /**
     * 子玩法名称
     */
    private String childName;

    public Integer getBetNum() {
        return betNum;
    }

    public void setBetNum(Integer betNum) {
        this.betNum = betNum;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public Integer getPlayType() {
        return playType;
    }

    public void setPlayType(Integer playType) {
        this.playType = playType;
    }

    public Double getPreBonus() {
        return preBonus;
    }

    public void setPreBonus(Double preBonus) {
        this.preBonus = preBonus;
    }

    public Integer getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Integer getChildCode() {
        return childCode;
    }

    public void setChildCode(Integer childCode) {
        this.childCode = childCode;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
}
