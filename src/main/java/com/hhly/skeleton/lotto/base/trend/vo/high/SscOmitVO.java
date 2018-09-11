package com.hhly.skeleton.lotto.base.trend.vo.high;

@SuppressWarnings("serial")

public class SscOmitVO extends HighLotteryVO {
	
    private boolean flag;
    
    private boolean b0;

    private boolean b1;

    private boolean b2;

    private boolean b3;

    private boolean b4;

    private boolean b5;

    private boolean b6;

    private boolean b7;

    private boolean b8;

    private boolean b9;

    private boolean wb0;
    
    private boolean wb1;

    private boolean wb2;

    private boolean wb3;

    private boolean wb4;

    private boolean wb5;

    private boolean wb6;

    private boolean wb7;

    private boolean wb8;

    private boolean wb9;

    private boolean wbig;

    private boolean wsmall;

    private boolean wodd;

    private boolean weven;
    
    private boolean qb0;

    private boolean qb1;

    private boolean qb2;

    private boolean qb3;

    private boolean qb4;

    private boolean qb5;

    private boolean qb6;

    private boolean qb7;

    private boolean qb8;

    private boolean qb9;

    private boolean qbig;

    private boolean qsmall;

    private boolean qodd;

    private boolean qeven;
    
    private boolean bb0;

    private boolean bb1;

    private boolean bb2;

    private boolean bb3;

    private boolean bb4;

    private boolean bb5;

    private boolean bb6;

    private boolean bb7;

    private boolean bb8;

    private boolean bb9;

    private boolean bbig;

    private boolean bsmall;

    private boolean bodd;

    private boolean beven;
    
    private boolean sb0;

    private boolean sb1;

    private boolean sb2;

    private boolean sb3;

    private boolean sb4;

    private boolean sb5;

    private boolean sb6;

    private boolean sb7;

    private boolean sb8;

    private boolean sb9;

    private boolean sbig;

    private boolean ssmall;

    private boolean sodd;

    private boolean seven;
    
    private boolean gb0;

    private boolean gb1;

    private boolean gb2;

    private boolean gb3;

    private boolean gb4;

    private boolean gb5;

    private boolean gb6;

    private boolean gb7;

    private boolean gb8;

    private boolean gb9;

    private boolean gbig;

    private boolean gsmall;

    private boolean godd;

    private boolean geven;

    private boolean q3z3;

    private boolean q3z6;

    private boolean q3bz;

    private boolean h3z3;

    private boolean h3z6;

    private boolean h3bz;

    private boolean span;

    private boolean s0;

    private boolean s1;

    private boolean s2;

    private boolean s3;

    private boolean s4;

    private boolean s5;

    private boolean s6;

    private boolean s7;

    private boolean s8;

    private boolean s9;

    private boolean s10;

    private boolean s11;

    private boolean s12;

    private boolean s13;

    private boolean s14;

    private boolean s15;

    private boolean s16;

    private boolean s17;
	private boolean s18;
	private boolean zxs0;
	private boolean zxs1;
	private boolean zxs2;
	private boolean zxs3;
	private boolean zxs4;
	private boolean zxs5;
	private boolean zxs6;
	private boolean zxs7;
	private boolean zxs8;
	private boolean zxs9;
	private boolean zxs10;
	private boolean zxs11;
	private boolean zxs12;
	private boolean zxs13;
	private boolean zxs14;
	private boolean zxs15;
	private boolean zxs16;
	private boolean zxs17;
	private boolean zxs18;
	private boolean zxs19;
	private boolean zxs20;
	private boolean zxs21;
	private boolean zxs22;
	private boolean zxs23;
	private boolean zxs24;
	private boolean zxs25;
	private boolean zxs26;
	private boolean zxs27;
	// 二星组选
	private boolean groupTwo0;
	private boolean groupTwo1;
	private boolean groupTwo2;
	private boolean groupTwo3;
	private boolean groupTwo4;
	private boolean groupTwo5;
	private boolean groupTwo6;
	private boolean groupTwo7;
	private boolean groupTwo8;
	private boolean groupTwo9;
	
