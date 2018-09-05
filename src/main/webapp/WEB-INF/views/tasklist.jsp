<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
<link rel="stylesheet" href= "https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css">

</head>
<body>

<p class="message">${ message }</p>
<table class="table">
			<thead>
				<tr>
					<th>Description</th>
					<th>Due Date</th>
					<th>Completed</th>
					<th>Delete</th>
					<th>Finish Task</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${ items }">
					<tr>
						<td>${ item.description }</td>
						<td>${ item.dueDate }</td>
						<td><input type="checkbox" value="true" ${ item.isComplete ? 'checked' : '' }></td>
						<td> <a href="/delete">Delete</a></td>
						<td> <a href="/edittask">Finish Task</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
		<a href="/add"> Add Task</a>
		</p>
		<p>
		<a href="/logout"> Logout</a>
		</p>

</body>
</html>