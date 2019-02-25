package com.eu.front.service;

import com.eu.front.entity.Recovery;
import com.eu.front.utils.PageUtil;

import java.util.List;
import java.util.Map;

public interface RecoveryService{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryRecovery(PageUtil page, String userName) throws Exception;


	/**
	 * 插入
	 *
	 * @param recovery
	 */
	void addRecovery(Recovery recovery) throws Exception;

	/**
	 * 通过ID删除
	 * @param id
	 */
	void deleteRecovery(String id) throws Exception;

	/**
	 * 查找所有回收信息报表
	 * @return
	 */
	List<Map<String, String>> findRecover();
}