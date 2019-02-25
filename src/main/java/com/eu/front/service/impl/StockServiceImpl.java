package com.eu.front.service.impl;

import com.eu.front.dao.StockDao;
import com.eu.front.service.StockService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao stockDao;

    @Override
    public List<Map<String, String>> queryStock(PageUtil page, String userName) throws Exception {
        String stockCode="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("stockCode",stockCode);
        page.setTotalSize(stockDao.queryStockCount());

        return stockDao.queryStock( data);
    }
}