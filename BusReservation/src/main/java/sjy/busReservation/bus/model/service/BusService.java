package sjy.busReservation.bus.model.service;

import java.sql.Connection;
import java.util.List;

import sjy.busReservation.bus.model.dao.BusDAO;
import sjy.busReservation.bus.model.dto.Bus;
import static sjy.busReservation.common.JDBCTemplate.*;

public class BusService {

	private BusDAO dao = new BusDAO();
	
	public List<Bus> selectAll() throws Exception {
		
		Connection conn = getConnection();
		
		List<Bus> busList = dao.selectAll(conn);
		
		close(conn);
		
		return busList;
	}

}
