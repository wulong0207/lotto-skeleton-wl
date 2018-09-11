package com.hhly.skeleton.lotto.base.trend.high.bo;

/**
 * @desc    快三遗漏BO
 * @author  Tony Wang
 * @date    2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class K3OmitBO extends HighOmitBaseBO {

	/**
	 * 号码数组
	 */
//	@Assemble(regex={"^b[1-6]{1}"})
//	private ArrayList<Object> nums;
	
	/**
	 * 和值数组
	 */
//	@Assemble(regex={"^s\\d{1,2}"},exclude={"s"})
//	private ArrayList<Object> sums;
	
	/**
	 * 跨度数组
	 */
//	@Assemble(regex={"^kd[0-5]{1}"})
//	private ArrayList<Object> kds;
	
	/**
	 * 同号数组
	 */
//	@Assemble(include={"t11","t22","t33","t44","t55","t66"})
//	private ArrayList<Object> ths;
	
	/**
	 * 不同号数组
	 */
//	@Assemble(regex={"^tdb[1-6]{1}"})
//	private ArrayList<Object> bths;
	
	/**
	 * 二同复数组
	 */
//	@Assemble(include={"tf11","tf22","tf33","tf44","tf55","tf66"})
//	private ArrayList<Object> tfs;
	
	/**
	 * 三同号数组
	 */
//	@Assemble(include={"t111","t222","t333","t444","t555","t666"})
//	private ArrayList<Object> t3s;
	
	/**
	 * 大小单双数组
	 */
