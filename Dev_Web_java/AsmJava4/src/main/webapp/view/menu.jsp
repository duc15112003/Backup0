<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.nav>li{
   float: left;
   margin-right: 15px;
 }
 
 .nav>li>a{
   text-transform: uppercase;
   color: red;
 }
 
 .nav li{
   position: relative;
   list-style:none;
 }
 
 .nav li a{
   padding: 10px;
   line-height: 20px;
   display: inline-block;
 }
 
 .nav .sub-menu{
   display: none;
   position: absolute;
   top: 0;
   left: 100%;
   width: 200px;
   background-color: #eee;
   padding: 5px 20px;
 }
 
 .nav li:hover>.sub-menu{
   display: block;
 }
 
 .nav>li>.sub-menu{
   top: 40px;
   left: 0;
 }
</style>
<body>
	<ul class="nav">
   <li><a href="#">Trang chủ</a></li>
   <li>
     <a href="#">Sản Phẩm</a>
     <ul class="sub-menu">
       <li>
           <a href="#">Hoa quả</a>
           <ul class="sub-menu">
               <li><a href="#">Táo</a></li>
               <li><a href="#">Kiwi</a></li>
               <li><a href="#">Cam</a></li>
           </ul>
        </li>
        <li><a href="#">Rau xanh</a></li>
        <li><a href="#">Đồ khô</a></li>
        <li><a href="#">Gạo</a></li>
     </ul>
   </li>
   <li><a href="#">Dịch vụ</a></li>
   <li><a href="#">Blog</a></li>
   <li><a href="#">Liên hệ</a></li>
   <li>
   		<a href="login.jsp">Đăng Nhập</a>
   		<ul class="sub-menu">
   			 <li><a href="#">Đăng Nhập</a></li>
               <li><a href="#">Quên Mật Khẩu</a></li>
               <li><a href="#">Đăng Ký</a></li>
                <li><a href="#">Đổi Mật Khẩu</a></li>
               <li><a href="#">Chỉnh Thông Tin</a></li>
               <li><a href="#">Đăng Xuất</a></li> 
   		</ul>
   	</li>
</ul>
</body>
</html>