package com.eu.front.service.impl;

import com.eu.front.dao.UserDao;
import com.eu.front.entity.Admin;
import com.eu.front.service.UserService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<Map<String, String>> insertUser(PageUtil page,String adminRealname) throws Exception {
        String adminReal="%"+adminRealname+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("adminRealname",adminReal);
        page.setTotalSize(userDao.queryUserCount());

        return userDao.queryUser(data);
    }

    @Override
    public void addUser(Admin admin) throws Exception{

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");//可以方便地修改日期格式
        String date = dateFormat.format( now );
        admin.setAdminDate(date);

        userDao.addUser(admin);

    }
    @Override
    public void deleteUser(String id) throws Exception{
        userDao.deleteUser(id);
    }
    @Override
    public List<Admin> findById(int id)throws Exception {
        return userDao.findById(id);
    }

    @Override
    public Admin queryUserInfo(String username) {
        try {
            return userDao.queryUserInfo(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUserInfo(Admin admin) {
        try {
            userDao.updateUserInfo(admin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
