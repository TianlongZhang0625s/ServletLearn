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
    <title>$Title$</title>
  </head>
  <body>
  <form action="/body.view" name="form" method="post">
    <table >
      <tr>
        <td>姓名：</td>
        <td><input name = "name" type="text"></td>
      </tr>
      <tr>
        <td>密码：</td>
        <td><input name = "pass" type="text"></td>
      </tr>
    </table>
      <input name = "login" type="submit" value="送出">
  </form>

  </body>
</html>
