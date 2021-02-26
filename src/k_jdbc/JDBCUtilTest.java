package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCUtilTest {

	public static void main(String[] args) {
		//여러줄-파라미터o
		JDBCUtil jdbc = JDBCUtil.getInstance();
		String sql = "select * from member where mem_id = ? ";
		List<Object> param = new ArrayList<>();
		param.add("a001");
	
		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		System.out.println(list);
		
		//한줄-파라미터x
		jdbc = JDBCUtil.getInstance();
		sql = "select * from member where mem_id='a001'";
		Map<String, Object> map = jdbc.selectOne(sql);
//		System.out.println(map);
		
		//한줄-파라미터o
		jdbc = JDBCUtil.getInstance();
		sql = "select * from prod where prod_name like ?  ";
		param = new ArrayList<>();
		param.add("삼성%");
		map = jdbc.selectOne(sql, param);
//		System.out.println(map);
		
		//여러줄-파라미터x
		jdbc = JDBCUtil.getInstance();
		sql = "select * from prod where prod_name like '삼성%'";
		list = jdbc.selectList(sql);
//		System.out.println(list);
		
		//업데이트-파라미터x
		jdbc = JDBCUtil.getInstance();
		sql = "update tb_jdbc_board set reg_date= reg_date+1";
		int result = jdbc.update(sql);
//		System.out.println(result+"개의 행이 변경되었습니다.");
		//업데이트-파라미터o
		jdbc = JDBCUtil.getInstance();
		sql = "update tb_jdbc_board set reg_date= reg_date+1 where content = ?";
		param = new ArrayList<>();
		param.add("작성글1");
		result = jdbc.update(sql, param);
//		System.out.println(result+"개의 행이 변경되었습니다.");
	}
		
}
