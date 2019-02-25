package com.eu.front.dao;

import com.eu.front.entity.Admin;

import java.util.List;
import java.util.Map;

public interface UserDao {
    /**
     * 分页查询数据
     */
    List<Map<String, String>> queryUser(Map<String, Object> data) throws Exception;

    Long queryUserCount() throws Exception;

    /**
     * 插入管理员
     *
     * @param admin
     */
    void addUser(Admin admin) throws Exception;

    /**
     * 通过ID删除用户
     * @param id
     */
    void deleteUser(String id) throws Exception;

    /**
     * 通过ID查询用户信息
     * @param id
     * @return
     */
    List<Admin> findById(int id) throws Exception;

    /**
     * 查找用户信息
     * @param username
     * @return
     */
    Admin queryUserInfo(String username);
    /**
     * 更新用户信息
     * @param admin
     */
    void updateUserInfo(Admin admin);
}
