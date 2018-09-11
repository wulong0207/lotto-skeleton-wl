package com.hhly.skeleton.lotto.base.singleupload.bo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 单式上传结果
 * @author YiJian
 * @date 2017年6月9日 下午2:48:24
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class SingleUploadSuccessResultBO  extends BaseBO {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 成功行号
	 */
	@JsonProperty("sl")
	private Integer successLine;	
	/**
	 * 原始投注内容(单条)
	 */
	@JsonProperty("bc")
	private String bettingContent;
	
	/**
	 * 过关方式
	 */
	@JsonProperty("par")
	private String parlay;
	/**
	 * 倍数
	 */
	@JsonProperty("mul")
	private Integer multiple;	
	
	/**
	 * 解析后投注内容集合
	 */
	@JsonProperty("bet")
	private List<SingleUploadJCBetDetail> betDetails;
	
	/**
	 * 统计除开 井号占位符投注场次数
	 */
	@JsonProperty("ct")
	private Integer count;
	
	public SingleUploadSuccessResultBO(String bettingContent, String parlay, Integer multiple) {
		super();
		this.bettingContent = bettingContent;
		this.parlay = parlay;
		this.multiple = multiple;
	}
	
	public SingleUploadSuccessResultBO(String bettingContent, String parlay, Integer multiple, Integer count) {
		super();
		this.bettingContent = bettingContent;
		this.parlay = parlay;
		this.multiple = multiple;
		this.count = count;
	}

	public SingleUploadSuccessResultBO(Integer successLine, String bettingContent, String parlay, Integer multiple, Integer count) {
		super();
		this.successLine = successLine;
		this.bettingContent = bettingContent;
		this.parlay = parlay;
		this.multiple = multiple;
		this.count = count;
	}
	
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<SingleUploadJCBetDetail> getBetDetails() {
		return betDetails;
	}

	public void setBetDetails(List<SingleUploadJCBetDetail> betDetails) {
		this.betDetails = betDetails;
	}

	public Integer getSuccessLine() {
		return successLine;
	}

	public void setSuccessLine(Integer successLine) {
		this.successLine = successLine;
	}

	public String getBettingContent() {
		return bettingContent;
	}

	public void setBettingContent(String bettingContent) {
		this.bettingContent = bettingContent;
	}

	public String getParlay() {
		return parlay;
	}

	public void setParlay(String parlay) {
		this.parlay = parlay;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	
}
