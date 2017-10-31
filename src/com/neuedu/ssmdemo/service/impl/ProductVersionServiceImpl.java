package com.neuedu.ssmdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.ssmdemo.bean.ProductVersion;
import com.neuedu.ssmdemo.mapper.ProductVersionMapper;
import com.neuedu.ssmdemo.service.ProductVersionService;

/**
 * 使用注解模式开发spring应用
 * 
 * 
 * @author chensw
 *
 */
@Service
public class ProductVersionServiceImpl implements ProductVersionService {
	// 业务层依赖与dao层
	// 依赖关系通过接口实现代码的解耦合，使用spring的依赖注入功能实现，
	// @Autowired是使用自动注入的方式实现
	@Autowired
	private ProductVersionMapper versionMapper;

	@Override
	public List<ProductVersion> findAll() {
		return versionMapper.findAll();
	}

}
