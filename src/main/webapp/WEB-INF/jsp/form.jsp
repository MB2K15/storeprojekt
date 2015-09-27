<%-- 
    Document   : form
    Created on : 2015-06-30, 12:21:52
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
    <title>Hallo</title>
    <style>
        #container {
            margin-top: 150px;
            width: 1000px;
            background-color: white;
            min-height: 300px;
            padding: 10px;
            margin-left: auto;
            margin-right: auto;
            font-size: 30px;
        }
    </style>
</head>
<body>
<h1>Skład sklepu</h1>

<div id="container">
    <f:form modelAttribute="product" action="addcart"
            method="post">

        <table border="1">
            <tr>
                <td>NAZWA:</td>
                <td><f:input path="name"/></td>
            </tr>
            <tr>
                <td>KATEGORIA:</td>
                <td><f:input path="category"/></td>
            </tr>
            <tr>
                <td>CENA:</td>
                <td><f:input path="price"/></td>
            </tr>
            <tr>
                <td>ILOSC:</td>
                <td><f:input path="number"/></td>
            </tr>

        </table>

        <input type="submit" value="SAVE CART"/>

    </f:form>

    <f:form method="POST" enctype="multipart/form-data"
            action="/upload">
        File to upload: <input type="file" name="file"><br/>
        <input type="submit" value="Upload"> Press here to upload the file!
    </f:form>
</div>


</body>

</html>
