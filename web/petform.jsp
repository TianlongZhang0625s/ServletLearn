<%--
  Created by IntelliJ IDEA.
  User: CAS
  Date: 2018/7/17
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html ; charset=UTF-8">
    <title>$Title$</title>
  </head>
  <body>
  <form action="/pet" name="form" method="post">

    姓名：<input type="text" name="user" value=""><br>
    邮件：<input type="text" name="email" value=""><br>
    你喜爱的宠物代表<br>
    <select name ="type" size = "6"  multiple="true">
      <option value="猫">猫</option>
      <option value="狗">狗</option>
      <option value="鱼">鱼</option>
      <option value="鸟">鸟</option>
    </select><br>

    <input type="submit" value="送出">
  </form>
  </body>
</html>
