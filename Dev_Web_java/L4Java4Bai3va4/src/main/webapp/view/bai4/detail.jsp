<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.prod{
		float: left;
		margin-left: 50px;
		margin-top:20px;
		border: 1px solid red; 
		width: 300px;
		height: auto;
	}
	.name{
		text-align:center;
		width:100%;
		background-color: blue;
		border: 1px solid black;
	}
	.image{
		text-align: center;
	}
	.price{
		float: left;
		border: 1px solid blue;
		width: 100%;
		text-align: center;
	}
</style>
<body>
		
		<div class="prod">
			<div class="name">
				${item.name}
			</div>
			<div class="image">
				<a href="chitietsanpham.jsp" >
				<img alt="" src="./image/${item.image}" style="width: 100px;height: 50px;">
				</a>
			</div>
			<div class="price">
			<strike>${item.price}</strike>
			${item.price*(1-item.discount)}
			</div> 
		</div>

</body>
</html>