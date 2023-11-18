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
<body>
	<c:forEach var="item" items="${items}">
		<div class="prod">
			<div class="name">
				${item.name}
			</div>
			<div class="image">
				<a href="/L4Java4ai3va4/view/chitietsanpham.jsp?name=${item.name}">
				nhấn vào đây
				</a>
			</div>
			<div class="price">
			<strike>${item.price}</strike>
			${item.price*(1-item.discount)}
			</div> 
		</div>
		  
         
		
	</c:forEach>
</body>
</html>