<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/page/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/css/login.css" media="all">
    <title>汽车零配件销售管理系统</title>
</head>
<body>
<div class="beijing">
    <div class="bei2">
        <div id="login">
            <h1>汽车零配件销售管理系统</h1>
                <input type="text" id="userName" required="required" placeholder="用户名"/>
                <input type="password" id="password" required="required" placeholder="密码"/>
                <button class="but" onclick="login()"  type="submit">登录</button>
                <button  class="but"  type="reset">重置</button>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="${baseurl}/public/common/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${baseurl}/public/common/jsplugin/jparticle.jquery.js"></script>
<script type="text/javascript" src="${baseurl}/public/js/login.js"></script>
<script>
    function login() {
        let adminName = $("#userName").val();
        let adminPassword = $("#password").val();
        $.ajax({
            url: "${baseurl}/login",
            data: {adminName: adminName, adminPassword: adminPassword},
            success: function (data) {
                if (data.result) {
                    location.href = "${baseurl}/index";
                } else {
                    layui.use('layer', function () {
                        var layer = layui.layer;
                        layer.msg('登录失败:用户名或密码错误', {icon: 5, time: 1000});
                    });
                }
            }
        });
    }

</script>
</html>
