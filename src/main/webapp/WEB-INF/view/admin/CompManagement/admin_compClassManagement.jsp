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

 类别，项目的录入和修改
 各个项目的参数的设置和修改

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
                <a class="navbar-brand" href="${ctx}/index">首页(未来可替换成图标) </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">比赛信息展示 <span class="sr-only">(current)</span></a></li>
                    <li><a href="${ctx}/teacher/insert">录入比赛信息 </a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 XXX老师</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

</div>


<div class="container">

    <form class="navbar-form navbar-left">
        <h3>全部比赛项目:</h3>
    </form>

    <form class="navbar-form navbar-right">
        <a href="${ctx}/admin/addCompClass" class="btn btn-default" role="button">添加教师</a>
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

        <tr>
            <td>院级(B类)</td>
            <td>通俗唱法(一等奖)</td>
            <td>5.6</td>
            <td>2.3</td>
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
                                <h4 class="modal-title" id="myModalLabel">院级(B类)--通俗唱法(一等奖)</h4>
                            </div>
                            <form class="form-inline">
                                <div class="modal-body">
                                    <div class="form-group">
                                        <label class="sr-only">类别基数</label>
                                        <input type="text" class="form-control" placeholder="Base">
                                    </div>
                                    <div class="form-group">
                                        <label class="sr-only">类别系数</label>
                                        <input type="text" class="form-control" placeholder="Factor">
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
            <td>
                <button type="button" class="btn btn-default">删除</button>
            </td>
        <tr>
    </table>


</div>


</body>
</html>
