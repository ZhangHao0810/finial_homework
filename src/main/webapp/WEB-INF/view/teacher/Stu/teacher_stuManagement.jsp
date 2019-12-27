<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/21
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>具体比赛的学生管理页面</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<br/>

<div class="container-fluid">

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
                    <li><a href="${ctx}/teacher/index1?teacherName=${name}">比赛信息展示</a></li>
                    <li class="active"><a href="#">管理具体比赛的学生信息 <span class="sr-only">(current)</span></a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 ${name}老师</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

</div>


<div class="container">

    <form class="navbar-form navbar-left">
        <h3>${name}老师--${infoName}</h3>
    </form>

    <form class="navbar-form navbar-right">
        <a href="${ctx}/teacher/stu/insert?compName=${infoName}&infoId=${infoId}" class="btn btn-default" role="button">增加学生</a>
    </form>

    <form class="navbar-form navbar-right">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">学生查询</button>
    </form>

    <table class="table table-hover">
        <tr>
            <th>学号</th>
            <th>学生姓名</th>
            <th>年龄</th>
            <th>班级</th>
            <th>删除学生</th>

        </tr>
        <c:forEach items="${stus}" var="item" varStatus="status">
        <tr>
            <td>${item.stuId}</td>
            <td>${item.stuName}</td>
            <td>${item.stuAge}</td>
            <td>${item.stuClass}</td>
            <td onclick="location.href='${ctx}/teacher/stu/delet?stuId=${item.stuId}&infoId=${infoId}';">
                <button type="button" class="btn btn-default" data-dismiss="modal">删除</button>
            </td>
        <tr>
            </c:forEach>

        <tr>
            <td>写死在页面上的</td>
            <td>张华</td>
            <td>13</td>
            <td>1903</td>
            <td onclick="location.href='#';">
                <button type="button" class="btn btn-default" data-dismiss="modal">删除</button>
            </td>
        <tr>


    </table>


</div>


</body>
</html>
