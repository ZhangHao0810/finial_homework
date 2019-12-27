<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/21
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>插入学生信息</title>

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
                    <li><a href="${ctx}/teacher/index">比赛信息展示</a></li>
                    <li class="active"><a href="#">插入具体比赛的学生信息 <span class="sr-only">(current)</span></a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 XXX老师</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

</div>

<div class="container">
    <div class="row">
        <div class="col-md-6" align="center">
            <img src="../../../../img/teacher/橘调灵动少女.jpg" width="533px" height="453px">
        </div>
        <div class="col-md-6 ">

            <br>
            <br>
            <br>
            <br>
            <br>
            <form class="form-horizontal" action="${ctx}/teacher/stu/insert1?infoId=${infoId}" method="post">

                <div class="alert alert-info" role="alert">
                    请添加具体学生信息
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label">比赛名称</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">${compName}</p>
                    </div>
                </div>

                <div class="form-group">
                    <label for="stuname" class="col-sm-2 control-label">姓名</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="stuname" name="stuName" placeholder="StuName">
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuage" class="col-sm-2 control-label">年龄</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="stuage"  name="stuAge" placeholder="StuAge">
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuclass" class="col-sm-2 control-label">班级</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="stuclass" name="stuClass" placeholder="StuClass">
                    </div>
                </div>


                <div class="form-group">
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                    <button type="submit" class="btn btn-default  ">保存</button>
                </div>

            </form>
        </div>
    </div>


</div>


</body>
</html>
