package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RateStatuisticsBO extends BaseBO {

	// 用户数
	private int u_n30;
	private int u_n30_n0;
	private int u_p0_p30;
	private int u_p30_p50;
	private int u_p50_p80;
	private int u_p80_p100;
	private int u_p100_p150;
	private int u_p150_p200;
	private int u_p200_p300;
	private int u_p300;
	

	// 金额
	private double m_n30;
	private double m_n30_n0;
	private double m_p0_p30;
	private double m_p30_p50;
	private double m_p50_p80;
	private double m_p80_p100;
	private double m_p100_p150;
	private double m_p150_p200;
	private double m_p200_p300;
	private double m_p300;

	// 用户占比
	private double ur_n30;
	private double ur_n30_n0;
	private double ur_p0_p30;
	private double ur_p30_p50;
	private double ur_p50_p80;
	private double ur_p80_p100;
	private double ur_p100_p150;
	private double ur_p150_p200;
	private double ur_p200_p300;
	private double ur_p300;

	// 金额占比
	private double mr_n30;
	private double mr_n30_n0;
	private double mr_p0_p30;
	private double mr_p30_p50;
	private double mr_p50_p80;
	private double mr_p80_p100;
	private double mr_p100_p150;
	private double mr_p150_p200;
	private double mr_p200_p300;
	private double mr_p300;
	
	public int getAllUser(){
		return u_n30+u_n30_n0+u_p0_p30+u_p30_p50+u_p50_p80+u_p80_p100+u_p100_p150+
		u_p150_p200+u_p200_p300+u_p300;
	}
	
	public double getAllMoney(){
		return m_n30+m_n30_n0+m_p0_p30+m_p30_p50+m_p50_p80+m_p80_p100+m_p100_p150+m_p150_p200
				+m_p200_p300+m_p300;
	}

	public int getU_n30() {
		return u_n30;
	}

	public void setU_n30(int u_n30) {
		this.u_n30 = u_n30;
	}

	public int getU_n30_n0() {
		return u_n30_n0;
	}

	public void setU_n30_n0(int u_n30_n0) {
		this.u_n30_n0 = u_n30_n0;
	}

	public int getU_p0_p30() {
		return u_p0_p30;
	}

	public void setU_p0_p30(int u_p0_p30) {
		this.u_p0_p30 = u_p0_p30;
	}

	public int getU_p30_p50() {
		return u_p30_p50;
	}

	public void setU_p30_p50(int u_p30_p50) {
		this.u_p30_p50 = u_p30_p50;
	}

	public int getU_p50_p80() {
		return u_p50_p80;
	}

	public void setU_p50_p80(int u_p50_p80) {
		this.u_p50_p80 = u_p50_p80;
	}

	public int getU_p80_p100() {
		return u_p80_p100;
	}

	public void setU_p80_p100(int u_p80_p100) {
		this.u_p80_p100 = u_p80_p100;
	}

	public int getU_p100_p150() {
		return u_p100_p150;
	}

	public void setU_p100_p150(int u_p100_p150) {
		this.u_p100_p150 = u_p100_p150;
	}

	public int getU_p150_p200() {
		return u_p150_p200;
	}

	public void setU_p150_p200(int u_p150_p200) {
		this.u_p150_p200 = u_p150_p200;
	}

	public int getU_p200_p300() {
		return u_p200_p300;
	}

	public void setU_p200_p300(int u_p200_p300) {
		this.u_p200_p300 = u_p200_p300;
	}

	public int getU_p300() {
		return u_p300;
	}

	public void setU_p300(int u_p300) {
		this.u_p300 = u_p300;
	}

	public double getM_n30() {
		return m_n30;
	}

	public void setM_n30(double m_n30) {
		this.m_n30 = m_n30;
	}

	public double getM_n30_n0() {
		return m_n30_n0;
	}

	public void setM_n30_n0(double m_n30_n0) {
		this.m_n30_n0 = m_n30_n0;
	}

	public double getM_p0_p30() {
		return m_p0_p30;
	}

	public void setM_p0_p30(double m_p0_p30) {
		this.m_p0_p30 = m_p0_p30;
	}

	public double getM_p30_p50() {
		return m_p30_p50;
	}

	public void setM_p30_p50(double m_p30_p50) {
		this.m_p30_p50 = m_p30_p50;
	}

	public double getM_p50_p80() {
		return m_p50_p80;
	}

	public void setM_p50_p80(double m_p50_p80) {
		this.m_p50_p80 = m_p50_p80;
	}

	public double getM_p80_p100() {
		return m_p80_p100;
	}

	public void setM_p80_p100(double m_p80_p100) {
		this.m_p80_p100 = m_p80_p100;
	}

	public double getM_p100_p150() {
		return m_p100_p150;
	}

	public void setM_p100_p150(double m_p100_p150) {
		this.m_p100_p150 = m_p100_p150;
	}

	public double getM_p150_p200() {
		return m_p150_p200;
	}

	public void setM_p150_p200(double m_p150_p200) {
		this.m_p150_p200 = m_p150_p200;
	}

	public double getM_p200_p300() {
		return m_p200_p300;
	}

	public void setM_p200_p300(double m_p200_p300) {
		this.m_p200_p300 = m_p200_p300;
	}

	public double getM_p300() {
		return m_p300;
	}

	public void setM_p300(double m_p300) {
		this.m_p300 = m_p300;
	}

	public double getUr_n30() {
		return ur_n30;
	}

	public void setUr_n30(double ur_n30) {
		this.ur_n30 = ur_n30;
	}

	public double getUr_n30_n0() {
		return ur_n30_n0;
	}

	public void setUr_n30_n0(double ur_n30_n0) {
		this.ur_n30_n0 = ur_n30_n0;
	}

	public double getUr_p0_p30() {
		return ur_p0_p30;
	}

	public void setUr_p0_p30(double ur_p0_p30) {
		this.ur_p0_p30 = ur_p0_p30;
	}

	public double getUr_p30_p50() {
		return ur_p30_p50;
	}

	public void setUr_p30_p50(double ur_p30_p50) {
		this.ur_p30_p50 = ur_p30_p50;
	}

	public double getUr_p50_p80() {
		return ur_p50_p80;
	}

	public void setUr_p50_p80(double ur_p50_p80) {
		this.ur_p50_p80 = ur_p50_p80;
	}

	public double getUr_p80_p100() {
		return ur_p80_p100;
	}

	public void setUr_p80_p100(double ur_p80_p100) {
		this.ur_p80_p100 = ur_p80_p100;
	}

	public double getUr_p100_p150() {
		return ur_p100_p150;
	}

	public void setUr_p100_p150(double ur_p100_p150) {
		this.ur_p100_p150 = ur_p100_p150;
	}

	public double getUr_p150_p200() {
		return ur_p150_p200;
	}

	public void setUr_p150_p200(double ur_p150_p200) {
		this.ur_p150_p200 = ur_p150_p200;
	}

	public double getUr_p200_p300() {
		return ur_p200_p300;
	}

	public void setUr_p200_p300(double ur_p200_p300) {
		this.ur_p200_p300 = ur_p200_p300;
	}

	public double getUr_p300() {
		return ur_p300;
	}

	public void setUr_p300(double ur_p300) {
		this.ur_p300 = ur_p300;
	}

	public double getMr_n30() {
		return mr_n30;
	}

	public void setMr_n30(double mr_n30) {
		this.mr_n30 = mr_n30;
	}

	public double getMr_n30_n0() {
		return mr_n30_n0;
	}

	public void setMr_n30_n0(double mr_n30_n0) {
		this.mr_n30_n0 = mr_n30_n0;
	}

	public double getMr_p0_p30() {
		return mr_p0_p30;
	}

	public void setMr_p0_p30(double mr_p0_p30) {
		this.mr_p0_p30 = mr_p0_p30;
	}

	public double getMr_p30_p50() {
		return mr_p30_p50;
	}

	public void setMr_p30_p50(double mr_p30_p50) {
		this.mr_p30_p50 = mr_p30_p50;
	}

	public double getMr_p50_p80() {
		return mr_p50_p80;
	}

	public void setMr_p50_p80(double mr_p50_p80) {
		this.mr_p50_p80 = mr_p50_p80;
	}

	public double getMr_p80_p100() {
		return mr_p80_p100;
	}

	public void setMr_p80_p100(double mr_p80_p100) {
		this.mr_p80_p100 = mr_p80_p100;
	}

	public double getMr_p100_p150() {
		return mr_p100_p150;
	}

	public void setMr_p100_p150(double mr_p100_p150) {
		this.mr_p100_p150 = mr_p100_p150;
	}

	public double getMr_p150_p200() {
		return mr_p150_p200;
	}

	public void setMr_p150_p200(double mr_p150_p200) {
		this.mr_p150_p200 = mr_p150_p200;
	}

	public double getMr_p200_p300() {
		return mr_p200_p300;
	}

	public void setMr_p200_p300(double mr_p200_p300) {
		this.mr_p200_p300 = mr_p200_p300;
	}

	public double getMr_p300() {
		return mr_p300;
	}

	public void setMr_p300(double mr_p300) {
		this.mr_p300 = mr_p300;
	}
	

}
