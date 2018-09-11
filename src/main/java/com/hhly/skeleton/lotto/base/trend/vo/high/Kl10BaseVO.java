package com.hhly.skeleton.lotto.base.trend.vo.high;

/**
 * @desc 快乐10分BaseBO，对应base表
 * @author Tony Wang
 * @date 2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class Kl10BaseVO implements java.io.Serializable{
	private boolean n01;
	private boolean n02;
	private boolean n03;
	private boolean n04;
	private boolean n05;
	private boolean n06;
	private boolean n07;
	private boolean n08;
	private boolean n09;
	private boolean n10;
	private boolean n11;
	private boolean n12;
	private boolean n13;
	private boolean n14;
	private boolean n15;
	private boolean n16;
	private boolean n17;
	private boolean n18;
	private boolean n19;
	private boolean n20;
	private boolean n1920;
	// 选三前组
    private boolean zx01;
    private boolean zx02;
    private boolean zx03;
    private boolean zx04;
    private boolean zx05;
    private boolean zx06;
    private boolean zx07;
    private boolean zx08;
    private boolean zx09;
    private boolean zx10;
    private boolean zx11;
    private boolean zx12;
    private boolean zx13;
    private boolean zx14;
    private boolean zx15;
    private boolean zx16;
    private boolean zx17;
    private boolean zx18;
    private boolean zx19;
    private boolean zx20;
    
    private boolean flag;
    
	public void showAll(boolean show) {
		showHt(show);
		showNums(show);
		showG3(show);
	}
	
    public void showHt(boolean show) {
		setN1920(show);
	}
	public void showNums(boolean show) {
		setN01(show);
		setN02(show);
		setN03(show);
		setN04(show);
		setN05(show);
		setN06(show);
		setN07(show);
		setN08(show);
		setN09(show);
		setN10(show);
		setN11(show);
		setN12(show);
		setN13(show);
		setN14(show);
		setN15(show);
		setN16(show);
		setN17(show);
		setN18(show);
		setN19(show);
		setN20(show);
	}
	public void showG3(boolean show) {
		setZx01(show);
		setZx02(show);
		setZx03(show);
		setZx04(show);
		setZx05(show);
		setZx06(show);
		setZx07(show);
		setZx08(show);
		setZx09(show);
		setZx10(show);
		setZx11(show);
		setZx12(show);
		setZx13(show);
		setZx14(show);
		setZx15(show);
		setZx16(show);
		setZx17(show);
		setZx18(show);
		setZx19(show);
		setZx20(show);
	}
	
	public boolean isN01() {
		return n01;
	}
	public void setN01(boolean n01) {
		this.n01 = n01;
	}
	public boolean isN02() {
		return n02;
	}
	public void setN02(boolean n02) {
		this.n02 = n02;
	}
	public boolean isN03() {
		return n03;
	}
	public void setN03(boolean n03) {
		this.n03 = n03;
	}
	public boolean isN04() {
		return n04;
	}
	public void setN04(boolean n04) {
		this.n04 = n04;
	}
	public boolean isN05() {
		return n05;
	}
	public void setN05(boolean n05) {
		this.n05 = n05;
	}
	public boolean isN06() {
		return n06;
	}
	public void setN06(boolean n06) {
		this.n06 = n06;
	}
	public boolean isN07() {
		return n07;
	}
	public void setN07(boolean n07) {
		this.n07 = n07;
	}
	public boolean isN08() {
		return n08;
	}
	public void setN08(boolean n08) {
		this.n08 = n08;
	}
	public boolean isN09() {
		return n09;
	}
	public void setN09(boolean n09) {
		this.n09 = n09;
	}
	public boolean isN10() {
		return n10;
	}
	public void setN10(boolean n10) {
		this.n10 = n10;
	}
	public boolean isN11() {
		return n11;
	}
	public void setN11(boolean n11) {
		this.n11 = n11;
	}
	public boolean isN12() {
		return n12;
	}
	public void setN12(boolean n12) {
		this.n12 = n12;
	}
	public boolean isN13() {
		return n13;
	}
	public void setN13(boolean n13) {
		this.n13 = n13;
	}
	public boolean isN14() {
		return n14;
	}
	public void setN14(boolean n14) {
		this.n14 = n14;
	}
	public boolean isN15() {
		return n15;
	}
	public void setN15(boolean n15) {
		this.n15 = n15;
	}
	public boolean isN16() {
		return n16;
	}
	public void setN16(boolean n16) {
		this.n16 = n16;
	}
	public boolean isN17() {
		return n17;
	}
	public void setN17(boolean n17) {
		this.n17 = n17;
	}
	public boolean isN18() {
		return n18;
	}
	public void setN18(boolean n18) {
		this.n18 = n18;
	}
	public boolean isN19() {
		return n19;
	}
	public void setN19(boolean n19) {
		this.n19 = n19;
	}
	public boolean isN20() {
		return n20;
	}
	public void setN20(boolean n20) {
		this.n20 = n20;
	}
	public boolean isN1920() {
		return n1920;
	}
	public void setN1920(boolean n1920) {
		this.n1920 = n1920;
	}
	public boolean isZx01() {
		return zx01;
	}
	public void setZx01(boolean zx01) {
		this.zx01 = zx01;
	}
	public boolean isZx02() {
		return zx02;
	}
	public void setZx02(boolean zx02) {
		this.zx02 = zx02;
	}
	public boolean isZx03() {
		return zx03;
	}
	public void setZx03(boolean zx03) {
		this.zx03 = zx03;
	}
	public boolean isZx04() {
		return zx04;
	}
	public void setZx04(boolean zx04) {
		this.zx04 = zx04;
	}
	public boolean isZx05() {
		return zx05;
	}
	public void setZx05(boolean zx05) {
		this.zx05 = zx05;
	}
	public boolean isZx06() {
		return zx06;
	}
	public void setZx06(boolean zx06) {
		this.zx06 = zx06;
	}
	public boolean isZx07() {
		return zx07;
	}
	public void setZx07(boolean zx07) {
		this.zx07 = zx07;
	}
	public boolean isZx08() {
		return zx08;
	}
	public void setZx08(boolean zx08) {
		this.zx08 = zx08;
	}
	public boolean isZx09() {
		return zx09;
	}
	public void setZx09(boolean zx09) {
		this.zx09 = zx09;
	}
	public boolean isZx10() {
		return zx10;
	}
	public void setZx10(boolean zx10) {
		this.zx10 = zx10;
	}
	public boolean isZx11() {
		return zx11;
	}
	public void setZx11(boolean zx11) {
		this.zx11 = zx11;
	}
	public boolean isZx12() {
		return zx12;
	}
	public void setZx12(boolean zx12) {
		this.zx12 = zx12;
	}
	public boolean isZx13() {
		return zx13;
	}
	public void setZx13(boolean zx13) {
		this.zx13 = zx13;
	}
	public boolean isZx14() {
		return zx14;
	}
	public void setZx14(boolean zx14) {
		this.zx14 = zx14;
	}
	public boolean isZx15() {
		return zx15;
	}
	public void setZx15(boolean zx15) {
		this.zx15 = zx15;
	}
	public boolean isZx16() {
		return zx16;
	}
	public void setZx16(boolean zx16) {
		this.zx16 = zx16;
	}
	public boolean isZx17() {
		return zx17;
	}
	public void setZx17(boolean zx17) {
		this.zx17 = zx17;
	}
	public boolean isZx18() {
		return zx18;
	}
	public void setZx18(boolean zx18) {
		this.zx18 = zx18;
	}
	public boolean isZx19() {
		return zx19;
	}
	public void setZx19(boolean zx19) {
		this.zx19 = zx19;
	}
	public boolean isZx20() {
		return zx20;
	}
	public void setZx20(boolean zx20) {
		this.zx20 = zx20;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}