	// 三星组三、三星组六遗漏
	private boolean groupThree0;
	private boolean groupThree1;
	private boolean groupThree2;
	private boolean groupThree3;
	private boolean groupThree4;
	private boolean groupThree5;
	private boolean groupThree6;
	private boolean groupThree7;
	private boolean groupThree8;
	private boolean groupThree9;

	public void showAll(boolean show) {
		//showNum(show);
		showWqbsg(show);
		showWdxds(show);
		showQdxds(show);
		showBdxds(show);
		showSdxds(show);
		showGdxds(show);
		showSum2(show);
		showSum3(show);
		showQ3(show);
		showH3(show);
		showG2(show);
		showG3(show);
	}

	public void showG2(boolean show) {
		setGroupTwo0(show);
		setGroupTwo1(show);
		setGroupTwo2(show);
		setGroupTwo3(show);
		setGroupTwo4(show);
		setGroupTwo5(show);
		setGroupTwo6(show);
		setGroupTwo7(show);
		setGroupTwo8(show);
		setGroupTwo9(show);
	}
	
	public void showG3(boolean show) {
		setGroupThree0(show);
		setGroupThree1(show);
		setGroupThree2(show);
		setGroupThree3(show);
		setGroupThree4(show);
		setGroupThree5(show);
		setGroupThree6(show);
		setGroupThree7(show);
		setGroupThree8(show);
		setGroupThree9(show);
	}
	
	public void showNum(boolean show) {
		setB0(show);
		setB1(show);
		setB2(show);
		setB3(show);
		setB4(show);
		setB5(show);
		setB6(show);
		setB7(show);
		setB8(show);
		setB9(show);
	}
	
	public void showW(boolean show) {
		setWb0(show);
		setWb1(show);
		setWb2(show);
		setWb3(show);
		setWb4(show);
		setWb5(show);
		setWb6(show);
		setWb7(show);
		setWb8(show);
		setWb9(show);
	}
	public void showWdxds(boolean show) {
		setWbig(show);
		setWsmall(show);
		setWodd(show);
		setWeven(show);
	}
	public void showQ(boolean show) {
		setQb0(show);
		setQb1(show);
		setQb2(show);
		setQb3(show);
		setQb4(show);
		setQb5(show);
		setQb6(show);
		setQb7(show);
		setQb8(show);
		setQb9(show);
	}
	public void showQdxds(boolean show) {
		setQbig(show);
		setQsmall(show);
		setQodd(show);
		setQeven(show);
	}
	public void showB(boolean show) {
		setBb0(show);
		setBb1(show);
		setBb2(show);
		setBb3(show);
		setBb4(show);
		setBb5(show);
		setBb6(show);
		setBb7(show);
		setBb8(show);
		setBb9(show);
	}
	public void showBdxds(boolean show) {
		setBbig(show);
		setBsmall(show);
		setBodd(show);
		setBeven(show);
	}
	public void showS(boolean show) {
		setSb0(show);
		setSb1(show);
		setSb2(show);
		setSb3(show);
		setSb4(show);
		setSb5(show);
		setSb6(show);
		setSb7(show);
		setSb8(show);
		setSb9(show);
	}
	public void showSdxds(boolean show) {
		setSbig(show);
		setSsmall(show);
		setSodd(show);
		setSeven(show);
	}
	public void showG(boolean show) {
		setGb0(show);
		setGb1(show);
		setGb2(show);
		setGb3(show);
		setGb4(show);
		setGb5(show);
		setGb6(show);
		setGb7(show);
		setGb8(show);
		setGb9(show);
	}
	public void showGdxds(boolean show) {
		setGbig(show);
		setGsmall(show);
		setGodd(show);
		setGeven(show);
	}
	public void showQ3(boolean show) {
		setQ3z3(show);
		setQ3z6(show);
		setQ3bz(show);
	}
	public void showH3(boolean show) {
		setH3z3(show);
		setH3z6(show);
		setH3bz(show);
	}

