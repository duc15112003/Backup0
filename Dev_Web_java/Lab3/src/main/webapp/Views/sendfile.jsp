<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Gửi email</h1>
	<h2> ${mess} </h2>
	<form action="sendFileEmail" method="post" enctype="multipart/form-data">
	form
	<input type="text" name="form">
	<br>
	to
	<input type="text" name="to">
	<br>
	subject
	<input type="text" name="subject">
	<br>
	file
	<input type="file" name="filetest">
	<br>
	body
	<input type="text" name="body">
	<button>send</button>
	</form>
	<br>
</body>
</html>