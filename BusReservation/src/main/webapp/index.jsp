<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>버스 예약 프로그램</title>
</head>
<body>
	
	<main>
		<c:choose>
			<%-- 로그인 안 했을 때 : 로그인/회원가입 --%>
			<c:when test="${empty sessionScope.loginMember}">
				
				<h1>버스 예약 로그인</h1>
				<form action="/login" method="post">
					<div>
						<p>이름</p>
						<input type="text" name="inputName">
					</div>
					<div>
						<p>전화번호</p>
						<input type="text" name="inputPhone">
					</div>
					<button>로그인</button>
					
					<a href="/signup" class="signup">회원가입</a>
				</form>
			</c:when>
			
			<%-- 로그인 했다면 현재 로그인한 사람의 예약 정보 출력 --%>
			<c:otherwise>
				<h1>로그인 성공</h1>
				<h1>${sessionScope.loginMember.name}님 버스 예약 정보</h1>
				
 				<c:choose>
					<%-- 예약 정보가 없을 때 --%>
					<c:when test="${empty sessionScope.reserveInfo.departures}">
						<h2>예약 정보가 존재하지 않습니다.</h2>
						
						<a href="/reserveBus">버스 예약하기</a>
						<a href="/logout">로그아웃</a>
											

					</c:when>
				
					<%-- 예약 정보가 있을 때 --%>
					<c:otherwise>
<%-- 						<c:forEach items="${sessionScope.loginMember}" var="vs">
							<p>${vs.name} 님이 예약하신 버스는</p>
							<p>${vs.busNo} 번 버스</p>
							<p>좌석 번호 : ${vs.reserveSeatNo}</p>
							<p>출발지 : ${vs.departures}</p>
							<p>도착지 : ${vs.arrivals}</p>
							<p>출발 시간 : ${vs.departureTime}</p>
							<p>출발 10분 전부터 탑승 가능합니다.</p>
						</c:forEach> --%>
						<p>
							${sessionScope.reserveInfo.busNo}번 버스 <br>
							${sessionScope.reserveInfo.reserveSeatNo}번 좌석<br>
							${sessionScope.reserveInfo.arrivals}행<br>
							${sessionScope.reserveInfo.departureTime} 에 출발 예정<br>
						</p>
						
						<%-- 예약 정보 수정/삭제 --%>
						<a href="/logout">로그아웃</a>
						<a href="/updateReserve">예약 변경</a>
						<a href="/deleteReserve">예약 취소</a>
					</c:otherwise>
				
				</c:choose>
				
			</c:otherwise>
		</c:choose>
	</main>
	
	<c:if test="${not empty sessionScope.message}">
		${message}
		
		<c:remove var="message" scope="session"/>
	</c:if>
	
</body>
</html>