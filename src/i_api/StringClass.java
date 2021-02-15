package i_api;

import java.util.Arrays;

public class StringClass {
	public static void main(String[] args) {
		boolean equals ="문자열".equals("문자열");
		System.out.println(equals);
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str1));
		
		String str = "12345abc";
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char charAt = str.charAt(i);
//			System.out.println(charAt);
		}
		
		//문자열 뒤집기
		String rev = "요세하녕안";
		for (int i = rev.length()-1; i >= 0; i--) {
			rev += rev.charAt(i);
		}
		System.out.println(rev);
		
		str ="0123456789";
		String sub1 = str.substring(3);//3~
		System.out.println(sub1);
		String sub2 =str.substring(5,8);//5~8번전(7)
		System.out.println(sub2);
				
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
		System.out.println(index);//3번인덱스부터 시작 (공백도 인덱스에 포함0,1,2,...)
		//substring과 indexOf를 조합해서 문자열 자르기
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		for (int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);
		}
		
		
		for (int i = 0; i < menu.length; i++) {
			String price = menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원"))+"원";
			System.out.println(price);
		}
		
		
		//---------------------------------------------------------------------//
		str = "abcd";
		str.contains("c");
		boolean contains = str.contains("f");
		System.out.println(contains);
		
		
		for (int i = 0; i < menu.length; i++) {
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는"+i+"번 인덱스에 있습니다.");
			}
		}		
		
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));

		//메뉴명과 가격 나누기
		
		for (int i = 0; i < menu.length; i++) {
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0]+ " / 가격 : "+ split[1]);
			}
		
		str = " 문자열 ";
		String trim = str.trim();
		System.out.println("[" + str + "] ㅡ> [" + trim + "]");
		
		
		//사용자의 실수로 아이디나 비밀번호 앞뒤에 공백이 들어가는 것을 방지하기 위해 사용할 수 있다.
		String id = " myId ";
		String password = "myPassword    ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		
		int number = 10;
		str =number + "";
		str = String.valueOf(number);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
