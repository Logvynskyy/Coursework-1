<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Додати квартиру</title>
        <style><%@include file="styles/style.css"%></style>
    </head>
    <body>
        <div class="content">
            <a class="btn" href="controller?do=main">Головна сторінка</a>
            <form method="post" action="controller?do=create">
                <input type="text" name="naming" placeholder="Заголовок" size="150"/>
                <input type="text" name="keywords" placeholder="Параметри (через кому)" size="150"/>
                <textarea name="description" cols="150" rows="15" placeholder="Основна інформація"></textarea>
                <input type="submit" value="Додати"/>
            </form>
        </div>
    </body>
</html>
