<%--
  Created by IntelliJ IDEA.
  User: Alexa
  Date: 25.02.2020
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  <h2>Провертка работоспособности:</h2>
  <c:url value="/usersList" var="userList"/>
  <a href="${userList}">Список пользователей</a>
  </body>
</html>
