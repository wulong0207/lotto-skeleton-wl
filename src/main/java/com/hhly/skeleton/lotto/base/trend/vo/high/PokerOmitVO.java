package com.hhly.skeleton.lotto.base.trend.vo.high;

@SuppressWarnings("serial")
public class PokerOmitVO extends HighLotteryVO {
	/**
     * A的遗漏
     */
    private boolean pa;

    /**
     * 2的遗漏
     */
    private boolean p2;
    /**
     * 3的遗漏
     */
    private boolean p3;
    /**
     * 4的遗漏
     */
    private boolean p4;
    /**
     * 5的遗漏
     */
    private boolean p5;
    /**
     * 6的遗漏
     */
    private boolean p6;
    /**
     * 7的遗漏
     */
    private boolean p7;
    /**
     * 8的遗漏
     */
    private boolean p8;
    /**
     * 9的遗漏
     */
    private boolean p9;
    /**
     * 10的遗漏
     */
    private boolean p10;
    /**
     * J的遗漏
     */
    private boolean pj;
    /**
     * Q的遗漏
     */
    private boolean pq;
    /**
     * K的遗漏
     */
    private boolean pk;
    /**
     * 同花的遗漏
     */
    private boolean pt;
    /**
     * 同花黑桃的遗漏
     */
    private boolean pt1;
    /**
     * 同花红心的遗漏
     */
    private boolean pt2;
    /**
     * 同花梅花的遗漏
     */
    private boolean pt3;
    /**
     * 同花方块的遗漏
     */
    private boolean pt4;
    /**
     * 顺子的遗漏
     */
    private boolean px;
    /**
     * 顺子A23的遗漏
     */
    private boolean pxa23;
    /**
     * 顺子234的遗漏
     */
    private boolean px234;
    /**
     * 顺子345的遗漏
     */
    private boolean px345;
    /**
     * 顺子456的遗漏
     */
    private boolean px456;
    /**
     * 顺子567的遗漏
     */
    private boolean px567;
    /**
     * 顺子678的遗漏
     */
    private boolean px678;
    /**
     * 顺子789的遗漏
     */
    private boolean px789;
    /**
     * 顺子8910的遗漏
     */
    private boolean px8910;
    /**
     * 顺子910j的遗漏
     */
    private boolean px910j;
    /**
     * 顺子10JQ的遗漏
     */
    private boolean px10jq;
    /**
     * 顺子JQK的遗漏
     */
    private boolean pxjqk;
    /**
     * 顺子QKA的遗漏
     */
    private boolean pxqka;
    /**
     * 对子的遗漏
     */
    private boolean pd;
    /**
     * 对子A的遗漏
     */
    private boolean pda;
    /**
     * 对子2的遗漏
     */
    private boolean pd2;
    /**
     * 对子3的遗漏
     */
    private boolean pd3;
    /**
     * 对子4的遗漏
     */
    private boolean pd4;
    /**
     * 对子5的遗漏
     */
    private boolean pd5;
    /**
     * 对子6的遗漏
     */
    private boolean pd6;
    /**
     * 对子7的遗漏
     */
    private boolean pd7;
    /**
     * 对子8的遗漏
     */
    private boolean pd8;
    /**
     * 对子9的遗漏
     */
    private boolean pd9;
    /**
     * 对子10的遗漏
     */
    private boolean pd10;
    /**
     * 对子J的遗漏
     */
    private boolean pdj;
    /**
     * 对子Q的遗漏
     */
    private boolean pdq;
    /**
     * 对子K的遗漏
     */
    private boolean pdk;
    /**
     * 豹子的遗漏
     */
    private boolean pb;
    /**
     * 豹子A的遗漏
     */
    private boolean pba;
    /**
     * 豹子2的遗漏
     */
    private boolean pb2;
    /**
     * 豹子3的遗漏
     */
    private boolean pb3;
    /**
     * 豹子4的遗漏
     */
    private boolean pb4;
    /**
     * 豹子5的遗漏
     */
    private boolean pb5;
    /**
     * 豹子6的遗漏
     */
    private boolean pb6;
    /**
     * 豹子7的遗漏
     */
    private boolean pb7;
    /**
     * 豹子8的遗漏
     */
    private boolean pb8;
    /**
     * 豹子9的遗漏
     */
    private boolean pb9;
    /**
     * 豹子10的遗漏
     */
    private boolean pb10;
    /**
     * 豹子J的遗漏
     */
    private boolean pbj;
    /**
     * 豹子Q的遗漏
     */
    private boolean pbq;
    /**
     * 豹子K的遗漏
     */
    private boolean pbk;
    
    private boolean type;


