<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> view student details </h2>
		<a href="/"> add new students</a>
		
		<table border = "1">
			<thead>
				<tr>
					<th> sr.no </th>
					<th> name </th>
					<th> email </th>
					<th> gender </th>
					<th> courses </th>
					<th> timings </th>
				</tr>
			
			</thead>
			
			<tbody>

			<c:forEach items="${stud}" var="student" varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${student.name}</td>
						<td>${student.email}</td>
						<td>${student.gender}</td>
						<td>${student.course}</td>
						<td>${student.timings}</td>
						
					</tr>
				</c:forEach>
			
			</tbody>
		
		</table>

</body>
</html>