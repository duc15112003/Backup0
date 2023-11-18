<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./readdata" method="post">
		Tên đăng nhập: <input name="username"><br> Mật khẩu: <input
			name="password" type="password"><br> Giới tính: <input
			name="gender" type="radio" value="true">Nam <input
			name="gender" type="radio" value="false">Nữ<br> <input
			name="married" type="checkbox">Đã có gia đình?<br> Quốc
		tịch: <select name="country">
			<option value="VN">Việt Nam</option>
			<option value="US">United States</option>
		</select><br> Ghi chú:
		<textarea name="notes" rows="3" cols="30"></textarea>
		<hr>
		<button>Đăng ký</button>
	</form>
	
	<mark>
		<ul>
		<li>Tên đăng nhập: <b>${param.username}</b></li>
		<li>Mật khẩu: <b>${param.password}</b></li>
		<li>Giới tính: <b>${param.gender}</b></li>
		<li>Tình trạng hôn nhân: <b>${param.married}</b></li>
		<li>Quốc tịch: <b>${param.country}</b></li>
		<li>Ghi chú: <b>${param.notes}</b></li>
		</ul>	
	</mark>
</body>
</html>