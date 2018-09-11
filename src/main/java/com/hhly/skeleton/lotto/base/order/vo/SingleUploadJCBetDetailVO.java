package com.hhly.skeleton.lotto.base.order.vo;


import com.hhly.skeleton.base.vo.BaseVO;


/**
 * 
 * @desc 单式上转投注详情(竞彩)
 * @author zhanglei
 * @date 2017年6月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SingleUploadJCBetDetailVO  extends BaseVO {

	private static final long serialVersionUID = 1L;
	/**
	 * 场次编号 如 星期一001 竞技彩专有
	 */
	private String sn;
	
	/**
	 * 标准格式，转换后的投注格式 310 。投注彩果(单个场次) 如:胜平负  -> 310
	 */
	private String lr;
	
	/**
	 * 玩法(目前只有混投上传时需要,区分 胜平负[S]/让胜平负[R])  竞技彩专有
	 */
	private String play;


	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getLr() {
		return lr;
	}

	public void setLr(String lr) {
		this.lr = lr;
	}

	public String getPlay() {
		return play;
	}

	public void setPlay(String play) {
		this.play = play;
	}
}
