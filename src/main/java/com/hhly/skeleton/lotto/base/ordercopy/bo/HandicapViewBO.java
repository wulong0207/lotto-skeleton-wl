package com.hhly.skeleton.lotto.base.ordercopy.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * 请求竞彩篮球盘口变化返回BO
 * @author longguoyou
 * @date 2018年01月05日
 * @compay 益彩网络科技有限公司
 * @since jdk 1.8
 */
public class HandicapViewBO extends BaseBO {
    private static final long serialVersionUID = 1L;
    /**
     * 盘口变化控制1：显示:0：隐藏
     */
    private Integer viewType;
    /**
     * 盘口变化数据集合
     */
    private List<HandicapBO> listHandicapBO;

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public List<HandicapBO> getListHandicapBO() {
        return listHandicapBO;
    }

    public void setListHandicapBO(List<HandicapBO> listHandicapBO) {
        this.listHandicapBO = listHandicapBO;
    }
}
