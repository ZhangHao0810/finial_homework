<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/12
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>所有教师账号的展示和管理</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
包含 教师名单管理:修改,删除教师.
包含 教师注册的确认.

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
                        <li ><a href="#">学生竞赛管理平台 后台 <span class="sr-only">(current)</span></a></li>
                    </ul>
                    <li class="active" ><a href="#">教师管理 </a></li>
                    <li><a href="${ctx}/teacher/insert">信息统计与查询 </a></li>
                    <li><a href="${ctx}/teacher/insert">比赛与比赛类别管理 </a></li>
                    <li><a href="${ctx}/teacher/insert">管理员管理 </a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 XXX管理员</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>


<div class="container">


    <div class="row">
        <div class="col-md-4" align="left">
            <h3>待激活教师名单:</h3>
            <table class="table table-bordered table-hover">
                <tr>
                    <th>教师姓名</th>
                    <th colspan="2" align="center">操作</th>
                </tr>

                <tr>
                    <td>张三</td>
                    <td onclick="location.href='';">
                        <button type="button" class="btn btn-default" data-dismiss="modal">授权</button>
                    </td>
                    <td onclick="location.href='';">
                        <button type="button" class="btn btn-default" data-dismiss="modal">拒绝</button>
                    </td>
                </tr>
            </table>
        </div>
    </div>

    <form class="navbar-form navbar-right">
        <a href="${ctx}/admin/addTeacher" class="btn btn-default" role="button">添加教师</a>
    </form>


    <h3>已激活教师信息</h3>
    <table class="table table-bordered  table-condensed">
        <tr>
            <th>教师姓名</th>
            <th colspan="2">操作</th>
        </tr>
        <tr>
            <td>王二麻子</td>
            <td >
                <a href="${ctx}/admin/updateTeacher" class="btn btn-default" role="button">修改</a>
            </td>
            <td >
                <button type="button" class="btn btn-default" data-dismiss="modal">删除</button>
            </td>

        </tr>
    </table>
</div>





<br/>
<br/>
<div style="text-align: center;">
    Copyright © 2019-2019 北京信息科技大学 软件工程实验室 版权所有
</div>

<br/>
<br/>
<br/>

</body>
</html>
