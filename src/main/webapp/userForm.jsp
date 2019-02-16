<%--
  Created by IntelliJ IDEA.
  User: a1
  Date: 2019-02-16
  Time: 02:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>User</title>
    <style>
        dl {
            background: none repeat scroll 0 0 #FAFAFA;
            margin: 8px 0;
            padding: 0;
        }

        dt {
            display: inline-block;
            width: 170px;
        }

        dd {
            display: inline-block;
            margin-left: 8px;
            vertical-align: top;
        }
    </style>
</head>
<body>
<section>
    <h3><a href="index.html">Home</a></h3>
    <h2>${param.action == 'create' ? 'Create user' : 'Edit user'}</h2>
    <hr>
    <jsp:useBean id="user" type="ru.javawebinar.topjava.model.User" scope="request"/>
    <form method="post" action="users">
        <input type="hidden" name="id" value="${user.id}">

        <dl>
            <dt>Name:</dt>
            <dd><input type="text" value="${user.name}" name="name" required></dd>
        </dl>
        <dl>
            <dt>Email:</dt>
            <dd><input type="text" value="${user.email}" name="email" required></dd>
        </dl>
        <dl>
            <dt>Password:</dt>
            <dd><input type="text" value="${user.password}" name="password" required></dd>
        </dl>
        <dl>
            <dt>Enabled:</dt>
            <dd><input type="text" value="${user.enabled}" name="enabled" required></dd>
        </dl>
        <dl>
            <dt>Date Of Creation:</dt>
            <dd><input type="datetime-local" value="${user.registered}" name="registered" required></dd>
        </dl>
        <dl>
            <dt>Calories per day:</dt>
            <dd><input type="number" value="${user.caloriesPerDay}" name="caloriesPerDay" required></dd>
        </dl>
        <%--<dl>--%>
            <%--<dt>Roles:</dt>--%>
            <dd><input type="hidden"  name="roles" value="${user.roles}"></dd>
        <%--<input type="hidden"  name="roles" value="${user.roles}>--%>
        <%--</dl>--%>
        <%--<dl>--%>
            <%--<dt>Name:</dt>--%>
            <%--<dd><input type="datetime-local" value="${user.name}" name="dateTime" required></dd>--%>
        <%--</dl>--%>
        <%--<dl>--%>
            <%--<dt>Calories:</dt>--%>
            <%--<dd><input type="number" value="${meal.calories}" name="calories" required></dd>--%>
        <%--</dl>--%>
        <button type="submit">Save</button>
        <button onclick="window.history.back()" type="button">Cancel</button>
    </form>
</section>
</body>
</html>

