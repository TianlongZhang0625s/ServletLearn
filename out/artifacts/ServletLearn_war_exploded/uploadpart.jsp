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
  <form action="/part.view" name="form" method="post" enctype="multipart/form-data">
    <table >
      <tr>
        <td>选择文件：</td>
        <td><input name = "photo" type="file" ></td>
      </tr>
      <tr>
    </table>
      <input name = "login" type="submit" name="upload">
  </form>

  </body>
</html>
