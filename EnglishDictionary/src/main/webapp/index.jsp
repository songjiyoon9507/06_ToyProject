<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>영어 단어 사전</title>
</head>
<body>
	
	<main>
		<c:choose>
			<%-- 로그인하지 않았을 때 보여줄 화면 --%>
			<c:when test="${empty sessionScope.loginMember}">
				<%-- 게스트 로그인 --%>
				<%-- 영단어 검색만 가능 --%>
			
			
				
			
			</c:when>
			
			
		</c:choose>
	</main>
	
</body>
</html>