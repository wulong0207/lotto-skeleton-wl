package com.hhly.skeleton.lotto.base.trend.vo.high;

@SuppressWarnings("serial")
public class K3OmitVO extends HighLotteryVO {

    /**
     * 号码1遗漏
     */
    private boolean showB1;

    /**
     * 号码2遗漏
     */
    private boolean showB2;

    /**
     * 号码3遗漏
     */
    private boolean showB3;

    /**
     * 号码4遗漏
     */
    private boolean showB4;

    /**
     * 号码5遗漏
     */
    private boolean showB5;

    /**
     * 号码6遗漏
     */
    private boolean showB6;

    /**
     * 开奖号码和值
     */
    private boolean showS;
    
    /**
     * 开奖号码和值为3遗漏
     */
    private boolean showS3;

    /**
     * 开奖号码和值为4遗漏
     */
    private boolean showS4;

    /**
     * 开奖号码和值为5遗漏
     */
    private boolean showS5;

    /**
     * 开奖号码和值为6遗漏
     */
    private boolean showS6;

    /**
     * 开奖号码和值为7遗漏
     */
    private boolean showS7;

    /**
     * 开奖号码和值为8遗漏
     */
    private boolean showS8;

    /**
     * 开奖号码和值为9遗漏
     */
    private boolean showS9;

    /**
     * 开奖号码和值为10遗漏
     */
    private boolean showS10;

    /**
     * 开奖号码和值为11遗漏
     */
    private boolean showS11;

    /**
     * 开奖号码和值为12遗漏
     */
    private boolean showS12;

    /**
     * 开奖号码和值为13遗漏
     */
    private boolean showS13;

    /**
     * 开奖号码和值为14遗漏
     */
    private boolean showS14;

    /**
     * 开奖号码和值为15遗漏
     */
    private boolean showS15;

    /**
     * 开奖号码和值为16遗漏
     */
    private boolean showS16;

    /**
     * 开奖号码和值17为遗漏
     */
    private boolean showS17;

    /**
     * 开奖号码和值为18遗漏
     */
    private boolean showS18;

    /**
     * 三同遗漏[号码为000、111、333]
     */
    private boolean showT3;

    /**
     * 三不同遗漏
     */
    private boolean showBt3;

    /**
     * 三连号通选遗漏
     */
    private boolean showL3;

    /**
     * 2同复[11*,22*,33*]
     */
    private boolean showTf2;

    /**
     * 2同单
     */
    private boolean showTd2;

    /**
     * 2不同
     */
    private boolean  showBt2;


    /**
     * 2同单11
     */
    private boolean  showT11;

    /**
     * 2同单22
     */
    private boolean  showT22;

    /**
     * 2同单33
     */
    private boolean  showT33;

    /**
     * 2同单44
     */
    private boolean  showT44;

    /**
     * 2同单55
     */
    private boolean  showT55;

    /**
     * 2同单66
     */
    private boolean  showT66;
    
    
    /**
     * 2同复11
     */
    private boolean  showTf11;

    /**
     * 2同复22
     */
    private boolean  showTf22;

    /**
     * 2同复33
     */
    private boolean  showTf33;

    /**
     * 2同复44
     */
    private boolean  showTf44;

    /**
     * 2同复55
     */
    private boolean  showTf55;

    /**
     * 2同复66
     */
    private boolean  showTf66;
    

    /**
     * 3同111
     */
    private boolean  showT111;

    /**
     * 3同222
     */
    private boolean  showT222;

    /**
     * 3同333
     */
    private boolean  showT333;

    /**
     * 3同444
     */
    private boolean  showT444;

    /**
     * 3同555
     */
    private boolean  showT555;

    /**
     * 3同666
     */
    private boolean  showT666;
    
    /**
     * 大
     */
    private boolean  showBig;

    /**
     * 小
     */
    private boolean  showSmall;

    /**
     * 单
     */
    private boolean  showOdd;

    /**
     * 双
     */
    private boolean  showEven;

    /**
     * 跨度
     */
    private boolean  showKd;
    /**
     * 跨度0
     */
    private boolean  showKd0;

    /**
     * 跨度1
     */
    private boolean  showKd1;

    /**
     * 跨度2
     */
    private boolean  showKd2;

    /**
     * 跨度3
     */
    private boolean  showKd3;

    /**
     * 跨度4
     */
    private boolean  showKd4;

    /**
     * 跨度5
     */
    private boolean  showKd5;
    
    /**
     * 二同单不同号1
     */
    private boolean  showTdb1;
    /**
     * 二同单不同号2
     */
    private boolean  showTdb2;
    /**
     * 二同单不同号3
     */
    private boolean  showTdb3;
    /**
     * 二同单不同号4
     */
    private boolean  showTdb4;
    /**
     * 二同单不同号5
     */
    private boolean  showTdb5;
    /**
     * 二同单不同号6
     */
    private boolean  showTdb6;
    
