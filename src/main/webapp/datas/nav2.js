var navs = [{
    "title": "库存信息",
    "icon": "fa fa-database",
    "href": "menu/stock",
    "spread": false
},{
    "title": "报表信息",
    "icon": "fa fa-building-o",
    "spread": false,
    "children": [{
        "title": "销售报表",
        "icon": "&#xe63c;",
        "href": "menu/findSale"
    }, {
        "title": "进货报表",
        "icon": "&#xe63c;",
        "href": "menu/findRecover"
    }]
},{
    "title": "账目核算",
    "icon": "fa fa-fax",
    "spread": false,
    "children": [{
        "title": "进账账目核算",
        "icon": "fa fa-book",
        "href": "menu/reckonSale"
    },{
        "title": "出账账目核算",
        "icon": "fa fa-book",
        "href": "menu/reckonRecover"
    }]
}];
