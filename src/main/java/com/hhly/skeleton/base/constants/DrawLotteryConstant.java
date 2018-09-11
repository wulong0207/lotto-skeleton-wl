package com.hhly.skeleton.base.constants;

import java.util.HashMap;
import java.util.Map;

import com.hhly.skeleton.base.common.LotteryEnum;

/**
 * @desc 彩种常量
 * @author huangchengfang1219
 * @date 2017年10月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawLotteryConstant {

	private static final Map<Integer, String> LOTTERY_KEY_MAP = new HashMap<Integer, String>();

	private static final Map<Integer, String> SX_KEY_MAP = new HashMap<Integer, String>();

	private static final Map<Integer, String> DIRECTION_KEY_MAP = new HashMap<Integer, String>();

	private static final Map<Integer, String> SEASON_KEY_MAP = new HashMap<Integer, String>();

	public static final String DIC_CODE_HIDDEN_LOTTERY = "2500";

	static {
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SSQ.getName(), "ssq");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.DLT.getName(), "dlt");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.F3D.getName(), "f3d");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.PL3.getName(), "pl3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.PL5.getName(), "pl5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.QXC.getName(), "qxc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.QLC.getName(), "qlc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SD11X5.getName(), "sd11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.D11X5.getName(), "gd11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JX11X5.getName(), "jx11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ11X5.getName(), "xj11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JSK3.getName(), "jsk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JXK3.getName(), "jxk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.CQKL10.getName(), "cqkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SDPOKER.getName(), "sdpoker");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.CQSSC.getName(), "cqssc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SFGG.getName(), "wf");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SFC.getName(), "sfc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZC_NINE.getName(), "rx9");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FB.getName(), "fb");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BB.getName(), "bb");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JQ4.getName(), "jq4");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BJDC.getName(), "bj");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZC6.getName(), "zc6");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HB11X5.getName(), "hb11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JS11X5.getName(), "js11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.LN11X5.getName(), "ln11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HL11X5.getName(), "hn11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.TJ11X5.getName(), "tj11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SX11X5.getName(), "sx11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JL11X5.getName(), "jl11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.AH11X5.getName(), "ah11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ11X5.getName(), "fj11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ11X5.getName(), "hlj11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SHX11X5.getName(), "shx11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GS11X5.getName(), "gs11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.YN11X5.getName(), "yn11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZJ11X5.getName(), "zj11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BJ11X5.getName(), "bj11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SH11X5.getName(), "sh11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GX11X5.getName(), "gx11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GZ11X5.getName(), "gz11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEB11X5.getName(), "heb11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.NX11X5.getName(), "nx11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.NMG11X5.getName(), "nmg11x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJSSC.getName(), "xjssc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.YNSSC.getName(), "ynssc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.TJSSC.getName(), "tjssc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HNKL10.getName(), "hnkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.DKL10.getName(), "gdkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GXKL10.getName(), "gxkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.TJKL10.getName(), "tjkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.YNKL10.getName(), "ynkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJKL10.getName(), "hljkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SHXKL10.getName(), "shxkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SXKL10.getName(), "sxkl10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GXK3.getName(), "gxk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.AHK3.getName(), "ahk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JLK3.getName(), "jlk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HNK3.getName(), "hnk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.QHK3.getName(), "qhk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GSK3.getName(), "gsk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HBK3.getName(), "hbk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SHK3.getName(), "shk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BJK3.getName(), "bjk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJK3.getName(), "fjk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GZK3.getName(), "gzk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.NMGK3.getName(), "nmgk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HBK3.getName(), "hbk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBK3.getName(), "hebk3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SHSSL.getName(), "shssl");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SDQYH.getName(), "sdqyh");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HNXYSC.getName(), "hnxysc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.PK10.getName(), "pk10");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SCHKL12.getName(), "schkl12");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZHJKL12.getName(), "zhjkl12");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.LNKL12.getName(), "lnkl12");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SXYTDJ.getName(), "sxytdj");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BJKL8.getName(), "bjkl8");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ36X7.getName(), "hlj36x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJP62.getName(), "hljp62");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ6J1.getName(), "hlj6j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ22X5.getName(), "hlj22x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.LN35X7.getName(), "ln35x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBHY2.getName(), "hebhy2");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBHY3.getName(), "hebhy3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBPL7.getName(), "hebpl7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBPL5.getName(), "hebpl5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEB20X5.getName(), "heb20x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.CQBBWP.getName(), "cqbbwp");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HENKY481.getName(), "henky481");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BJKZC.getName(), "bjkzc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.CQBBWP.getName(), "cqbbwp");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HENKY481.getName(), "henky481");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.BJKZC.getName(), "bjkzc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HD15X5.getName(), "hd15x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HDDF6J1.getName(), "hddf6j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JS7N.getName(), "js7n");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SHTTCX4.getName(), "shttcx4");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZJ20X5.getName(), "zj20x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZJ6J1.getName(), "zj6j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ36X7.getName(), "fj36x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ31X7.getName(), "fj31x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ22X5.getName(), "fj22x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GD36X7.getName(), "gd36x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GD26X5.getName(), "gd26x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GDHC1.getName(), "gdhc1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SZFC.getName(), "szfc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEN22X5.getName(), "hen22x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ25X7.getName(), "xj25x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ18X7.getName(), "xj18x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ35X7.getName(), "xj35x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GXKLSC.getName(), "gxklsc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.AH25X5.getName(), "ah25x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HAIN4J1.getName(), "hain4j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HUB30X5.getName(), "hub30x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HDDF6J1.getName(), "hddf6j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HD15X5.getName(), "hd15x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SHTTCX4.getName(), "shttcx4");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.JS7N.getName(), "js7n");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZJ20X5.getName(), "zj20x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.ZJ6J1.getName(), "zj6j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ36X7.getName(), "hlj36x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJP62.getName(), "hljp62");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ6J1.getName(), "hlj6j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HLJ22X5.getName(), "hlj22x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.LN35X7.getName(), "ln35x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBHY2.getName(), "hebhy2");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBHY3.getName(), "hebhy3");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBPL7.getName(), "hebpl7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEBPL5.getName(), "hebpl5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEB20X5.getName(), "heb20x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HEN22X5.getName(), "hen22x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ25X7.getName(), "xj25x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ18X7.getName(), "xj18x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.XJ35X7.getName(), "xj35x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GXKLSC.getName(), "gxklsc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.AH25X5.getName(), "ah25x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HAIN4J1.getName(), "hain4j1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ22X5.getName(), "fj22x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ31X7.getName(), "fj31x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.FJ36X7.getName(), "fj36x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GD36X7.getName(), "gd36x7");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GDHC1.getName(), "gdhc1");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.GD26X5.getName(), "gd26x5");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.SZFC.getName(), "szfc");
		LOTTERY_KEY_MAP.put(LotteryEnum.Lottery.HUB30X5.getName(), "hub30x5");
	}

	static {
		SX_KEY_MAP.put(1, "鼠");
		SX_KEY_MAP.put(2, "牛");
		SX_KEY_MAP.put(3, "虎");
		SX_KEY_MAP.put(4, "兔");
		SX_KEY_MAP.put(5, "龙");
		SX_KEY_MAP.put(6, "蛇");
		SX_KEY_MAP.put(7, "马");
		SX_KEY_MAP.put(8, "羊");
		SX_KEY_MAP.put(9, "猴");
		SX_KEY_MAP.put(10, "鸡");
		SX_KEY_MAP.put(11, "狗");
		SX_KEY_MAP.put(12, "猪");
	}

	static {
		DIRECTION_KEY_MAP.put(1, "春");
		DIRECTION_KEY_MAP.put(2, "夏");
		DIRECTION_KEY_MAP.put(3, "秋");
		DIRECTION_KEY_MAP.put(4, "冬");
	}

	static {
		SEASON_KEY_MAP.put(1, "东");
		SEASON_KEY_MAP.put(2, "南");
		SEASON_KEY_MAP.put(3, "西");
		SEASON_KEY_MAP.put(4, "北");
	}

	public static String getSxKey(Integer key) {
		return key == null ? null : SX_KEY_MAP.get(key);
	}

	public static String getDirectionKey(Integer key) {
		return key == null ? null : DIRECTION_KEY_MAP.get(key);
	}

	public static String getSeasonKey(Integer key) {
		return key == null ? null : SEASON_KEY_MAP.get(key);
	}

	public static String getLotteryKey(Integer lotteryCode) {
		return lotteryCode == null ? null : LOTTERY_KEY_MAP.get(lotteryCode);
	}

	public static Map<Integer, String> getAllLotteryKey() {
		return LOTTERY_KEY_MAP;
	}

}
