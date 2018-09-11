package com.hhly.skeleton.lotto.base.recommend.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/8/15 15:27
 * @company 益彩网络科技公司
 */
public class RcmdSingleVO extends PageVO {

    private String token;

    /**
     * 1.我的推单 2.已付费
     */
    private Integer queryType;

    /**
     * 1.进行中 2.已完场
     */
    private Integer status;


    private Integer userId;

    /**
     * 1:单关,2：2串1
     */
    private Integer type;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
