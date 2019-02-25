package com.eu.front.service;

import com.eu.front.entity.Sale;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface SaleService{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> querySale(PageUtil page, String userName) throws Exception;


	/**
	 * 插入
	 *
	 * @param customer
	 */
	void addSale(Sale customer) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteSale(String id) throws Exception;

	/**
	 * 查找所有销售账单 报表统计
	 * @return
	 */
	List<Map<String, String>> findSale();
}