<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/12
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>教师的登录页面</title>

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
<nav class="navbar navbar-default">
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
            <a class="navbar-brand" href="${ctx}/index">平台首页 </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">教师登录 <span class="sr-only">(current)</span></a></li>
                <li><a href="${ctx}/teacher/register">教师注册 </a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">查询</button>
            </form>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>


<div class="row">
    <div class="col-md-6" align="center">
        <<img src="../../../img/teacher/双女比基尼.jpg" width="500px" height="715.5px">
    </div>
    <div class="col-md-6 ">

        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <form action="${ctx}/teacher/login1" method="post">
            <div class="form-group">
                <label for="name">教师姓名</label>
                <div class="row">
                    <div class="col-xs-4">
                        <input type="text" class="form-control" id="name" name="teacherName" placeholder="TeacherName">
                    </div>
                </div>
            </div>
            <div class="form-group ">
                <label for="exampleInputPassword1">密码</label>
                <div class="row">
                    <div class="col-xs-4">
                        <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-default">登录</button>
        </form>
        <br/>
        <br/>
    </div>
</div>

</body>
</html>
