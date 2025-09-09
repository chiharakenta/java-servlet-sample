<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>students</title>
</head>
<body>
    <h1>Hello Students</h1>
    <ul>
        <c:forEach var="student" items="${studentList}">
            <li>${student}</li>
        </c:forEach>
    </ul>
</body>
</html>