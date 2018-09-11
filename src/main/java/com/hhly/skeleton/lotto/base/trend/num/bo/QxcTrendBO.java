package com.hhly.skeleton.lotto.base.trend.num.bo;

import java.util.ArrayList;

import com.hhly.skeleton.base.util.trendutil.Assemble;
import com.hhly.skeleton.base.util.trendutil.TrendIgnore;
import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

@SuppressWarnings("serial")
public class QxcTrendBO extends TrendBaseBO{

	@Assemble(regex={"^bw\\d{1}$","^sw\\d{1}$","^w\\d{1}$","^q\\d{1}$","^b\\d{1}$","^s\\d{1}$","^g\\d{1}$"})
	@TrendIgnore
	private  ArrayList<Object> omits;
	
//	/**
//	 * 第一位
//	 */
//	@Assemble(regex={"^bw\\d{1}$"})
//	private ArrayList<Object> wz1;
//	/**
//	 * 第二位
//	 */
//	@Assemble(regex={"^sw\\d{1}$"})
//	private ArrayList<Object> wz2;
//	/**
//	 * 第三位
//	 */
//	@Assemble(regex={"^w\\d{1}$"})
//	private ArrayList<Object> wz3;
//	/**
//	 * 第四位
//	 */
//	@Assemble(regex={"^q\\d{1}$"})
//	private ArrayList<Object> wz4;
//	/**
//	 * 第五位
//	 */
//	@Assemble(regex={"^b\\d{1}$"})
//	private ArrayList<Object> wz5;
//	/**
//	 * 第六位
//	 */
//	@Assemble(regex={"^s\\d{1}$"})
//	private ArrayList<Object> wz6;
//	/**
//	 * 第七位
//	 */
//	@Assemble(regex={"^g\\d{1}$"})
//	private ArrayList<Object> wz7;
	
    private Integer bw0;

    private Integer bw1;

    private Integer bw2;

    private Integer bw3;

    private Integer bw4;

    private Integer bw5;

    private Integer bw6;

    private Integer bw7;

    private Integer bw8;

    private Integer bw9;

    private Integer sw0;

    private Integer sw1;

    private Integer sw2;

    private Integer sw3;

    private Integer sw4;

    private Integer sw5;

    private Integer sw6;

    private Integer sw7;

    private Integer sw8;

    private Integer sw9;

    private Integer w0;

    private Integer w1;

    private Integer w2;

    private Integer w3;

    private Integer w4;

    private Integer w5;

    private Integer w6;

    private Integer w7;

    private Integer w8;

    private Integer w9;

    private Integer q0;

    private Integer q1;

    private Integer q2;

    private Integer q3;

    private Integer q4;

    private Integer q5;

    private Integer q6;

    private Integer q7;

    private Integer q8;

    private Integer q9;

    private Integer b0;

    private Integer b1;

    private Integer b2;

    private Integer b3;

    private Integer b4;

    private Integer b5;

    private Integer b6;

    private Integer b7;

    private Integer b8;

    private Integer b9;

    private Integer s0;

    private Integer s1;

    private Integer s2;

    private Integer s3;

    private Integer s4;

    private Integer s5;

    private Integer s6;

    private Integer s7;

    private Integer s8;

    private Integer s9;

    private Integer g0;

    private Integer g1;

    private Integer g2;

    private Integer g3;

    private Integer g4;

    private Integer g5;

    private Integer g6;

    private Integer g7;

    private Integer g8;

    private Integer g9;
    
	/**
	 * 大小比:1[7:0],2[6:1],3[5:2],4[4:3],5[3:4],6[2:5],7[1:6],8[0:7]
	 */
    @TrendIgnore
	private Integer bs;
	/**
	 * 奇偶比:1[7:0],2[6:1],3[5:2],4[4:3],5[3:4],6[2:5],7[1:6],8[0:7]
	 */
    @TrendIgnore
	private Integer oe;

	public Integer getBw0() {
		return bw0;
	}

	public void setBw0(Integer bw0) {
		this.bw0 = bw0;
	}

	public Integer getBw1() {
		return bw1;
	}

	public void setBw1(Integer bw1) {
		this.bw1 = bw1;
	}

	public Integer getBw2() {
		return bw2;
	}

	public void setBw2(Integer bw2) {
		this.bw2 = bw2;
	}

	public Integer getBw3() {
		return bw3;
	}

