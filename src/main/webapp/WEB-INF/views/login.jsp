<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2022-12-09
  Time: 오후 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    img, label {display:inline-block;}
    label {width:130px}
    button {background-color:blue; color:white; font-size:15px}
</style>
<body>
    <form method="post" action="loginOk">
        <div><label>User ID: </label><input type='text' name='userid'/></div>
        <div><label>Password: </label><input type='password' name='password'/></div>
        <br>
        <button type='submit'>login</button>
    </form>
</div>
</body>
</html>