	/**
	 * @desc   显示二星和值
	 * @author Tony Wang
	 * @create 2017年7月28日
	 * @param show 
	 */
	public void showSum2(boolean show) {
		setS0(show);
		setS1(show);
		setS2(show);
		setS3(show);
		setS4(show);
		setS5(show);
		setS6(show);
		setS7(show);
		setS8(show);
		setS9(show);
		setS10(show);
		setS11(show);
		setS12(show);
		setS13(show);
		setS14(show);
		setS15(show);
		setS16(show);
		setS17(show);
		setS18(show);
	}

	/**
	 * @desc   显示三星和值
	 * @author Tony Wang
	 * @create 2017年7月28日
	 * @param show 
	 */
	public void showSum3(boolean show) {
		setZxs0(show);
		setZxs1(show);
		setZxs2(show);
		setZxs3(show);
		setZxs4(show);
		setZxs5(show);
		setZxs6(show);
		setZxs7(show);
		setZxs8(show);
		setZxs9(show);
		setZxs10(show);
		setZxs11(show);
		setZxs12(show);
		setZxs13(show);
		setZxs14(show);
		setZxs15(show);
		setZxs16(show);
		setZxs17(show);
		setZxs18(show);
		setZxs19(show);
		setZxs20(show);
		setZxs21(show);
		setZxs22(show);
		setZxs23(show);
		setZxs24(show);
		setZxs25(show);
		setZxs26(show);
		setZxs27(show);
	}
	
	public void showWqbsg(boolean show) {
		showW(show);
		showQ(show);
		showB(show);
		showS(show);
		showG(show);
	}

	public void showBsg(boolean show) {
		showB(show);
		showS(show);
		showG(show);
	}

	public boolean isZxs0() {
		return zxs0;
	}

	public void setZxs0(boolean zxs0) {
		this.zxs0 = zxs0;
	}

	public boolean isZxs1() {
		return zxs1;
	}

	public void setZxs1(boolean zxs1) {
		this.zxs1 = zxs1;
	}

	public boolean isZxs2() {
		return zxs2;
	}

	public void setZxs2(boolean zxs2) {
		this.zxs2 = zxs2;
	}

	public boolean isZxs3() {
		return zxs3;
	}

	public void setZxs3(boolean zxs3) {
		this.zxs3 = zxs3;
	}

	public boolean isZxs4() {
		return zxs4;
	}

	public void setZxs4(boolean zxs4) {
		this.zxs4 = zxs4;
	}

	public boolean isZxs5() {
		return zxs5;
	}

	public void setZxs5(boolean zxs5) {
		this.zxs5 = zxs5;
	}

	public boolean isZxs6() {
		return zxs6;
	}

	public void setZxs6(boolean zxs6) {
		this.zxs6 = zxs6;
	}

	public boolean isZxs7() {
		return zxs7;
	}

	public void setZxs7(boolean zxs7) {
		this.zxs7 = zxs7;
	}

	public boolean isZxs8() {
		return zxs8;
	}

	public void setZxs8(boolean zxs8) {
		this.zxs8 = zxs8;
	}

	public boolean isZxs9() {
		return zxs9;
	}

	public void setZxs9(boolean zxs9) {
		this.zxs9 = zxs9;
	}

	public boolean isZxs10() {
		return zxs10;
	}

	public void setZxs10(boolean zxs10) {
		this.zxs10 = zxs10;
	}

	public boolean isZxs11() {
		return zxs11;
	}

	public void setZxs11(boolean zxs11) {
		this.zxs11 = zxs11;
	}

	public boolean isZxs12() {
		return zxs12;
	}

	public void setZxs12(boolean zxs12) {
		this.zxs12 = zxs12;
	}

	public boolean isZxs13() {
		return zxs13;
	}

	public void setZxs13(boolean zxs13) {
		this.zxs13 = zxs13;
	}

	public boolean isZxs14() {
		return zxs14;
	}

