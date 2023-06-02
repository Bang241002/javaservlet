<%--
  Created by IntelliJ IDEA.
  User: ThinkBook
  Date: 5/29/2023
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Hello JSP</p>
<a href="User/Profile.jsp?id=1&name=LUONGVIETHOANG">Thong tin nguoi dung</a>
<%
    int x =10; int y = 15;
    int z = x+y;
%>

<h1><%=z %></h1>
</body>
</html>
