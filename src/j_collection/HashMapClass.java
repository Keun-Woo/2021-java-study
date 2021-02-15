package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("number", 10);
		map.put("name", "홍길동");
		map.put("a", "홍길동");
		map.put("ㄱ", "홍길동");
		map.put("scanner", new Scanner(System.in));
//		System.out.println(map);
		
		map.put("name", "이순신");
//		System.out.println(map);
//		
		map.remove("a");
//		System.out.println(map);
		map.get("name");
		Object value = map.get("name");
//		System.out.println(value);
//		System.out.println(((String)value).substring(0,1));
//		
	
		Set<String>keys = map.keySet();//import
		
		for(String key : keys){
//			System.out.println(key + " : " + map.get(key));
		}
		
		for(String key : map.keySet()){
			
		}
		
//		ArrayList<HashMap<String,Object>>row = new HashMap<>();
//		row.put("CART_MEMBER", "a001");
//		row.put("CART_NO","20202020");
//		row.put("CART_PROD", "P10101");	
//		
//		
//		
//		
		
		
		//회원테이블
		//아이디 , 비밀번호 , 이름 , 전화번호
		ArrayList<HashMap<String,Object>> users = new ArrayList<>();
		
		HashMap<String,Object> user = new HashMap<>();
		user.put("id", "admin");
		user.put("password","admin123");
		user.put("name","관리자");
		user.put("tel", "010-1234-1123");
		
		users.add(user);
		
		
		HashMap<String,Object> user1 = new HashMap<>();
		user1.put("id", "user1");
		user1.put("password", "user111");
		user1.put("name","강건우");
		user1.put("tel", "010-7435-9099");
		
		users.add(user1);
		
		Set<String> keys1 =user.keySet();
		for (String key : keys1) {
			System.out.println(key + " : " + user.get(key));
		}
		
		
		
		
		
		
//		for (int i = 0; i < users.size(); i++) {
//			HashMap<String,Object> u = users.get(i);
//		}
//
		for(String key : user1.keySet()){
			System.out.println(key + " : " + user1.get(key));
		}
//		
		
		for(HashMap<String,Object> u : users){
			for(String key : u.keySet()){
				System.out.println(key + " : " + u.get(key));
				System.out.println("----------------------");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
