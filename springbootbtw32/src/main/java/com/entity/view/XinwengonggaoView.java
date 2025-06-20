package com.entity.view;

import com.entity.XinwengonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-18 09:48:23
 */
@TableName("xinwengonggao")
public class XinwengonggaoView  extends XinwengonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwengonggaoView(){
	}
 
 	public XinwengonggaoView(XinwengonggaoEntity xinwengonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, xinwengonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
