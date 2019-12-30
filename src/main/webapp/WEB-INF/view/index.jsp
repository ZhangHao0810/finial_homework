<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/10
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>这是首页 </title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <style>

    img {
       background-color: #5bc0de;
        border: 1px;
    }

</style>


</head>
<body >

<div class="container-fluid" >


    <%--导航条--%>
    <nav class="navbar navbar-default">
        <div class="container-fluid" >
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header" >
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                        data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#" >北信科 学生竞赛管理平台</a>
            </div>
        </div><!-- /.container-fluid -->
    </nav>
</div>

<div class="container" >

    <%--轮播图--%>
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" data-interval="500">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active" align="center">
                <img src="../../img/test/四男长条.jpg" alt="...">

            </div>
            <div class="item" align="center">
                <img src="../../img/test/妖尾.jpg" alt="...">
            </div>

        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>

<br><br>



    <%--格栅系统下得带链接图片--%>
    <div class="row"  >
        <div class="col-md-5 col-sm-6 col-xs-12" align="center">
            <a href="${ctx}/teacher/login"><img src="../../img/index/教师入口.PNG"  class="img-thumbnail" border="1"></a>
        </div>
        <div class="col-md-5 col-md-offset-2 col-sm-6 col-xs-12" align="center">
            <a href="${ctx}/admin/login"><img src="../../img/index/管理员入口.PNG" class="img-thumbnail"></a>
        </div>
        <div class="col-md-5 col-sm-6 col-xs-12" align="center">
            <a href="#"><img src="../../img/index/平台简介.PNG"  class="img-thumbnail"></a>
        </div>
        <div class="col-md-5 col-md-offset-2 col-sm-6 col-xs-12" align="center">
            <a href="#"><img src="../../img/index/联系我们.PNG"  class="img-thumbnail"></a>
        </div>
    </div>

</div>
<br/>
<br/>

<div align="center">
    <img src="../../img/test/欧美奔放女孩_看图王.jpg"/>
</div>
<br/>
<br/>
<div style="text-align: center;">
    友情链接:
    <a class="btn btn-success" href="#">北京信息科技大学官网</a>
    <a class="btn btn-success" href="#">北京信息科技大学计算机学院</a>
    <a class="btn btn-success" href="#">北京信息科技大学 软件工程研究中心</a>
    <br/>
    Copyright © 2019-2019 北京信息科技大学 软件工程研究中心 版权所有 盗用必究!!  技术负责人:张浩
</div>

<br/>
<br/>
<br/>

</body>
</html>
