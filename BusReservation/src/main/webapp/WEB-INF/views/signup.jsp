<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 가입</title>
</head>
<body>
	<main>
		<h1>회원가입</h1>
		
		<%-- 유효성 검사 빠짐 --%>
		<form action="/signup" method="post">
			<p>이름</p>
			<input type="text" name="inputName" autocomplete="off" required>
			
			<p>전화번호</p>
			<input type="text" name="inputPhone" autocomplete="off" required>
			
			<button>가입하기</button>
		</form>
	</main>
</body>
</html>