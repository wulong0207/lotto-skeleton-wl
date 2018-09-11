package com.hhly.skeleton.lotto.base.sport.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.List;

/**
 * 
 * @author yuanshangbing
 * 
 * @date 2017年2月16日 下午3:53:20
 * 
 * @desc 提交方案，页面传递投注json对象对应实体
 *
 */
public class JCLQBuySelectVO  extends BaseVO {
	private static final long serialVersionUID = 899662773244326198L;
	/**
	 * 彩期
	 */
	private String issueNo;
	/**
	 * 比赛编号
	 */
	private String gameNo;
	/**
	 * 主队名全称
	 */
	private String homeTeamName;
	/**
	 * 客队名全称
	 */
	private String awayTeamName;
	/**
	 * 主队排名
	 */
	private String homeRank;
	/**
	 * 客队排名
	 */
	private String awayRank;
	/**
	 * 过关方式
	 */
	private String way;
	/**
	 * 赔率
	 */
	private double sp;
	/**
	 * 让球数
	 */
	private String handicap;
	/**
	 * 是否设胆
	 */
	private boolean seleted;
	/**
	 * 系统编号
	 */
	private String systemNo;
	/**
	 * 购买投注赔率对象集合
	 */
	private List<BuySpVO> listBuySp;

	/**
	 *
	 */
	private List<JCLQBuySelectVO> listMaxSp;
	/**
	 *
	 */
	private List<JCLQBuySelectVO> listMinSp;
	/**
	 *
	 */
	private List<JCLQBuySelectVO> listRelationSp;

	public JCLQBuySelectVO(){}
	/**
	 * 此构造方法用于listRelationSp new 对象调用
	 * @param _issueNo
	 * @param _gameNo
	 * @param _sp
	 */
	public JCLQBuySelectVO(String _issueNo, String _gameNo, double _sp){
		this.issueNo = _issueNo;
		this.gameNo  = _gameNo;
		this.sp      = _sp;
	}
	/**
	 * 此构造方法用于listMaxSp和listMinSp new 对象调用
	 * @param _issueNo
	 * @param _gameNo
	 * @param _sp
	 * @param _listBuySp
	 * @param _way
	 */
	public JCLQBuySelectVO(String _issueNo, String _gameNo, double _sp, List<BuySpVO> _listBuySp, String _way){
		this.issueNo = _issueNo;
		this.gameNo  = _gameNo;
		this.sp      = _sp;
		this.listBuySp = _listBuySp;
		this.way = _way;
	}
	/**
	 *
	 * @param _issueNo
	 * @param _gameNo
	 * @param _listBuySp
	 * @param _homeTeamName
	 * @param _awayTeamName
	 * @param _handicap
	 * @param _way
	 */
	public JCLQBuySelectVO(String _issueNo, String _gameNo, List<BuySpVO> _listBuySp, String _homeTeamName, String _awayTeamName, String _handicap, String _way){
		this.issueNo = _issueNo;
		this.gameNo  = _gameNo;
		this.listBuySp = _listBuySp;
		this.homeTeamName = _homeTeamName;
		this.awayTeamName = _awayTeamName;
		this.handicap = _handicap;
		this.way = _way;
	}
	
	public String getIssueNo() {
		return issueNo;
	}
	public void setIssueNo(String issueNo) {
		this.issueNo = issueNo;
	}
	public String getGameNo() {
		return gameNo;
	}
	public void setGameNo(String gameNo) {
		this.gameNo = gameNo;
	}
	public String getHomeTeamName() {
		return homeTeamName;
	}
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}
	public String getAwayTeamName() {
		return awayTeamName;
	}
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	public String getHomeRank() {
		return homeRank;
	}
	public void setHomeRank(String homeRank) {
		this.homeRank = homeRank;
	}
	public String getAwayRank() {
		return awayRank;
	}
	public void setAwayRank(String awayRank) {
		this.awayRank = awayRank;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public double getSp() {
		return sp;
	}
	public void setSp(double sp) {
		this.sp = sp;
	}
	public String getHandicap() {
		return handicap;
	}
	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}
	public boolean isSeleted() {
		return seleted;
	}
	public void setSeleted(boolean seleted) {
		this.seleted = seleted;
	}
	public String getSystemNo() {
		return systemNo;
	}
	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}
	public List<BuySpVO> getListBuySp() {
		return listBuySp;
	}
	public void setListBuySp(List<BuySpVO> listBuySp) {
		this.listBuySp = listBuySp;
	}
	public List<JCLQBuySelectVO> getListMaxSp() {
		return listMaxSp;
	}
	public void setListMaxSp(List<JCLQBuySelectVO> listMaxSp) {
		this.listMaxSp = listMaxSp;
	}
	public List<JCLQBuySelectVO> getListMinSp() {
		return listMinSp;
	}
	public void setListMinSp(List<JCLQBuySelectVO> listMinSp) {
		this.listMinSp = listMinSp;
	}
	public List<JCLQBuySelectVO> getListRelationSp() {
		return listRelationSp;
	}
	public void setListRelationSp(List<JCLQBuySelectVO> listRelationSp) {
		this.listRelationSp = listRelationSp;
	}
}
