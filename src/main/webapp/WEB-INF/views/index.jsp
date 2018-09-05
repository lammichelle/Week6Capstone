<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href= "https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css">

</head>
<body>


<div class="container">

<h1>Log in!</h1>

	<p class="message">${ message }</p>
	<form action="/login" method="post">
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
		<p>
			<a href="/newuser">New User</a>
		</p>
	
</div>

</body>
</html>