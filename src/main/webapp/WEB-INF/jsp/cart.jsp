<%-- 
    Document   : product
    Created on : 2015-06-30, 23:56:35
    Author     : Matt
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1250" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
    <title>JSP Page</title>
</head>
<body>
<h1>Twój koszyk:</h1>

<table>
    <th>
    <td>Nazwa :</td>
    <td>Kategoria:</td>
    <td>Cena:</td>
    </th>
    <c:forEach items='<%= request.getSession().getAttribute("lista")%>' var="p">
        <tr>
            <td>${p.name}</td>
            <td>${p.category}</td>
            <td>${p.price}</td>
        </tr>
    </c:forEach>
</table>

<a href="./form.htm">Continue shopping....</a>
</body>
</html>
