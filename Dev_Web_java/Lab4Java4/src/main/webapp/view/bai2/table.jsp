<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width:100%;">
			<thead>
			<tr>
				<th>Username</th>
				<th>Password</th>
				<th>Remember?</th>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td>${items[0].name}</td>
					<td>${items[0].pass}</td>
					<td>${items[0].remember?'Yes':'No'}</td>
				</tr>
			</tbody>
	</table>
</body>
</html>