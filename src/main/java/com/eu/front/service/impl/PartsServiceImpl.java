package com.eu.front.service.impl;

import com.eu.front.dao.PartsDao;
import com.eu.front.entity.Parts;
import com.eu.front.service.PartsService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PartsServiceImpl implements PartsService {
    @Autowired
    private PartsDao partsDao;

    @Override
    public List<Map<String, String>> queryParts(PageUtil page, String userName) throws Exception {
        String adminReal = "%" + userName + "%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("partsName", adminReal);
        page.setTotalSize(partsDao.queryPartsCount());

        return partsDao.queryParts(data);
    }

    @Override
    public void addParts(Parts customer) throws Exception {
        partsDao.addParts(customer);
    }

    @Override
    public void deleteParts(String id) throws Exception {
        partsDao.deleteParts(id);
    }

    @Override
    public  List<Map<String, String>> queryPartsInfo() throws Exception {
       return partsDao.queryPartsInfo();
    }
}