	public void setBw3(Integer bw3) {
		this.bw3 = bw3;
	}

	public Integer getBw4() {
		return bw4;
	}

	public void setBw4(Integer bw4) {
		this.bw4 = bw4;
	}

	public Integer getBw5() {
		return bw5;
	}

	public void setBw5(Integer bw5) {
		this.bw5 = bw5;
	}

	public Integer getBw6() {
		return bw6;
	}

	public void setBw6(Integer bw6) {
		this.bw6 = bw6;
	}

	public Integer getBw7() {
		return bw7;
	}

	public void setBw7(Integer bw7) {
		this.bw7 = bw7;
	}

	public Integer getBw8() {
		return bw8;
	}

	public void setBw8(Integer bw8) {
		this.bw8 = bw8;
	}

	public Integer getBw9() {
		return bw9;
	}

	public void setBw9(Integer bw9) {
		this.bw9 = bw9;
	}

	public Integer getSw0() {
		return sw0;
	}

	public void setSw0(Integer sw0) {
		this.sw0 = sw0;
	}

	public Integer getSw1() {
		return sw1;
	}

	public void setSw1(Integer sw1) {
		this.sw1 = sw1;
	}

	public Integer getSw2() {
		return sw2;
	}

	public void setSw2(Integer sw2) {
		this.sw2 = sw2;
	}

	public Integer getSw3() {
		return sw3;
	}

	public void setSw3(Integer sw3) {
		this.sw3 = sw3;
	}

	public Integer getSw4() {
		return sw4;
	}

	public void setSw4(Integer sw4) {
		this.sw4 = sw4;
	}

	public Integer getSw5() {
		return sw5;
	}

	public void setSw5(Integer sw5) {
		this.sw5 = sw5;
	}

	public Integer getSw6() {
		return sw6;
	}

	public void setSw6(Integer sw6) {
		this.sw6 = sw6;
	}

	public Integer getSw7() {
		return sw7;
	}

	public void setSw7(Integer sw7) {
		this.sw7 = sw7;
	}

	public Integer getSw8() {
		return sw8;
	}

	public void setSw8(Integer sw8) {
		this.sw8 = sw8;
	}

	public Integer getSw9() {
		return sw9;
	}

	public void setSw9(Integer sw9) {
		this.sw9 = sw9;
	}

	public Integer getW0() {
		return w0;
	}

	public void setW0(Integer w0) {
		this.w0 = w0;
	}

	public Integer getW1() {
		return w1;
	}

	public void setW1(Integer w1) {
		this.w1 = w1;
	}

	public Integer getW2() {
		return w2;
	}

	public void setW2(Integer w2) {
		this.w2 = w2;
	}

	public Integer getW3() {
		return w3;
	}

	public void setW3(Integer w3) {
		this.w3 = w3;
	}

	public Integer getW4() {
		return w4;
	}

	public void setW4(Integer w4) {
		this.w4 = w4;
	}

	public Integer getW5() {
		return w5;
	}

	public void setW5(Integer w5) {
		this.w5 = w5;
	}

	public Integer getW6() {
		return w6;
	}

	public void setW6(Integer w6) {
		this.w6 = w6;
	}

	public Integer getW7() {
		return w7;
	}

	public void setW7(Integer w7) {
		this.w7 = w7;
	}

	public Integer getW8() {
		return w8;
	}

	public void setW8(Integer w8) {
		this.w8 = w8;
	}

	public Integer getW9() {
		return w9;
	}

	public void setW9(Integer w9) {
		this.w9 = w9;
	}

	public Integer getQ0() {
		return q0;
	}

	public void setQ0(Integer q0) {
		this.q0 = q0;
	}

	public Integer getQ1() {
		return q1;
	}

	public void setQ1(Integer q1) {
		this.q1 = q1;
	}

	public Integer getQ2() {
		return q2;
	}

	public void setQ2(Integer q2) {
		this.q2 = q2;
	}

	public Integer getQ3() {
		return q3;
	}

	public void setQ3(Integer q3) {
		this.q3 = q3;
	}

	public Integer getQ4() {
		return q4;
	}

	public void setQ4(Integer q4) {
		this.q4 = q4;
	}

	public Integer getQ5() {
		return q5;
	}

	public void setQ5(Integer q5) {
		this.q5 = q5;
	}

	public Integer getQ6() {
		return q6;
	}

	public void setQ6(Integer q6) {
		this.q6 = q6;
	}

