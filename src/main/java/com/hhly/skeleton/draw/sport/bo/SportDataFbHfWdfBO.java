package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

public class SportDataFbHfWdfBO extends SportDataBaseBO {

	private static final long serialVersionUID = 6213953806974696229L;

	/**
	 * 胜胜的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWinWin;

	/**
	 * 胜平的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWinDraw;

	/**
	 * 胜负的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spWinFail;

	/**
	 * 平胜的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spDrawWin;

	/**
	 * 平平的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spDrawDraw;

	/**
	 * 平负的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spDrawFail;

	/**
	 * 负胜的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFailWin;

	/**
	 * 负平的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFailDraw;

	/**
	 * 负负的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spFailFail;

	public Double getSpWinWin() {
		return spWinWin;
	}

	public void setSpWinWin(Double spWinWin) {
		this.spWinWin = spWinWin;
	}

	public Double getSpWinDraw() {
		return spWinDraw;
	}

	public void setSpWinDraw(Double spWinDraw) {
		this.spWinDraw = spWinDraw;
	}

	public Double getSpWinFail() {
		return spWinFail;
	}

	public void setSpWinFail(Double spWinFail) {
		this.spWinFail = spWinFail;
	}

	public Double getSpDrawWin() {
		return spDrawWin;
	}

	public void setSpDrawWin(Double spDrawWin) {
		this.spDrawWin = spDrawWin;
	}

	public Double getSpDrawDraw() {
		return spDrawDraw;
	}

	public void setSpDrawDraw(Double spDrawDraw) {
		this.spDrawDraw = spDrawDraw;
	}

	public Double getSpDrawFail() {
		return spDrawFail;
	}

	public void setSpDrawFail(Double spDrawFail) {
		this.spDrawFail = spDrawFail;
	}

	public Double getSpFailWin() {
		return spFailWin;
	}

	public void setSpFailWin(Double spFailWin) {
		this.spFailWin = spFailWin;
	}

	public Double getSpFailDraw() {
		return spFailDraw;
	}

	public void setSpFailDraw(Double spFailDraw) {
		this.spFailDraw = spFailDraw;
	}

	public Double getSpFailFail() {
		return spFailFail;
	}

	public void setSpFailFail(Double spFailFail) {
		this.spFailFail = spFailFail;
	}

}
