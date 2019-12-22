<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/21
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp"%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>具体比赛信息的展示页面,包含学生信息.</title>

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
                    <li><a href="${ctx}/teacher/index">全部比赛信息 </a></li>
                    <li class="active"><a href="#">具体比赛信息展示 <span class="sr-only">(current)</span></a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 XXX老师</a>
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
        <td>北信科沙雕大赛</td>
        <td>宿舍级(C类)</td>
        <td>极品沙雕(一等奖)</td>
        <td>
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">
                竞赛证书
            </button>

            <!-- Modal -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">竞赛证书</h4>
                        </div>
                        <div class="modal-body">
                            <img src="../../../img/teacher/蓝色发箍女孩.jpg"  width="312px" height="400px">
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
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal1">
                指导证书
            </button>

            <!-- Modal -->
            <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel1">指导证书</h4>
                        </div>
                        <div class="modal-body">
                            <img src="../../../img/teacher/马尾可爱女.jpg" width="384px" height="512px">
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
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal2">
                比赛照片
            </button>

            <!-- Modal -->
            <div class="modal fade"  id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel3">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel3" >比赛照片</h4>
                        </div>
                        <div class="modal-body">
                            <img src="../../../img/teacher/双女比基尼.jpg" width="250px" height="357.75px">
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


        <tr>
            <td >123</td>
            <td >张华</td>
            <td >13</td>
            <td >1903</td>
        </tr>

        <tr>
            <td >123</td>
            <td >张华</td>
            <td >13</td>
            <td >1903</td>
        </tr>

        <tr>
            <td >123</td>
            <td >张华</td>
            <td >13</td>
            <td >1903</td>
        </tr>
    </table>


</div>

</body>
</html>