	public void setZxs14(boolean zxs14) {
		this.zxs14 = zxs14;
	}

	public boolean isZxs15() {
		return zxs15;
	}

	public void setZxs15(boolean zxs15) {
		this.zxs15 = zxs15;
	}

	public boolean isZxs16() {
		return zxs16;
	}

	public void setZxs16(boolean zxs16) {
		this.zxs16 = zxs16;
	}

	public boolean isZxs17() {
		return zxs17;
	}

	public void setZxs17(boolean zxs17) {
		this.zxs17 = zxs17;
	}

	public boolean isZxs18() {
		return zxs18;
	}

	public void setZxs18(boolean zxs18) {
		this.zxs18 = zxs18;
	}

	public boolean isZxs19() {
		return zxs19;
	}

	public void setZxs19(boolean zxs19) {
		this.zxs19 = zxs19;
	}

	public boolean isZxs20() {
		return zxs20;
	}

	public void setZxs20(boolean zxs20) {
		this.zxs20 = zxs20;
	}

	public boolean isZxs21() {
		return zxs21;
	}

	public void setZxs21(boolean zxs21) {
		this.zxs21 = zxs21;
	}

	public boolean isZxs22() {
		return zxs22;
	}

	public void setZxs22(boolean zxs22) {
		this.zxs22 = zxs22;
	}

	public boolean isZxs23() {
		return zxs23;
	}

	public void setZxs23(boolean zxs23) {
		this.zxs23 = zxs23;
	}

	public boolean isZxs24() {
		return zxs24;
	}

	public void setZxs24(boolean zxs24) {
		this.zxs24 = zxs24;
	}

	public boolean isZxs25() {
		return zxs25;
	}

	public void setZxs25(boolean zxs25) {
		this.zxs25 = zxs25;
	}

	public boolean isZxs26() {
		return zxs26;
	}

	public void setZxs26(boolean zxs26) {
		this.zxs26 = zxs26;
	}

	public boolean isZxs27() {
		return zxs27;
	}

	public void setZxs27(boolean zxs27) {
		this.zxs27 = zxs27;
	}
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public boolean isB1() {
		return b1;
	}

	public void setB1(boolean b1) {
		this.b1 = b1;
	}

	public boolean isB2() {
		return b2;
	}

	public void setB2(boolean b2) {
		this.b2 = b2;
	}

	public boolean isB3() {
		return b3;
	}

	public void setB3(boolean b3) {
		this.b3 = b3;
	}

	public boolean isB4() {
		return b4;
	}

	public void setB4(boolean b4) {
		this.b4 = b4;
	}

	public boolean isB5() {
		return b5;
	}

	public void setB5(boolean b5) {
		this.b5 = b5;
	}

	public boolean isB6() {
		return b6;
	}

	public void setB6(boolean b6) {
		this.b6 = b6;
	}

	public boolean isB7() {
		return b7;
	}

	public void setB7(boolean b7) {
		this.b7 = b7;
	}

	public boolean isB8() {
		return b8;
	}

	public void setB8(boolean b8) {
		this.b8 = b8;
	}

	public boolean isB9() {
		return b9;
	}

	public void setB9(boolean b9) {
		this.b9 = b9;
	}

	public boolean isWb1() {
		return wb1;
	}

	public void setWb1(boolean wb1) {
		this.wb1 = wb1;
	}

	public boolean isWb2() {
		return wb2;
	}

	public void setWb2(boolean wb2) {
		this.wb2 = wb2;
	}

	public boolean isWb3() {
		return wb3;
	}

	public void setWb3(boolean wb3) {
		this.wb3 = wb3;
	}

	public boolean isWb4() {
		return wb4;
	}

	public void setWb4(boolean wb4) {
		this.wb4 = wb4;
	}

	public boolean isWb5() {
		return wb5;
	}

	public void setWb5(boolean wb5) {
		this.wb5 = wb5;
	}

	public boolean isWb6() {
		return wb6;
	}

	public void setWb6(boolean wb6) {
		this.wb6 = wb6;
	}

