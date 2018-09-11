package com.hhly.skeleton.lotto.base.sport.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @version 1.0
 * @auth lgs on
 * @date 2017/2/26.
 * @desc
 * @compay 益彩网络科技有限公司
 */
public class MatchDataBO extends BaseBO {

    private static final long serialVersionUID = 4021884593050817209L;
    /**
     * 赛事id
     */
    private Integer id;

    /**
     * 赛事名称
     */
    private String matchName;

    /**
     * 是否热门 0,不是 1,是
     */
    private Integer hot;

    /**
     * 是否有单h关 0,不是 1,是
     */
    private Integer single;

    /**
     * 是否是5大联赛 0,不是 1,是
     */
    private Integer fiveLeague;

    /**
     * 赛事一共有多少场比赛
     */
    private Integer total;

    /**
     * 比赛类型
     * 1：足球赛事；2：篮球赛事；3：网球；4：橄榄球；5：排球；6：羽毛球；7：乒乓球；8：沙滩排球；9：冰球；10：曲棍球；11：手球；12：水球
     */
    private Integer matchType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getSingle() {
        return single;
    }

    public void setSingle(Integer single) {
        this.single = single;
    }

    public Integer getFiveLeague() {
        return fiveLeague;
    }

    public void setFiveLeague(Integer fiveLeague) {
        this.fiveLeague = fiveLeague;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    public Integer getMatchType() {
        return matchType;
    }

    public void setMatchType(Integer matchType) {
        this.matchType = matchType;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("matchName", matchName)
                .append("hot", hot)
                .append("single", single)
                .append("fiveLeague", fiveLeague)
                .append("total", total)
                .append("matchType", matchType)
                .toString();
    }
}
