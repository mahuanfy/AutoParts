package com.eu.front.service;

import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface StockService{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryStock(PageUtil page, String userName) throws Exception;

}