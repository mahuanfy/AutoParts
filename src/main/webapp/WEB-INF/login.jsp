<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/page/tag.jsp" %>

<html lang="en">
<head>
    <title>汽车零配件销售管理系统</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" type="text/css" href="${baseurl}/public/common/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}/public/css/login.css" media="all">
</head>
<body>
<div class="larry-canvas" id="canvas"></div>
<div class="layui-layout layui-layout-login">
    <h1 style="margin-left: -10px">
        <strong>汽车零配件销售管理系统</strong>
        <%--<em>Management System</em>--%>
    </h1>
    <div class="layui-user-icon larry-login">
        <input type="text" placeholder="账号" id="userName" required class="login_txtbx"/>
    </div>
    <div class="layui-pwd-icon larry-login">
        <input type="password" placeholder="密码" id="password" required class="login_txtbx"/>
    </div>
    <div class="layui-submit larry-login" style="margin-top: 20px;width:90%">
        <button   onclick="login()"  class="submit_btn">立即登录</button>
    </div>
    <div class="layui-login-text">
    </div>

</div>
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
                        layer.msg('登录失败:用户名或密码错误', {icon: 5, time: 2000});
                    });
                }
            }
        });
    }

</script>
</body>
</html>
