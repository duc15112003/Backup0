<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
.container{
	margin:0;
	padding:0;
}

.header{
	width: 100%;
	height: 10%;
	background-color: blue;
}
.menu{
	background-color: green;
	margin-top: 2%;
	width: 100%;
	height: 10%;
}

.menu ul{
	margin-left: -4%;
}

.menu ul li{
	display: inline;
	margin-left: 20px;
}

.item{
	width: 75%;
	height: auto;
	float: left;
}

.item .sp{
	text-align: center;
	border: 1px solid black;
	width: 30%;
	height: 200px;
	display: inline-block;
	margin-top: 2%;
}
.item .sp .anh{
	margin-left: 10%;
	margin-top: 10%;
	border: 1px solid green;
	display: block;
	width: 80%;
	height: 100px;
}
.item .sp .name{
	border: 1px solid blue;
	display: block;
	margin-bottom: 9%;
}

.navBar{
	width: 25%;
	height: auto;
	float: right;
}

.login{
	border: 1px solid black;
	width: 90%;
	height: 100px;
}
.btnlogin{
	float:right;
}

table{
	border:1px solid red;
	width: 90.7%;
}
tr td{
	border:1px solid red;
	text-align: center;
}
tr td li{
	list-style-type: none;
}
.footer{
	margin-top: 40%;
	text-align: center;
	border: 1px solid red;
}
</style>
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