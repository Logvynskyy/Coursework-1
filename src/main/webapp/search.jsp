<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Знайдені квартири</title>
        <style><%@include file="styles/style.css"%></style>
    </head>
    <body>
        <div class="content">
            <a href="controller?do=main">Головна сторінка</a>
            <form method="post" action="controller?do=search">
                <input type="text" placeholder="Пошук" name="search"/>
                <input type="submit" value="Пошук"/>
            </form>
            <jstl:forEach items="${requestScope.searchBlanks}" var="blank">
                <p><a href="controller?do=blank&naming=${blank.naming}">${blank.naming}</a></p>
            </jstl:forEach>
        </div>
    </body>
</html>
