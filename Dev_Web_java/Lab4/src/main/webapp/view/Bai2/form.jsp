<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User editer</h1>
	<form action="./submit" method="post">
		Username: 
		<input name="username" value=”${form.name}”><br>
		Password: 
		<input name="password" value=”${form.pass}”><br>
		<input name="remember" type="checkbox" ${form.remember?'checked':''}>
		Remember me?
		<br>
		<button>Create</button>
		
	</form>
</body>	
</html>