	public boolean isWb7() {
		return wb7;
	}

	public void setWb7(boolean wb7) {
		this.wb7 = wb7;
	}

	public boolean isWb8() {
		return wb8;
	}

	public void setWb8(boolean wb8) {
		this.wb8 = wb8;
	}

	public boolean isWb9() {
		return wb9;
	}

	public void setWb9(boolean wb9) {
		this.wb9 = wb9;
	}

	public boolean isWbig() {
		return wbig;
	}

	public void setWbig(boolean wbig) {
		this.wbig = wbig;
	}

	public boolean isWsmall() {
		return wsmall;
	}

	public void setWsmall(boolean wsmall) {
		this.wsmall = wsmall;
	}

	public boolean isWodd() {
		return wodd;
	}

	public void setWodd(boolean wodd) {
		this.wodd = wodd;
	}

	public boolean isWeven() {
		return weven;
	}

	public void setWeven(boolean weven) {
		this.weven = weven;
	}

	public boolean isQb1() {
		return qb1;
	}

	public void setQb1(boolean qb1) {
		this.qb1 = qb1;
	}

	public boolean isQb2() {
		return qb2;
	}

	public void setQb2(boolean qb2) {
		this.qb2 = qb2;
	}

	public boolean isQb3() {
		return qb3;
	}

	public void setQb3(boolean qb3) {
		this.qb3 = qb3;
	}

	public boolean isQb4() {
		return qb4;
	}

	public void setQb4(boolean qb4) {
		this.qb4 = qb4;
	}

	public boolean isQb5() {
		return qb5;
	}

	public void setQb5(boolean qb5) {
		this.qb5 = qb5;
	}

	public boolean isQb6() {
		return qb6;
	}

	public void setQb6(boolean qb6) {
		this.qb6 = qb6;
	}

	public boolean isQb7() {
		return qb7;
	}

	public void setQb7(boolean qb7) {
		this.qb7 = qb7;
	}

	public boolean isQb8() {
		return qb8;
	}

	public void setQb8(boolean qb8) {
		this.qb8 = qb8;
	}

	public boolean isQb9() {
		return qb9;
	}

	public void setQb9(boolean qb9) {
		this.qb9 = qb9;
	}

	public boolean isQbig() {
		return qbig;
	}

	public void setQbig(boolean qbig) {
		this.qbig = qbig;
	}

	public boolean isQsmall() {
		return qsmall;
	}

	public void setQsmall(boolean qsmall) {
		this.qsmall = qsmall;
	}

	public boolean isQodd() {
		return qodd;
	}

	public void setQodd(boolean qodd) {
		this.qodd = qodd;
	}

	public boolean isQeven() {
		return qeven;
	}

	public void setQeven(boolean qeven) {
		this.qeven = qeven;
	}

	public boolean isBb1() {
		return bb1;
	}

	public void setBb1(boolean bb1) {
		this.bb1 = bb1;
	}

	public boolean isBb2() {
		return bb2;
	}

	public void setBb2(boolean bb2) {
		this.bb2 = bb2;
	}

	public boolean isBb3() {
		return bb3;
	}

	public void setBb3(boolean bb3) {
		this.bb3 = bb3;
	}

	public boolean isBb4() {
		return bb4;
	}

	public void setBb4(boolean bb4) {
		this.bb4 = bb4;
	}

	public boolean isBb5() {
		return bb5;
	}

	public void setBb5(boolean bb5) {
		this.bb5 = bb5;
	}

	public boolean isBb6() {
		return bb6;
	}

	public void setBb6(boolean bb6) {
		this.bb6 = bb6;
	}

	public boolean isBb7() {
		return bb7;
	}

	public void setBb7(boolean bb7) {
		this.bb7 = bb7;
	}

	public boolean isBb8() {
		return bb8;
	}

	public void setBb8(boolean bb8) {
		this.bb8 = bb8;
	}

	public boolean isBb9() {
		return bb9;
	}

	public void setBb9(boolean bb9) {
		this.bb9 = bb9;
	}

