<%-- 
    Document   : send
    Created on : 2015-07-16, 14:36:13
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>SENDING EMAIL</title>
    </head>
    <body> 
        
        <h1>Sending...</h1>
        <f:form action = "send" method="post">
            <table>
                <tr>
                    <td>To:</td>
                    <td><input type="text" name="odbiorca" size="65" /></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="podmiot" size="65" /></td>
                </tr>
                <tr>
                    <td>Message:</td>
                    <td><textarea cols="50" rows="10" name="wiadomosc"></textarea></td>
                </tr>               
                <tr>
                    <td colspan="2" align="center">
                        <input type="button" name="submit" value="Send E-mail" />
                    </td>
                </tr>
            </table>
       </f:form>
    </body>
</html>