	public void showRn(boolean show) {
		setPa(show);
		setP2(show);
		setP3(show);
		setP4(show);
		setP5(show);
		setP6(show);
		setP7(show);
		setP8(show);
		setP9(show);
		setP10(show);
		setPj(show);
		setPq(show);
		setPk(show);
	}

	public void showTh(boolean show) {
		setPt(show);
		setPt1(show);
		setPt2(show);
		setPt3(show);
		setPt4(show);
	}

	public void showSz(boolean show) {
		setPx(show);
	    setPxa23(show);
	    setPx234(show);
	    setPx345(show);
	    setPx456(show);
	    setPx567(show);
	    setPx678(show);
	    setPx789(show);
	    setPx8910(show);
	    setPx910j(show);
	    setPx10jq(show);
	    setPxjqk(show);
	    setPxqka(show);
	}

	public void showDz(boolean show) {
	    setPd(show);
	    setPda(show);
	    setPd2(show);
	    setPd3(show);
	    setPd4(show);
	    setPd5(show);
	    setPd6(show);
	    setPd7(show);
	    setPd8(show);
	    setPd9(show);
	    setPd10(show);
	    setPdj(show);
	    setPdq(show);
	    setPdk(show);
	}

	public void showBz(boolean show) {
	    setPb(show);
	    setPba(show);
	    setPb2(show);
	    setPb3(show);
	    setPb4(show);
	    setPb5(show);
	    setPb6(show);
	    setPb7(show);
	    setPb8(show);
	    setPb9(show);
	    setPb10(show);
	    setPbj(show);
	    setPbq(show);
	    setPbk(show);
	}
    
	public boolean isPa() {
		return pa;
	}

	public void setPa(boolean pa) {
		this.pa = pa;
	}

	public boolean isP2() {
		return p2;
	}

	public void setP2(boolean p2) {
		this.p2 = p2;
	}

	public boolean isP3() {
		return p3;
	}

	public void setP3(boolean p3) {
		this.p3 = p3;
	}

	public boolean isP4() {
		return p4;
	}

	public void setP4(boolean p4) {
		this.p4 = p4;
	}

	public boolean isP5() {
		return p5;
	}

	public void setP5(boolean p5) {
		this.p5 = p5;
	}

	public boolean isP6() {
		return p6;
	}

	public void setP6(boolean p6) {
		this.p6 = p6;
	}

	public boolean isP7() {
		return p7;
	}

	public void setP7(boolean p7) {
		this.p7 = p7;
	}

	public boolean isP8() {
		return p8;
	}

	public void setP8(boolean p8) {
		this.p8 = p8;
	}

	public boolean isP9() {
		return p9;
	}

	public void setP9(boolean p9) {
		this.p9 = p9;
	}

	public boolean isP10() {
		return p10;
	}

	public void setP10(boolean p10) {
		this.p10 = p10;
	}

	public boolean isPj() {
		return pj;
	}

	public void setPj(boolean pj) {
		this.pj = pj;
	}

	public boolean isPq() {
		return pq;
	}

	public void setPq(boolean pq) {
		this.pq = pq;
	}

	public boolean isPk() {
		return pk;
	}

	public void setPk(boolean pk) {
		this.pk = pk;
	}

	public boolean isPt() {
		return pt;
	}

	public void setPt(boolean pt) {
		this.pt = pt;
	}

	public boolean isPt1() {
		return pt1;
	}

	public void setPt1(boolean pt1) {
		this.pt1 = pt1;
	}

	public boolean isPt2() {
		return pt2;
	}

	public void setPt2(boolean pt2) {
		this.pt2 = pt2;
	}

	public boolean isPt3() {
		return pt3;
	}

	public void setPt3(boolean pt3) {
		this.pt3 = pt3;
	}

	public boolean isPt4() {
		return pt4;
	}

	public void setPt4(boolean pt4) {
		this.pt4 = pt4;
	}

	public boolean isPx() {
		return px;
	}

	public void setPx(boolean px) {
		this.px = px;
	}

	public boolean isPxa23() {
		return pxa23;
	}

	public void setPxa23(boolean pxa23) {
		this.pxa23 = pxa23;
	}

	public boolean isPx234() {
		return px234;
	}

	public void setPx234(boolean px234) {
		this.px234 = px234;
	}

	public boolean isPx345() {
		return px345;
	}

	public void setPx345(boolean px345) {
		this.px345 = px345;
	}

	public boolean isPx456() {
		return px456;
	}

	public void setPx456(boolean px456) {
		this.px456 = px456;
	}

	public boolean isPx567() {
		return px567;
	}

	public void setPx567(boolean px567) {
		this.px567 = px567;
	}

	public boolean isPx678() {
		return px678;
	}

	public void setPx678(boolean px678) {
		this.px678 = px678;
	}

