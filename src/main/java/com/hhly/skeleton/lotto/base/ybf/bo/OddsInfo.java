package com.hhly.skeleton.lotto.base.ybf.bo;

import com.hhly.skeleton.base.bo.BaseBO;

public class OddsInfo extends BaseBO {
    private static final long serialVersionUID = 1L;

    private Integer scheduleId;//赛事ID
    private Integer sclassId;//联赛ID
    private String sclassName;//联赛名称
    private String matchTime;//比赛时间
    private Integer homeScore;//主队比分
    private Integer guestScore;//客队比分
    private Integer homeTeamId;//主队ID
    private Integer guestTeamId;//客队ID
    private String homeName;//主队名称
    private String guestName;//客队名称
    private String homeOrder;//主队排名
    private String guestOrder;//客队排名
    private Double euHomeWin;//欧指-终盘-主胜
    private Double euDraw;//欧指-终盘-走
    private Double euGuestWin;//欧指-终盘-客胜
    private Double ceuHomeWin;//欧指-初盘-主胜
    private Double ceuDraw;//欧指-初盘-走
    private Double ceuGuestWin;//欧指-初盘-客胜
    private Double asUpOdds;//让球-终盘-上水
    private Double asLetGoal;//让球-终盘-盘口，纯数字-需要转换
    private Double asDownOdds;//让球-终盘-下水
    private Double asOddsTot;
    private Double casUpOdds;//让球-初盘-上水
    private Double casLetGoal;//让球-初盘-盘口，纯数字-需要转换
    private Double casDownOdds;//让球-初盘-下水
    private Double casOddsTot;
    private Double over;//大小球-终盘-大
    private Double under;//大小球-终盘-小
    private Double totScore;//大小球-终盘-盘口，纯数字-需要转换
    private String formatTotScore;//把数据转换成对应的盘口，对应大小球-终盘-盘口，前端采用该字段
    private String formatLetGoal;//把数据转换成对应的盘口，对应让球-终盘-盘口，前端采用该字段
    private String formatCTotScore;//把数据转换成对应的盘口，对应大小球-初盘-盘口，前端采用该字段
    private String formatCLetGoal;//把数据转换成对应的盘口，对应让球-初盘-盘口，前端采用该字段
    private Double cover;//大小球-初盘-大
    private Double cunder;//大小球-初盘-小
    private Double ctotScore;//大小球-初盘-盘口，纯数字-需要转换
    private Integer companyId;//公司id
    private Integer matchResult;//比赛结果，0胜，1平，2负
    private Integer letGoalResult;//让球-终盘-结果，0赢盘，1走盘，2输盘
    private Integer totScoreResult;//大小球-终盘-结果，0大，1走，2小
    private Integer cLetGoalResult;//让球-初盘-结果，0赢盘，1走盘，2输盘
    private Integer cTotScoreResult;//大小球-初盘-结果，0大，1走，2小
    private String sColor;//联赛颜色
    private Integer matchState;//比赛状态
    private String matchSeason;//赛季
    private Integer homeHalfScore;//主队半场比分
    private Integer guestHalfScore;//客队半场比分

    public Integer getHomeHalfScore() {
        return homeHalfScore;
    }

    public void setHomeHalfScore(Integer homeHalfScore) {
        this.homeHalfScore = homeHalfScore;
    }

    public Integer getGuestHalfScore() {
        return guestHalfScore;
    }

    public void setGuestHalfScore(Integer guestHalfScore) {
        this.guestHalfScore = guestHalfScore;
    }

    public Integer getMatchState() {
        return matchState;
    }

    public void setMatchState(Integer matchState) {
        this.matchState = matchState;
    }

    public String getsColor() {
        return sColor;
    }

