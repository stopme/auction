<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>用户上传图片页面</title>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<center>
    <form action="good/create.do" method="post"
          enctype="multipart/form-data">
        文件1
        <input type="file" name="files" /><br />
        文件2
        <input type="file" name="files" /><br />
        文件3
        <input type="file" name="files" /><br />
        文件4
        <input type="file" name="files" /><br />
        <input type="input" name="goodName"  /><br />
        <input type="input" name="goodCode" /><br />
        <input type="input" name="goodTag" value="厂家直销;保证A货;源头资源" /><br />
        <input type="input" name="miaoshaPrice" value="90000" /><br />
        <input type="input" name="salePrice" value="40000" /><br />
        <input type="text" name="goodDetail"  /><br />
        <input type="submit" value="上 传" />
    </form>
    <h5>上传结果：</h5>


    <c:forEach items="${fileList}" var="imagename">
        <img alt="暂无图片" src="${imagename}" /> <br/>
    </c:forEach>

</center>
</body>
</html>
