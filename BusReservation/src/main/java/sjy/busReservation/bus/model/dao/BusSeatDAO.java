package sjy.busReservation.bus.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import sjy.busReservation.bus.model.dto.BusSeat;

public class BusSeatDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public BusSeatDAO() {
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public List<BusSeat> showSeat(String inputBusNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
