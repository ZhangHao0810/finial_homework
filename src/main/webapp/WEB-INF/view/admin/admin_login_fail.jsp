<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/21
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>

<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>管理员的登录失败页面</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<br>
<div class="container-fluid">

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${ctx}/index">平台首页</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="${ctx}/admin/index1">学生竞赛管理平台 后台 <span
                            class="sr-only">(current)</span></a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>


<div class="row">
    <div class="col-md-6" align="center">
        <<img src="../../../img/admin/白色少女.jpg" width="500px" height="500px">
    </div>
    <div class="col-md-6 ">
        <br>
        <br>
        <br>
        <br>
        <br>
        <div class="row">
            <div class="col-xs-8">
                <div class="alert alert-warning alert-dismissible fade in" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                            aria-hidden="true">×</span></button>
                    <strong>登录失败!</strong> 请重新检查用户名和密码
                </div>
                <div/>
            </div>
            <br>
            <form action="${ctx}/admin/login1" method="post">
                <div class="form-group">
                    <label for="name">管理员姓名</label>
                    <div class="row">
                        <div class="col-xs-4">
                            <input type="text" class="form-control" id="name"  name="adminName" placeholder="AdminName">
                        </div>
                    </div>
                </div>
                <div class="form-group ">
                    <label for="exampleInputPassword1">密码</label>
                    <div class="row">
                        <div class="col-xs-4">
                            <input type="password" class="form-control" id="exampleInputPassword1"  name="password" placeholder="Password">
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-default">登录</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
