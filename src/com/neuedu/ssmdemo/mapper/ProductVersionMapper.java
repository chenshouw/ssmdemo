package com.neuedu.ssmdemo.mapper;

import java.util.List;
import java.util.Map;

import com.neuedu.ssmdemo.bean.Pager;
import com.neuedu.ssmdemo.bean.ProductVersion;

public interface ProductVersionMapper {

	List<ProductVersion> findAll();

	// 其它操作方法
	public ProductVersion findById(String id);// 参数可类型以是基本数据类型或字符串

	public int addProductVersion(ProductVersion version);// 参数可以是对象或集合,数组

	public int deleteById(String id);

	public int editProductVersion(ProductVersion version);
	
	//根据用户输入的发布时间或版本描述信息查询版本记录
	public List<ProductVersion> findByExample(Map<String, String> conditions);
	public List<ProductVersion> findByExample2(ProductVersion version);
	
	//查询发布时间在某月后的版本记录
	public List<ProductVersion> findByProduceDate(Map<String, String> conditions);
	
	//根据给定的一组记录编号，查询数据(批量新增，删除，修改，查询 )
	public List<ProductVersion> findByIds(String[] ids);//数据，List，Set等
	public List<ProductVersion> findByIds2(List<String> ids);
	
	//带条件分页查询
	public List<ProductVersion> findByPager(Pager pager);
}