	public boolean isPx789() {
		return px789;
	}

	public void setPx789(boolean px789) {
		this.px789 = px789;
	}

	public boolean isPx8910() {
		return px8910;
	}

	public void setPx8910(boolean px8910) {
		this.px8910 = px8910;
	}

	public boolean isPx10jq() {
		return px10jq;
	}

	public void setPx10jq(boolean px10jq) {
		this.px10jq = px10jq;
	}

	public boolean isPxjqk() {
		return pxjqk;
	}

	public void setPxjqk(boolean pxjqk) {
		this.pxjqk = pxjqk;
	}

	public boolean isPxqka() {
		return pxqka;
	}

	public void setPxqka(boolean pxqka) {
		this.pxqka = pxqka;
	}

	public boolean isPd() {
		return pd;
	}

	public void setPd(boolean pd) {
		this.pd = pd;
	}

	public boolean isPda() {
		return pda;
	}

	public void setPda(boolean pda) {
		this.pda = pda;
	}

	public boolean isPd2() {
		return pd2;
	}

	public void setPd2(boolean pd2) {
		this.pd2 = pd2;
	}

	public boolean isPd3() {
		return pd3;
	}

	public void setPd3(boolean pd3) {
		this.pd3 = pd3;
	}

	public boolean isPd4() {
		return pd4;
	}

	public void setPd4(boolean pd4) {
		this.pd4 = pd4;
	}

	public boolean isPd5() {
		return pd5;
	}

	public void setPd5(boolean pd5) {
		this.pd5 = pd5;
	}

	public boolean isPd6() {
		return pd6;
	}

	public void setPd6(boolean pd6) {
		this.pd6 = pd6;
	}

	public boolean isPd7() {
		return pd7;
	}

	public void setPd7(boolean pd7) {
		this.pd7 = pd7;
	}

	public boolean isPd8() {
		return pd8;
	}

	public void setPd8(boolean pd8) {
		this.pd8 = pd8;
	}

	public boolean isPd9() {
		return pd9;
	}

	public void setPd9(boolean pd9) {
		this.pd9 = pd9;
	}

	public boolean isPd10() {
		return pd10;
	}

	public void setPd10(boolean pd10) {
		this.pd10 = pd10;
	}

	public boolean isPdj() {
		return pdj;
	}

	public void setPdj(boolean pdj) {
		this.pdj = pdj;
	}

	public boolean isPdq() {
		return pdq;
	}

	public void setPdq(boolean pdq) {
		this.pdq = pdq;
	}

	public boolean isPdk() {
		return pdk;
	}

	public void setPdk(boolean pdk) {
		this.pdk = pdk;
	}

	public boolean isPb() {
		return pb;
	}

	public void setPb(boolean pb) {
		this.pb = pb;
	}

	public boolean isPba() {
		return pba;
	}

	public void setPba(boolean pba) {
		this.pba = pba;
	}

	public boolean isPb2() {
		return pb2;
	}

	public void setPb2(boolean pb2) {
		this.pb2 = pb2;
	}

	public boolean isPb3() {
		return pb3;
	}

	public void setPb3(boolean pb3) {
		this.pb3 = pb3;
	}

	public boolean isPb4() {
		return pb4;
	}

	public void setPb4(boolean pb4) {
		this.pb4 = pb4;
	}

	public boolean isPb5() {
		return pb5;
	}

	public void setPb5(boolean pb5) {
		this.pb5 = pb5;
	}

	public boolean isPb6() {
		return pb6;
	}

	public void setPb6(boolean pb6) {
		this.pb6 = pb6;
	}

	public boolean isPb7() {
		return pb7;
	}

	public void setPb7(boolean pb7) {
		this.pb7 = pb7;
	}

	public boolean isPb8() {
		return pb8;
	}

	public void setPb8(boolean pb8) {
		this.pb8 = pb8;
	}

	public boolean isPb9() {
		return pb9;
	}

	public void setPb9(boolean pb9) {
		this.pb9 = pb9;
	}

	public boolean isPb10() {
		return pb10;
	}

	public void setPb10(boolean pb10) {
		this.pb10 = pb10;
	}

	public boolean isPbj() {
		return pbj;
	}

	public void setPbj(boolean pbj) {
		this.pbj = pbj;
	}

	public boolean isPbq() {
		return pbq;
	}

	public void setPbq(boolean pbq) {
		this.pbq = pbq;
	}

	public boolean isPbk() {
		return pbk;
	}

	public void setPbk(boolean pbk) {
		this.pbk = pbk;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public boolean isPx910j() {
		return px910j;
	}

	public void setPx910j(boolean px910j) {
		this.px910j = px910j;
	}
	
}
