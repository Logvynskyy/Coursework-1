<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Вхід</title>
    <style><%@include file="styles/style.css"%></style>
</head>
<body>
    <jstl:if test="${not empty requestScope.notExists}">
        <p>Такого користувача не знайдено</p>
    </jstl:if>
    <div class="content">
        <form method="post" action="controller?do=login">
            <input type="text" name="name" placeholder="login" size="10"/>
            <input type="password" name="password" placeholder="password" size="10"/>
            <input type="submit" value="Ввійти"/>
        </form>
        <a href="controller?do=main">Повернутися на початкову сторінку</a>
    </div>
</body>
</html>