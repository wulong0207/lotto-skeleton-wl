package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 活动模块用户传参vo
 * @date 2017/8/10
 * @company 益彩网络科技公司
 */
public class UserActivityVO extends BaseVO{

    /**
     * 查询类型
     * 1:手机号，2：身份证号码，3：真实姓名
     */
    private Short type;

    /**
     * 查询字段
     */
    private String queryField;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getQueryField() {
        return queryField;
    }

    public void setQueryField(String queryField) {
        this.queryField = queryField;
    }

}
