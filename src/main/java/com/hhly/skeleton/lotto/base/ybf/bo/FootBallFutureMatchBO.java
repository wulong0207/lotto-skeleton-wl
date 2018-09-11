package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2017/11/9.
 * @company 益彩网络科技有限公司
 */
public class FootBallFutureMatchBO extends BaseBO {
    private static final long serialVersionUID = 1L;

    private String date;
    private List<MatchAns> list;

    /**
     * 更多url
     */
    private String moreUrl = "http://m.13322.com/live/bifen/index.html?id={matchId}#/";

    public String getMoreUrl() {
        return moreUrl;
    }

    public void setMoreUrl(String moreUrl) {
        this.moreUrl = moreUrl;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<MatchAns> getList() {
        return list;
    }

    public void setList(List<MatchAns> list) {
        this.list = list;
    }
}
