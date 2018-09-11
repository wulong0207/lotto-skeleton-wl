package com.hhly.skeleton.draw.sport.bo;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.hhly.skeleton.draw.issue.bo.DrawLotteryIssueBO;

/**
 * @desc 老足彩开奖BO
 * @author huangchengfang1219
 * @date 2017年10月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawSportOldBO extends DrawLotteryIssueBO {

	private static final long serialVersionUID = 4705187524553556573L;

	public DrawSportOldBO() {
		super();
	}

	public DrawSportOldBO(DrawLotteryIssueBO bo) {
		try {
			BeanUtils.copyProperties(bo, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 对阵列表
	 */
	private List<DrawSportOldMatchBO> againsts;

	public List<DrawSportOldMatchBO> getAgainsts() {
		return againsts;
	}

	public void setAgainsts(List<DrawSportOldMatchBO> againsts) {
		this.againsts = againsts;
	}

}
