package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import d_array.Array;

public class JDBCUtil {
	private JDBCUtil(){
		
	}
	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInstance(){
		if(instance == null){
			instance = new JDBCUtil();
		}
		return instance;
	}
	
	 String url ="jdbc:oracle:thin:@localhost:1521:xe";
	 String user = "pc05";
	 String password = "java";
	 Connection con = null;
	 PreparedStatement ps = null;
	 ResultSet rs = null;
	
	
	//여러줄조회- 파라미터o
	 	public List<Map<String ,Object>> selectList(String sql, List<Object> param){
		 List<Map<String ,Object>> list = new ArrayList<>();
		 try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for (int i = 0; i <param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount =metaData.getColumnCount();
			
			while (rs.next()){
				HashMap<String, Object> row = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					row.put(metaData.getColumnName(i),rs.getObject(i));
				}
				list.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close(); } catch (Exception e) {}
			if(con != null) try { con.close(); } catch (Exception e) {}
			
		}
		return list; 
	 }

	 	//한줄조회-파라미터x           Map<String, Object> selectOne(String sql)
	 
	 	public	Map<String, Object> selectOne(String sql) {
	 		Map<String, Object> map = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
		
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount =metaData.getColumnCount();
			
			while (rs.next()){
					map = new HashMap();
				for (int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i),rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close(); } catch (Exception e) {}
			if(con != null) try { con.close(); } catch (Exception e) {}
			
		}
		return map;
	}
	 	//한줄 조회-파라미터o     Map<String, Object> selectOne(String sql, List<Object> param)
	 	public	Map<String, Object> selectOne(String sql, List<Object> param){
	 		Map<String, Object> map = null; 
		try {
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			for (int i = 0; i <param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount =metaData.getColumnCount();
			
			while (rs.next()){
				map = new HashMap();
				for (int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i),rs.getObject(i));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null) try { rs.close(); } catch (Exception e) {}
			if(ps != null) try { ps.close(); } catch (Exception e) {}
			if(con != null) try { con.close(); } catch (Exception e) {}
			
		}
		return map;
	}
	 	//여러줄조회-파라미터x
	 	public List<Map<String ,Object>> selectList(String sql){
			 List<Map<String ,Object>> list = new ArrayList<>();
			 try {
				con = DriverManager.getConnection(url, user, password);
				
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				ResultSetMetaData metaData = rs.getMetaData();
				int columnCount =metaData.getColumnCount();
				
				while (rs.next()){
					HashMap<String, Object> row = new HashMap<>();
					for (int i = 1; i <= columnCount; i++) {
						row.put(metaData.getColumnName(i),rs.getObject(i));
					}
					list.add(row);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(rs != null) try { rs.close(); } catch (Exception e) {}
				if(ps != null) try { ps.close(); } catch (Exception e) {}
				if(con != null) try { con.close(); } catch (Exception e) {}
				
			}
			return list; 
		 }
	 	 //업데이트 -파라미터x
	 	public int update(String sql){
	 		int result = 0;
	 		try {
					con = DriverManager.getConnection(url, user, password);
					
					ps = con.prepareStatement(sql);
					
					result = ps.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					if(rs != null) try { rs.close(); } catch (Exception e) {}
					if(ps != null) try { ps.close(); } catch (Exception e) {}
					if(con != null) try { con.close(); } catch (Exception e) {}
					
				}
			return result;
	 		 
	 	 }
	 	 //업데이트-파라미터o
	 	public int update(String sql, List<Object> param){
	 		 int result = 0;
	 		try {
					con = DriverManager.getConnection(url, user, password);
					
					ps = con.prepareStatement(sql);
					for (int i = 0; i <param.size(); i++) {
						ps.setObject(i+1, param.get(i));
					}
					result = ps.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					if(rs != null) try { rs.close(); } catch (Exception e) {}
					if(ps != null) try { ps.close(); } catch (Exception e) {}
					if(con != null) try { con.close(); } catch (Exception e) {}
					
				}
			return result;
	 	
	 	}
}
