<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User management</title>

<style>
    #other
    {
        
         
                width:1000px;
                background-color:blue;
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

<form:form action="user.do" method="POST" commandName="usr">
	<table>
		<tr>
			<td>User ID</td>
			<td><form:input path="usrId"/></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><form:input path="usrName"/></td>
		</tr>
		<tr>
			<td>User Password</td>
			<td><form:input path="usrPasswd"/></td>
		</tr>
		<tr>
			<td>User Description</td>
			<td><form:input path="usrDesc"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add"/>
				<input type="submit" name="action" value="Edit"/>
				<input type="submit" name="action" value="Delete"/>
				<input type="submit" name="action" value="Search"/>
			</td>
		</tr>
	</table>
</form:form>
<br>

<table border="1">
	<th>User Id</th>
	<th>User Name</th>
	<th>User Password</th>
	<th>User Desc</th>
	<c:forEach items="${usrList}" var="usr">
		<tr>
			<td>${usr.usrId}</td>
			<td>${usr.usrName}</td>
			<td>${usr.usrPasswd}</td>
			<td>${usr.usrDesc}</td>
		</tr>
	</c:forEach>	
</table>
    </div>
</body>
</html>