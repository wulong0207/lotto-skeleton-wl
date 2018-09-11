package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 第三方接入参数实体类
 * @date 2017/12/7
 * @company 益彩网络科技公司
 */
public class OauthVO extends BaseVO {

    /**
     * 第三方对接code
     */
    private String code;
    
    /**
     * 第三方appid
     */
    private String appId;
    
    /**
     * 第三方秘钥
     */
    private String secret; 

    /**
     * 唯一标识
     */
    private String accessToken;
    

    /**
     * 请求类型，1：快速登录，2，第三方注册
     */
    private Short reqType;
    
    /**
     * 代理编码
     */
    private String agentCode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Short getReqType() {
        return reqType;
    }

    public void setReqType(Short reqType) {
        this.reqType = reqType;
    }

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
    
}
