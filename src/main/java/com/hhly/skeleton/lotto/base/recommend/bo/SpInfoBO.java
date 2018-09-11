package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @Description SP值、是否命中标红
 * @Author longguoyou
 * @Date  2018/8/14 11:21
 * @Since 1.8
 */

public class SpInfoBO extends BaseBO {
    /**
     * sp值
     */
    private Float sp;
    /**
     * 是推荐
     */
    private Integer flag;

    public Float getSp() {
        return sp;
    }

    public void setSp(Float sp) {
        this.sp = sp;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
