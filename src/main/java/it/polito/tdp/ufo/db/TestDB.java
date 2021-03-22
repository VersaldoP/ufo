package it.polito.tdp.ufo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestDB {
	public static void main(String[] args) {
		
//		
//		String jdbcURL="jdbc:mysql://localhost/ufo_sightings?user=root&password=root";
//		try {
//			Connection conn = DriverManager.getConnection(jdbcURL);
//			
//			String sql= "SELECT DISTINCT shape "
//					+ "FROM sighting "
//					+"where shape<> '' ";
//					/*
//					 * i vari comandi dovrebbero essere in unica riga
//					 *  quindi devo formattarli con uno spazio finali se divido !!!!
//					 */
//			PreparedStatement st = conn.prepareStatement(sql);
//			ResultSet res = st.executeQuery();
//			
//			List<String> formeUfo= new ArrayList<>();
//			while(res.next()) {
//				String forma = res.getString("shape");
//				formeUfo.add(forma);
//				
//			}
//			System.out.println(formeUfo);
//			
//			
//			String sql2= "SELECT COUNT(*)AS cnt FROM sighting WHERE shape=?";
//			String scelta ="cirlcle";
//			PreparedStatement st2 = conn.prepareStatement(sql2);
//			st2.setString(1,scelta);
//			ResultSet res2=st2.executeQuery();
//			res2.first();
//			int count = res2.getInt("cnt");
//			
//		   st2.close();
//		   
//			
//		   System.out.println("UFO DI FORMA "+scelta+" sono :"+count);
//			
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
		
		SightingDAO dao = new SightingDAO();
		List<String> formeUFO = dao.readShapes();
		
		for(String forma:formeUFO) {
			int count = dao.CountByShape(forma);
			System.out.println("Ufo di forma "+forma+" sono: "+count);
			
		}
	}

	private static void createStatement() {
		// TODO Auto-generated method stub
		
	}

}