    public void setsColor(String sColor) {
        this.sColor = sColor;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getSclassId() {
        return sclassId;
    }

    public void setSclassId(Integer sclassId) {
        this.sclassId = sclassId;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public String getGuestOrder() {
        return guestOrder;
    }

    public void setGuestOrder(String guestOrder) {
        this.guestOrder = guestOrder;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(Integer guestTeamId) {
        this.guestTeamId = guestTeamId;
    }

    public String getHomeOrder() {
        return homeOrder;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setHomeOrder(String homeOrder) {
        this.homeOrder = homeOrder;
    }

    public Double getEuHomeWin() {
        return euHomeWin;
    }

    public void setEuHomeWin(Double euHomeWin) {
        this.euHomeWin = euHomeWin;
    }

    public Double getEuDraw() {
        return euDraw;
    }

    public void setEuDraw(Double euDraw) {
        this.euDraw = euDraw;
    }

    public Double getEuGuestWin() {
        return euGuestWin;
    }

    public void setEuGuestWin(Double euGuestWin) {
        this.euGuestWin = euGuestWin;
    }

    public Double getCeuHomeWin() {
        return ceuHomeWin;
    }

    public String getSclassName() {
        return sclassName;
    }

    public void setSclassName(String sclassName) {
        this.sclassName = sclassName;
    }

    public void setCeuHomeWin(Double ceuHomeWin) {
        this.ceuHomeWin = ceuHomeWin;
    }

    public Double getCeuDraw() {
        return ceuDraw;
    }

    public void setCeuDraw(Double ceuDraw) {
        this.ceuDraw = ceuDraw;
    }

    public Double getCeuGuestWin() {
        return ceuGuestWin;
    }

    public void setCeuGuestWin(Double ceuGuestWin) {
        this.ceuGuestWin = ceuGuestWin;
    }

    public Double getAsUpOdds() {
        return asUpOdds;
    }

    public void setAsUpOdds(Double asUpOdds) {
        this.asUpOdds = asUpOdds;
    }

    public Double getAsLetGoal() {
        return asLetGoal;
    }

    public void setAsLetGoal(Double asLetGoal) {
        this.asLetGoal = asLetGoal;
    }

    public Double getAsDownOdds() {
        return asDownOdds;
    }

    public void setAsDownOdds(Double asDownOdds) {
        this.asDownOdds = asDownOdds;
    }

    public Double getAsOddsTot() {
        return asOddsTot;
    }

    public void setAsOddsTot(Double asOddsTot) {
        this.asOddsTot = asOddsTot;
    }

    public Double getCasUpOdds() {
        return casUpOdds;
    }

    public void setCasUpOdds(Double casUpOdds) {
        this.casUpOdds = casUpOdds;
    }

    public Double getCasLetGoal() {
        return casLetGoal;
    }

    public void setCasLetGoal(Double casLetGoal) {
        this.casLetGoal = casLetGoal;
    }

    public Double getCasDownOdds() {
        return casDownOdds;
    }

    public void setCasDownOdds(Double casDownOdds) {
        this.casDownOdds = casDownOdds;
    }

    public Double getCasOddsTot() {
        return casOddsTot;
    }

    public void setCasOddsTot(Double casOddsTot) {
        this.casOddsTot = casOddsTot;
    }

    public Double getOver() {
        return over;
    }

    public void setOver(Double over) {
        this.over = over;
    }

    public Double getUnder() {
        return under;
    }

    public void setUnder(Double under) {
        this.under = under;
    }

    public Double getTotScore() {
        return totScore;
    }

    public void setTotScore(Double totScore) {
        this.totScore = totScore;
    }

    public Double getCover() {
        return cover;
    }

    public void setCover(Double cover) {
        this.cover = cover;
    }

    public Double getCunder() {
        return cunder;
    }

    public void setCunder(Double cunder) {
        this.cunder = cunder;
    }

    public Double getCtotScore() {
        return ctotScore;
    }

    public void setCtotScore(Double ctotScore) {
        this.ctotScore = ctotScore;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(Integer matchResult) {
        this.matchResult = matchResult;
    }

    public Integer getLetGoalResult() {
        return letGoalResult;
    }

    public void setLetGoalResult(Integer letGoalResult) {
        this.letGoalResult = letGoalResult;
    }

    public Integer getTotScoreResult() {
        return totScoreResult;
    }

    public void setTotScoreResult(Integer totScoreResult) {
        this.totScoreResult = totScoreResult;
    }

    public Integer getcLetGoalResult() {
        return cLetGoalResult;
    }

    public void setcLetGoalResult(Integer cLetGoalResult) {
        this.cLetGoalResult = cLetGoalResult;
    }

    public Integer getcTotScoreResult() {
        return cTotScoreResult;
    }

    public void setcTotScoreResult(Integer cTotScoreResult) {
        this.cTotScoreResult = cTotScoreResult;
    }

    public String getFormatTotScore() {
        return formatTotScore;
    }

    public void setFormatTotScore(String formatTotScore) {
        this.formatTotScore = formatTotScore;
    }

    public String getFormatLetGoal() {
        return formatLetGoal;
    }

    public void setFormatLetGoal(String formatLetGoal) {
        this.formatLetGoal = formatLetGoal;
    }

    public String getFormatCTotScore() {
        return formatCTotScore;
    }

    public void setFormatCTotScore(String formatCTotScore) {
        this.formatCTotScore = formatCTotScore;
    }

    public String getFormatCLetGoal() {
        return formatCLetGoal;
    }

    public void setFormatCLetGoal(String formatCLetGoal) {
        this.formatCLetGoal = formatCLetGoal;
    }

    public void setMatchSeason(String matchSeason) {
        this.matchSeason = matchSeason;
    }

    public String getMatchSeason() {
        return matchSeason;
    }


}
