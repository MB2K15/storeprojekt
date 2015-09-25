<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1250" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
    <title>JSP Page</title>
</head>
    <title>EXAMPLE STORE</title>
    <style>

        #welcome {

            width: 1000px;
            padding: 1px;
            min-height: 15px;
            text-align: center;
            color: white;
            background-color: blue;
        }

        #content {

            margin-left: auto;
            margin-right: auto;
            width: 1000px;
            min-height: 200px;
        }


    </style>
</head>
<body>
<div id="content">
    <div id="welcome">
        <h1>Witam w sklepie medycznym</h1>
    </div>
    <table>
        <tr>
            <td>Dodaj produkty na magazyn</td>
            <td><a href="./form">Start</a></td>
        </tr>
        <tr>
            <td>Dodaj nowy produkt</td>
            <td><a href="./add">Dodaj</a></td>
        </tr>
        <tr>
            <td>Kontakt</td>
            <td><a href='./Emailsend'>Formularz kontaktowy</a></td>
        </tr>
    </table>

    <h3>Produkty</h3>
    <table>
        <thead>
        <td>Name</td>
        <td>Price</td>
        </thead>
        <c:forEach items='<%= request.getSession().getAttribute("allproducts")%>' var="prod">
            <tr>
                <td>${prod.name}</td>
                <td>${prod.price}</td>
                

                <td>
                    <form action="addtocart" method="post">
                        <input hidden="true" name="productId" value="${prod.id}"/>
                        <button>Dodaj do koszyka</button>
                        
                    </form>
                </td>
            </tr>

        </c:forEach>
    </table>
</div>
</body>
</html>
