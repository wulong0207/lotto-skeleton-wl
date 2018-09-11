package com.hhly.skeleton.lotto.base.ticket.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class TicketVO extends PageVO {

	private String ticketChannelId;

	private String machineKey;

	private String machineValue;

	private String id;

	private String type;

	private String lotteryCode;

	private String receiptContent;

	private String receiptContentDetail;

	private String status;
	
	private Date endTicketTime;

	public String getMachineKey() {
		return machineKey;
	}

	public void setMachineKey(String machineKey) {
		this.machineKey = machineKey;
	}

	public String getMachineValue() {
		return machineValue;
	}

	public void setMachineValue(String machineValue) {
		this.machineValue = machineValue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the ticketChannelId
	 */
	public String getTicketChannelId() {
		return ticketChannelId;
	}

	/**
	 * @param ticketChannelId
	 *            the ticketChannelId to set
	 */
	public void setTicketChannelId(String ticketChannelId) {
		this.ticketChannelId = ticketChannelId;
	}

	public String getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getReceiptContent() {
		return receiptContent;
	}

	public void setReceiptContent(String receiptContent) {
		this.receiptContent = receiptContent;
	}

	public String getReceiptContentDetail() {
		return receiptContentDetail;
	}

	public void setReceiptContentDetail(String receiptContentDetail) {
		this.receiptContentDetail = receiptContentDetail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the endTicketTime
	 */
	public Date getEndTicketTime() {
		return endTicketTime;
	}

	/**
	 * @param endTicketTime the endTicketTime to set
	 */
	public void setEndTicketTime(Date endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	@Override
	public String toString() {
		return "TicketVO [ticketChannelId=" + ticketChannelId + ", machineKey=" + machineKey + ", machineValue="
				+ machineValue + ", id=" + id + ", type=" + type + ", lotteryCode=" + lotteryCode + ", receiptContent="
				+ receiptContent + ", receiptContentDetail=" + receiptContentDetail + ", status=" + status
				+ ", endTicketTime=" + endTicketTime + "]";
	}
	
	

}
