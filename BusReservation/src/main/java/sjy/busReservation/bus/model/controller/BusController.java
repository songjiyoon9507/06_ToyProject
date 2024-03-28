package sjy.busReservation.bus.model.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import sjy.busReservation.bus.model.dto.Bus;
import sjy.busReservation.bus.model.dto.BusSeat;
import sjy.busReservation.bus.model.service.BusSeatService;
import sjy.busReservation.bus.model.service.BusService;
import sjy.busReservation.member.model.dto.Member;
import sjy.busReservation.member.model.service.MemberService;

@WebServlet("/reserveBus")
public class BusController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 버스 전체 조회
		BusService service = new BusService();
		
		try {
			
			List<Bus> busList = service.selectAll();
			
			req.setAttribute("busList", busList);
						
		} catch (Exception e) {
			System.out.println("[버스 전체 조회 중 오류 발생]");
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("WEB-INF/views/reserveBus.jsp").forward(req, resp);
	
	}
	
	/**
	 * 입력받은 버스 번호로 버스 빈좌석 보여주기
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String inputBusNo = req.getParameter("inputBusNo");
			
			System.out.println(inputBusNo);
			
			BusSeatService service = new BusSeatService();
			
			HttpSession session = req.getSession();
			
			session.setAttribute("busNo", inputBusNo);
			
			List<BusSeat> seatList = service.showSeat(inputBusNo);
			
			
			
			req.setAttribute("seatList", seatList);
			
			req.getRequestDispatcher("WEB-INF/views/reserveSeat.jsp").forward(req, resp);
			
		} catch (Exception e) {
			System.out.println("[버스 예약 중 오류 발생]");
			e.printStackTrace();
		}
		
		
	
	}
}
