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
        <legend>账单出账核算</legend>
        <div style="margin: 20px;">
            <table class="site-table layui-table table-hover ">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>日期</th>
                    <th>本次回收编号</th>
                    <th>回收钢铁类型</th>
                    <th>回收钢铁总重量(单位：吨)</th>
                    <th>回收单价(单位：元/吨)</th>
                    <th>总额</th>
                </tr>
                </thead>
                <tbody class="tr_1">

                </tbody>
            </table>
        </div>
        <div style="margin: 25px;" id="demo1"></div>
        <ul id="biuuu_city_list"></ul>
    </fieldset>
</div>
<script id="list-tpl" type="text/html">
    {{# layui.each(d.info, function(index, item){}}
    <tr>
        <td>{{ index+1}}</td>
        <td>{{item.recovery_year+"-"+item.recovery_month+"-"+item.recovery_day }}</td>
        <th>{{item.recovery_code == undefined ? "暂无" : item.recovery_code}}</th>
        <th>{{item.steel_name == undefined ? "暂无" : item.steel_name}}</th>
        <th>{{item.recovery_capacity == undefined ? "暂无" : item.recovery_capacity+'吨'}}</th>
        <th>{{item.recovery_pirce == undefined ? "暂无" : item.recovery_pirce+'元/吨'}}</th>
        <th>{{"出账："+-parseInt(item.recovery_capacity) * parseInt(item.recovery_pirce)+"元"}}</th>

    {{# }); }}
</script>

</body>
<script type="text/javascript">
    let totalSize = 10;
    let currentIndex = 1;
    let pageSize = 10;
    let cl;
    layui.use(['jquery', 'layer', 'element', 'laypage', 'form', 'laytpl', 'tree', 'upload'], function () {
        window.jQuery = window.$ = layui.jquery;
        window.layer = layui.layer;
        var element = layui.element(),
            form = layui.form(),
            laytpl = layui.laytpl;

        cl = {
            page: function () {
                layui.laypage({
                    cont: 'demo1',
                    pages: totalSize, //总页数
                    curr: currentIndex,
                    groups: 5,//连续显示分页数
                    skin: '#1E9FFF',
                    jump: function (obj, first) {
                        currentIndex = obj.curr;
                        if (!first) {
                            cl.list();
                        }
                    }
                });
            },
            list: function () {
                let recoveryCode ="";
                $.post("${pageContext.request.contextPath}/Recovery/findRecovery", {
                        currentIndex: currentIndex,
                        pageSize: pageSize,
                        userName: recoveryCode
                    },
                    function (data) {
                        if (data.result) {
                            currentIndex = data.page.currentIndex;
                            totalSize = data.page.totalSize;

                            cl.page();
                            laytpl($("#list-tpl").text()).render(data, function (html) {
                                $(".tr_1").html(html);
                            });
                            form.render();
                        }
                    },
                    "json"
                );
            },
        }
        $(function () {
            cl.list();
        });
    });


</script>

</html>