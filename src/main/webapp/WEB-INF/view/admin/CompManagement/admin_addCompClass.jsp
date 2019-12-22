<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/22
  Time: 8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>添加管理员</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

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
                        <li ><a href="${ctx}/admin/index">学生竞赛管理平台 后台 <span class="sr-only">(current)</span></a></li>
                    </ul>
                    <li><a href="${ctx}/admin/showTeachers">教师管理 </a></li>
                    <li><a href="${ctx}/admin/showAllCompInfo">信息统计与查询 </a></li>
                    <li class="active"><a href="${ctx}/admin/compClass">比赛与比赛类别管理 </a></li>
                    <li ><a href="${ctx}/admin/showAdmin">管理员管理 </a></li>

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
        <div class="col-md-6" align="center">
            <img src="../../../../img/admin/白色少女.jpg" width="500px" height="500px">
        </div>
        <div class="col-md-6 ">

            <br>
            <br>
            <br>
            <br>
            <br>
            <form class="form-horizontal">
                <div class="alert alert-info" role="alert">
                    请添加比赛相关属性
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">类别</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" placeholder="如:A类">
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">等级</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"  placeholder="如:一等奖">
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">基数</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"  placeholder="Base">
                    </div>
                </div>
                <div class="form-group">
                    <label  class="col-sm-2 control-label">系数</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control"  placeholder="Factor">
                    </div>
                </div>
                <div class="form-group">
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp;
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp;
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp;
                    &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    <button type="submit" class="btn btn-info ">提交</button>
                </div>
            </form>
                </div>
    </div>




</div>


</body>
</html>