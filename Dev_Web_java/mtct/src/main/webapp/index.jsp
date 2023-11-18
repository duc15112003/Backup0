<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./hello" method="post">
	<input type="text" name="a" value="${s1}">
	<input type="text" name="b" value="${s2}">
		<button formaction="./cong">+</button>
		<button formaction="./tru">-</button>
		<button formaction="./nhan">*</button>
		<button formaction="./chia">/</button>
	</form>
	<mark> ${kq} </mark>
</body>
</html>