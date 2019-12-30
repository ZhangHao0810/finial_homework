<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/12/12
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <title>录入比赛信息页面</title>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../../../bootstrap-3.3.7-dist/css/bootstrap.css"/>

    <!-- 引入 JQuery -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="../../../../bootstrap-3.3.7-dist/js/bootstrap.js"></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">



    <script  type="text/javascript">
        function save(){
            document.form1.action="${ctx}/teacher/comp/insert2";
            document.form1.submit();
        }
        function send(){
            document.form1.action="${ctx}/teacher/comp/insert1";
            document.form1.submit();
        }

        function myCheck()
        {//循环所有的表单元素； 也可以用jQuery：$("#表单id")[0].elements.length-1

            var flag=1;
            for(var i=0;i<document.form1.elements.length-1;i++) //下面减一是因为数组的下标为0
            {
                if(document.form1.elements[i].value=="")
                {
                    flag=0;
                    document.form1.elements[i].focus();
                }
            }
            if (flag===1) {
                send();
            }else {
                alert("请上传三张图片.");
                window.location.href="${ctx}/teacher/comp/insert?teacherName=${teacherName}";
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
                <a class="navbar-brand" href="${ctx}/index">平台首页</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="${ctx}/teacher/index1?teacherName=${teacherName}">比赛信息展示 <span class="sr-only">(current)</span></a></li>
                    <li class="active"><a href="#">录入比赛信息 </a></li>
                </ul>
                <form class="navbar-form navbar-right">
                    <a href="#" class="btn btn-primary  btn-sm  disabled" role="button">欢迎您 ${teacherName}老师</a>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-6" align="center">
            <img src="../../../../img/teacher/可爱睡衣小熊女.jpg">
        </div>
        <div class="col-md-6 ">

            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <form name="form1" enctype="multipart/form-data" method="post">

                <div class="form-group">
                    <label>比赛名称</label>
                    <select class="form-control" name="compName">
                        <c:forEach items="${comps}" var="item" varStatus="status">
                        <option>${item.compName}</option>
                        </c:forEach>
                    </select>
                </div>
                <br>

                    <div class="form-group">
                        <label for="竞赛证书"> 竞赛证书:</label>
                        <input type="file" id="竞赛证书" name="compCert">
                    </div>


                    <div class="form-group">
                        <label for="指导证书">指导证书:</label>
                        <input type="file" id="指导证书" name="guideCert">
                    </div>


                    <div class="form-group">
                        <label for="比赛照片">比赛照片:</label>
                        <input type="file" id="比赛照片" name="compPhoto">
                    </div>

                <input type="hidden" name="teacherName" value="${teacherName}"/>

                    <button type="submit" class="btn btn-default" onclick="save()">保存</button>
                    <button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="top"
                            title="提交比赛信息之后不可修改!!请慎重" onclick="send()">提交
                    </button>
            </form>
        </div>
    </div>


</div>

<div style="text-align: center;">
    Copyright © 2019-2019 北京信息科技大学 软件工程研究中心 版权所有 盗用必究!!  技术负责人:张浩
</div>
</body>
</html>
