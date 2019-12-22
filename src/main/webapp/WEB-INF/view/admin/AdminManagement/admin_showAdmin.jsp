<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/21
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>管理员展示界面</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>


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
                    <ul class="nav navbar-nav">
                        <li><a href="#">学生竞赛管理平台 后台 <span class="sr-only">(current)</span></a></li>
                    </ul>
                    <li><a href="#">教师管理 </a></li>
                    <li><a href="${ctx}/teacher/insert">信息统计与查询 </a></li>
                    <li><a href="${ctx}/teacher/insert">比赛与比赛类别管理 </a></li>
                    <li  class="active"><a href="#">管理员管理 </a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 XXX管理员</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>


<div class="container">

    <form class="navbar-form navbar-left">
        <h3>管理员管理</h3>
    </form>

    <form class="navbar-form navbar-right">
        <a href="${ctx}/admin/addAdmin" class="btn btn-default" role="button">增加管理员</a>
    </form>

    <form class="navbar-form navbar-right">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">管理员查询</button>
    </form>

    <table class="table table-hover">
        <tr>
            <th>管理员账号</th>
            <th>管理员密码</th>
            <th colspan="2" align="center">管理员操作</th>
        </tr>

        <tr>
            <td >张三丰</td>
            <td onclick="location.href='${ctx}/admin/updateAdmin';">
                <button type="button" class="btn btn-default" data-dismiss="modal">修改密码</button>
            </td>
            <td >
                <button type="button" class="btn btn-default" data-dismiss="modal">删除</button>
            </td>
        <tr>
        <tr>
            <td >刘德华</td>
            <td onclick="location.href='${ctx}/admin/updateAdmin';">
                <button type="button" class="btn btn-default" data-dismiss="modal">修改密码</button>
            </td>
            <td >
                <button type="button" class="btn btn-default" data-dismiss="modal">删除</button>
            </td>
        <tr>
        <tr>
            <td >郭德纲</td>
            <td onclick="location.href='${ctx}/admin/updateAdmin';">
                <button type="button" class="btn btn-default" data-dismiss="modal">修改密码</button>
            </td>
            <td >
                <button type="button" class="btn btn-default" data-dismiss="modal">删除</button>
            </td>
        <tr>



    </table>


</div>

</body>
</html>
