package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class self_JDBC {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc05";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "select mem_id ,mem_name from member where substr(mem_id,-3,3)=?";
			
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
