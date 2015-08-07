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
<center>
<table border="2" width="1000px" cellpadding="20px" style="border-collapse: collapse">

    <c:forEach items='<%= request.getSession().getAttribute("product")%>' var="p">

        <tr>
            <td>Nazwa : ${p.name}</td>
            <td>Kategoria:${p.category}</td>
            <td>Cena:${p.price}</td>
            <td>Ilość:${p.number}</td>
           <td>
               <a href="./remove.htm?productId=${p.id}"
                  onclick="return confirm('Are you sure ??')"> Remove product   
               </a>
           </td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="5">
            Total:$ <%= request.getSession().getAttribute("wszystko")%>
        </td>
    </tr>
</table>

<a href="./form.htm">Continue shopping....</a>
</center>
</body>
</html>
