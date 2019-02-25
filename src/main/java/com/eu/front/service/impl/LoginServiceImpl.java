package com.eu.front.service.impl;

import com.eu.front.dao.LoginDao;
import com.eu.front.entity.Admin;
import com.eu.front.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Admin login(Admin admin) {
        try {
            if (loginDao.login(admin) != null) {
                return  loginDao.login(admin);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }


}
