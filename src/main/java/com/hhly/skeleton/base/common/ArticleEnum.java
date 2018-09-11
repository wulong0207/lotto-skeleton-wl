package com.hhly.skeleton.base.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.hhly.skeleton.base.common.DicEnum.PlatFormEnum;
import com.hhly.skeleton.lotto.base.operate.vo.OperateArticleLottVO;

public class ArticleEnum {
	/**
	 * @desc  文章标题管理
	 * @author lidecheng
	 * @date 2017年3月20日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum AriticleEnum{
		/**
		 * 购彩主页
		 */
		HOME("1",6),
		/**
		 * 网站公告
		 */
		WEBNOTIC("1.1",6),
		/**
		 * 赛事公告
		 */
		MATCHNOTIC("1.2",6),
		/**
		 * 前瞻
		 */
		FORESEE("1.3.1",11),
		/**
		 * 关注
		 */
		FOCUS("1.3.2",11),
		/**
		 * 分析
		 */
		ANALYZE("1.4.1",11),
		/**
		 * 足彩
		 */
		FOOTBALL("1.3.3",11),
		/**
		 * 推荐
		 */
		RECOMMEND("1.4.2",11),
		/**
		 * 媒体
		 */
		MEDIA("1.4.3",11),
		/**
		 * 开奖
		 */
		DRAW("1.4.4",11),
		/**
		 * 高频
		 */
		HIGH("1.4.5",11),
		/**
		 * 竞技彩
		 */
		SPORT("1.3",11),
		/**
		 * 数字彩
		 */
		NUMBER("1.4",11),
		/**
		 * 赛事 
		 */
		MATCH("1.3.4",11),
		
		
		/**
		 * 购彩页资讯
		 */
		DRAWNEWS("1.5",1),
		/**
		 * 资讯公告
		 */
		DRAWNOTIC("1.5.1",1),
		/**
		 * 购彩主页
		 */
		NEWS("2",6),
		/**资讯置顶*/
		NEWSTICK("2.1",10), 
		/**资讯栏目*/
		NEWSZX("2.2",10), 
		/**最新*/
		LASTNEWS("2.3",10), 
		/*** 头条*/
		TOP("2.4",1),
		/**大奖播报*/
		BIGDRAW("2.5",10),
		/**数字彩投注提示*/
		NUMPROMPT("2.6",10), 
		/**竞技彩专栏*/
		SPORTARTI("2.7",10),  
		/**彩票学院*/
		NEWSCOLLEGE("2.8",10), 
		/**竞技彩*/
		NEWSJC("2.9",10), 
		/**数字彩*/
		NEWSNUM("2.11",10),
		/**高频彩*/
		NEWSHIGH("2.10",10),   
		/**彩市趣闻*/
		NEWSANEC("2.12",10), 
		/**视频栏目*/
		VIDEO("2.13",10),  
		/**图片栏目*/
		PICTURE("2.14",10),
		/**竞彩足球*/
		NEWSFOOTBALL("2.9.1",10), 
		/**竞彩篮球*/
		NEWSBASKETBALL("2.9.2",10),  
		/**足彩*/
		NEWSFOOTBALLLOTT("2.9.3",10), 
		/**指数中心*/
		BASKETCENTER("2.9.2.1",10),  
		/**精彩专题*/
		BASKETSPECIAL("2.9.2.2",10),  
		/**大奖播报*/
		BASKETNOTIC("2.9.2.3",10),
		/**竞彩专栏*/
		BASKETARTI("2.9.2.4",10),   
		/**彩票学院*/
		BASKETCOLLEGE("2.9.2.5",10), 
		/**赛事前瞻*/
		FOOTBALLFORE("2.9.1.1",10), 
		/**推荐分析*/
		FOOTBALLANALY("2.9.1.2",10),  
		/**最新资讯*/
		FOOTBALLLAST("2.9.1.3",10), 
		/**竞技彩专栏*/
		FOOTBALLARTI("2.9.1.4",10),
		/**彩票学院*/
		FOOTBALLCOLLEGE("2.9.1.5",10),
		/**七星彩*/
		QXC("2.11.1",10),  
		/**七星彩*/
		SSQ("2.11.2",10),
		/**dlt*/
		DLT("2.11.3",10),
		/**qlc*/
		QLC("2.11.3",10),
		/**HIGH11X5*/		
		HIGH11X5("2.10.1",10),
		/**七星彩-分析预测*/
		QXC_ANALYZE("2.11.1.1"),
		/**七星彩-大奖名单*/
		QXC_PRIZE("2.11.1.2"),
		/**双色球-分析预测*/
		SSQ_ANALYZE("2.11.2.1"),
		/**双色球-大奖名单*/
		SSQ_PRIZE("2.11.2.2"),
		/**大乐透-分析预测*/
		DLT_ANALYZE("2.11.3.1"),
		/**大乐透-大奖名单*/
		DLT_PRIZE("2.11.3.2"),
		/**七乐彩-分析预测*/
		QLC_ANALYZE("2.11.4.1"),
		/**七乐彩-大奖名单*/
		QLC_PRIZE("2.11.4.2"),
		/**福彩3D-分析预测*/
		F3D_ANALYZE("2.11.7.1"),
		/**福彩3D-大奖名单*/
		F3D_PRIZE("2.11.7.2"),
		/**数字排列-分析预测*/
		PL_ANALYZE("2.11.8.1"),
		/**数字排列-大奖名单*/
		PL_PRIZE("2.11.8.2"),
		;  

		
		/**
		 * 标题值
		 */
		private String value;
		
