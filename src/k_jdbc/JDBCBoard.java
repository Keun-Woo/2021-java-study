package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class JDBCBoard {
	private final static String url ="jdbc:oracle:thin:@localhost:1521:xe";
	private final static String user = "pc05";
	private final static String password = "java";
	
	
	public static void main(String[] args) {
		//오라클 데이터베이스에 게시판 테이블을 생성하고 , 게시판 프로그램을 만들어주세요.
		//테이블 : TB_JDBC_BOARD
		//컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID , REG_DATE
		//       넘버          버차100    버차 300      버차 20          데이트
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		while(true){
			System.out.println("-----------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("-----------------------------");
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			try {
				con = DriverManager.getConnection(url, user, password);
				String sql = "select * from TB_JDBC_BOARD";
				
				ps = con.prepareStatement(sql);
								
				rs = ps.executeQuery();
				
				ResultSetMetaData md = rs.getMetaData();//메타데이터 : 데이터에 대한 데이터
				int columnCount = md.getColumnCount();//컬럼 수 
				
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(md.getColumnName(i)+"\t");
					}
					System.out.println();
					while(rs.next()){
						
						for (int i = 1; i <= columnCount; i++) {
							
							Object value = rs.getObject(i);
							System.out.print(value + "\t");
						}
						System.out.println();
					}
		}
			
		
		
		
		
		
		
		
		
		

	}
	static void Read{
		try {
		con = DriverManager.getConnection(url, user, password);
		String sql = "";
		
		ps = con.prepareStatement(sql);
		ps.setString(1, "001");
		
		rs = ps.executeQuery();
		
		ResultSetMetaData md = rs.getMetaData();//메타데이터 : 데이터에 대한 데이터
		int columnCount = md.getColumnCount();//컬럼 수 
		
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(md.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()){
				
				for (int i = 1; i <= columnCount; i++) {
					
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
		
		
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally{
		if(rs != null) try { rs.close(); } catch (Exception e) {}
		if(ps != null) try { ps.close(); } catch (Exception e) {}
		if(con != null) try { con.close(); } catch (Exception e) {}
		
	}
		
	}
	
	
	
	
	
	
}


	