//	@Assemble(include={"big","small","odd","even"})
//	private ArrayList<Object> dxds;

	// 注意字段类型要为Integer，否则OmitTrendUtil无法计算
    /**
     * 号码1遗漏
     */
    private Integer  b1;

    /**
     * 号码2遗漏
     */
    private Integer  b2;

    /**
     * 号码3遗漏
     */
    private Integer  b3;

    /**
     * 号码4遗漏
     */
    private Integer  b4;

    /**
     * 号码5遗漏
     */
    private Integer  b5;

    /**
     * 号码6遗漏
     */
    private Integer  b6;

    /**
     * 开奖号码和值为3遗漏
     */
    private Integer  s3;

    /**
     * 开奖号码和值为4遗漏
     */
    private Integer  s4;

    /**
     * 开奖号码和值为5遗漏
     */
    private Integer  s5;

    /**
     * 开奖号码和值为6遗漏
     */
    private Integer  s6;

    /**
     * 开奖号码和值为7遗漏
     */
    private Integer  s7;

    /**
     * 开奖号码和值为8遗漏
     */
    private Integer  s8;

    /**
     * 开奖号码和值为9遗漏
     */
    private Integer  s9;

    /**
     * 开奖号码和值为10遗漏
     */
    private Integer  s10;

    /**
     * 开奖号码和值为11遗漏
     */
    private Integer  s11;

    /**
     * 开奖号码和值为12遗漏
     */
    private Integer  s12;

    /**
     * 开奖号码和值为13遗漏
     */
    private Integer  s13;

    /**
     * 开奖号码和值为14遗漏
     */
    private Integer  s14;

    /**
     * 开奖号码和值为15遗漏
     */
    private Integer  s15;

    /**
     * 开奖号码和值为16遗漏
     */
    private Integer  s16;

    /**
     * 开奖号码和值17为遗漏
     */
    private Integer  s17;

    /**
     * 开奖号码和值为18遗漏
     */
    private Integer  s18;

    /**
     * 三同遗漏[号码为000、111、333]
     */
    private Integer  t3;

    /**
     * 三不同遗漏
     */
    private Integer  bt3;

    /**
     * 三连号通选遗漏
     */
    private Integer  l3;

    /**
     * 2同复[11*,22*,33*]
     */
    private Integer  tf2;

    /**
     * 2同单
     */
    private Integer  td2;

    /**
     * 2不同
     */
    private Integer  bt2;


    /**
     * 2同单11
     */
    private Integer  t11;

    /**
     * 2同单22
     */
    private Integer  t22;

    /**
     * 2同单33
     */
    private Integer  t33;

    /**
     * 2同单44
     */
    private Integer  t44;

    /**
     * 2同单55
     */
    private Integer  t55;

    /**
     * 2同单66
     */
    private Integer  t66;
    
    
    /**
     * 2同复11
     */
    private Integer  tf11;

    /**
     * 2同复22
     */
    private Integer  tf22;

    /**
     * 2同复33
     */
    private Integer  tf33;

    /**
     * 2同复44
     */
    private Integer  tf44;

    /**
     * 2同复55
     */
    private Integer  tf55;

    /**
     * 2同复66
     */
    private Integer  tf66;
    

    /**
     * 3同111
     */
    private Integer  t111;

    /**
     * 3同222
     */
    private Integer  t222;

    /**
     * 3同333
     */
    private Integer  t333;

    /**
     * 3同444
     */
    private Integer  t444;

    /**
     * 3同555
     */
    private Integer  t555;

    /**
     * 3同666
     */
    private Integer  t666;
    
    /**
     * 大
     */
    private Integer  big;

    /**
     * 小
     */
    private Integer  small;

    /**
     * 单
     */
    private Integer  odd;

    /**
     * 双
     */
    private Integer  even;

    /**
     * 跨度0
     */
    private Integer  kd0;

    /**
     * 跨度1
     */
    private Integer  kd1;

    /**
     * 跨度2
     */
    private Integer  kd2;

    /**
     * 跨度3
     */
    private Integer  kd3;

    /**
     * 跨度4
     */
    private Integer  kd4;

    /**
     * 跨度5
     */
    private Integer  kd5;
    
    /**
     * 二同单不同号1
     */
    private Integer  tdb1;
    /**
     * 二同单不同号2
     */
    private Integer  tdb2;
    /**
     * 二同单不同号3
     */
    private Integer  tdb3;
    /**
     * 二同单不同号4
     */
    private Integer  tdb4;
    /**
     * 二同单不同号5
     */
    private Integer  tdb5;
    /**
     * 二同单不同号6
     */
    private Integer  tdb6;
    /**
     * 跨度
     */
    private Integer kd;
    /**
     * 和
     */
    private Integer s;
    
    /**
     * 形态:1.豹子;2.对子;3.三不同
     */
    private Integer type;
    
    /**
     * 大小比:1[3:0],2[2:1],3[1:2],4[0:3]
     */
    private Integer bs;

    public void setT111to666(Integer omit) {
		setT111(omit);
		setT222(omit);
		setT333(omit);
		setT444(omit);
		setT555(omit);
		setT666(omit);
	}

	public void setTd(Integer omit) {
		setT11(omit);
		setT22(omit);
		setT33(omit);
		setT44(omit);
		setT55(omit);
		setT66(omit);
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

	public Integer getS10() {
		return s10;
	}

	public void setS10(Integer s10) {
		this.s10 = s10;
	}

	public Integer getS11() {
		return s11;
	}

	public void setS11(Integer s11) {
		this.s11 = s11;
	}

	public Integer getS12() {
		return s12;
	}

	public void setS12(Integer s12) {
		this.s12 = s12;
	}

	public Integer getS13() {
		return s13;
	}

	public void setS13(Integer s13) {
		this.s13 = s13;
	}

	public Integer getS14() {
		return s14;
	}

	public void setS14(Integer s14) {
		this.s14 = s14;
	}

	public Integer getS15() {
		return s15;
	}

	public void setS15(Integer s15) {
		this.s15 = s15;
	}

	public Integer getS16() {
		return s16;
	}

	public void setS16(Integer s16) {
		this.s16 = s16;
	}

	public Integer getS17() {
		return s17;
	}

	public void setS17(Integer s17) {
		this.s17 = s17;
	}

	public Integer getS18() {
		return s18;
	}

	public void setS18(Integer s18) {
		this.s18 = s18;
	}

	public Integer getT3() {
		return t3;
	}

	public void setT3(Integer t3) {
		this.t3 = t3;
	}

	public Integer getBt3() {
		return bt3;
	}

	public void setBt3(Integer bt3) {
		this.bt3 = bt3;
	}

	public Integer getL3() {
		return l3;
	}

	public void setL3(Integer l3) {
		this.l3 = l3;
	}

	public Integer getTf2() {
		return tf2;
	}

	public void setTf2(Integer tf2) {
		this.tf2 = tf2;
	}

	public Integer getTd2() {
		return td2;
	}

	public void setTd2(Integer td2) {
		this.td2 = td2;
	}

	public Integer getBt2() {
		return bt2;
	}

	public void setBt2(Integer bt2) {
		this.bt2 = bt2;
	}

	public Integer getT11() {
		return t11;
	}

	public void setT11(Integer t11) {
		this.t11 = t11;
	}

	public Integer getT22() {
		return t22;
	}

	public void setT22(Integer t22) {
		this.t22 = t22;
	}

	public Integer getT33() {
		return t33;
	}

	public void setT33(Integer t33) {
		this.t33 = t33;
	}

	public Integer getT44() {
		return t44;
	}

	public void setT44(Integer t44) {
		this.t44 = t44;
	}

	public Integer getT55() {
		return t55;
	}

	public void setT55(Integer t55) {
		this.t55 = t55;
	}

	public Integer getT66() {
		return t66;
	}

	public void setT66(Integer t66) {
		this.t66 = t66;
	}

	public Integer getT111() {
		return t111;
	}

	public void setT111(Integer t111) {
		this.t111 = t111;
	}

	public Integer getT222() {
		return t222;
	}

	public void setT222(Integer t222) {
		this.t222 = t222;
	}

	public Integer getT333() {
		return t333;
	}

	public void setT333(Integer t333) {
		this.t333 = t333;
	}

	public Integer getT444() {
		return t444;
	}

	public void setT444(Integer t444) {
		this.t444 = t444;
	}

	public Integer getT555() {
		return t555;
	}

	public void setT555(Integer t555) {
		this.t555 = t555;
	}

	public Integer getT666() {
		return t666;
	}

	public void setT666(Integer t666) {
		this.t666 = t666;
	}

	public Integer getBig() {
		return big;
	}

	public void setBig(Integer big) {
		this.big = big;
	}

	public Integer getSmall() {
		return small;
	}

	public void setSmall(Integer small) {
		this.small = small;
	}

	public Integer getOdd() {
		return odd;
	}

	public void setOdd(Integer odd) {
		this.odd = odd;
	}

	public Integer getEven() {
		return even;
	}

	public void setEven(Integer even) {
		this.even = even;
	}

	public Integer getKd0() {
		return kd0;
	}

	public void setKd0(Integer kd0) {
		this.kd0 = kd0;
	}

	public Integer getKd1() {
		return kd1;
	}

	public void setKd1(Integer kd1) {
		this.kd1 = kd1;
	}

	public Integer getKd2() {
		return kd2;
	}

	public void setKd2(Integer kd2) {
		this.kd2 = kd2;
	}

	public Integer getKd3() {
		return kd3;
	}

	public void setKd3(Integer kd3) {
		this.kd3 = kd3;
	}

	public Integer getKd4() {
		return kd4;
	}

	public void setKd4(Integer kd4) {
		this.kd4 = kd4;
	}

	public Integer getKd5() {
		return kd5;
	}

	public void setKd5(Integer kd5) {
		this.kd5 = kd5;
	}

	public Integer getTdb1() {
		return tdb1;
	}

	public void setTdb1(Integer tdb1) {
		this.tdb1 = tdb1;
	}

	public Integer getTdb2() {
		return tdb2;
	}

	public void setTdb2(Integer tdb2) {
		this.tdb2 = tdb2;
	}

	public Integer getTdb3() {
		return tdb3;
	}

	public void setTdb3(Integer tdb3) {
		this.tdb3 = tdb3;
	}

	public Integer getTdb4() {
		return tdb4;
	}

	public void setTdb4(Integer tdb4) {
		this.tdb4 = tdb4;
	}

	public Integer getTdb5() {
		return tdb5;
	}

	public void setTdb5(Integer tdb5) {
		this.tdb5 = tdb5;
	}

	public Integer getTdb6() {
		return tdb6;
	}

	public void setTdb6(Integer tdb6) {
		this.tdb6 = tdb6;
	}

	public Integer getTf11() {
		return tf11;
	}

	public void setTf11(Integer tf11) {
		this.tf11 = tf11;
	}

	public Integer getTf22() {
		return tf22;
	}

	public void setTf22(Integer tf22) {
		this.tf22 = tf22;
	}

	public Integer getTf33() {
		return tf33;
	}

	public void setTf33(Integer tf33) {
		this.tf33 = tf33;
	}

	public Integer getTf44() {
		return tf44;
	}

	public void setTf44(Integer tf44) {
		this.tf44 = tf44;
	}

	public Integer getTf55() {
		return tf55;
	}

	public void setTf55(Integer tf55) {
		this.tf55 = tf55;
	}

	public Integer getTf66() {
		return tf66;
	}

	public void setTf66(Integer tf66) {
		this.tf66 = tf66;
	}

	public Integer getKd() {
		return kd;
	}

	public void setKd(Integer kd) {
		this.kd = kd;
	}

	public Integer getS() {
		return s;
	}

	public void setS(Integer s) {
		this.s = s;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getBs() {
		return bs;
	}

	public void setBs(Integer bs) {
		this.bs = bs;
	}
}