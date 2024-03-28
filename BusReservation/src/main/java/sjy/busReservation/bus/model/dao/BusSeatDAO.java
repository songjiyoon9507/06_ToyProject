package sjy.busReservation.bus.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import sjy.busReservation.bus.model.dto.BusSeat;
import static sjy.busReservation.common.JDBCTemplate.*;

public class BusSeatDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public BusSeatDAO() {
		try {
			prop = new Properties();
			
			String filePath
				= BusSeatDAO.class.getResource("/sjy/busReservation/sql/busSeat-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
		} catch(Exception e) {
			System.out.println("BusSeatDAO 오류 발생");
			e.printStackTrace();
		}
	
	}

	/** 버스 번호 입력 받아 남은 좌석번호 돌려주는 SQL
	 * @param conn
	 * @param inputBusNo
	 * @return seatList
	 * @throws Exception
	 */
	public List<BusSeat> showSeat(Connection conn, String inputBusNo) throws Exception {
		List<BusSeat> seatList = new ArrayList<BusSeat>();
		
		try {
			String sql = prop.getProperty("showSeat");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputBusNo);
			
			rs = pstmt.executeQuery();
			
//			if(rs.next()) {
//				System.out.println("ResultSet 있음");
//			} else {
//				System.out.println("ResultSet 없음");
//			}
			
			while(rs.next()) {
				seatList.add(new BusSeat(rs.getInt(1), rs.getInt(2)));
			}
			
			System.out.println(seatList.get(1).getSeatNo());
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return seatList;
	}

}
