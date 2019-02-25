package com.eu.front.service.impl;

import com.eu.front.dao.SteelDao;
import com.eu.front.entity.Steel;
import com.eu.front.service.SteelService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SteelServiceImpl implements SteelService {
    @Autowired
    private SteelDao steelDao;

    @Override
    public List<Map<String, String>> querySteel(PageUtil page, String userName) throws Exception {
        String adminReal = "%" + userName + "%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("steelName", adminReal);
        page.setTotalSize(steelDao.querySteelCount());

        return steelDao.querySteel(data);
    }

    @Override
    public void addSteel(Steel customer) throws Exception {
        steelDao.addSteel(customer);
    }

    @Override
    public void deleteSteel(String id) throws Exception {
        steelDao.deleteSteel(id);
    }

    @Override
    public  List<Map<String, String>> querySteelInfo() throws Exception {
       return steelDao.querySteelInfo();
    }
}