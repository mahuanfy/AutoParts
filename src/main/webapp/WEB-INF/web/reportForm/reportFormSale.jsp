<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="../../../page/tag.jsp" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Table</title>
    <link rel="stylesheet" href="${baseurl}/public/common/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${baseurl}/public/common/css/global.css" media="all">
    <link rel="stylesheet" href="${baseurl}/public/css/global.css" media="all">
    <link rel="stylesheet" href="${baseurl}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${baseurl}/public/css/table.css"/>
    <script type="text/javascript" src="${baseurl}/js/myjs/jquery.min.js"></script>
    <link rel="stylesheet" href="${baseurl}/public/css/eu_manage.css" media="all">
    <script type="text/javascript" src="${baseurl}/public/js/button_js.js" charset="utf-8"></script>
</head>
<style>
    .layui-table td, .layui-table th {
        text-align: center;
    }

</style>
<script type="text/javascript" src="${baseurl}/public/common/layui/layui.js"></script>
<body>
<div class="admin-main">
    <fieldset class="layui-elem-field">
        <legend>销售报表统计</legend>
        <div style="margin: 20px;">
            <table class="site-table layui-table table-hover ">
                <thead>
                <tr>
                    <th>年份</th>
                    <th>月份</th>
                    <th>销售次数</th>
                    <th>销售总重量</th>
                    <th>总销售额</th>
                </tr>
                </thead>
                <tbody id="tr_1">

                </tbody>
            </table>
        </div>
        <div style="margin: 25px;" id="demo1"></div>
        <ul id="biuuu_city_list"></ul>
    </fieldset>
</div>

</body>
<script type="text/javascript">
    let cl;
    layui.use(['jquery', 'layer', 'element', 'laypage', 'form', 'laytpl', 'tree', 'upload'], function () {
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            form = layui.form(),
            laytpl = layui.laytpl;

        cl = {
            list: function () {
                let year = [];
                let yearOnly;

                let _html = "";
                $.post("${pageContext.request.contextPath}/ReportForm/findRecover",
                    function (data) {
                        if (data.result) {
                            let sumCount = 0;//总计
                            let sumCountCapacity = 0;//总计
                            let sumCountPirce = 0;//总计
                            for (let i = 0; i < data.Sale.length; i++) {
                                year.push(data.Sale[i].sale_year);
                            }
                            yearOnly = Array.from(new Set(year));
                            //选择月数
                            for (let j = 0; j < yearOnly.length; j++) {
                                let count = 0;//小计
                                let countCapacity = 0;//小计
                                let countPirce = 0;//小计

                                let monthOnly;
                                let month = [];
                                for (let i = 0; i < data.Sale.length; i++) {
                                    if (data.Sale[i].sale_year == yearOnly[j]) {
                                        month.push(data.Sale[i].sale_month);
                                    }
                                }

                                monthOnly = Array.from(new Set(month));
                                _html += "<tr><td  rowspan=" + monthOnly.length + ">" + yearOnly[j] + "年 </td>";
                                for (let i = 0; i < monthOnly.length; i++) {
                                    let capacity = 0;
                                    let pirce = 0;
                                    let day = 0;
                                    for (let r = 0; r < data.Sale.length; r++) {
                                        if (data.Sale[r].sale_month == monthOnly[i] && data.Sale[r].sale_year == yearOnly[j]) {
                                            day++;
                                            capacity += parseInt(data.Sale[r].sale_capacity);
                                            pirce += parseInt(data.Sale[r].sale_capacity) * parseInt(data.Sale[r].sale_pirce)
                                        }
                                    }
                                    _html += "<td  >" + monthOnly[i] + "月 </td>" +
                                        "<td>" + day + "次</td><td>" + capacity + "吨</td><td>" + pirce + "元</td></tr>";
                                    count += day;
                                    countCapacity += capacity;
                                    countPirce += pirce;
                                }
                                _html += "<tr style='background-color: rgb(239, 236, 236);'><td colspan='2'>小计：</td><td>" + count + "次</td><td>" + countCapacity + "吨</td><td>" + countPirce + "元</td></tr>"
                                sumCount += count;
                                sumCountCapacity += countCapacity;
                                sumCountPirce += countPirce;
                            }
                            _html += "<tr style='background-color: rgb(239, 236, 236);'><td colspan='2'>总计：</td><td>" + sumCount + "次</td><td>" + sumCountCapacity + "吨</td><td>" + sumCountPirce + "元</td></tr>"
                        }
                        $("#tr_1").html(_html);
                    });
            },
        }
        $(function () {
            cl.list();
        });
    })
    ;

    function numAtArrayCount(arr, num) {
        arr.sort();
        return arr.lastIndexOf(num) - arr.indexOf(num) + 1;
    }

</script>

</html>