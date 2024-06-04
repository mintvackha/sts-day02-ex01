<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>
		Hello world! 안녕하세요 
	
	</h1>
	<table>
		<P>  The time on the server is ${serverTime}. </P>
		
		<ul>
			<li><a href="member/list.do">회원 목록</a>
			</li>
			<li><a href="member/input.do">회원 등록</a>
			</li>
			<li><a href="member/detail.do">회원 상세보기</a>
			</li>
			<li><a href="member/edit.do">회원 수정</a>
			</li>
			<li><a href="member/delete.do">회원 삭제</a>
			</li>
			
		</ul>
	</table>
	
</body>
</html>
