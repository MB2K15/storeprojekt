
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    
    <title>Login Page</title>
    
    <style>
#login-box {
    
    
    
	width: 300px;
	padding: 50px;
	margin: 100px auto;
	background-color: red;
        color: white;
        -webkit-border-radius: 2px;
	-moz-border-radius: 2px;
        
	box-shadow:10px 10px 50px red;
        
	
}           
    </style>
</head>
<body>
    
    

<h1>Login panel : ${message}</h1>
<div id = "login-box">
<form action="login" method="post">
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='username'></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        
        <tr>
            <td colspan='2'><input name="submit" type="submit"
                                   value="submit"/></td>
        </tr>
       
        <tr>
            <td colspan="2"><a href='http://localhost:8080/bcprojekt/index' title="Register now">Register</a></td>
        </tr>
    </table>
</form>
</div>

</body>
</html>
