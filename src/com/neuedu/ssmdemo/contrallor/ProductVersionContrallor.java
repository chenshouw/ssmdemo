package com.neuedu.ssmdemo.contrallor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.ssmdemo.bean.ProductVersion;
import com.neuedu.ssmdemo.service.ProductVersionService;

@Controller//声明本类是一个控制器类
@RequestMapping("/productversion")//配置URL网址
public class ProductVersionContrallor {
	//使用注解整合
	@Autowired
	private ProductVersionService productVersionService;
	
	@RequestMapping("/list")//访问地址：/productversion/list.action
	public ModelAndView  list(){
		List<ProductVersion> list  = productVersionService.findAll();
		//ModelAndView是spring mvc的一个组件，用于设置页面的名称和传递数据到页面中，与servlet的request类似
		//传递数据的默认作用域（范围）也是Request范围,默认是请求转发
		ModelAndView view = new ModelAndView();
		view.setViewName("list");//设置jsp页面的名称 - pages/list.jsp
		view.addObject("versionList", list);
		return view;
	}

}
