package sjy.busReservation.bus.model.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import sjy.busReservation.member.model.dto.Member;

@WebServlet("/reserveSeat")
public class SeatController extends HttpServlet {
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		try {
//			String seatNo = req.getParameter("seatNo");
//			
//			System.out.println(seatNo);
//			
//		} catch(Exception e) {
//			System.out.println("[SeatController 오류]");
//			e.printStackTrace();
//		}
//		
//
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			HttpSession session = req.getSession();
			
			String seatNo = req.getParameter("inputSeatNo");
			String busNo = (String) session.getAttribute("busNo");
			Member member = (Member) session.getAttribute("loginMember");
//			System.out.println(seatNo); 
//			System.out.println(busNo); 
//			System.out.println(member.getPhoneNum()); 
			
			// 이제 값들 넣어서 service 호출해서
			// 테이블에 update 해줄 거

			
		} catch (Exception e) {
			System.out.println("[SeatController 오류]");
			e.printStackTrace();
		}
	
	}
}
