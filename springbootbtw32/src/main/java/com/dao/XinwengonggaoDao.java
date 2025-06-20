package com.dao;

import com.entity.XinwengonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwengonggaoVO;
import com.entity.view.XinwengonggaoView;


/**
 * 新闻公告
 * 
 * @author 
 * @email 
 * @date 2022-05-18 09:48:23
 */
public interface XinwengonggaoDao extends BaseMapper<XinwengonggaoEntity> {
	
	List<XinwengonggaoVO> selectListVO(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
	
	XinwengonggaoVO selectVO(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
	
	List<XinwengonggaoView> selectListView(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);

	List<XinwengonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
	
	XinwengonggaoView selectView(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
	

}
