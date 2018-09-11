package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Map;

/**
 * @author lgs on
 * @version 1.0
 * @desc
 * @date 2018/4/10.
 * @company 益彩网络科技有限公司
 */
public class FootBallMatchCount extends BaseBO {

    private static final long serialVersionUID = 1L;

    /**
     * 近期交战
     */
    private FootBallWarCountBO war;

    /**
     * 主队战绩
     */
    private Map<String, Integer> home;

    /**
     * 客队战绩
     */
    private Map<String, Integer> guest;

    public FootBallWarCountBO getWar() {
        return war;
    }

    public void setWar(FootBallWarCountBO war) {
        this.war = war;
    }

    public Map<String, Integer> getHome() {
        return home;
    }

    public void setHome(Map<String, Integer> home) {
        this.home = home;
    }

    public Map<String, Integer> getGuest() {
        return guest;
    }

    public void setGuest(Map<String, Integer> guest) {
        this.guest = guest;
    }
}
