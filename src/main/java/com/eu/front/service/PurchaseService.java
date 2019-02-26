package com.eu.front.service;

import com.eu.front.entity.Purchase;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface PurchaseService{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryPurchase(PageUtil page, String userName) throws Exception;


	/**
	 * 插入
	 *
	 * @param purchase
	 */
	void addPurchase(Purchase purchase) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deletePurchase(String id) throws Exception;

	/**
	 * 查找所有进货信息报表
	 * @return
	 */
	List<Map<String, String>> findRecover();
}
