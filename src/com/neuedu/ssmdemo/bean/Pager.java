package com.neuedu.ssmdemo.bean;

import java.io.Serializable;
import java.util.Map;

public class Pager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1812404864698392867L;
	private int page = 1;
	private int size = 3;
	private int total = 0;// 总记录数
	private int pages = 0;// 总页数
	private Map<String, String> conditions;//带参数的分页查询，使用conditions保存搜索条件

	public Pager() {
	}

	public Pager(int page, int size) {
		super();
		this.page = page;
		this.size = size;
	}

	public Map<String, String> getConditions() {
		return conditions;
	}

	public void setConditions(Map<String, String> conditions) {
		this.conditions = conditions;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;

		this.pages = this.total % size == 0 ? this.total / size : this.total / size + 1;
	}

	public int getPages() {
		return pages;
	}

	public int getStartIndex() {
		return (page - 1) * size;
	}

	public int getEndIndex() {
		return page * size;
	}

	public int getPrePage() {
		int prePage = page - 1 < 1 ? 1 : page - 1;
		return prePage;
	}

	public int getNextPage() {
		int nextPage = page + 1 > pages ? pages : page + 1;
		return nextPage;
	}
}
