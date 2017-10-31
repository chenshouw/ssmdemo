package com.neuedu.ssmdemo.service;

import java.util.List;

import com.neuedu.ssmdemo.bean.ProductVersion;

/**
 * 业务层接口
 * 
 * 
 * @author chensw
 *
 */
public interface ProductVersionService {

	public List<ProductVersion> findAll();
}
