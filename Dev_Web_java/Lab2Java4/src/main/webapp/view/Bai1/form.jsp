<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./tinhtoan" method="post">
			<input name="a" placeholder="Cạnh a?"><br>
			<input name="b" placeholder="Cạnh b?"><br>
			<input name="c" placeholder="Cạnh c?"><hr>
			<button formaction="./dientich">Tính diện tích</button>
			<button formaction="./chuvi">Tính chu vi</button>
			<h3>${message}</h3>
	</form>
</body>
</html>