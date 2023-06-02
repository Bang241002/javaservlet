<%--
  Created by IntelliJ IDEA.
  User: ThinkBook
  Date: 5/29/2023
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>ADD USER</h1>
    <form action="viewUser.jsp" method="post">
        <input name="name" type="text" placeholder="User name"> <br/>
        <input name="password" type="password" placeholder="Password"> <br/>
        <input name="phone" type="text" placeholder="Phone number"> <br/>
        <textarea rows="3" cols="25" name="about" placeholder="Introduction"></textarea> <br/>
        <input name="favourites1" type="checkbox" value="Xemphim"> Xem phim
        <input name="favourites2" type="checkbox" value="Xemkich"> Xem Kich

        <input type="submit" value="ADD">
    </form>
</body>
</html>