	public boolean isBbig() {
		return bbig;
	}

	public void setBbig(boolean bbig) {
		this.bbig = bbig;
	}

	public boolean isBsmall() {
		return bsmall;
	}

	public void setBsmall(boolean bsmall) {
		this.bsmall = bsmall;
	}

	public boolean isBodd() {
		return bodd;
	}

	public void setBodd(boolean bodd) {
		this.bodd = bodd;
	}

	public boolean isBeven() {
		return beven;
	}

	public void setBeven(boolean beven) {
		this.beven = beven;
	}

	public boolean isSb1() {
		return sb1;
	}

	public void setSb1(boolean sb1) {
		this.sb1 = sb1;
	}

	public boolean isSb2() {
		return sb2;
	}

	public void setSb2(boolean sb2) {
		this.sb2 = sb2;
	}

	public boolean isSb3() {
		return sb3;
	}

	public void setSb3(boolean sb3) {
		this.sb3 = sb3;
	}

	public boolean isSb4() {
		return sb4;
	}

	public void setSb4(boolean sb4) {
		this.sb4 = sb4;
	}

	public boolean isSb5() {
		return sb5;
	}

	public void setSb5(boolean sb5) {
		this.sb5 = sb5;
	}

	public boolean isSb6() {
		return sb6;
	}

	public void setSb6(boolean sb6) {
		this.sb6 = sb6;
	}

	public boolean isSb7() {
		return sb7;
	}

	public void setSb7(boolean sb7) {
		this.sb7 = sb7;
	}

	public boolean isSb8() {
		return sb8;
	}

	public void setSb8(boolean sb8) {
		this.sb8 = sb8;
	}

	public boolean isSb9() {
		return sb9;
	}

	public void setSb9(boolean sb9) {
		this.sb9 = sb9;
	}

	public boolean isSbig() {
		return sbig;
	}

	public void setSbig(boolean sbig) {
		this.sbig = sbig;
	}

	public boolean isSsmall() {
		return ssmall;
	}

	public void setSsmall(boolean ssmall) {
		this.ssmall = ssmall;
	}

	public boolean isSodd() {
		return sodd;
	}

	public void setSodd(boolean sodd) {
		this.sodd = sodd;
	}

	public boolean isSeven() {
		return seven;
	}

	public void setSeven(boolean seven) {
		this.seven = seven;
	}

	public boolean isGb1() {
		return gb1;
	}

	public void setGb1(boolean gb1) {
		this.gb1 = gb1;
	}

	public boolean isGb2() {
		return gb2;
	}

	public void setGb2(boolean gb2) {
		this.gb2 = gb2;
	}

	public boolean isGb3() {
		return gb3;
	}

	public void setGb3(boolean gb3) {
		this.gb3 = gb3;
	}

	public boolean isGb4() {
		return gb4;
	}

	public void setGb4(boolean gb4) {
		this.gb4 = gb4;
	}

	public boolean isGb5() {
		return gb5;
	}

	public void setGb5(boolean gb5) {
		this.gb5 = gb5;
	}

	public boolean isGb6() {
		return gb6;
	}

	public void setGb6(boolean gb6) {
		this.gb6 = gb6;
	}

	public boolean isGb7() {
		return gb7;
	}

	public void setGb7(boolean gb7) {
		this.gb7 = gb7;
	}

	public boolean isGb8() {
		return gb8;
	}

	public void setGb8(boolean gb8) {
		this.gb8 = gb8;
	}

	public boolean isGb9() {
		return gb9;
	}

	public void setGb9(boolean gb9) {
		this.gb9 = gb9;
	}

	public boolean isGbig() {
		return gbig;
	}

	public void setGbig(boolean gbig) {
		this.gbig = gbig;
	}

	public boolean isGsmall() {
		return gsmall;
	}

	public void setGsmall(boolean gsmall) {
		this.gsmall = gsmall;
	}

	public boolean isGodd() {
		return godd;
	}

	public void setGodd(boolean godd) {
		this.godd = godd;
	}

