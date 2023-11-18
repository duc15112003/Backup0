<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="./usemap" method="post">
	<input type="text" name="fullname">
	<br>
	<input type="checkbox" name="hobbie" value="R">Đọc sách
		<br>
	<input type="checkbox" name="hobbie" value="D">Đi chơi
		<br>
	<input type="checkbox" name="hobbie" value="T">Nghỉ Ngơi
		<br>
		giới tính <br>
		<input type="radio" name="gender" value="male">nam
		<input type="radio" name="gender" value="female">nữ
		<input type="radio" name="gender" value="other">khác
		<button>submit</button>
	</form>
</body>
</html>