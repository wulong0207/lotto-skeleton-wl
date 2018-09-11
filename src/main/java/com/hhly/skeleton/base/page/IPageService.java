package com.hhly.skeleton.base.page;

import com.hhly.skeleton.base.bo.PagingBO;
import com.hhly.skeleton.base.vo.PageVO;
/**
 * 
 * @desc 分页模板方法接口（模板方法模式）
 * @author jiangwei
 * @date 2017-2-4
 * @company 益彩网络科技公司
 * @version 1.2
 */
public interface IPageService {
    /**
     * 分页服务
     * @param page 分页实现类
     * @return
     */
    <T> PagingBO<T> getPageData(PageVO vo,ISimplePage<T> page);
    /**
     * 分页服务
     * @param vo 分页参数
     * @param isCheckPageParam 是否检查分页参数是否正确
     * @param page 分页实现类
     * @return
     */
     <T> PagingBO<T> getPageData(PageVO vo,boolean isCheckPageParam,ISimplePage<T> page);
     
     /**
      * 分页参数验证
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月21日 下午4:00:43
     * @param vo
     * @return 验证成功true 验证失败false
     */
    boolean validParam(PageVO vo);
}
