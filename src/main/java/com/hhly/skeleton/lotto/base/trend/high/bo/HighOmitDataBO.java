/**
 * 
 */
package com.hhly.skeleton.lotto.base.trend.high.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc
 * @author Bruce
 * @date 2017年3月24日
 * @company 益彩网络科技有限公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class HighOmitDataBO extends BaseBO{
	
	/**
	 * 不同子玩法取值不同
	 * 十一选五：1任选;2.万位;3:千位;4:百位;5:前二组选;6:前三组选
	 */
	
	/**
	 * 键值对的形式存储遗漏数据对象
	 * 1:冷热数据;2:当前遗漏;3:最大遗漏;4:上次遗漏
	 */
	private List<HighOmitBaseBO> baseOmit;
	
	/**
	 * 近期遗漏走势,直选时会有万、千、百位
	 * "recentOmit": [
     * {
     *   "subPlay": "1",
     *   "list":[
	 *       {
	 *       "issue": "2015070222",
	 *       "drawCode": "04,11,08,07,05",
	 *       "b01": "3",
	 *       ...
	 *       },
	 *        {
	 *       "issue": "2015070221",
	 *       "drawCode": "04,11,08,07,05",
	 *       "b01": "3",
	 *       ...
	 *       },
     *   ]
     *  
     * },
     * ...
     * ]
	 */
	private List<HighOmitBaseBO> recentOmit;

	
	public HighOmitDataBO(List<HighOmitBaseBO> baseOmit, List<HighOmitBaseBO> recentOmit) {
		super();
		this.baseOmit = baseOmit;
		this.recentOmit = recentOmit;
	}

	public HighOmitDataBO(List<HighOmitBaseBO> baseOmit) {
		this.baseOmit = baseOmit;
	}

	public List<HighOmitBaseBO> getBaseOmit() {
		return baseOmit;
	}

	public void setBaseOmit(List<HighOmitBaseBO> baseOmit) {
		this.baseOmit = baseOmit;
	}

	public List<HighOmitBaseBO> getRecentOmit() {
		return recentOmit;
	}

	public void setRecentOmit(List<HighOmitBaseBO> recentOmit) {
		this.recentOmit = recentOmit;
	}
}
