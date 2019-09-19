<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
success
<c:forEach items="${list}" var="user">
    ${user.username} -- > ${user.birthday}
</c:forEach>
</body>
</html>
