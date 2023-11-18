<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../css/style.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="header">
			<h1>Online Shopping Mall</h1>
		</div>
		<jsp:include page="menu.jsp">
			<jsp:param value="menu" name="menu"/>
		</jsp:include>
		<div class="nav">
			<jsp:include page="item.jsp">
				<jsp:param value="name" name="name"/>
				<jsp:param value="anh" name="anh"/>
			</jsp:include>
		</div>
		
		<div class="navBar">
			<jsp:include page="login.jsp">
				<jsp:param value="login" name="login"/>
			</jsp:include>
			
			<jsp:include page="category.jsp">
				<jsp:param value="category" name="category"/>
			</jsp:include>
		</div>
		
		<div class="footer">
			FPT POLYTECHNIC @2023. All Right Reserved
		</div>
	</div>
</body>
</html>