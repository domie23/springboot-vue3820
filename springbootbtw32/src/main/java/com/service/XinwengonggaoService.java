package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwengonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwengonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwengonggaoView;


/**
 * 新闻公告
 *
 * @author 
 * @email 
 * @date 2022-05-18 09:48:23
 */
public interface XinwengonggaoService extends IService<XinwengonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwengonggaoVO> selectListVO(Wrapper<XinwengonggaoEntity> wrapper);
   	
   	XinwengonggaoVO selectVO(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
   	
   	List<XinwengonggaoView> selectListView(Wrapper<XinwengonggaoEntity> wrapper);
   	
   	XinwengonggaoView selectView(@Param("ew") Wrapper<XinwengonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwengonggaoEntity> wrapper);
   	

}

