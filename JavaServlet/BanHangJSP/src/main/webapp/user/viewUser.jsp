<%--
  Created by IntelliJ IDEA.
  User: ThinkBook
  Date: 5/29/2023
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
       String name = request.getParameter("name");
       String password = request.getParameter("password");
       String phone = request.getParameter("phone");
       String about = request.getParameter("about");
       String favourites1 = request.getParameter("favourites1");
       String favourites2 = request.getParameter("favourites2");
        String fav = "";
        if (favourites1 !=null){
            fav +=favourites1 + " - ";
        }
        if (favourites2 !=null){
            fav +=favourites2;
        }
    %>

    <table>
        <tr>
            <td>Name</td> <td><%= name %></td>
        </tr>
        <tr>
            <td> Password</td> <td><%=  password %></td>
        </tr>
        <tr>
            <td>Phone</td> <td><%= phone %></td>
        </tr>
        <tr>
            <td>About</td> <td><%= about %></td>
        </tr>
        <tr>
            <td>Favourites</td> <td><%= fav %></td>
        </tr>
    </table>
</body>
</html>