    //private boolean showMyTf2;
    
    private boolean showMyTd2;
    
    /**
     * 是否显示形态1.豹子;2.对子;3.三不同
     */
    private boolean type;
    /**
     * 是否显示大小比:1[3:0],2[2:1],3[1:2],4[0:3]
     */
    private boolean bs;
    
    
	public K3OmitVO() {
	}

	public K3OmitVO(int lotteryCode, int subPlay, int omitType) {
		super(lotteryCode, subPlay, omitType);
	}
	
	public void showSum(boolean isShow) {
		setShowS3(isShow);
		setShowS4(isShow);
		setShowS5(isShow);
		setShowS6(isShow);
		setShowS7(isShow);
		setShowS8(isShow);
		setShowS9(isShow);
		setShowS10(isShow);
		setShowS11(isShow);
		setShowS12(isShow);
		setShowS13(isShow);
		setShowS14(isShow);
		setShowS15(isShow);
		setShowS16(isShow);
		setShowS17(isShow);
		setShowS18(isShow);
	}
	/**
	 * @desc   设置和值形态
	 * @author Tony Wang
	 * @create 2017年6月27日
	 * @param isShow 
	 */
	public void showSumForm(boolean isShow) {
		setShowBig(isShow);
		setShowSmall(isShow);
		setShowOdd(isShow);
		setShowEven(isShow);
	}
	
	public void show1To6(boolean isShow) {
		setShowB1(isShow);
		setShowB2(isShow);
		setShowB3(isShow);
		setShowB4(isShow);
		setShowB5(isShow);
		setShowB6(isShow);
	}
	
	public void showDrawcodeForm(boolean isShow) {
		setShowT3(isShow);
		setShowBt3(isShow);
		setShowL3(isShow);
		setShowTf2(isShow);
		setShowTd2(isShow);
		setShowBt2(isShow);
	}
	public void showKd(boolean isShow) {
		setShowKd0(isShow);
		setShowKd1(isShow);
		setShowKd2(isShow);
		setShowKd3(isShow);
		setShowKd4(isShow);
		setShowKd5(isShow);
	}
	public void showToPC(boolean isShow) {
		setShowIssue(isShow);
		setShowDrawCode(isShow);
		show1To6(isShow);
		showDrawcodeForm(isShow);
		showKd(isShow);
	}
	public void showT3All(boolean isShow) {
		setShowT111(isShow);
		setShowT222(isShow);
		setShowT333(isShow);
		setShowT444(isShow);
		setShowT555(isShow);
		setShowT666(isShow);
	}
	
	public void showTd11To66(boolean isShow) {
		setShowT11(isShow);
		setShowT22(isShow);
		setShowT33(isShow);
		setShowT44(isShow);
		setShowT55(isShow);
		setShowT66(isShow);
	}
	
	public void showTd(boolean isShow) {
		showTd11To66(isShow);
		setShowTdb1(isShow);
		setShowTdb2(isShow);
		setShowTdb3(isShow);
		setShowTdb4(isShow);
		setShowTdb5(isShow);
		setShowTdb6(isShow);
		setShowMyTd2(isShow);
	}
	/**
	 * @desc   二同复遗漏通过比较豹子遗漏和二同单遗漏中的较小者得到
	 * @author Tony Wang
	 * @create 2017年6月28日
	 * @param b 
	 */
	public void showTf(boolean show) {
		//showT3All(isShow);
		//showTd11To66(isShow);
		//setShowMyTf2(isShow);
		setShowTf11(show);
		setShowTf22(show);
		setShowTf33(show);
		setShowTf44(show);
		setShowTf55(show);
		setShowTf66(show);
	}
	
	public void showToMobile(boolean show) {
		setShowIssue(show);
		setShowDrawCode(show);
		show1To6(show);
		setShowS(show);
		setShowKd(show);
	}
	
	public void showAll(boolean show) {
		showSum(show);
		showSumForm(show);
		show1To6(show);
		showDrawcodeForm(show);
		showKd(show);
		//setShowKd(show);
		showT3All(show);
		//showTd11To66(show);
		showTd(show);
		showTf(show);
		setShowIssue(show);
		setShowDrawCode(show);
		//setShowS(show);
		//setType(show);
		//setBs(show);
	}
	
