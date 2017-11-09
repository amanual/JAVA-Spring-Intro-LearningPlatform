<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" type = "text/css" href = "css/style.css">
<title>Assignment page</title>
</head>
<body>
	<h2>Fortran!</h2>
	<a href = "/m/38/0553/0733">Set up</a>
	<a href ="/m/38/0483/0345">Forms</a>
	<a href = "/m/38/0553/0342">Cards</a>
	<a href = "/m/26/0553/0348">Advanced</a>
	<a href ="/m/26/0483/2342">Binary</a><br>
	<p><input type = "checkbox">  Assignment completed</p><br>
	
	<textarea cols = "80" rows = "5" name = "textarea" ><c:out value = "${ links }"/></textarea>
	<p><a href = "/"> Back</a></p>
</body>
</html>