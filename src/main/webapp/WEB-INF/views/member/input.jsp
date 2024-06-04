<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.isdeliver.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.isdeliver.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.isdeliver.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.isdeliver.net/npm/botstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	<div class="container">
		<h1>멤버 등록</h1>
		<form action="input.do" method="POST">
			<table class="table table-bordered">
				<tr>
					<th width="20%">ID</th>
					<td width="80%"><input type="text" value="test" name="id"/></td>
					
				</tr>
				<tr>
					<th>PASSWORD</th>
					<td><input type="password" value="1234" name="password"/></td>
					
				</tr>
				<tr>
					<th>NAME</th>
					<td><input type="text" value="테스트" name="name"/></td>
					
				</tr>
				<tr>
					<th>ROLE</th>
					<td><input type="text" value="User" name="role"/></td>
					
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="저장"/></td>
					
				</tr>
				
			</table>
			
		</form>
	</div>
</body>
</html>