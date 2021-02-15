package SelfStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap0209 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,Object>> PROD = new ArrayList<>();
		HashMap<String, Object> PROD1 = new HashMap<>();
		PROD1.put("제품ID", "P0001");
		PROD1.put("제품이름", "강낭콩");
		PROD1.put("제품갯수", 11);
		PROD1.put("제품제조사", "농심");
		PROD.add(PROD1);
		
		HashMap<String, Object> PROD2 = new HashMap<>();
		PROD2.put("제품ID", "P0002");
		PROD2.put("제품이름", "완두콩");
		PROD2.put("제품갯수", 15);
		PROD2.put("제품제조사", "삼양");
		PROD.add(PROD2);
		
		for(HashMap<String,Object> u : PROD){
			for(String key : u.keySet()){
				System.out.println(key + " : " + u.get(key));
				System.out.println("-----------------------");
			}
		}
		
		
		
		
		
		
		
		
	}

}
