<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Інформація про ${requestScope.blank.naming}</title>
        <style><%@include file="styles/style.css"%></style>
    </head>
    <body>
        <div class="content">
            <p class="info">Інформація про квартиру</p>
            <p class="info">Назва - ${requestScope.blank.naming}</p>
            <p class="info">Параметри - ${requestScope.blank.keywords}</p>
            <p class="info">Опис - ${requestScope.blank.description}</p>
            <jstl:choose>
                <jstl:when test="${not empty sessionScope.user}">
                <form method="post" action="controller?do=editBlank">
                    <input type="hidden" name="blank" value="${requestScope.blank.naming}">
                    <input type="submit" value="Редагувати"/>
                </form>
                <form method="post" action="controller?do=delete">
                    <input type="hidden" name="blank" value="${requestScope.blank.naming}">
                    <input type="submit" value="Видалити"/>
                </form>
                <a class = "red" href="controller?do=main">Повернутися до списку квартир</a>
                </jstl:when>
            </jstl:choose>
        </div>
    </body>
</html>
