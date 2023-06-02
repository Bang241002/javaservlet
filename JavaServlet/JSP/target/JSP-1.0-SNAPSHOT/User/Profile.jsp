<%--
  Created by IntelliJ IDEA.
  User: ThinkBook
  Date: 5/29/2023
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>Xin chao Luong Viet Hoang</h1>
<% int id = Integer.valueOf(request.getParameter("id"));
    String name = request.getParameter("name");
%>
<p>ID cua Hoang la <%= id%></p>
<p>Ten day du cua Hoang la <%= name%></p>
<a href="logout.jsp">Dang Xuat</a>
</body>
</html>
