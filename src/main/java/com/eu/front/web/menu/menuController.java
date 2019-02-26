package com.eu.front.web.menu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

@Controller
@RequestMapping("/menu")
public class menuController extends HttpServlet {

    //用户
    @RequestMapping("/user")
    public String tronClass() {
        return "web/user/user";
    }

    //客户
    @RequestMapping("/customerce")
    public String customerce() {
        return "web/customerce/customerce";
    }

    //汽车零配件类型
    @RequestMapping("/parts")
    public String parts() {
        return "web/parts/parts";
    }

    //仓库
    @RequestMapping("/storage")
    public String storage() {
        return "web/storage/storage";
    }

    //
    @RequestMapping("/stock")
    public String stock() {
        return "web/stock/stock";
    }

    @RequestMapping("/Sale")
    public String Sale() {
        return "web/sale/sale";
    }

    @RequestMapping("/purchase")
    public String purchase() {
        return "web/purchase/purchase";
    }

    @RequestMapping("/reckonRecover")
    public String reckonRecover() {
        return "web/reckon/reckonPurchase";
    }

    @RequestMapping("/reckonSale")
    public String reckonSale() {
        return "web/reckon/reckonSale";
    }

    @RequestMapping("/findRecover")
    public String findRecover() {
        return "web/reportForm/reportFormPurchase";
    }

    @RequestMapping("/findSale")
    public String findSale() {
        return "web/reportForm/reportFormSale";
    }


}
