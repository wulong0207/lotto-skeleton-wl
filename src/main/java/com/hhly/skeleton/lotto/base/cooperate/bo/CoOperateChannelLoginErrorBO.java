package com.hhly.skeleton.lotto.base.cooperate.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 渠道登录错误次数
 *
 * @author huangchengfang1219
 * @date 2018年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CoOperateChannelLoginErrorBO extends BaseBO {

	private static final long serialVersionUID = 6293638471971201178L;

	/**
	 * 错误次数
	 */
	private Integer count;

	/**
	 * 缓存时间
	 */
	private Date cacheTime;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Date getCacheTime() {
		return cacheTime;
	}

	public void setCacheTime(Date cacheTime) {
		this.cacheTime = cacheTime;
	}

}
