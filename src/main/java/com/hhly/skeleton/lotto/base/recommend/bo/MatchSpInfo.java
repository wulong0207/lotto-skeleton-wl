package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @Description 对阵让球、赔率信息
 * @Author longguoyou
 * @Date  2018/8/14 11:18
 * @Since 1.8
 */

public class MatchSpInfo extends BaseBO{
    /**
     * 让球数
     */
    private String info;
    /**
     * 赔率信息
      */
    List<SpInfoBO> listSpInfoBO;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<SpInfoBO> getListSpInfoBO() {
        return listSpInfoBO;
    }

    public void setListSpInfoBO(List<SpInfoBO> listSpInfoBO) {
        this.listSpInfoBO = listSpInfoBO;
    }
}
