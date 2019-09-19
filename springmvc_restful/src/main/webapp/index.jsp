<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<a href="user/1">查询请求</a><br>
<form action="user" method="post">
    <input type="submit" value="post添加请求">
</form>   <br>
<form action="user" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="put修改请求">
</form>  <br>
<form action="user/1" method="post">
    <input type="hidden" name="_method" value="delete">

    <input type="submit" value="delete删除请求">
</form>  <br>

</body>
</html>
