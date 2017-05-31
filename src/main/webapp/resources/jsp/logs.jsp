<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${Logs.size()}
    <c:forEach items="${Logs}" var="log">
        <p> <h3>${log.leftPart}</h3> ${log.mathAction} <h3>${log.rightPart}</h3> at ${log.time}</p><hr>
    </c:forEach>
</body>
</html>
