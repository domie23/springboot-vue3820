package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XinwengonggaoDao;
import com.entity.XinwengonggaoEntity;
import com.service.XinwengonggaoService;
import com.entity.vo.XinwengonggaoVO;
import com.entity.view.XinwengonggaoView;

@Service("xinwengonggaoService")
public class XinwengonggaoServiceImpl extends ServiceImpl<XinwengonggaoDao, XinwengonggaoEntity> implements XinwengonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwengonggaoEntity> page = this.selectPage(
                new Query<XinwengonggaoEntity>(params).getPage(),
                new EntityWrapper<XinwengonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwengonggaoEntity> wrapper) {
		  Page<XinwengonggaoView> page =new Query<XinwengonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwengonggaoVO> selectListVO(Wrapper<XinwengonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwengonggaoVO selectVO(Wrapper<XinwengonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwengonggaoView> selectListView(Wrapper<XinwengonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwengonggaoView selectView(Wrapper<XinwengonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
