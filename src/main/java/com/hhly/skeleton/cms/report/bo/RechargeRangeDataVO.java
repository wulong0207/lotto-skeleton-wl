package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class RechargeRangeDataVO extends BaseVO {

	private Integer id;
	/** 时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dt;
	/** 注册渠道id **/
	private Integer channelId;
	/** 支付渠道id **/
	private Integer channelPayId;
	/** 充值用户数 **/
	private Integer fillUser;
	/** 充值金额 **/
	private Double fillMoney;
	/** 10-50的总金额 **/
	private Double m0_50;
	/** 10-50的总充值人数 **/
	private Integer u0_50;
	private Double m51_100;
	private Integer u51_100;
	private Double m101_500;
	private Integer u101_500;
	private Double m501_1000;
	private Integer u501_1000;
	private Double m1001_5000;
	private Integer u1001_5000;
	private Double m5001_10000;
	private Integer u5001_10000;
	private Double m10001_50000;
	private Integer u10001_50000;
	private Double m50001_100000;
	private Integer u50001_100000;
	private Double m100000;
	private Integer u100000;
	private Double r0_50;
	private Double r51_100;
	private Double r101_500;
	private Double r501_1000;
	private Double r1001_5000;
	private Double r5001_10000;
	private Double r10001_50000;
	private Double r50001_100000;
	private Double r100000;

	{
		r0_50 = 0d;
		r51_100 = 0d;
		r101_500 = 0d;
		r501_1000 = 0d;
		r1001_5000 = 0d;
		r5001_10000 = 0d;
		r10001_50000 = 0d;
		r50001_100000 = 0d;
		r100000 = 0d;
	}

	public RechargeRangeDataVO() {
	}

	public RechargeRangeDataVO(int u0_50, int u51_100, int u101_500, int u501_1000, int u1001_5000, int u5001_10000,
			int u10001_50000, int u50001_100000, int u100000) {
		this.u0_50 = u0_50;
		this.u51_100 = u51_100;
		this.u101_500 = u101_500;
		this.u501_1000 = u501_1000;
		this.u1001_5000 = u1001_5000;
		this.u5001_10000 = u5001_10000;
		this.u10001_50000 = u10001_50000;
		this.u50001_100000 = u50001_100000;
		this.u100000 = u100000;

	}

	public RechargeRangeDataVO(double m0_50, double m51_100, double m101_500, double m501_1000, double m1001_5000,
			double m5001_10000, double m10001_50000, double m50001_100000, double m100000) {
		this.m0_50 = m0_50;
		this.m51_100 = m51_100;
		this.m101_500 = m101_500;
		this.m501_1000 = m501_1000;
		this.m1001_5000 = m1001_5000;
		this.m5001_10000 = m5001_10000;
		this.m10001_50000 = m10001_50000;
		this.m50001_100000 = m50001_100000;
		this.m100000 = m100000;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getChannelPayId() {
		return channelPayId;
	}

	public void setChannelPayId(Integer channelPayId) {
		this.channelPayId = channelPayId;
	}

	public Integer getFillUser() {
		return fillUser;
	}

	public void setFillUser(Integer fillUser) {
		this.fillUser = fillUser;
	}

	public Double getFillMoney() {
		return fillMoney;
	}

	public void setFillMoney(Double fillMoney) {
		this.fillMoney = fillMoney;
	}

	public Double getM0_50() {
		return m0_50;
	}

	public void setM0_50(Double m0_50) {
		this.m0_50 = m0_50;
	}

	public Integer getU0_50() {
		return u0_50;
	}

	public void setU0_50(Integer u0_50) {
		this.u0_50 = u0_50;
	}

	public Double getR0_50() {
		return r0_50;
	}

	public void setR0_50(Double r0_50) {
		this.r0_50 = r0_50;
	}

	public Double getM51_100() {
		return m51_100;
	}

	public void setM51_100(Double m51_100) {
		this.m51_100 = m51_100;
	}

	public Integer getU51_100() {
		return u51_100;
	}

	public void setU51_100(Integer u51_100) {
		this.u51_100 = u51_100;
	}

	public Double getM101_500() {
		return m101_500;
	}

	public void setM101_500(Double m101_500) {
		this.m101_500 = m101_500;
	}

	public Integer getU101_500() {
		return u101_500;
	}

	public void setU101_500(Integer u101_500) {
		this.u101_500 = u101_500;
	}

	public Double getM501_1000() {
		return m501_1000;
	}

	public void setM501_1000(Double m501_1000) {
		this.m501_1000 = m501_1000;
	}

	public Integer getU501_1000() {
		return u501_1000;
	}

	public void setU501_1000(Integer u501_1000) {
		this.u501_1000 = u501_1000;
	}

	public Double getM1001_5000() {
		return m1001_5000;
	}

	public void setM1001_5000(Double m1001_5000) {
		this.m1001_5000 = m1001_5000;
	}

	public Integer getU1001_5000() {
		return u1001_5000;
	}

	public void setU1001_5000(Integer u1001_5000) {
		this.u1001_5000 = u1001_5000;
	}

	public Double getM5001_10000() {
		return m5001_10000;
	}

	public void setM5001_10000(Double m5001_10000) {
		this.m5001_10000 = m5001_10000;
	}

	public Integer getU5001_10000() {
		return u5001_10000;
	}

	public void setU5001_10000(Integer u5001_10000) {
		this.u5001_10000 = u5001_10000;
	}

	public Double getM10001_50000() {
		return m10001_50000;
	}

	public void setM10001_50000(Double m10001_50000) {
		this.m10001_50000 = m10001_50000;
	}

	public Integer getU10001_50000() {
		return u10001_50000;
	}

	public void setU10001_50000(Integer u10001_50000) {
		this.u10001_50000 = u10001_50000;
	}

	public Double getM50001_100000() {
		return m50001_100000;
	}

	public void setM50001_100000(Double m50001_100000) {
		this.m50001_100000 = m50001_100000;
	}

	public Integer getU50001_100000() {
		return u50001_100000;
	}

	public void setU50001_100000(Integer u50001_100000) {
		this.u50001_100000 = u50001_100000;
	}

	public Double getM100000() {
		return m100000;
	}

	public void setM100000(Double m100000) {
		this.m100000 = m100000;
	}

	public Integer getU100000() {
		return u100000;
	}

	public void setU100000(Integer u100000) {
		this.u100000 = u100000;
	}

	public Double getR51_100() {
		return r51_100;
	}

	public void setR51_100(Double r51_100) {
		this.r51_100 = r51_100;
	}

	public Double getR101_500() {
		return r101_500;
	}

	public void setR101_500(Double r101_500) {
		this.r101_500 = r101_500;
	}

	public Double getR501_1000() {
		return r501_1000;
	}

	public void setR501_1000(Double r501_1000) {
		this.r501_1000 = r501_1000;
	}

	public Double getR1001_5000() {
		return r1001_5000;
	}

	public void setR1001_5000(Double r1001_5000) {
		this.r1001_5000 = r1001_5000;
	}

	public Double getR5001_10000() {
		return r5001_10000;
	}

	public void setR5001_10000(Double r5001_10000) {
		this.r5001_10000 = r5001_10000;
	}

	public Double getR10001_50000() {
		return r10001_50000;
	}

	public void setR10001_50000(Double r10001_50000) {
		this.r10001_50000 = r10001_50000;
	}

	public Double getR50001_100000() {
		return r50001_100000;
	}

	public void setR50001_100000(Double r50001_100000) {
		this.r50001_100000 = r50001_100000;
	}

	public Double getR100000() {
		return r100000;
	}

	public void setR100000(Double r100000) {
		this.r100000 = r100000;
	}

}
