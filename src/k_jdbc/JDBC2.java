package k_jdbc;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pc05";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "Select * from cart where cart_member = ?";
			//? >> 값을 세팅하기 위함 이후에 메서드가 온다.
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001"); // setString(몇번째 ?(?의 인덱스), ?의값)
			
			rs = ps.executeQuery();
			
			//컬럼의 정보를 갖고있는 metadata
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
