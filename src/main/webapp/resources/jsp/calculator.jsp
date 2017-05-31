
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>Calculator</title>
</head>
<body>
<sf:form action="/calculate/calc" method="post" modelAttribute="Number">
    <sf:input path="num"/><sf:errors path="num"/><sf:label path="num"></sf:label><br><br>
    <input type="submit" name="action" value="add">
    <input type="submit" name="action" value="substr">
    <input type="submit" name="action" value="divide">
    <input type="submit" name="action" value="multiply">
</sf:form>
<h3>${Number.num}</h3>
</body>
</html>
