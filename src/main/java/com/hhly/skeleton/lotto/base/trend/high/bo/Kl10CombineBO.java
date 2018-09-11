package com.hhly.skeleton.lotto.base.trend.high.bo;

import java.util.ArrayList;

import com.hhly.skeleton.base.util.trendutil.Assemble;

/**
 * @desc 包含base表及3code表的字段
 * @author Tony Wang
 * @date 2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */

@SuppressWarnings("serial")
public class Kl10CombineBO extends HighOmitBaseBO {
	
	// 任选N
	@Assemble(regex={"^n\\d{2}$"})
	private ArrayList<Object> nums;
	
	// 前一红投
	@Assemble(include={"n1920"})
	private ArrayList<Object> ht;
	
	// 选三前组
	@Assemble(regex={"^zx\\d{2}$"})
	private ArrayList<Object> zx;
	
	// 第一位
    @Assemble(regex={"^b\\d{2}$"})
	private ArrayList<Object> first;
	
    // 第二位
	@Assemble(regex={"^s\\d{2}$"})
	private ArrayList<Object> second;
	
	// 第三位
	@Assemble(regex={"^g\\d{2}$"})
	private ArrayList<Object> third;
	
	private Integer n01;
	private Integer n02;
	private Integer n03;
	private Integer n04;
	private Integer n05;
	private Integer n06;
	private Integer n07;
	private Integer n08;
	private Integer n09;
	private Integer n10;
	private Integer n11;
	private Integer n12;
	private Integer n13;
	private Integer n14;
	private Integer n15;
	private Integer n16;
	private Integer n17;
	private Integer n18;
	private Integer n19;
	private Integer n20;
	private Integer n1920;
	
	// 选三前组
    private Integer zx01;
    private Integer zx02;
    private Integer zx03;
    private Integer zx04;
    private Integer zx05;
    private Integer zx06;
    private Integer zx07;
    private Integer zx08;
    private Integer zx09;
    private Integer zx10;
    private Integer zx11;
    private Integer zx12;
    private Integer zx13;
    private Integer zx14;
    private Integer zx15;
    private Integer zx16;
    private Integer zx17;
    private Integer zx18;
    private Integer zx19;
    private Integer zx20;
    
    // 第一位
	private Integer b01;
    private Integer b02;
    private Integer b03;
    private Integer b04;
    private Integer b05;
    private Integer b06;
    private Integer b07;
    private Integer b08;
    private Integer b09;
    private Integer b10;
    private Integer b11;
    private Integer b12;
    private Integer b13;
    private Integer b14;
    private Integer b15;
    private Integer b16;
    private Integer b17;
    private Integer b18;
    private Integer b19;
    private Integer b20;
    
    // 第二位
    private Integer s01;
    private Integer s02;
    private Integer s03;
    private Integer s04;
    private Integer s05;
    private Integer s06;
    private Integer s07;
    private Integer s08;
    private Integer s09;
    private Integer s10;
    private Integer s11;
    private Integer s12;
    private Integer s13;
    private Integer s14;
    private Integer s15;
    private Integer s16;
    private Integer s17;
    private Integer s18;
    private Integer s19;
    private Integer s20;

    // 第三位
    private Integer g01;
    private Integer g02;
    private Integer g03;
    private Integer g04;
    private Integer g05;
    private Integer g06;
    private Integer g07;
    private Integer g08;
    private Integer g09;
    private Integer g10;
    private Integer g11;
    private Integer g12;
    private Integer g13;
    private Integer g14;
    private Integer g15;
    private Integer g16;
    private Integer g17;
    private Integer g18;
    private Integer g19;
    private Integer g20;
    
