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


    <script>


        function checked(compName,teacherId) {
            window.location.href="${ctx}/teacher/comp/showSingleComp?compName=" + compName+"&teacherId="+ teacherId;
        }

        function notChecked(compName,teacherId) {
            window.location.href= "${ctx}/teacher/comp/update?compName=" + compName+"&teacherId="+teacherId ;

        }
        function choose(checke, compName,teacherId) {
            if (checke === "未提交") {
                notChecked(compName,teacherId);
            } else {
                checked(compName,teacherId);
            }
        }
    </script>
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
                <a class="navbar-brand" href="${ctx}/index">平台首页 </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="${ctx}/teacher/index">教师端首页 <span class="sr-only">(current)</span></a>
                    </li>
                    <li><a href="${ctx}/teacher/comp/insert?teacherName=${teacher.teacherName}">录入比赛信息 </a></li>

                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 ${teacher.teacherName}
                        老师</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

</div>


<div class="container">

    <form class="navbar-form navbar-left">
        <h3>我带队的比赛:</h3>
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
            <th>操作</th>

            <%--<th>删除该比赛</th>--%>

        </tr>
        <c:forEach items="${result}" var="item" varStatus="status">
        <div id="test">
            <tr>
                <td onclick="choose('${item.checked}','${item.compName}','${teacher.teacherId}')">${item.compName}</td>
                <td onclick="choose('${item.checked}','${item.compName}','${teacher.teacherId}')">${item.leibie}</td>
                <td onclick="choose('${item.checked}','${item.compName}','${teacher.teacherId}')">${item.xiangmu}</td>
                <td onclick="choose('${item.checked}','${item.compName}','${teacher.teacherId}')">${item.createTime}</td>
                <td onclick="choose('${item.checked}','${item.compName}','${teacher.teacherId}')">${item.checked}</td>
                <td>

                    <!-- 弹出模态框 -->
                    <button type="button" class="btn btn-default  btn-sm" data-toggle="modal"
                            data-target="#${item.compName}">
                        查看参赛学生
                    </button>

                    <!-- Modal -->
                    <div class="modal fade" id="${item.compName}" tabindex="-1" role="dialog"
                         aria-labelledby="myModalLabel">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                            aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title"
                                        id="myModalLabel">老师: ${teacher.teacherName}-比赛名称:${item.compName}</h4>
                                </div>
                                <div class="modal-body">
                                    <table class="table table-hover">
                                        <tr>
                                            <th>学生id</th>
                                            <th>学生姓名</th>
                                            <th>学生年龄</th>
                                            <th>学生班级</th>
                                        </tr>
                                        <c:forEach items="${item.stus}" var="stu" varStatus="status">
                                            <tr>
                                                <td>${stu.stuId}</td>
                                                <td>${stu.stuName}</td>
                                                <td>${stu.stuAge}</td>
                                                <td>${stu.stuClass}</td>
                                            </tr>
                                        </c:forEach>
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
                    <a href="${ctx}/teacher/stu/index1?infoId=${item.infoId}">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">学生信息管理</button>
                    </a>
                </td>

                <td>
                    <a href="${ctx}/teacher/comp/delet?teacherId=${teacher.teacherId}&compName=${item.compName}">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">删除比赛</button>
                    </a>

                </td>

                    <%--<td onclick="location.href='${ctx}/teacher/login';">--%>
                    <%--<button type="button" class="btn btn-default" data-dismiss="modal">删除</button>--%>
                    <%--</td>--%>
            </tr>
            </c:forEach>
        </div>

        <%--<td onclick="location.href='${ctx}/teacher/login';">--%>
        <%--<button type="button" class="btn btn-default" data-dismiss="modal">删除</button>--%>
        <%--</td>--%>


            <%--<td onclick="location.href='${ctx}/teacher/login';">--%>
            <%--<button type="button" class="btn btn-default" data-dismiss="modal">删除</button>--%>
            <%--</td>--%>
        <tr>
    </table>


</div>


</body>
</html>
