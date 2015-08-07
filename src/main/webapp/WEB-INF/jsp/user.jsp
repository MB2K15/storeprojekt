<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User management</title>

    <style>
        #other {

            width: 1000px;
            background-color: yellowgreen;
            min-height: 300px;
            padding: 10px;
            margin-left: auto;
            margin-right: auto;

        }


    </style>
</head>
<body>
<div id="other">
    <h1>Users Data</h1>

    <h2><a href="login">Go to login page</a></h2>

    <form:form action="user" method="POST" commandName="usr">
    <table>
        <tr>
            <td>User Name</td>
            <td><form:input path="usrName"/></td>
        </tr>
        <tr>
            <td>User Password</td>
            <td><form:password path="usrPasswd"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="action" value="Add"/>
            </td>
        </tr>
    </table>
    </form:form>
</body>
</html>