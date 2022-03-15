<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Редагувати інформацію</title>
        <style><%@include file="styles/style.css"%></style>
    </head>
    <body>
        <div class="content">
            <form method="post" action="controller?do=edit">
                <input type="hidden" name="blank" value="${requestScope.blank.naming}">
                <input type="text" name="newNaming" value="${requestScope.blank.naming}" placeholder="Заголовок" size="150 "/>
                <input type="text" name="newKeywords" value="${requestScope.blank.keywords}" placeholder="Параметри (через кому)" size="150"/>
                <textarea name="newDescription" cols="150" rows="15" placeholder="Інформація"></textarea>
                <input type="submit" value="Редагувати"/>
            </form>
        </div>
    </body>
</html>
