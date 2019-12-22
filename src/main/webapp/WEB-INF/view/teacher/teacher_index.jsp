<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/12
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>教师登录之后的首页</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

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
        <h3>我带队的比赛:</h3>
    </form>

    <form class="navbar-form navbar-right">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">比赛查询</button>
    </form>

    <table class="table table-hover">
        <tr>
            <th>比赛名称</th>
            <th>类别</th>
            <th>项目</th>
            <th>比赛时间</th>
            <th>比赛信息状态</th>
            <th>查看参赛学生信息</th>
            <th>学生信息管理</th>
            <%--<th>删除该比赛</th>--%>

        </tr>

        <tr>
            <td onclick="location.href='${ctx}/teacher/update';">北信科舞蹈大赛</td>
            <td onclick="location.href='${ctx}/teacher/update';">校级(A类)</td>
            <td onclick="location.href='${ctx}/teacher/update';">民族舞(一等奖)</td>
            <td onclick="location.href='${ctx}/teacher/update';">2019年12月21日10:18:02</td>
            <td onclick="location.href='${ctx}/teacher/update';">未提交</td>
            <td>

                <!-- 弹出模态框 -->
                <button type="button" class="btn btn-default  btn-sm" data-toggle="modal" data-target="#myModal">
                    查看参赛学生
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">XX老师-北信科舞蹈大赛</h4>
                            </div>
                            <div class="modal-body">
                                <table class="table table-hover">
                                    <tr>
                                        <th>学生学号</th>
                                        <th>学生姓名</th>
                                        <th>学生班级</th>
                                    </tr>
                                </table>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>

            </td>
            <td>
                <a href="${ctx}/teacher/stu/index">
                    <button type="button" class="btn btn-primary" data-dismiss="modal">学生信息管理</button>
                </a>
            </td>

            <%--<td onclick="location.href='${ctx}/teacher/login';">--%>
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">删除</button>--%>
            <%--</td>--%>
        <tr>
        <tr>
            <td>北信科歌唱大赛</td>
            <td>院级(B类)</td>
            <td>通俗唱法(一等奖)</td>
            <td>2019年12月21日10:18:02</td>
            <td onclick="location.href='${ctx}/teacher/show';">已提交</td>
            <td>
                <!-- 弹出模态框 -->
                <button type="button" class="btn btn-default  btn-sm" data-toggle="modal" data-target="#myModal">
                    查看参赛学生
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel1">XX老师-北信科舞蹈大赛</h4>
                            </div>
                            <div class="modal-body">
                                <table class="table table-hover">
                                    <tr>
                                        <th>学生学号</th>
                                        <th>学生姓名</th>
                                        <th>学生班级</th>
                                    </tr>
                                </table>
                            </div>
                            <div class="modal-footer">
                                <a href="#">
                                    <button type="button" class="btn btn-primary" data-dismiss="modal">学生信息修改</button>
                                </a>
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
            </td>

        <td>
            <a href="${ctx}/teacher/stu/index">
                <button type="button" class="btn btn-primary" data-dismiss="modal">学生信息管理</button>
            </a>
        </td>

    <%--<td onclick="location.href='${ctx}/teacher/login';">--%>
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">删除</button>--%>
            <%--</td>--%>
        <tr>
        <tr>
            <td>北信科沙雕大赛</td>
            <td>宿舍级(C类)</td>
            <td>极品沙雕(一等奖)</td>
            <td>2019年12月21日10:18:02</td>
            <td>已提交</td>
            <td>
                <!-- 弹出模态框 -->
                <button type="button" class="btn btn-default  btn-sm" data-toggle="modal" data-target="#myModal">
                    查看参赛学生
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                        aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel2">XX老师-北信科舞蹈大赛</h4>
                            </div>
                            <div class="modal-body">
                                <table class="table table-hover">
                                    <tr>
                                        <th>学生学号</th>
                                        <th>学生姓名</th>
                                        <th>学生班级</th>
                                    </tr>
                                </table>
                            </div>
                            <div class="modal-footer">
                                <a href="#">
                                    <button type="button" class="btn btn-primary" data-dismiss="modal">学生信息修改</button>
                                </a>
                                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
            </td>

        <td>
            <a href="${ctx}/teacher/stu/index">
                <button type="button" class="btn btn-primary" data-dismiss="modal">学生信息管理</button>
            </a>
        </td>

    <%--<td onclick="location.href='${ctx}/teacher/login';">--%>
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">删除</button>--%>
            <%--</td>--%>
        <tr>
    </table>


</div>


</body>
</html>
