package com.hhly.skeleton.base.util;

import java.util.List;
import java.util.Map;

import com.hhly.skeleton.lotto.base.sport.vo.JCLQBuySelectVO;
import com.hhly.skeleton.lotto.base.sport.vo.JczqBuySelectVO;

/**
 * 
 * @author longguoyou
 * 
 * @date 2017年2月9日 上午11:17:50
 * 
 * @desc 彩票相关计算
 *
 */
public class CalculatorUtil {
	
	/**
	 * 
	 * @author longguoyou
	 * 
	 * @date 2017年2月9日 上午11:23:27
	 * 
	 * @desc 阶乘
	 *
	 * @param num 
	 * @return
	 */
	public static int factorial(int num) {
		return (num > 1) ? num * factorial(num - 1) : 1;
	}
	/**
	 * 
	 * @author longguoyou
	
	 * @date 2017年2月9日 上午11:27:10
	
	 * @desc 计算组合数
	 *
	 * @param total 总个数
	 * @param get   取个数
	 * @return
	 */
	public static int combination(int total , int  get){
		if(total < get){return 0;}
		return (total > get) ? factorial(total) / (factorial(total - get) * factorial(get)) : 1;
	}
	
	/**
	 * 计算投注金额
	 * @author longguoyou
	 * @date 2017年3月15日
	 * @param betNum   注数
	 * @param multiple 倍数
	 * @param singleAmount 单注金额
	 * @return 总金额
	 */
	public static double calculateAmount(int betNum, int multiple, double singleAmount){
		return MathUtil.mul((betNum * multiple), singleAmount); 
	}
	
	/**
	 * 奖金优化和非奖金优化金额计算
	 * @author longguoyou
	 * @date 2017年5月31日
	 * @param betNum
	 * @param multiple
	 * @param singleAmount
	 * @param flag  是否奖金优化
	 * @return
	 */
	public static double calculateAmount(int betNum, int multiple, double singleAmount, boolean flag){
		if(!flag){
			return calculateAmount(betNum, 1, singleAmount);
		}else{
			return calculateAmount(betNum, multiple, singleAmount);
		}
	}
	
	/**
	 * 
	 * @author longguoyou
	
	 * @date 2017年2月9日 上午11:34:13
	
	 * @desc 计算单一过关组合注数
	 *
	 * @param list 投注列表
	 * @param len  投注列表size
	 * @param flag 是否混合
	 * @return
	 */
	public static int combinationZS(List<JczqBuySelectVO> list , int len, boolean flag){
		if(flag){
			return (len >= 1) ? (list.get(len - 1).getListRelationSp().size() * combinationZS(list, len - 1, flag)) : 1;
		}
		return (len >= 1) ? (list.get(len - 1).getListBuySp().size() * combinationZS(list, len - 1, flag)) : 1;
	}

	/**
	 *
	 * @author yuanshangbing

	 * @date 2017年2月9日 上午11:34:13

	 * @desc 计算单一过关组合注数
	 *
	 * @param list 投注列表
	 * @param len  投注列表size
	 * @param flag 是否混合
	 * @return
	 */
	public static int combinationLQZS(List<JCLQBuySelectVO> list, int len, boolean flag){
		if(flag){
			return (len >= 1) ? (list.get(len - 1).getListRelationSp().size() * combinationLQZS(list, len - 1, flag)) : 1;
		}
		return (len >= 1) ? (list.get(len - 1).getListBuySp().size() * combinationLQZS(list, len - 1, flag)) : 1;
	}

	/**
	 * 
	 * @author longguoyou
	
	 * @date 2017年2月9日 上午11:50:16
	
	 * @desc 计算混合过关注数
	 *
	 * @param map 组合后的投注列表
	 * @return
	 */
	public static int combinationMixZS(Map<String,List<JczqBuySelectVO>> map){
		int total = 0;
		for(Map.Entry<String, List<JczqBuySelectVO>> entry : map.entrySet()){
			int zs = 1;
			List<JczqBuySelectVO> listBuySelectVO = entry.getValue();
			for(JczqBuySelectVO buySelectVO : listBuySelectVO){
				zs *= buySelectVO.getListRelationSp().size();
			}
			total += zs;
		}
		return total;
	}
}
