package com.hhly.skeleton.base.bo;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-8 上午10:38:43
 * @Desc 字典BO
 */
@SuppressWarnings("serial")
public class DictionaryBO extends BaseBO {
	//值
    private String id;
    //描述
    private String text;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public DictionaryBO() {
		super();
	}

	public DictionaryBO(String id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
    
    
}
