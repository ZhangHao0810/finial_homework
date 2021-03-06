<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/25
  Time: 18:14
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
                        <li ><a href="${ctx}/admin/index1">学生竞赛管理平台 后台 <span class="sr-only">(current)</span></a></li>
                    </ul>
                    <li><a href="${ctx}/admin/showTeachers">教师管理 </a></li>
                    <li><a href="${ctx}/admin/showAllCompInfo">信息统计与查询 </a></li>
                    <li><a href="${ctx}/admin/compClass">比赛与比赛类别管理 </a></li>
                    <li class="active"><a href="${ctx}/admin/showAdmin">管理员管理 </a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 尊敬的管理员</a>
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
        <br/>
        <br/>
        <div class="col-md-3" align="left">
            <div class="alert alert-danger alert-dismissible fade in" role="alert">
                <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                        aria-hidden="true">×</span></button>
                <h4>Oh,添加失败了!</h4>
                <p>您的管理员账号重复,请换用其他字段试一下吧</p>
            </div>
        </div>
        <div class="col-md-6 ">

            <br>
            <br>
            <br>
            <br>
            <br>
            <form class="form-horizontal" action="${ctx}/admin/addAdmin1" method="post">

                <div class="alert alert-info" role="alert">
                    请添加具体管理员信息
                </div>

                <div class="form-group">
                    <label for="adminname" class="col-sm-2 control-label">管理员<br/>账号</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="adminname" name="adminName" placeholder="AdminName">
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuid" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="stuid"  name="password" placeholder="PassWord">
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
                    <button type="submit" class="btn btn-default  ">保存</button>
                </div>

            </form>
        </div>
    </div>


</div>

<div style="text-align: center;">
    Copyright © 2019-2019 北京信息科技大学 软件工程研究中心 版权所有 盗用必究!!  技术负责人:张浩
</div>
</body>
</html>