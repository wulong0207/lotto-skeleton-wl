package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 第三方获取的用户信息内容
 * @date 2017/5/9
 * @company 益彩网络科技公司
 */
public class TPInfoVO extends BaseVO {
	
	/**
	 * 账户名
	 */
	private String accountName;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * openId
     */
    private String openid;
    
    /**
     * 登录类型
     */
    private Short type;

    /**
     * 性别  1：男，2：女
     */
    private Short sex;

    /**
     * 语言
     */
    private String language;

    /**
     * 城市
     */
    private String city;

    /**
     * 省份
     */
    private String province;

    /**
     * 国家
     */
    private String country;

    /**
     * 头像url
     */
    private String headimgurl;

    /**
     * unionid
     */
    private String unionid;

    /**
     * qq - 性别
     */
    private String gender;

    /**
     * 头像
     */
    private String figureurl;

    /**
     * 头像1
     */
    private String figureurl_1;

    /**
     * 头像2
     */
    private String figureurl_2;

    /**
     * qq - 头像1
     */
    private String figureurl_qq_1;

    /**
     * qq - 头像2
     */
    private String figureurl_qq_2;

    /**
     * 用户唯一标识
     */
    private String token;

    /**
     * 注册平台 1.web, 2.wap, 3.android, 4.ios
     */
    private Short platform;

    /**
     * 渠道ID
     */
    private String channelId;

    /**
     * 请求类型
     * @return
     */
    private Short reqType;
    
	/**
	 * 代理系统编码
	 */
	private String agentCode;
	
	/**
	 * 手机号
	 */
	private String mobile;

    /**
     * 请求ip地址
     */
	private String ip;
	
	/**
	 * 排序取值; 0:不减一,1:减一
	 */
	private Short orderNum;

    public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFigureurl() {
        return figureurl;
    }

    public void setFigureurl(String figureurl) {
        this.figureurl = figureurl;
    }

    public String getFigureurl_1() {
        return figureurl_1;
    }

    public void setFigureurl_1(String figureurl_1) {
        this.figureurl_1 = figureurl_1;
    }

    public String getFigureurl_2() {
        return figureurl_2;
    }

    public void setFigureurl_2(String figureurl_2) {
        this.figureurl_2 = figureurl_2;
    }

    public String getFigureurl_qq_1() {
        return figureurl_qq_1;
    }

    public void setFigureurl_qq_1(String figureurl_qq_1) {
        this.figureurl_qq_1 = figureurl_qq_1;
    }

    public String getFigureurl_qq_2() {
        return figureurl_qq_2;
    }

    public void setFigureurl_qq_2(String figureurl_qq_2) {
        this.figureurl_qq_2 = figureurl_qq_2;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

	public Short getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Short orderNum) {
		this.orderNum = orderNum;
	}
}
