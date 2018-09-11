package com.hhly.skeleton.lotto.base.operate.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * 帮助文章
 *
 * @author huangchengfang1219
 * @date 2017年11月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpBO extends BaseBO {

	private static final long serialVersionUID = 7776157891508386916L;

	/**
	 * 帮助ID
	 */
	private Integer id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 标签
	 */
	private String label;

	/**
	 * 摘要
	 */
	private String summary;

	/**
	 * 所属栏目编码
	 */
	private String typeCode;

	/**
	 * 所属栏目名称
	 */
	private String typeName;

	/**
	 * 文章内容
	 */
	private String content;

	/**
	 * 语音URL
	 */
	private String audio;

	/**
	 * 满意度百分比
	 */
	private Integer ablePercent;

	/**
	 * 是否包含语音
	 */
	private Integer containsAudio;

	/**
	 * 下一篇
	 */
	private OperateHelpBO nextHelp;

	/**
	 * 上一篇
	 */
	private OperateHelpBO prevHelp;

	/**
	 * 父类编码，格式：1|帮助中心,1.1|新手问题
	 */
	private String typeAll;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		if (!ObjectUtil.isBlank(audio)) {
			this.audio = audio;
		}
	}

	public Integer getAblePercent() {
		return ablePercent;
	}

	public void setAblePercent(Integer ablePercent) {
		this.ablePercent = ablePercent;
	}

	public Integer getContainsAudio() {
		return containsAudio;
	}

	public void setContainsAudio(Integer containsAudio) {
		this.containsAudio = containsAudio;
	}

	public OperateHelpBO getNextHelp() {
		return nextHelp;
	}

	public void setNextHelp(OperateHelpBO nextHelp) {
		this.nextHelp = nextHelp;
	}

	public OperateHelpBO getPrevHelp() {
		return prevHelp;
	}

	public void setPrevHelp(OperateHelpBO prevHelp) {
		this.prevHelp = prevHelp;
	}

	public String getTypeAll() {
		return typeAll;
	}

	public void setTypeAll(String typeAll) {
		this.typeAll = typeAll;
	}

}
