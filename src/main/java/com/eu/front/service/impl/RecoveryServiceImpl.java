package com.eu.front.service.impl;

import com.eu.front.dao.RecoveryDao;
import com.eu.front.dao.StockDao;
import com.eu.front.entity.Recovery;
import com.eu.front.entity.Recovery;
import com.eu.front.entity.Stock;
import com.eu.front.service.RecoveryService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecoveryServiceImpl implements RecoveryService {
    @Autowired
    private StockDao stockDao;
    @Autowired
    private RecoveryDao recoveryDao;
    @Override
    public List<Map<String, String>> queryRecovery(PageUtil page, String userName) throws Exception {
        String adminReal="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("recoveryCode",adminReal);
        page.setTotalSize(recoveryDao.queryRecoveryCount());

        return recoveryDao.queryRecovery(data);
    }

    @Override
    public void addRecovery(Recovery recovery) throws Exception {
        recoveryDao.addRecovery(recovery);
        Stock stock1 = stockDao.queryStockById(recovery.getRecoveryStorageId());
        //获取库存该仓库的重量
        int stockCapacity = Integer.parseInt(stock1.getStockCapacity());
        Stock stock = new Stock();
        String capacity = String.valueOf((stockCapacity + Integer.parseInt(recovery.getRecoveryCapacity())));
        //仓库重量减去销售的重量
        stock.setStockCapacity(capacity);
        stock.setStockStorageId(recovery.getRecoveryStorageId());
        stockDao.addStock(stock);
    }

    @Override
    public void deleteRecovery(String id) throws Exception {
        //查询回收编号
        Recovery recovery= recoveryDao.findById(id);
        recoveryDao.deleteRecovery(id);

        Stock stock1 = stockDao.queryStockById(recovery.getRecoveryStorageId());
        //获取库存该仓库的重量
        int stockCapacity = Integer.parseInt(stock1.getStockCapacity());

        Stock stock = new Stock();
        String capacity = String.valueOf((stockCapacity - Integer.parseInt(recovery.getRecoveryCapacity())));
        //仓库重量减去销售的重量
        stock.setStockCapacity(capacity);
        stock.setStockStorageId(recovery.getRecoveryStorageId());
        stockDao.addStock(stock);
    }

    @Override
    public List<Map<String, String>> findRecover() {
        return recoveryDao.findRecover();
    }
}
