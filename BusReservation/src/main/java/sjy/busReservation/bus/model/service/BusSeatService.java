package sjy.busReservation.bus.model.service;

import java.sql.Connection;
import java.util.List;

import sjy.busReservation.bus.model.dao.BusSeatDAO;
import sjy.busReservation.bus.model.dto.BusSeat;
import static sjy.busReservation.common.JDBCTemplate.*;

public class BusSeatService {

	private BusSeatDAO dao = new BusSeatDAO();
	
	/** 버스 번호 입력 받아 남은 좌석 보여줌
	 * @param inputBusNo
	 * @return seatList
	 * @throws Exception
	 */
	public List<BusSeat> showSeat(String inputBusNo) throws Exception {
		Connection conn = getConnection();
		
		List<BusSeat> seatList = dao.showSeat(inputBusNo);
		
		close(conn);
		
		return seatList;
	}

}
