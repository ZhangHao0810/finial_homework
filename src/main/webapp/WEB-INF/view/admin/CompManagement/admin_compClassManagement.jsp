<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/12
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>


<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>教师登录之后的首页</title>

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
                        <li><a href="${ctx}/admin/index1">学生竞赛管理平台 后台 <span class="sr-only">(current)</span></a></li>
                    </ul>
                    <li><a href="${ctx}/admin/showTeachers">教师管理 </a></li>
                    <li><a href="${ctx}/admin/showAllCompInfo">信息统计与查询 </a></li>
                    <li class="active"><a href="${ctx}/admin/compClass">比赛与比赛类别管理 </a></li>
                    <li><a href="${ctx}/admin/showAdmin">管理员管理 </a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 尊敬的管理员</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

</div>


<div class="container">

    <form class="navbar-form navbar-left">
        <h3>全部比赛类别</h3>
    </form>

    <form class="navbar-form navbar-right">
        <a href="${ctx}/admin/addCompClass" class="btn btn-default" role="button">添加比赛类别</a>
    </form>


    <table class="table table-hover">
        <tr>
            <th>比赛类别</th>
            <th>比赛等级</th>
            <th>基数</th>
            <th>系数</th>
            <th>修改参数</th>
            <th>删除类别</th>
        </tr>
        <c:forEach items="${list}" var="item" varStatus="status">
        <tr>
            <td onclick="location.href='${ctx}/admin/addComp?classId=${item.classId}';">${item.category}</td>
            <td onclick="location.href='${ctx}/admin/addComp?classId=${item.classId}';">${item.grade }</td>
            <td onclick="location.href='${ctx}/admin/addComp?classId=${item.classId}';">${item.base}</td>
            <td onclick="location.href='${ctx}/admin/addComp?classId=${item.classId}';">${item.factor}</td>
            <td>

                <!-- Button trigger modal -->
                <button type="button" class="btn btn-success " data-toggle="modal" data-target="#myModal">
                    修改该类别
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">比赛类别:${item.category}--比赛等级:${item.grade}</h4>
                            </div>
                            <form class="form-inline" action="${ctx}/admin/update">
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label class="sr-only">类别基数</label>
                                        <input type="text" class="form-control" name="base" value="${item.base}">
                                    </div>
                                    <div class="form-group">
                                        <label class="sr-only">类别系数</label>
                                        <input type="text" class="form-control" name="factor" value="${item.factor}">
                                        <input type="hidden" class="form-control" name="classId" value="${item.classId}" >
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="submit" class="btn btn-danger">提交</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </td>
            <td onclick="location.href='${ctx}/admin/deletClass?classId=${item.classId}';">
                <button type="button" class="btn btn-danger">删除</button>
            </td>
        <tr>
            </c:forEach>
    </table>


</div>

<div style="text-align: center;">
    Copyright © 2019-2019 北京信息科技大学 软件工程研究中心 版权所有 盗用必究!!  技术负责人:张浩
</div>
</body>
</html>
