<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>���� �ܾ� ����</title>
</head>
<body>
	
	<main>
		<c:choose>
			<%-- �α������� �ʾ��� �� ������ ȭ�� --%>
			<c:when test="${empty sessionScope.loginMember}">
				<%-- �Խ�Ʈ �α��� --%>
				<%-- ���ܾ� �˻��� ���� --%>
			
			
				
			
			</c:when>
			
			
		</c:choose>
	</main>
	
</body>
</html>