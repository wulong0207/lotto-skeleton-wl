package com.hhly.skeleton.lotto.base.trend.high.bo;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

@SuppressWarnings("serial")
public class PokerTrendBaseBO extends TrendBaseBO{
	
	private String issue;
	private String drawCode;
	
	private Integer type; 
	/** 
     * A的遗漏
     */
    private Integer pa;

    /**
     * 2的遗漏
     */
    private Integer p2;
    /**
     * 3的遗漏
     */
    private Integer p3;
    /**
     * 4的遗漏
     */
    private Integer p4;
    /**
     * 5的遗漏
     */
    private Integer p5;
    /**
     * 6的遗漏
     */
    private Integer p6;
    /**
     * 7的遗漏
     */
    private Integer p7;
    /**
     * 8的遗漏
     */
    private Integer p8;
    /**
     * 9的遗漏
     */
    private Integer p9;
    /**
     * 10的遗漏
     */
    private Integer p10;
    /**
     * J的遗漏
     */
    private Integer pj;
    /**
     * Q的遗漏
     */
    private Integer pq;
    /**
     * K的遗漏
     */
    private Integer pk;
    /**
     * 同花的遗漏
     */
    private Integer pt;
    /**
     * 同花黑桃的遗漏
     */
    private Integer pt1;
    /**
     * 同花红心的遗漏
     */
    private Integer pt2;
    /**
     * 同花梅花的遗漏
     */
    private Integer pt3;
    /**
     * 同花方块的遗漏
     */
    private Integer pt4;
    /**
     * 顺子的遗漏
     */
    private Integer px;
    /**
     * 顺子A23的遗漏
     */
    private Integer pxa23;
    /**
     * 顺子234的遗漏
     */
    private Integer px234;
    /**
     * 顺子345的遗漏
     */
    private Integer px345;
    /**
     * 顺子456的遗漏
     */
    private Integer px456;
    /**
     * 顺子567的遗漏
     */
    private Integer px567;
    /**
     * 顺子678的遗漏
     */
    private Integer px678;
    /**
     * 顺子789的遗漏
     */
    private Integer px789;
    /**
     * 顺子8910的遗漏
     */
    private Integer px8910;
    /**
     * 顺子910j的遗漏
     */
    private Integer px910j;
    /**
     * 顺子10JQ的遗漏
     */
    private Integer px10jq;
    /**
     * 顺子JQK的遗漏
     */
    private Integer pxjqk;
    /**
     * 顺子QKA的遗漏
     */
    private Integer pxqka;
    /**
     * 对子的遗漏
     */
    private Integer pd;
    /**
     * 对子A的遗漏
     */
    private Integer pda;
    /**
     * 对子2的遗漏
     */
    private Integer pd2;
    /**
     * 对子3的遗漏
     */
    private Integer pd3;
    /**
     * 对子4的遗漏
     */
    private Integer pd4;
    /**
     * 对子5的遗漏
     */
    private Integer pd5;
    /**
     * 对子6的遗漏
     */
    private Integer pd6;
    /**
     * 对子7的遗漏
     */
    private Integer pd7;
    /**
     * 对子8的遗漏
     */
    private Integer pd8;
    /**
     * 对子9的遗漏
     */
    private Integer pd9;
    /**
     * 对子10的遗漏
     */
    private Integer pd10;
    /**
     * 对子J的遗漏
     */
    private Integer pdj;
    /**
     * 对子Q的遗漏
     */
    private Integer pdq;
    /**
     * 对子K的遗漏
     */
    private Integer pdk;
    /**
     * 豹子的遗漏
     */
    private Integer pb;
    /**
     * 豹子A的遗漏
     */
    private Integer pba;
    /**
     * 豹子2的遗漏
     */
    private Integer pb2;
    /**
     * 豹子3的遗漏
     */
    private Integer pb3;
    /**
     * 豹子4的遗漏
     */
    private Integer pb4;
    /**
     * 豹子5的遗漏
     */
    private Integer pb5;
    /**
     * 豹子6的遗漏
     */
    private Integer pb6;
    /**
     * 豹子7的遗漏
     */
    private Integer pb7;
    /**
     * 豹子8的遗漏
     */
    private Integer pb8;
    /**
     * 豹子9的遗漏
     */
    private Integer pb9;
    /**
     * 豹子10的遗漏
     */
    private Integer pb10;
    /**
     * 豹子J的遗漏
     */
    private Integer pbj;
    /**
     * 豹子Q的遗漏
     */
    private Integer pbq;
    /**
     * 豹子K的遗漏
     */
    private Integer pbk;
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getPa() {
		return pa;
	}
	public void setPa(Integer pa) {
		this.pa = pa;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public Integer getP3() {
		return p3;
	}
	public void setP3(Integer p3) {
		this.p3 = p3;
	}
	public Integer getP4() {
		return p4;
	}
	public void setP4(Integer p4) {
		this.p4 = p4;
	}
	public Integer getP5() {
		return p5;
	}
	public void setP5(Integer p5) {
		this.p5 = p5;
	}
	public Integer getP6() {
		return p6;
	}
	public void setP6(Integer p6) {
		this.p6 = p6;
	}
	public Integer getP7() {
		return p7;
	}
	public void setP7(Integer p7) {
		this.p7 = p7;
	}
	public Integer getP8() {
		return p8;
	}
	public void setP8(Integer p8) {
		this.p8 = p8;
	}
	public Integer getP9() {
		return p9;
	}
	public void setP9(Integer p9) {
		this.p9 = p9;
	}
	public Integer getP10() {
		return p10;
	}
	public void setP10(Integer p10) {
		this.p10 = p10;
	}
	public Integer getPj() {
		return pj;
	}
	public void setPj(Integer pj) {
		this.pj = pj;
	}
	public Integer getPq() {
		return pq;
	}
	public void setPq(Integer pq) {
		this.pq = pq;
	}
	public Integer getPk() {
		return pk;
	}
	public void setPk(Integer pk) {
		this.pk = pk;
	}
	public Integer getPt() {
		return pt;
	}
	public void setPt(Integer pt) {
		this.pt = pt;
	}
	public Integer getPt1() {
		return pt1;
	}
	public void setPt1(Integer pt1) {
		this.pt1 = pt1;
	}
	public Integer getPt2() {
		return pt2;
	}
	public void setPt2(Integer pt2) {
		this.pt2 = pt2;
	}
	public Integer getPt3() {
		return pt3;
	}
	public void setPt3(Integer pt3) {
		this.pt3 = pt3;
	}
	public Integer getPt4() {
		return pt4;
	}
	public void setPt4(Integer pt4) {
		this.pt4 = pt4;
	}
	public Integer getPx() {
		return px;
	}
	public void setPx(Integer px) {
		this.px = px;
	}
	public Integer getPxa23() {
		return pxa23;
	}
	public void setPxa23(Integer pxa23) {
		this.pxa23 = pxa23;
	}
	public Integer getPx234() {
		return px234;
	}
	public void setPx234(Integer px234) {
		this.px234 = px234;
	}
	public Integer getPx345() {
		return px345;
	}
	public void setPx345(Integer px345) {
		this.px345 = px345;
	}
	public Integer getPx456() {
		return px456;
	}
	public void setPx456(Integer px456) {
		this.px456 = px456;
	}
	public Integer getPx567() {
		return px567;
	}
	public void setPx567(Integer px567) {
		this.px567 = px567;
	}
	public Integer getPx678() {
		return px678;
	}
	public void setPx678(Integer px678) {
		this.px678 = px678;
	}
	public Integer getPx789() {
		return px789;
	}
	public void setPx789(Integer px789) {
		this.px789 = px789;
	}
	public Integer getPx8910() {
		return px8910;
	}
	public void setPx8910(Integer px8910) {
		this.px8910 = px8910;
	}
	public Integer getPx910j() {
		return px910j;
	}
	public void setPx910j(Integer px910j) {
		this.px910j = px910j;
	}
	public Integer getPx10jq() {
		return px10jq;
	}
	public void setPx10jq(Integer px10jq) {
		this.px10jq = px10jq;
	}
	public Integer getPxjqk() {
		return pxjqk;
	}
	public void setPxjqk(Integer pxjqk) {
		this.pxjqk = pxjqk;
	}
	public Integer getPxqka() {
		return pxqka;
	}
	public void setPxqka(Integer pxqka) {
		this.pxqka = pxqka;
	}
	public Integer getPd() {
		return pd;
	}
	public void setPd(Integer pd) {
		this.pd = pd;
	}
	public Integer getPda() {
		return pda;
	}
	public void setPda(Integer pda) {
		this.pda = pda;
	}
	public Integer getPd2() {
		return pd2;
	}
	public void setPd2(Integer pd2) {
		this.pd2 = pd2;
	}
	public Integer getPd3() {
		return pd3;
	}
	public void setPd3(Integer pd3) {
		this.pd3 = pd3;
	}
	public Integer getPd4() {
		return pd4;
	}
	public void setPd4(Integer pd4) {
		this.pd4 = pd4;
	}
	public Integer getPd5() {
		return pd5;
	}
	public void setPd5(Integer pd5) {
		this.pd5 = pd5;
	}
	public Integer getPd6() {
		return pd6;
	}
	public void setPd6(Integer pd6) {
		this.pd6 = pd6;
	}
	public Integer getPd7() {
		return pd7;
	}
	public void setPd7(Integer pd7) {
		this.pd7 = pd7;
	}
	public Integer getPd8() {
		return pd8;
	}
	public void setPd8(Integer pd8) {
		this.pd8 = pd8;
	}
	public Integer getPd9() {
		return pd9;
	}
	public void setPd9(Integer pd9) {
		this.pd9 = pd9;
	}
	public Integer getPd10() {
		return pd10;
	}
	public void setPd10(Integer pd10) {
		this.pd10 = pd10;
	}
	public Integer getPdj() {
		return pdj;
	}
	public void setPdj(Integer pdj) {
		this.pdj = pdj;
	}
	public Integer getPdq() {
		return pdq;
	}
	public void setPdq(Integer pdq) {
		this.pdq = pdq;
	}
	public Integer getPdk() {
		return pdk;
	}
	public void setPdk(Integer pdk) {
		this.pdk = pdk;
	}
	public Integer getPb() {
		return pb;
	}
	public void setPb(Integer pb) {
		this.pb = pb;
	}
	public Integer getPba() {
		return pba;
	}
	public void setPba(Integer pba) {
		this.pba = pba;
	}
	public Integer getPb2() {
		return pb2;
	}
	public void setPb2(Integer pb2) {
		this.pb2 = pb2;
	}
	public Integer getPb3() {
		return pb3;
	}
	public void setPb3(Integer pb3) {
		this.pb3 = pb3;
	}
	public Integer getPb4() {
		return pb4;
	}
	public void setPb4(Integer pb4) {
		this.pb4 = pb4;
	}
	public Integer getPb5() {
		return pb5;
	}
	public void setPb5(Integer pb5) {
		this.pb5 = pb5;
	}
	public Integer getPb6() {
		return pb6;
	}
	public void setPb6(Integer pb6) {
		this.pb6 = pb6;
	}
	public Integer getPb7() {
		return pb7;
	}
	public void setPb7(Integer pb7) {
		this.pb7 = pb7;
	}
	public Integer getPb8() {
		return pb8;
	}
	public void setPb8(Integer pb8) {
		this.pb8 = pb8;
	}
	public Integer getPb9() {
		return pb9;
	}
	public void setPb9(Integer pb9) {
		this.pb9 = pb9;
	}
	public Integer getPb10() {
		return pb10;
	}
	public void setPb10(Integer pb10) {
		this.pb10 = pb10;
	}
	public Integer getPbj() {
		return pbj;
	}
	public void setPbj(Integer pbj) {
		this.pbj = pbj;
	}
	public Integer getPbq() {
		return pbq;
	}
	public void setPbq(Integer pbq) {
		this.pbq = pbq;
	}
	public Integer getPbk() {
		return pbk;
	}
	public void setPbk(Integer pbk) {
		this.pbk = pbk;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getDrawCode() {
		return drawCode;
	}
	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}
    
    
}