	public Integer getQ7() {
		return q7;
	}

	public void setQ7(Integer q7) {
		this.q7 = q7;
	}

	public Integer getQ8() {
		return q8;
	}

	public void setQ8(Integer q8) {
		this.q8 = q8;
	}

	public Integer getQ9() {
		return q9;
	}

	public void setQ9(Integer q9) {
		this.q9 = q9;
	}

	public Integer getB0() {
		return b0;
	}

	public void setB0(Integer b0) {
		this.b0 = b0;
	}

	public Integer getB1() {
		return b1;
	}

	public void setB1(Integer b1) {
		this.b1 = b1;
	}

	public Integer getB2() {
		return b2;
	}

	public void setB2(Integer b2) {
		this.b2 = b2;
	}

	public Integer getB3() {
		return b3;
	}

	public void setB3(Integer b3) {
		this.b3 = b3;
	}

	public Integer getB4() {
		return b4;
	}

	public void setB4(Integer b4) {
		this.b4 = b4;
	}

	public Integer getB5() {
		return b5;
	}

	public void setB5(Integer b5) {
		this.b5 = b5;
	}

	public Integer getB6() {
		return b6;
	}

	public void setB6(Integer b6) {
		this.b6 = b6;
	}

	public Integer getB7() {
		return b7;
	}

	public void setB7(Integer b7) {
		this.b7 = b7;
	}

	public Integer getB8() {
		return b8;
	}

	public void setB8(Integer b8) {
		this.b8 = b8;
	}

	public Integer getB9() {
		return b9;
	}

	public void setB9(Integer b9) {
		this.b9 = b9;
	}

	public Integer getS0() {
		return s0;
	}

	public void setS0(Integer s0) {
		this.s0 = s0;
	}

	public Integer getS1() {
		return s1;
	}

	public void setS1(Integer s1) {
		this.s1 = s1;
	}

	public Integer getS2() {
		return s2;
	}

	public void setS2(Integer s2) {
		this.s2 = s2;
	}

	public Integer getS3() {
		return s3;
	}

	public void setS3(Integer s3) {
		this.s3 = s3;
	}

	public Integer getS4() {
		return s4;
	}

	public void setS4(Integer s4) {
		this.s4 = s4;
	}

	public Integer getS5() {
		return s5;
	}

	public void setS5(Integer s5) {
		this.s5 = s5;
	}

	public Integer getS6() {
		return s6;
	}

	public void setS6(Integer s6) {
		this.s6 = s6;
	}

	public Integer getS7() {
		return s7;
	}

	public void setS7(Integer s7) {
		this.s7 = s7;
	}

	public Integer getS8() {
		return s8;
	}

	public void setS8(Integer s8) {
		this.s8 = s8;
	}

	public Integer getS9() {
		return s9;
	}

	public void setS9(Integer s9) {
		this.s9 = s9;
	}

	public Integer getG0() {
		return g0;
	}

	public void setG0(Integer g0) {
		this.g0 = g0;
	}

	public Integer getG1() {
		return g1;
	}

	public void setG1(Integer g1) {
		this.g1 = g1;
	}

	public Integer getG2() {
		return g2;
	}

	public void setG2(Integer g2) {
		this.g2 = g2;
	}

	public Integer getG3() {
		return g3;
	}

	public void setG3(Integer g3) {
		this.g3 = g3;
	}

	public Integer getG4() {
		return g4;
	}

	public void setG4(Integer g4) {
		this.g4 = g4;
	}

	public Integer getG5() {
		return g5;
	}

	public void setG5(Integer g5) {
		this.g5 = g5;
	}

	public Integer getG6() {
		return g6;
	}

	public void setG6(Integer g6) {
		this.g6 = g6;
	}

	public Integer getG7() {
		return g7;
	}

	public void setG7(Integer g7) {
		this.g7 = g7;
	}

	public Integer getG8() {
		return g8;
	}

	public void setG8(Integer g8) {
		this.g8 = g8;
	}

	public Integer getG9() {
		return g9;
	}

	public void setG9(Integer g9) {
		this.g9 = g9;
	}

	public ArrayList<Object> getOmits() {
		return omits;
	}

	public void setOmits(ArrayList<Object> omits) {
		this.omits = omits;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}

	public Integer getOe() {
		return oe;
	}

	public void setOe(Integer oe) {
		this.oe = oe;
	}
}