	public boolean isGeven() {
		return geven;
	}

	public void setGeven(boolean geven) {
		this.geven = geven;
	}

	public boolean isQ3z3() {
		return q3z3;
	}

	public void setQ3z3(boolean q3z3) {
		this.q3z3 = q3z3;
	}

	public boolean isQ3z6() {
		return q3z6;
	}

	public void setQ3z6(boolean q3z6) {
		this.q3z6 = q3z6;
	}

	public boolean isQ3bz() {
		return q3bz;
	}

	public void setQ3bz(boolean q3bz) {
		this.q3bz = q3bz;
	}

	public boolean isH3z3() {
		return h3z3;
	}

	public void setH3z3(boolean h3z3) {
		this.h3z3 = h3z3;
	}

	public boolean isH3z6() {
		return h3z6;
	}

	public void setH3z6(boolean h3z6) {
		this.h3z6 = h3z6;
	}

	public boolean isH3bz() {
		return h3bz;
	}

	public void setH3bz(boolean h3bz) {
		this.h3bz = h3bz;
	}

	public boolean isSpan() {
		return span;
	}

	public void setSpan(boolean span) {
		this.span = span;
	}

	public boolean isS0() {
		return s0;
	}

	public void setS0(boolean s0) {
		this.s0 = s0;
	}

	public boolean isS1() {
		return s1;
	}

	public void setS1(boolean s1) {
		this.s1 = s1;
	}

	public boolean isS2() {
		return s2;
	}

	public void setS2(boolean s2) {
		this.s2 = s2;
	}

	public boolean isS3() {
		return s3;
	}

	public void setS3(boolean s3) {
		this.s3 = s3;
	}

	public boolean isS4() {
		return s4;
	}

	public void setS4(boolean s4) {
		this.s4 = s4;
	}

	public boolean isS5() {
		return s5;
	}

	public void setS5(boolean s5) {
		this.s5 = s5;
	}

	public boolean isS6() {
		return s6;
	}

	public void setS6(boolean s6) {
		this.s6 = s6;
	}

	public boolean isS7() {
		return s7;
	}

	public void setS7(boolean s7) {
		this.s7 = s7;
	}

	public boolean isS8() {
		return s8;
	}

	public void setS8(boolean s8) {
		this.s8 = s8;
	}

	public boolean isS9() {
		return s9;
	}

	public void setS9(boolean s9) {
		this.s9 = s9;
	}

	public boolean isS10() {
		return s10;
	}

	public void setS10(boolean s10) {
		this.s10 = s10;
	}

	public boolean isS11() {
		return s11;
	}

	public void setS11(boolean s11) {
		this.s11 = s11;
	}

	public boolean isS12() {
		return s12;
	}

	public void setS12(boolean s12) {
		this.s12 = s12;
	}

	public boolean isS13() {
		return s13;
	}

	public void setS13(boolean s13) {
		this.s13 = s13;
	}

	public boolean isS14() {
		return s14;
	}

	public void setS14(boolean s14) {
		this.s14 = s14;
	}

	public boolean isS15() {
		return s15;
	}

	public void setS15(boolean s15) {
		this.s15 = s15;
	}

	public boolean isS16() {
		return s16;
	}

	public void setS16(boolean s16) {
		this.s16 = s16;
	}

	public boolean isS17() {
		return s17;
	}

	public void setS17(boolean s17) {
		this.s17 = s17;
	}

	public boolean isS18() {
		return s18;
	}

	public void setS18(boolean s18) {
		this.s18 = s18;
	}

	public boolean isB0() {
		return b0;
	}

	public void setB0(boolean b0) {
		this.b0 = b0;
	}

	public boolean isWb0() {
		return wb0;
	}

	public void setWb0(boolean wb0) {
		this.wb0 = wb0;
	}

	public boolean isQb0() {
		return qb0;
	}

	public void setQb0(boolean qb0) {
		this.qb0 = qb0;
	}

	public boolean isBb0() {
		return bb0;
	}

