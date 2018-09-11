package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.common.SportEnum;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

/**
 * @desc 胜负过关
 * @author huangchengfang1219
 * @date 2017年9月23日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportWfBO extends SportBaseBO {

	private static final long serialVersionUID = 5268382541903551262L;

	/**
	 * 赛事类型
	 */
	private Short matchType;

	/**
	 * 让球胜平负，0：负；1：平；3：胜
	 */
	private Short letWdf;

	/**
	 * 让球胜平负SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spLetWdf;

	public Short getMatchType() {
		return matchType;
	}

	public void setMatchType(Short matchType) {
		this.matchType = matchType;
	}

	public String getMatchTypeText() {
		if (matchType != null) {
			for (SportEnum.MatchTypeEnum matchTypeEnum : SportEnum.MatchTypeEnum.values()) {
				if (matchTypeEnum.getCode() == matchType.intValue()) {
					return matchTypeEnum.getName();
				}
			}
		}
		return null;
	}

	public Short getLetWdf() {
		return letWdf;
	}

	public void setLetWdf(Short letWdf) {
		this.letWdf = letWdf;
	}

	public String getLetWdfText() {
		return SportEnum.SportWDFEnum.getWfName(letWdf);
	}

	public Double getSpLetWdf() {
		return spLetWdf;
	}

	public void setSpLetWdf(Double spLetWdf) {
		this.spLetWdf = spLetWdf;
	}

}
