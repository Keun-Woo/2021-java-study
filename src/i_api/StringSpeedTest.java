package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
//		String str = "a";//문자를 재생성하면 얼마나 느려질까?
//		
//		
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//				str +="a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start+"ms");
		
		
		StringBuffer sb = new StringBuffer("a");
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			sb.append("a");
		}
		long end =System.currentTimeMillis();
		System.out.println(end-start+"ms");
	}

}