	public void setBb0(boolean bb0) {
		this.bb0 = bb0;
	}

	public boolean isSb0() {
		return sb0;
	}

	public void setSb0(boolean sb0) {
		this.sb0 = sb0;
	}

	public boolean isGb0() {
		return gb0;
	}

	public void setGb0(boolean gb0) {
		this.gb0 = gb0;
	}

	public boolean isGroupTwo0() {
		return groupTwo0;
	}

	public void setGroupTwo0(boolean groupTwo0) {
		this.groupTwo0 = groupTwo0;
	}

	public boolean isGroupTwo1() {
		return groupTwo1;
	}

	public void setGroupTwo1(boolean groupTwo1) {
		this.groupTwo1 = groupTwo1;
	}

	public boolean isGroupTwo2() {
		return groupTwo2;
	}

	public void setGroupTwo2(boolean groupTwo2) {
		this.groupTwo2 = groupTwo2;
	}

	public boolean isGroupTwo3() {
		return groupTwo3;
	}

	public void setGroupTwo3(boolean groupTwo3) {
		this.groupTwo3 = groupTwo3;
	}

	public boolean isGroupTwo4() {
		return groupTwo4;
	}

	public void setGroupTwo4(boolean groupTwo4) {
		this.groupTwo4 = groupTwo4;
	}

	public boolean isGroupTwo5() {
		return groupTwo5;
	}

	public void setGroupTwo5(boolean groupTwo5) {
		this.groupTwo5 = groupTwo5;
	}

	public boolean isGroupTwo6() {
		return groupTwo6;
	}

	public void setGroupTwo6(boolean groupTwo6) {
		this.groupTwo6 = groupTwo6;
	}

	public boolean isGroupTwo7() {
		return groupTwo7;
	}

	public void setGroupTwo7(boolean groupTwo7) {
		this.groupTwo7 = groupTwo7;
	}

	public boolean isGroupTwo8() {
		return groupTwo8;
	}

	public void setGroupTwo8(boolean groupTwo8) {
		this.groupTwo8 = groupTwo8;
	}

	public boolean isGroupTwo9() {
		return groupTwo9;
	}

	public void setGroupTwo9(boolean groupTwo9) {
		this.groupTwo9 = groupTwo9;
	}

	public boolean isGroupThree0() {
		return groupThree0;
	}

	public void setGroupThree0(boolean groupThree0) {
		this.groupThree0 = groupThree0;
	}

	public boolean isGroupThree1() {
		return groupThree1;
	}

	public void setGroupThree1(boolean groupThree1) {
		this.groupThree1 = groupThree1;
	}

	public boolean isGroupThree2() {
		return groupThree2;
	}

	public void setGroupThree2(boolean groupThree2) {
		this.groupThree2 = groupThree2;
	}

	public boolean isGroupThree3() {
		return groupThree3;
	}

	public void setGroupThree3(boolean groupThree3) {
		this.groupThree3 = groupThree3;
	}

	public boolean isGroupThree4() {
		return groupThree4;
	}

	public void setGroupThree4(boolean groupThree4) {
		this.groupThree4 = groupThree4;
	}

	public boolean isGroupThree5() {
		return groupThree5;
	}

	public void setGroupThree5(boolean groupThree5) {
		this.groupThree5 = groupThree5;
	}

	public boolean isGroupThree6() {
		return groupThree6;
	}

	public void setGroupThree6(boolean groupThree6) {
		this.groupThree6 = groupThree6;
	}

	public boolean isGroupThree7() {
		return groupThree7;
	}

	public void setGroupThree7(boolean groupThree7) {
		this.groupThree7 = groupThree7;
	}

	public boolean isGroupThree8() {
		return groupThree8;
	}

	public void setGroupThree8(boolean groupThree8) {
		this.groupThree8 = groupThree8;
	}

	public boolean isGroupThree9() {
		return groupThree9;
	}

	public void setGroupThree9(boolean groupThree9) {
		this.groupThree9 = groupThree9;
	}
}
