<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Оренда квартир</title>
        <style><%@include file="styles/style.css"%></style>
    </head>
    <body>
        <div class="content">
            <jstl:choose>
                <jstl:when test="${not empty sessionScope.user}">
                    <p>${sessionScope.user.name},
                        <a href="controller?do=logout" class="exit">Вихід</a>
                    </p>
                    <form method="post" action="addinfo.jsp">
                        <input type="submit" class = "red" value="Додати інформацію про квартиру"/>
                    </form>
                    <p>Список ваших квартир</p>
                    <jstl:forEach items="${requestScope.blanks}" var="blank">
                        <jstl:if test="${blank.owner.equals(sessionScope.user)}">
                            <p><a href="controller?do=blank&naming=${blank.naming}">${blank.naming}</a></p>
                        </jstl:if>
                    </jstl:forEach>
                </jstl:when>
                <jstl:otherwise>
                    <form method="post" action="controller?do=search">
                        <input type="text" name="search" placeholder="Введіть параметри"/>
                        <input type="submit" class="btn" value="Пошук"/>
                    </form>
                    <div class="form-text">
                        <a href="register.jsp" class="form-link">Реєстрація</a>
                        <a href="login.jsp" class="form-link">Вхід</a>
                    </div>
                </jstl:otherwise>
            </jstl:choose>
        </div>
    </body>
</html>

