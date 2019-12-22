<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/22
  Time: 9:14
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
<br/>
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

        <div class="col-md-6" >
            <br/>
            <h3>该类别的全部比赛</h3>
            <table class="table table-bordered  table-condensed">
                <tr>
                    <th>比赛名称</th>
                    <th>比赛类别</th>
                    <th>比赛等级</th>
                    <th>成果基数</th>
                    <th>成果系数</th>

                </tr>
                <tr >
                    <td>北信科沙雕大比拼</td>
                    <td>校级B类</td>
                    <td>宿舍比拼二等奖</td>
                    <td>3.5</td>
                    <td>2.8</td>
                </tr>
            </table>
        </div>

        <div class="col-md-6 ">

            <br>
            <br>
            <br>
            <br>
            <br>
            <form class="form-horizontal">

                <div class="alert alert-info" role="alert">
                    请为类别添加具体比赛
                </div>


                <div class="form-group">
                    <label class="col-sm-2 control-label">比赛类别</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">北信科舞蹈大赛</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">比赛等级</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">校级</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">基数</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">5.5</p>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">系数</label>
                    <div class="col-sm-10">
                        <p class="form-control-static">6.8</p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuid" class="col-sm-2 control-label">比赛名称</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="stuid" placeholder="CompName">
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


    <div  align="left">
        <img src="../../../../img/teacher/橘调灵动少女.jpg" width="800px" height="680px" >
    </div>

</div>


</body>
</html>