	public boolean isShowB1() {
		return showB1;
	}
	public void setShowB1(boolean showB1) {
		this.showB1 = showB1;
	}
	public boolean isShowB2() {
		return showB2;
	}
	public void setShowB2(boolean showB2) {
		this.showB2 = showB2;
	}
	public boolean isShowB3() {
		return showB3;
	}
	public void setShowB3(boolean showB3) {
		this.showB3 = showB3;
	}
	public boolean isShowB4() {
		return showB4;
	}
	public void setShowB4(boolean showB4) {
		this.showB4 = showB4;
	}
	public boolean isShowB5() {
		return showB5;
	}
	public void setShowB5(boolean showB5) {
		this.showB5 = showB5;
	}
	public boolean isShowB6() {
		return showB6;
	}
	public void setShowB6(boolean showB6) {
		this.showB6 = showB6;
	}
	public boolean isShowS3() {
		return showS3;
	}
	public void setShowS3(boolean showS3) {
		this.showS3 = showS3;
	}
	public boolean isShowS4() {
		return showS4;
	}
	public void setShowS4(boolean showS4) {
		this.showS4 = showS4;
	}
	public boolean isShowS5() {
		return showS5;
	}
	public void setShowS5(boolean showS5) {
		this.showS5 = showS5;
	}
	public boolean isShowS6() {
		return showS6;
	}
	public void setShowS6(boolean showS6) {
		this.showS6 = showS6;
	}
	public boolean isShowS7() {
		return showS7;
	}
	public void setShowS7(boolean showS7) {
		this.showS7 = showS7;
	}
	public boolean isShowS8() {
		return showS8;
	}
	public void setShowS8(boolean showS8) {
		this.showS8 = showS8;
	}
	public boolean isShowS9() {
		return showS9;
	}
	public void setShowS9(boolean showS9) {
		this.showS9 = showS9;
	}
	public boolean isShowS10() {
		return showS10;
	}
	public void setShowS10(boolean showS10) {
		this.showS10 = showS10;
	}
	public boolean isShowS11() {
		return showS11;
	}
	public void setShowS11(boolean showS11) {
		this.showS11 = showS11;
	}
	public boolean isShowS12() {
		return showS12;
	}
	public void setShowS12(boolean showS12) {
		this.showS12 = showS12;
	}
	public boolean isShowS13() {
		return showS13;
	}
	public void setShowS13(boolean showS13) {
		this.showS13 = showS13;
	}
	public boolean isShowS14() {
		return showS14;
	}
	public void setShowS14(boolean showS14) {
		this.showS14 = showS14;
	}
	public boolean isShowS15() {
		return showS15;
	}
	public void setShowS15(boolean showS15) {
		this.showS15 = showS15;
	}
	public boolean isShowS16() {
		return showS16;
	}
	public void setShowS16(boolean showS16) {
		this.showS16 = showS16;
	}
	public boolean isShowS17() {
		return showS17;
	}
	public void setShowS17(boolean showS17) {
		this.showS17 = showS17;
	}
	public boolean isShowS18() {
		return showS18;
	}
	public void setShowS18(boolean showS18) {
		this.showS18 = showS18;
	}
	public boolean isShowT3() {
		return showT3;
	}
	public void setShowT3(boolean showT3) {
		this.showT3 = showT3;
	}
	public boolean isShowBt3() {
		return showBt3;
	}
	public void setShowBt3(boolean showBt3) {
		this.showBt3 = showBt3;
	}
	public boolean isShowL3() {
		return showL3;
	}
	public void setShowL3(boolean showL3) {
		this.showL3 = showL3;
	}
	public boolean isShowTf2() {
		return showTf2;
	}
	public void setShowTf2(boolean showTf2) {
		this.showTf2 = showTf2;
	}
	public boolean isShowTd2() {
		return showTd2;
	}
	public void setShowTd2(boolean showTd2) {
		this.showTd2 = showTd2;
	}
	public boolean isShowBt2() {
		return showBt2;
	}
	public void setShowBt2(boolean showBt2) {
		this.showBt2 = showBt2;
	}
	public boolean isShowT11() {
		return showT11;
	}
	public void setShowT11(boolean showT11) {
		this.showT11 = showT11;
	}
	public boolean isShowT22() {
		return showT22;
	}
	public void setShowT22(boolean showT22) {
		this.showT22 = showT22;
	}
	public boolean isShowT33() {
		return showT33;
	}
	public void setShowT33(boolean showT33) {
		this.showT33 = showT33;
	}
	public boolean isShowT44() {
		return showT44;
	}
	public void setShowT44(boolean showT44) {
		this.showT44 = showT44;
	}
	public boolean isShowT55() {
		return showT55;
	}
	public void setShowT55(boolean showT55) {
		this.showT55 = showT55;
	}
	public boolean isShowT66() {
		return showT66;
	}
	public void setShowT66(boolean showT66) {
		this.showT66 = showT66;
	}
	public boolean isShowTf11() {
		return showTf11;
	}
	public void setShowTf11(boolean showTf11) {
		this.showTf11 = showTf11;
	}
	public boolean isShowTf22() {
		return showTf22;
	}
	public void setShowTf22(boolean showTf22) {
		this.showTf22 = showTf22;
	}
	public boolean isShowTf33() {
		return showTf33;
	}
	public void setShowTf33(boolean showTf33) {
		this.showTf33 = showTf33;
	}
	public boolean isShowTf44() {
		return showTf44;
	}
	public void setShowTf44(boolean showTf44) {
		this.showTf44 = showTf44;
	}
	public boolean isShowTf55() {
		return showTf55;
	}
	public void setShowTf55(boolean showTf55) {
		this.showTf55 = showTf55;
	}
	public boolean isShowTf66() {
		return showTf66;
	}
	public void setShowTf66(boolean showTf66) {
		this.showTf66 = showTf66;
	}
	public boolean isShowT111() {
		return showT111;
	}
	public void setShowT111(boolean showT111) {
		this.showT111 = showT111;
	}
	public boolean isShowT222() {
		return showT222;
	}
	public void setShowT222(boolean showT222) {
		this.showT222 = showT222;
	}
	public boolean isShowT333() {
		return showT333;
	}
	public void setShowT333(boolean showT333) {
		this.showT333 = showT333;
	}
	public boolean isShowT444() {
		return showT444;
	}
	public void setShowT444(boolean showT444) {
		this.showT444 = showT444;
	}
	public boolean isShowT555() {
		return showT555;
	}
	public void setShowT555(boolean showT555) {
		this.showT555 = showT555;
	}
	public boolean isShowT666() {
		return showT666;
	}
	public void setShowT666(boolean showT666) {
		this.showT666 = showT666;
	}
	public boolean isShowBig() {
		return showBig;
	}
	public void setShowBig(boolean showBig) {
		this.showBig = showBig;
	}
	public boolean isShowSmall() {
		return showSmall;
	}
	public void setShowSmall(boolean showSmall) {
		this.showSmall = showSmall;
	}
	public boolean isShowOdd() {
		return showOdd;
	}
	public void setShowOdd(boolean showOdd) {
		this.showOdd = showOdd;
	}
	public boolean isShowEven() {
		return showEven;
	}
	public void setShowEven(boolean showEven) {
		this.showEven = showEven;
	}
	public boolean isShowKd0() {
		return showKd0;
	}
	public void setShowKd0(boolean showKd0) {
		this.showKd0 = showKd0;
	}
	public boolean isShowKd1() {
		return showKd1;
	}
	public void setShowKd1(boolean showKd1) {
		this.showKd1 = showKd1;
	}
	public boolean isShowKd2() {
		return showKd2;
	}
	public void setShowKd2(boolean showKd2) {
		this.showKd2 = showKd2;
	}
	public boolean isShowKd3() {
		return showKd3;
	}
	public void setShowKd3(boolean showKd3) {
		this.showKd3 = showKd3;
	}
	public boolean isShowKd4() {
		return showKd4;
	}
	public void setShowKd4(boolean showKd4) {
		this.showKd4 = showKd4;
	}
	public boolean isShowKd5() {
		return showKd5;
	}
	public void setShowKd5(boolean showKd5) {
		this.showKd5 = showKd5;
	}
	public boolean isShowTdb1() {
		return showTdb1;
	}
	public void setShowTdb1(boolean showTdb1) {
		this.showTdb1 = showTdb1;
	}
	public boolean isShowTdb2() {
		return showTdb2;
	}
	public void setShowTdb2(boolean showTdb2) {
		this.showTdb2 = showTdb2;
	}
	public boolean isShowTdb3() {
		return showTdb3;
	}
	public void setShowTdb3(boolean showTdb3) {
		this.showTdb3 = showTdb3;
	}
	public boolean isShowTdb4() {
		return showTdb4;
	}
	public void setShowTdb4(boolean showTdb4) {
		this.showTdb4 = showTdb4;
	}
	public boolean isShowTdb5() {
		return showTdb5;
	}
	public void setShowTdb5(boolean showTdb5) {
		this.showTdb5 = showTdb5;
	}
	public boolean isShowTdb6() {
		return showTdb6;
	}
	public void setShowTdb6(boolean showTdb6) {
		this.showTdb6 = showTdb6;
	}
	public boolean isShowMyTd2() {
		return showMyTd2;
	}
	public void setShowMyTd2(boolean showMyTd2) {
		this.showMyTd2 = showMyTd2;
	}
	public boolean isShowS() {
		return showS;
	}
	public void setShowS(boolean showS) {
		this.showS = showS;
	}
	public boolean isShowKd() {
		return showKd;
	}
	public void setShowKd(boolean showKd) {
		this.showKd = showKd;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public boolean isBs() {
		return bs;
	}
	public void setBs(boolean bs) {
		this.bs = bs;
	}
}
