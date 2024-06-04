<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
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
		<c:forEach var="row" items="${memberList }">
			<tr>
				<th>${row.id }</th>
				<th>${row.password }</th>
				<th>${row.name }</th>
				<th>${row.role }</th>
				
			
			</tr>
		</c:forEach>
		
			
		
	
	</table>
	
	<a href="input.do">등록</a>
	
</body>
</html>