package com.eu.front.service.impl;

import com.eu.front.dao.PurchaseDao;
import com.eu.front.dao.StockDao;
import com.eu.front.entity.Purchase;
import com.eu.front.entity.Purchase;
import com.eu.front.entity.Stock;
import com.eu.front.service.PurchaseService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private StockDao stockDao;
    @Autowired
    private PurchaseDao purchaseDao;
    @Override
    public List<Map<String, String>> queryPurchase(PageUtil page, String userName) throws Exception {
        String adminReal="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("purchaseCode",adminReal);
        page.setTotalSize(purchaseDao.queryPurchaseCount());

        return purchaseDao.queryPurchase(data);
    }

    @Override
    public void addPurchase(Purchase purchase) throws Exception {
        purchaseDao.addPurchase(purchase);
        Stock stock1 = stockDao.queryStockById(purchase.getPurchaseStorageId());
        //获取库存该仓库的件数
        int stockCapacity = Integer.parseInt(stock1.getStockCapacity());
        Stock stock = new Stock();
        String capacity = String.valueOf((stockCapacity + Integer.parseInt(purchase.getPurchaseCapacity())));
        //仓库件数减去销售的件数
        stock.setStockCapacity(capacity);
        stock.setStockStorageId(purchase.getPurchaseStorageId());
        stockDao.addStock(stock);
    }

    @Override
    public void deletePurchase(String id) throws Exception {
        //查询进货编号
        Purchase purchase= purchaseDao.findById(id);
        purchaseDao.deletePurchase(id);

        Stock stock1 = stockDao.queryStockById(purchase.getPurchaseStorageId());
        //获取库存该仓库的件数
        int stockCapacity = Integer.parseInt(stock1.getStockCapacity());

        Stock stock = new Stock();
        String capacity = String.valueOf((stockCapacity - Integer.parseInt(purchase.getPurchaseCapacity())));
        //仓库件数减去销售的件数
        stock.setStockCapacity(capacity);
        stock.setStockStorageId(purchase.getPurchaseStorageId());
        stockDao.addStock(stock);
    }

    @Override
    public List<Map<String, String>> findRecover() {
        return purchaseDao.findRecover();
    }
}
