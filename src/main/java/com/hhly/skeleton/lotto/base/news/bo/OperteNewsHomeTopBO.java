package com.hhly.skeleton.lotto.base.news.bo;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueLottBO;
import com.hhly.skeleton.lotto.base.sport.bo.JcMathSPBO;

/**
 * @desc  资讯首页头部接口
 * @author lidecheng
 * @date 2017年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperteNewsHomeTopBO  extends BaseBO{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6585023790805961422L;

	/**
	 * 开奖公告
	 */
	private IssueLottBO drawNotic;
	
	/**
	 * 今日开奖
	 */
	private List<IssueLottBO> drawTaday;
	/**
	 * 竞彩列表
	 */
	private List<JcMathSPBO> jcList;

	public List<JcMathSPBO> getJcList() {
		return jcList;
	}

	public void setJcList(List<JcMathSPBO> jcList) {
		this.jcList = jcList;
	}

	public IssueLottBO getDrawNotic() {
		return drawNotic;
	}

	public void setDrawNotic(IssueLottBO drawNotic) {
		this.drawNotic = drawNotic;
	}

	public List<IssueLottBO> getDrawTaday() {
		return drawTaday;
	}

	public void setDrawTaday(List<IssueLottBO> drawTaday) {
		this.drawTaday = drawTaday;
	}
	
}
