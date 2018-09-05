<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Task form</title>
<link rel="stylesheet" href= "https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css">

</head>
<body>




	<form action="/addTask" method="post">
		<p>
			<label for="description">Description:</label>
			<input id="description" name="description">
		</p>
		<p>
			<label for="dueDate">Due Date:</label>
			<input id="dueDate" name="dueDate">
		</p>
		<p>
			<label for="isComplete">Complete:</label>
			<select id="isComplete" name="isComplete">
  			<option value="1">True</option>
  			<option value="0">False</option>
			</select>
			
		</p>
		<p>
			<button type="submit">Add Task</button>
		</p>
		</form>
		
		<p>
		<a href="/tasklist">Cancel</a>
		</p>
		
</body>
</html>