package com.hhly.skeleton.lotto.base.ticket.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.order.bo.OrderMatchInfoBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 竞技彩票明细
 * @date 2017/11/1 14:56
 * @company 益彩网络科技公司
 */
public class SportTicketDetailInfoBO extends BaseBO {
    private static final long serialVersionUID = 9033237722772851476L;

    /**
     * 注数
     */
	private Integer betNum;
	/**
	 * 金额
	 */
	private Double money;
	/**
	 * 倍数
	 */
	private Integer multiple;
	/**
	 * 税前奖金
	 */
	private Double preBonus;
	/**
	 * 出票状态：-2出票失败;-1送票失败;0不出票;1待分配;2已分配;3已送票;4已出票
	 */
	private Short ticketStatus;
	/**
	 * 票中奖状态：1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	private Short winningStatus;
	/**
	 * 过关方式
	 */
	private String passway;
	/**
	 * 对阵列表(竞技彩)
	 */
	private List<MatchsBO> listMatchs;

	/**
	 * 冠亚军对阵列表
	 */
	private List<OrderMatchInfoBO> orderMatchInfoBOs;
	
	public Integer getBetNum() {
		return betNum;
	}
	public void setBetNum(Integer betNum) {
		this.betNum = betNum;
	}
	
	public Integer getMultiple() {
		return multiple;
	}
	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getPreBonus() {
		return preBonus;
	}
	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}
	public Short getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(Short ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Short getWinningStatus() {
		return winningStatus;
	}
	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}
	public String getPassway() {
		return passway;
	}
	public void setPassway(String passway) {
		this.passway = passway;
	}
	public List<MatchsBO> getListMatchs() {
		return listMatchs;
	}
	public void setListMatchs(List<MatchsBO> listMatchs) {
		this.listMatchs = listMatchs;
	}

	public List<OrderMatchInfoBO> getOrderMatchInfoBOs() {
		return orderMatchInfoBOs;
	}

	public void setOrderMatchInfoBOs(List<OrderMatchInfoBO> orderMatchInfoBOs) {
		this.orderMatchInfoBOs = orderMatchInfoBOs;
	}
}
