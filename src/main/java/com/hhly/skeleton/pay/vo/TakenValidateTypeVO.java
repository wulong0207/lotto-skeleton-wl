package com.hhly.skeleton.pay.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.PayConstants.TakenValidateTypeEnum;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 银行卡验证方式
 * @author xiongJinGang
 * @date 2017年4月18日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TakenValidateTypeVO extends BaseBO {
	private static final long serialVersionUID = 1862003978034334321L;
	private String name;// 验证名称
	private Short type;// 验证类型，参考TakenValidateTypeEnum
	private String code;// 隐藏中间的编码
	@JsonIgnore
	private String fullCode;// 明文显示
	@JsonIgnore
	private String validateStr;// 验证字符串
	@JsonIgnore
	private String realName;// 实名
	@JsonIgnore
	private String bankName;// 银行名称
	@JsonIgnore
	private String token;// 登录token

	public TakenValidateTypeVO() {
		super();
	}

	public TakenValidateTypeVO(TakenValidateTypeEnum takenValidateTypeEnum, String code) {
		super();
		this.name = takenValidateTypeEnum.getValue();
		this.type = takenValidateTypeEnum.getKey();
		this.code = StringUtil.hideString(code, takenValidateTypeEnum.getKey());
		this.fullCode = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullCode() {
		return fullCode;
	}

	public void setFullCode(String fullCode) {
		this.fullCode = fullCode;
	}

	public String getValidateStr() {
		return validateStr;
	}

	public void setValidateStr(String validateStr) {
		this.validateStr = validateStr;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "TakenValidateTypeVO [name=" + name + ", type=" + type + ", code=" + code + ", fullCode=" + fullCode + ", validateStr=" + validateStr + ", realName=" + realName + ", bankName=" + bankName + ", token="
				+ token + "]";
	}

}
