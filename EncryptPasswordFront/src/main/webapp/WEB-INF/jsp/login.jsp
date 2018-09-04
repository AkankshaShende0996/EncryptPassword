<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="/encryptionConfirm">
<table>
<tr>
<td>
Email 
</td>
<td>
<input type="text" name="email" id="emailId"/>
</td>
</tr>
<tr>
<td>
Password
</td>
<td> <input type="password" name="pass" id="password"/> 
<a href="#"><span>Forgot?</span></a></td>
</tr>
<tr>
<td></td>
<td>
<button type="submit" name="login" ><span>Login</span></button>
</td>
</tr>
<tr>
<td></td>
<td>
<a name="signup" href="#"><span>New Capstore User? SignUp</span></a>
</td>
</tr>
</table>
</form>
</body>
</html>