	public Integer getN01() {
		return n01;
	}
	public void setN01(Integer n01) {
		this.n01 = n01;
	}
	public Integer getN02() {
		return n02;
	}
	public void setN02(Integer n02) {
		this.n02 = n02;
	}
	public Integer getN03() {
		return n03;
	}
	public void setN03(Integer n03) {
		this.n03 = n03;
	}
	public Integer getN04() {
		return n04;
	}
	public void setN04(Integer n04) {
		this.n04 = n04;
	}
	public Integer getN05() {
		return n05;
	}
	public void setN05(Integer n05) {
		this.n05 = n05;
	}
	public Integer getN06() {
		return n06;
	}
	public void setN06(Integer n06) {
		this.n06 = n06;
	}
	public Integer getN07() {
		return n07;
	}
	public void setN07(Integer n07) {
		this.n07 = n07;
	}
	public Integer getN08() {
		return n08;
	}
	public void setN08(Integer n08) {
		this.n08 = n08;
	}
	public Integer getN09() {
		return n09;
	}
	public void setN09(Integer n09) {
		this.n09 = n09;
	}
	public Integer getN10() {
		return n10;
	}
	public void setN10(Integer n10) {
		this.n10 = n10;
	}
	public Integer getN11() {
		return n11;
	}
	public void setN11(Integer n11) {
		this.n11 = n11;
	}
	public Integer getN12() {
		return n12;
	}
	public void setN12(Integer n12) {
		this.n12 = n12;
	}
	public Integer getN13() {
		return n13;
	}
	public void setN13(Integer n13) {
		this.n13 = n13;
	}
	public Integer getN14() {
		return n14;
	}
	public void setN14(Integer n14) {
		this.n14 = n14;
	}
	public Integer getN15() {
		return n15;
	}
	public void setN15(Integer n15) {
		this.n15 = n15;
	}
	public Integer getN16() {
		return n16;
	}
	public void setN16(Integer n16) {
		this.n16 = n16;
	}
	public Integer getN17() {
		return n17;
	}
	public void setN17(Integer n17) {
		this.n17 = n17;
	}
	public Integer getN18() {
		return n18;
	}
	public void setN18(Integer n18) {
		this.n18 = n18;
	}
	public Integer getN19() {
		return n19;
	}
	public void setN19(Integer n19) {
		this.n19 = n19;
	}
	public Integer getN20() {
		return n20;
	}
	public void setN20(Integer n20) {
		this.n20 = n20;
	}
	public Integer getN1920() {
		return n1920;
	}
	public void setN1920(Integer n1920) {
		this.n1920 = n1920;
	}
	public Integer getZx01() {
		return zx01;
	}
	public void setZx01(Integer zx01) {
		this.zx01 = zx01;
	}
	public Integer getZx02() {
		return zx02;
	}
	public void setZx02(Integer zx02) {
		this.zx02 = zx02;
	}
	public Integer getZx03() {
		return zx03;
	}
	public void setZx03(Integer zx03) {
		this.zx03 = zx03;
	}
	public Integer getZx04() {
		return zx04;
	}
	public void setZx04(Integer zx04) {
		this.zx04 = zx04;
	}
	public Integer getZx05() {
		return zx05;
	}
	public void setZx05(Integer zx05) {
		this.zx05 = zx05;
	}
	public Integer getZx06() {
		return zx06;
	}
	public void setZx06(Integer zx06) {
		this.zx06 = zx06;
	}
	public Integer getZx07() {
		return zx07;
	}
	public void setZx07(Integer zx07) {
		this.zx07 = zx07;
	}
	public Integer getZx08() {
		return zx08;
	}
	public void setZx08(Integer zx08) {
		this.zx08 = zx08;
	}
	public Integer getZx09() {
		return zx09;
	}
	public void setZx09(Integer zx09) {
		this.zx09 = zx09;
	}
	public Integer getZx10() {
		return zx10;
	}
	public void setZx10(Integer zx10) {
		this.zx10 = zx10;
	}
	public Integer getZx11() {
		return zx11;
	}
	public void setZx11(Integer zx11) {
		this.zx11 = zx11;
	}
	public Integer getZx12() {
		return zx12;
	}
	public void setZx12(Integer zx12) {
		this.zx12 = zx12;
	}
	public Integer getZx13() {
		return zx13;
	}
	public void setZx13(Integer zx13) {
		this.zx13 = zx13;
	}
	public Integer getZx14() {
		return zx14;
	}
	public void setZx14(Integer zx14) {
		this.zx14 = zx14;
	}
	public Integer getZx15() {
		return zx15;
	}
	public void setZx15(Integer zx15) {
		this.zx15 = zx15;
	}
	public Integer getZx16() {
		return zx16;
	}
	public void setZx16(Integer zx16) {
		this.zx16 = zx16;
	}
	public Integer getZx17() {
		return zx17;
	}
	public void setZx17(Integer zx17) {
		this.zx17 = zx17;
	}
	public Integer getZx18() {
		return zx18;
	}
	public void setZx18(Integer zx18) {
		this.zx18 = zx18;
	}
	public Integer getZx19() {
		return zx19;
	}
	public void setZx19(Integer zx19) {
		this.zx19 = zx19;
	}
	public Integer getZx20() {
		return zx20;
	}
	public void setZx20(Integer zx20) {
		this.zx20 = zx20;
	}
	public ArrayList<Object> getNums() {
		return nums;
	}
	public void setNums(ArrayList<Object> nums) {
		this.nums = nums;
	}
	public ArrayList<Object> getHt() {
		return ht;
	}
	public void setHt(ArrayList<Object> ht) {
		this.ht = ht;
	}
	public ArrayList<Object> getZx() {
		return zx;
	}
	public void setZx(ArrayList<Object> zx) {
		this.zx = zx;
	}
	public ArrayList<Object> getFirst() {
		return first;
	}
	public void setFirst(ArrayList<Object> first) {
		this.first = first;
	}
	public ArrayList<Object> getSecond() {
		return second;
	}
	public void setSecond(ArrayList<Object> second) {
		this.second = second;
	}
	public ArrayList<Object> getThird() {
		return third;
	}
	public void setThird(ArrayList<Object> third) {
		this.third = third;
	}
	public Integer getB01() {
		return b01;
	}
	public void setB01(Integer b01) {
		this.b01 = b01;
	}
	public Integer getB02() {
		return b02;
	}
	public void setB02(Integer b02) {
		this.b02 = b02;
	}
	public Integer getB03() {
		return b03;
	}
	public void setB03(Integer b03) {
		this.b03 = b03;
	}
	public Integer getB04() {
		return b04;
	}
	public void setB04(Integer b04) {
		this.b04 = b04;
	}
	public Integer getB05() {
		return b05;
	}
	public void setB05(Integer b05) {
		this.b05 = b05;
	}
	public Integer getB06() {
		return b06;
	}
	public void setB06(Integer b06) {
		this.b06 = b06;
	}
	public Integer getB07() {
		return b07;
	}
	public void setB07(Integer b07) {
		this.b07 = b07;
	}
	public Integer getB08() {
		return b08;
	}
	public void setB08(Integer b08) {
		this.b08 = b08;
	}
	public Integer getB09() {
		return b09;
	}
	public void setB09(Integer b09) {
		this.b09 = b09;
	}
	public Integer getB10() {
		return b10;
	}
	public void setB10(Integer b10) {
		this.b10 = b10;
	}
	public Integer getB11() {
		return b11;
	}
	public void setB11(Integer b11) {
		this.b11 = b11;
	}
	public Integer getB12() {
		return b12;
	}
	public void setB12(Integer b12) {
		this.b12 = b12;
	}
	public Integer getB13() {
		return b13;
	}
	public void setB13(Integer b13) {
		this.b13 = b13;
	}
	public Integer getB14() {
		return b14;
	}
	public void setB14(Integer b14) {
		this.b14 = b14;
	}
	public Integer getB15() {
		return b15;
	}
	public void setB15(Integer b15) {
		this.b15 = b15;
	}
	public Integer getB16() {
		return b16;
	}
	public void setB16(Integer b16) {
		this.b16 = b16;
	}
	public Integer getB17() {
		return b17;
	}
	public void setB17(Integer b17) {
		this.b17 = b17;
	}
	public Integer getB18() {
		return b18;
	}
	public void setB18(Integer b18) {
		this.b18 = b18;
	}
	public Integer getB19() {
		return b19;
	}
	public void setB19(Integer b19) {
		this.b19 = b19;
	}
	public Integer getB20() {
		return b20;
	}
	public void setB20(Integer b20) {
		this.b20 = b20;
	}
	public Integer getS01() {
		return s01;
	}
	public void setS01(Integer s01) {
		this.s01 = s01;
	}
	public Integer getS02() {
		return s02;
	}
	public void setS02(Integer s02) {
		this.s02 = s02;
	}
	public Integer getS03() {
		return s03;
	}
	public void setS03(Integer s03) {
		this.s03 = s03;
	}
	public Integer getS04() {
		return s04;
	}
	public void setS04(Integer s04) {
		this.s04 = s04;
	}
	public Integer getS05() {
		return s05;
	}
	public void setS05(Integer s05) {
		this.s05 = s05;
	}
	public Integer getS06() {
		return s06;
	}
	public void setS06(Integer s06) {
		this.s06 = s06;
	}
	public Integer getS07() {
		return s07;
	}
	public void setS07(Integer s07) {
		this.s07 = s07;
	}
	public Integer getS08() {
		return s08;
	}
	public void setS08(Integer s08) {
		this.s08 = s08;
	}
	public Integer getS09() {
		return s09;
	}
	public void setS09(Integer s09) {
		this.s09 = s09;
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
	public Integer getS19() {
		return s19;
	}
	public void setS19(Integer s19) {
		this.s19 = s19;
	}
	public Integer getS20() {
		return s20;
	}
	public void setS20(Integer s20) {
		this.s20 = s20;
	}
	public Integer getG01() {
		return g01;
	}
	public void setG01(Integer g01) {
		this.g01 = g01;
	}
	public Integer getG02() {
		return g02;
	}
	public void setG02(Integer g02) {
		this.g02 = g02;
	}
	public Integer getG03() {
		return g03;
	}
	public void setG03(Integer g03) {
		this.g03 = g03;
	}
	public Integer getG04() {
		return g04;
	}
	public void setG04(Integer g04) {
		this.g04 = g04;
	}
	public Integer getG05() {
		return g05;
	}
	public void setG05(Integer g05) {
		this.g05 = g05;
	}
	public Integer getG06() {
		return g06;
	}
	public void setG06(Integer g06) {
		this.g06 = g06;
	}
	public Integer getG07() {
		return g07;
	}
	public void setG07(Integer g07) {
		this.g07 = g07;
	}
	public Integer getG08() {
		return g08;
	}
	public void setG08(Integer g08) {
		this.g08 = g08;
	}
	public Integer getG09() {
		return g09;
	}
	public void setG09(Integer g09) {
		this.g09 = g09;
	}
	public Integer getG10() {
		return g10;
	}
	public void setG10(Integer g10) {
		this.g10 = g10;
	}
	public Integer getG11() {
		return g11;
	}
	public void setG11(Integer g11) {
		this.g11 = g11;
	}
	public Integer getG12() {
		return g12;
	}
	public void setG12(Integer g12) {
		this.g12 = g12;
	}
	public Integer getG13() {
		return g13;
	}
	public void setG13(Integer g13) {
		this.g13 = g13;
	}
	public Integer getG14() {
		return g14;
	}
	public void setG14(Integer g14) {
		this.g14 = g14;
	}
	public Integer getG15() {
		return g15;
	}
	public void setG15(Integer g15) {
		this.g15 = g15;
	}
	public Integer getG16() {
		return g16;
	}
	public void setG16(Integer g16) {
		this.g16 = g16;
	}
	public Integer getG17() {
		return g17;
	}
	public void setG17(Integer g17) {
		this.g17 = g17;
	}
	public Integer getG18() {
		return g18;
	}
	public void setG18(Integer g18) {
		this.g18 = g18;
	}
	public Integer getG19() {
		return g19;
	}
	public void setG19(Integer g19) {
		this.g19 = g19;
	}
	public Integer getG20() {
		return g20;
	}
	public void setG20(Integer g20) {
		this.g20 = g20;
	}
}