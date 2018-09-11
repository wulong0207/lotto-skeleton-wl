package com.hhly.skeleton.lotto.base.ticket.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 所有彩种公用 出票BO
 * @author longguoyou
 * @date 2017年11月1日
 * @compay 益彩网络科技有限公司
 */
public class TicketCommonInfoBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /**
     * 注数
     */
	private Integer betNum;
	/**
	 * 金额
	 */
	private Integer money;
	/**
	 * 倍数
	 */
	private Integer multiple;
	/**
	 * 投注内容(数字彩)
	 */
	private String planContent;
	/**
	 * 玩法及投注类型(数字彩)
	 */
	private String playType;
	/**
	 * 税前奖金
	 */
	private Integer preBonus;
	/**
	 * 出票状态
	 */
	private Short ticketStatus;
	/**
	 * 票中奖状态
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
	
	public Integer getBetNum() {
		return betNum;
	}
	public void setBetNum(Integer betNum) {
		this.betNum = betNum;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
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
	public String getPlayType() {
		return playType;
	}
	public void setPlayType(String playType) {
		this.playType = playType;
	}
	public Integer getPreBonus() {
		return preBonus;
	}
	public void setPreBonus(Integer preBonus) {
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
	
	
}
