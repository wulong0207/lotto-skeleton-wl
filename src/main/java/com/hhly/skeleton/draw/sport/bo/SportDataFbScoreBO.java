package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

public class SportDataFbScoreBO extends SportDataBaseBO {

	private static final long serialVersionUID = 8595140116752718065L;

	/**
	 * SP1:0时的值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp10;

	/**
	 * SP2:0
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp20;

	/**
	 * SP2:1
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp21;

	/**
	 * SP3:0
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp30;

	/**
	 * SP3:1
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp31;

	/**
	 * SP3:2
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp32;

	/**
	 * SP4:0
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp40;

	/**
	 * SP4:1
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp41;

	/**
	 * SP4:2
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp42;

	/**
	 * SP5:0
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp50;

	/**
	 * SP5:1
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp51;

	/**
	 * SP5:2
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp52;

	/**
	 * SP胜其它
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWinOther;

	/**
	 * SP0:0
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp00;

	/**
	 * SP1:1
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp11;

	/**
	 * SP2:2
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp22;

	/**
	 * SP3:3
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp33;

	/**
	 * SP平其它
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spDrawOther;

	/**
	 * SP0:1
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp01;

	/**
	 * SP0:2
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp02;

	/**
	 * SP1:2
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp12;

	/**
	 * SP0:3
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp03;

	/**
	 * SP1:3
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp13;

	/**
	 * SP2:3
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp23;

	/**
	 * SP0:4
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp04;

	/**
	 * SP1:4
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp14;

	/**
	 * SP2:4
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp24;

	/**
	 * SP0:5
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp05;

	/**
	 * SP1:5
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp15;

	/**
	 * SP2:5
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double sp25;

	/**
	 * 负其它
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFailOther;

	public Double getSp10() {
		return sp10;
	}

	public void setSp10(Double sp10) {
		this.sp10 = sp10;
	}

	public Double getSp20() {
		return sp20;
	}

	public void setSp20(Double sp20) {
		this.sp20 = sp20;
	}

	public Double getSp21() {
		return sp21;
	}

	public void setSp21(Double sp21) {
		this.sp21 = sp21;
	}

	public Double getSp30() {
		return sp30;
	}

	public void setSp30(Double sp30) {
		this.sp30 = sp30;
	}

	public Double getSp31() {
		return sp31;
	}

	public void setSp31(Double sp31) {
		this.sp31 = sp31;
	}

	public Double getSp32() {
		return sp32;
	}

	public void setSp32(Double sp32) {
		this.sp32 = sp32;
	}

	public Double getSp40() {
		return sp40;
	}

	public void setSp40(Double sp40) {
		this.sp40 = sp40;
	}

	public Double getSp41() {
		return sp41;
	}

	public void setSp41(Double sp41) {
		this.sp41 = sp41;
	}

	public Double getSp42() {
		return sp42;
	}

	public void setSp42(Double sp42) {
		this.sp42 = sp42;
	}

	public Double getSp50() {
		return sp50;
	}

	public void setSp50(Double sp50) {
		this.sp50 = sp50;
	}

	public Double getSp51() {
		return sp51;
	}

	public void setSp51(Double sp51) {
		this.sp51 = sp51;
	}

	public Double getSp52() {
		return sp52;
	}

	public void setSp52(Double sp52) {
		this.sp52 = sp52;
	}

	public Double getSpWinOther() {
		return spWinOther;
	}

	public void setSpWinOther(Double spWinOther) {
		this.spWinOther = spWinOther;
	}

	public Double getSp00() {
		return sp00;
	}

	public void setSp00(Double sp00) {
		this.sp00 = sp00;
	}

	public Double getSp11() {
		return sp11;
	}

	public void setSp11(Double sp11) {
		this.sp11 = sp11;
	}

	public Double getSp22() {
		return sp22;
	}

	public void setSp22(Double sp22) {
		this.sp22 = sp22;
	}

	public Double getSp33() {
		return sp33;
	}

	public void setSp33(Double sp33) {
		this.sp33 = sp33;
	}

	public Double getSpDrawOther() {
		return spDrawOther;
	}

	public void setSpDrawOther(Double spDrawOther) {
		this.spDrawOther = spDrawOther;
	}

	public Double getSp01() {
		return sp01;
	}

	public void setSp01(Double sp01) {
		this.sp01 = sp01;
	}

	public Double getSp02() {
		return sp02;
	}

	public void setSp02(Double sp02) {
		this.sp02 = sp02;
	}

	public Double getSp12() {
		return sp12;
	}

	public void setSp12(Double sp12) {
		this.sp12 = sp12;
	}

	public Double getSp03() {
		return sp03;
	}

	public void setSp03(Double sp03) {
		this.sp03 = sp03;
	}

	public Double getSp13() {
		return sp13;
	}

	public void setSp13(Double sp13) {
		this.sp13 = sp13;
	}

	public Double getSp23() {
		return sp23;
	}

	public void setSp23(Double sp23) {
		this.sp23 = sp23;
	}

	public Double getSp04() {
		return sp04;
	}

	public void setSp04(Double sp04) {
		this.sp04 = sp04;
	}

	public Double getSp14() {
		return sp14;
	}

	public void setSp14(Double sp14) {
		this.sp14 = sp14;
	}

	public Double getSp24() {
		return sp24;
	}

	public void setSp24(Double sp24) {
		this.sp24 = sp24;
	}

	public Double getSp05() {
		return sp05;
	}

	public void setSp05(Double sp05) {
		this.sp05 = sp05;
	}

	public Double getSp15() {
		return sp15;
	}

	public void setSp15(Double sp15) {
		this.sp15 = sp15;
	}

	public Double getSp25() {
		return sp25;
	}

	public void setSp25(Double sp25) {
		this.sp25 = sp25;
	}

	public Double getSpFailOther() {
		return spFailOther;
	}

	public void setSpFailOther(Double spFailOther) {
		this.spFailOther = spFailOther;
	}

}
