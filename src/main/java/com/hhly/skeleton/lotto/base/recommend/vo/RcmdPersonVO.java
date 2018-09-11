package com.hhly.skeleton.lotto.base.recommend.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/8/11 10:30
 * @company 益彩网络科技公司
 */
public class RcmdPersonVO extends BaseVO {

    /**
     * 入口 1：我的推荐（必须登录）2：推荐列表传userId
     */
    private Integer seeType;

    /**
     *
     * 必传
     */
    private Integer userId;

    /**
     * 登录需要传
     */
    private String token;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getSeeType() {
        return seeType;
    }

    public void setSeeType(Integer seeType) {
        this.seeType = seeType;
    }
}