		/**
		 * 查询行数
		 */
		private int rows;
		
		/**
		 * 资讯首页内容
		 */
		public static final  List<OperateArticleLottVO> homeList;
				
		AriticleEnum(String value) {
			this.value = value;
		}

		AriticleEnum(String value, int rows) {
			this(value);
			this.rows = rows;
		}
		public int getRows() {
			return rows;
		}

		public void setRows(int rows) {
			this.rows = rows;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		static{
			homeList = new ArrayList<OperateArticleLottVO>();
			for(AriticleEnum ariEnum :AriticleEnum.values()){
				String value = ariEnum.getValue();
				if(value.equals(WEBNOTIC.getValue())||value.equals(MATCHNOTIC.getValue())||
					(value.length()>2&&
							(value.substring(0, 3).equals(SPORT.getValue())
							||value.substring(0, 3).equals(NUMBER.getValue())
							)
					)
				){
					OperateArticleLottVO vo = new OperateArticleLottVO();
					vo.setRownum(ariEnum.getRows());
					vo.setTypeCode(ariEnum.getValue());
					vo.setPlatform(PlatFormEnum.WEB.getValue());
					homeList.add(vo);
				}
			}
		}
		
		/**
		 * @param value
		 *            类型值
		 * @return true/false
		 * @Desc 是否为首页竞技彩资讯下的菜单内容信息
		 */
		public static boolean isHomeSport(String value) {
            return AriticleEnum.MATCH.name().equals(value)
                    || AriticleEnum.FOOTBALL.name().equals(value)
                    || AriticleEnum.FORESEE.name().equals(value)
                    || AriticleEnum.FOCUS.name().equals(value);
        }
		/**
		 * @param value
		 *            类型值
		 * @return true/false
		 * @Desc 是否为首页数字彩资讯下的菜单内容信息
		 */
		public static boolean isHomeNum(String value) {
            return AriticleEnum.ANALYZE.name().equals(value)
                    || AriticleEnum.RECOMMEND.name().equals(value)
                    || AriticleEnum.MEDIA.name().equals(value)
                    || AriticleEnum.DRAW.name().equals(value)
                    || AriticleEnum.HIGH.name().equals(value);
        }
		
		/**
		 * 检查类型是否存在
		 * @param ariValue
		 * @return
		 */
		public static boolean contain(String ariValue) {
			if (ariValue == null) {
				return false;
			}
			for (AriticleEnum l : AriticleEnum.values()) {
				if (ariValue.equals(l.getValue())) {
					return true;
				}
			}
			return false;
		}
	}
	
	public enum ArticleStatus {
		// 0被驳回;1编辑中;2待审核;3审核通过;4已发布(数据库不保存此状态)
		REJECT(0),
		EDITING(1),
		WAIT_APPROVE(2),
		APPROVE(3);
		//RELEASE(4);
        ArticleStatus(int status) {
			this.status = status;
		}

		private final int status;

		public int getStatus() {
			return status;
		}

		public static boolean isEditable(Integer status) {
			return Objects.equals(status, REJECT.getStatus()) ||
					Objects.equals(status, EDITING.getStatus()) ||
					Objects.equals(status, APPROVE.getStatus());
		}
	}
}
