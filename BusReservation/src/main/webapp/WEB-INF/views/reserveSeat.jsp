<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>좌석 예약</title>
</head>
<body>
	<main>
		<h1>좌석 예약하기</h1>
		<c:choose>
			<%-- seatList가 null이 아닐 때 --%>
			<c:when test="${not empty requestScope.seatList}">

				<c:forEach var="seat" items="${seatList}">
<%-- 					<a href="/reserveSeat" name="seatNo" value="${seat.seatNo}">${seat.seatNo}</a>	 --%>
					<span>${seat.seatNo}</span>	
				</c:forEach>
				<form action="/reserveSeat" method="post">
					<p>예약할 좌석 번호 입력</p>
					<input type="number" name="inputSeatNo">
					<div>
						<button>확인</button>
						<a>돌아가기</a>
					</div>		
				</form>
			</c:when>
			
			<%-- seatList가 null 일 때 --%>
			<c:otherwise>
				남은 좌석이 없습니다.
			</c:otherwise>
		</c:choose>
	</main>

</body>
</html>