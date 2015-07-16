<%-- 
    Document   : shopping
    Created on : 2015-07-14, 17:08:26
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>MEDICAL STORE</title>
        
        <style>
            
            #welcome{
   
    width: 1000px;
    padding:1px;
    min-height: 15px;
    text-align: center;
    color:white;
    background-color: blue;   
            }
            
            
            
        </style>
    </head>
    <body>
        <div id="welcome">
        <h1>Witam w sklepie medycznym</h1>
        </div>
        <table>
            <tr>
            <td>Przejdź do zakupu towaru</td>
            <td><a href="./form">Start</a></td>
            </tr>
            <tr>
            <td>Dodaj nowy produkt</td>
            <td><a href="./add">Dodaj</a></td>
            </tr>
            <tr>
            <td>Kontakt</td>
            <td><a href="./Emailform">Formularz kontaktowy</a></td>
            </tr>
        </table>
    </body>
</html>
