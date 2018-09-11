package com.hhly.skeleton.lotto.base.recommend.bo;


import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @Description
 * @Author longguoyou
 * @Date 2018/8/18 9:17
 * @Since 1.8
 */

public class RcmdAttentionPagingBO extends BaseBO {

    private Integer total;

    private List<RcmdAttentionBO> listRcmdUserBO;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<RcmdAttentionBO> getListRcmdUserBO() {
        return listRcmdUserBO;
    }

    public void setListRcmdUserBO(List<RcmdAttentionBO> listRcmdUserBO) {
        this.listRcmdUserBO = listRcmdUserBO;
    }
}
