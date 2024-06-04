<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.isdeliver.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.isdeliver.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.isdeliver.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.isdeliver.net/npm/botstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	
	<h1>멤버 목록</h1>
	<table width="300" border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>관리사/유저</th>
			
		
		</tr>
		<c:forEach var="member" items="${memberList }">
			<tr>
				<th><a href="detail.do?id=${member.id}">${member.id }</th>
				<th>${member.password }</th>
				<th>${member.name }</th>
				<th>${member.role }</th>
				
			
			</tr>
		</c:forEach>
	</table>
	
	<a href="input.do">등록</a>
</body>
</html>