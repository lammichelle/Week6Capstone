<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User form</title>
<link rel="stylesheet" href= "https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css">

</head>
<body>

		<form action="/adduser" method="post">
		<p>
			<input id="id" name="id" type="hidden" value = "null">
		</p>
		<p>
			<label for="email">Email:</label>
			<input id="email" name="email" type="email">
		</p>
		<p>
			<label for="password">Password:</label>
			<input id="password" name="password">
		</p>
		<p>
			<button type="submit">Login</button>
		</p>
		</form>
		

</body>
</html>