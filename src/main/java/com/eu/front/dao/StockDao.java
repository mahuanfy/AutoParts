package com.eu.front.dao;

import com.eu.front.entity.Stock;
import com.eu.front.entity.Storage;

import java.util.List;
import java.util.Map;

public interface StockDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryStock(Map<String, Object> data) throws Exception;

	Long queryStockCount() throws Exception;

	Stock queryStockById(String stockStorageId);

	 void addStock( Stock Stock);
	 //仓库增加 库存显示
	 void addStockCustomer(Storage storage);

	 void deleteStockCustomer(Storage storage);


}
