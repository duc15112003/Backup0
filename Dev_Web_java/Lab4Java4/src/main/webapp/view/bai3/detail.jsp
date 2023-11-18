<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Tên SP:
	<br>
	Giá Gốc <strike>${item.price}</strike>
	<br>
	Giá Mới: <c:set var="newprice" value="${item.price*(1-item.discount)}"/>
	<fmt:formatNumber value="${newprice}"/>
	<br>
	Mức Giá:
	<c:choose>
		<c:when test="${newprice < 10}">Giá thấp</c:when>
		<c:when test="${newprice > 100}">Giá cao</c:when>
		<c:otherwise>Bình thường</c:otherwise>
	</c:choose>
</body>
</html>