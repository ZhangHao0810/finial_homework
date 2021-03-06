<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/21
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>具体比赛信息的展示页面,包含学生信息.</title>

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
                <a class="navbar-brand" href="${ctx}/index">平台首页 </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="${ctx}/teacher/index?teacherName=${teacherName}">比赛信息展示 </a></li>
                    <li class="active"><a href="#">具体比赛信息展示 <span class="sr-only">(current)</span></a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 尊敬的老师</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

</div>

<div class="container">


    <table class="table table-hover  table-striped">

        <h5>比赛信息:</h5>
        <tr>
            <th>比赛名称</th>
            <th>比赛类别</th>
            <th>比赛等级</th>
            <th>竞赛证书</th>
            <th>指导证书</th>
            <th>比赛照片</th>
        </tr>

        <tr>
            <td>${compName}</td>
            <td>${clazz.category}</td>
            <td>${clazz.grade}</td>
            <td>
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal1">
                    竞赛证书
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">竞赛证书</h4>
                            </div>
                            <div class="modal-body">
                                <img src="../../../../upload/${teacherName}/${compName}/compCert/${compCert}"
                                     width="580px" height="380px">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </td>


            <td>
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal12">
                    指导证书
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal12" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel1">指导证书</h4>
                            </div>
                            <div class="modal-body">
                                <img src="../../../../upload/${teacherName}/${compName}/guideCert/${guidecert}"
                                     width="580px" height="380px">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </td>

            <td>
                <!-- Button trigger modal -->
                <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal23">
                    比赛照片
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal23" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel3">比赛照片</h4>
                            </div>
                            <div class="modal-body">
                                <img src="../../../../upload/${teacherName}/${compName}/compPhoto/${compPhoto}"
                                     width="580px" height="380px">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </td>

        </tr>
    </table>
    <br>
    <table class="table table-hover  table-striped">
        <h4>参赛学生信息</h4>
        <tr>
            <th>学生学号</th>
            <th>学生姓名</th>
            <th>学生年龄</th>
            <th>学生班级</th>
        </tr>
        <c:forEach items="${stus}" var="item" varStatus="status">
        <tr>
            <td>${item.stuId}</td>
            <td>${item.stuName}</td>
            <td>${item.stuAge}</td>
            <td>${item.stuClass}</td>
        </tr>
        </c:forEach>
    </table>

</div>

<div style="text-align: center;">
    Copyright © 2019-2019 北京信息科技大学 软件工程研究中心 版权所有 盗用必究!! 技术负责人:张浩
</div>
</body>
</html>
