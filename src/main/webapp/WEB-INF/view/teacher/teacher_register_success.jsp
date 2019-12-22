<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/12
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>教师的注册页面</title>

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
            <a class="navbar-brand" href="${ctx}/index">首页(未来可替换成图标) </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="${ctx}/teacher/login">教师登录 </a></li>
                <li class="active"><a href="#">教师注册 <span class="sr-only">(current)</span></a></li>
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
        <img src="../../../img/teacher/马尾可爱女.jpg" width="500px" height="715.5px">
    </div>
    <br>
    <br>
    <br>
    <div class="col-md-4" align="left">
        <div class="alert alert-success" role="alert">
            <strong>Well done! 已成功提交注册信息</strong><br/>
            请等待一段时间,或者直接联系管理员激活您的账号<br/>
            <a href="${ctx}/index">
                <button type="button" class="btn btn-danger" href="">返回平台首页</button>
            </a>
        </div>
    </div>

    <div class="col-md-6 ">
        <br>
        <form>
            <div class="form-group">
                <label for="name">教师姓名</label>
                <div class="row">
                    <div class="col-xs-4">
                        <input type="text" class="form-control" id="name">
                    </div>
                </div>
            </div>
            <div class="form-group ">
                <label for="exampleInputPassword1">密码</label>
                <div class="row">
                    <div class="col-xs-4">
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>
                </div>
            </div>
            <button type="submit" class="btn btn-default" data-target="modal">注册</button>
        </form>
    </div>
</div>
</body>
</html>