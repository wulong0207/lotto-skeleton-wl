package com.hhly.skeleton.base.page.template;

import com.hhly.skeleton.base.bo.PagingBO;
import com.hhly.skeleton.base.page.AbstractStatisticsPage;
import com.hhly.skeleton.base.page.IPageService;
import com.hhly.skeleton.base.page.ISimplePage;
import com.hhly.skeleton.base.vo.PageVO;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collections;

/**
 * @author jiangwei
 * @Version 1.2
 * @CreatDate 2017-1-7 上午9:11:08
 * @Desc 分页查询，采用模板方法设计模式
 */
@Service
public class PageService implements IPageService {

	@Override
	public <T> PagingBO<T> getPageData(PageVO vo, ISimplePage<T> page) {
		return getPageData(vo, true, page);
	}

	@Override
	public <T> PagingBO<T> getPageData(PageVO vo, boolean isCheckPageParam, ISimplePage<T> page) {
		Assert.notNull(vo, "分页查询参数错误");
		if (isCheckPageParam && !validParam(vo)) {
			throw new IllegalArgumentException("分页查询参数错误(pageIndex不能小于0，pageSize不能小于1)，pageIndex："
					+ vo.getPageIndex() + "|pageSize:" + vo.getPageSize());
		}
		PagingBO<T> result = new PagingBO<T>();
		// 获取总条数
		int total = page.getTotal();
		result.setTotal(total);
		if (total > 0) {
			// 如果存在数据查询获取数据
			result.setData(page.getData());
		} else {
			result.setData(Collections.<T> emptyList());
		}
		// 判断是否是统计分页
		if (page instanceof AbstractStatisticsPage) {
			AbstractStatisticsPage<T> sp = (AbstractStatisticsPage<T>) page;
			result.setOther(sp.getOther());
		}
		return result;
	}

	@Override
	public boolean validParam(PageVO vo) {
		return !(vo.getPageIndex() == null || vo.getPageIndex() < 0 || vo.getPageSize() == null || vo.getPageSize() <= 0);
	}
}
