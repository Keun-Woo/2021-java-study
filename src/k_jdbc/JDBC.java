package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc05";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			con = DriverManager.getConnection(url, user, password);
			
			String sql = " select * from member";
			ps = con.prepareStatement(sql);
			
			//Select
			rs = ps.executeQuery();
			
			//insert,update,delete
//			int result = ps.executeUpdate(); 
			//몇개의 row가 영향을 받았는지 반환해준다.
			
			//next란 메서드는 실행할 때 마다 한줄씩 확인한다. 그래서 while 문으로 돌린다.
			while(rs.next()){
				System.out.print(rs.getString(1));//컬럼의순서
				System.out.println(rs.getString("MEM_ID"));//컬럼의이름 
				
//				rs.getString(1) - varchar 
//				rs.getInt(1) - number
//				rs.getDate(1) - date 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close(); } catch (Exception e) {}
			if(con != null) try { con.close(); } catch (Exception e) {}
			
		}

		
		
		
		
		
		
		
		
	}
}
