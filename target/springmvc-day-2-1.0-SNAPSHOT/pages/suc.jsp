<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
 <h3>成功了。。。。</h3>
<%-- 从mv中获取对象,用el表达式--%>
${msg}

 <%
     System.out.println("suc.jsp页面执行了");
 %>
</body>
</html>
