package b_operator;

public class CoparingCoperator {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		boolean k;
		boolean b = x<y;
		System.out.println(b);
		b = x<=y-15;
		System.out.println(b);
		
		String str1 = "abc";
		String str2 = "abc";
		b= str1 == str2;
		System.out.println(b);
		
		
		
		b= str1.equals(str2);
		System.out.println(b);
		b= !str1.equals(str2);
		System.out.println(b);
		
//		x가 y보다 크다.
		boolean t = x>y;
		System.out.println(t);
//		x + 5 와 y는 같다.
		boolean tt = x+5==y;
		System.out.println(tt);
//		y는 홀수이다.
		boolean ttt = y%2==1;
		System.out.println(ttt);
//		"기본형"과 "참조형"은 다르다.
		String str3 = "기본형";
		String str4 = "참조형";
		k = !str3.equals(str4);
		System.out.println(k);
		
		
		
		
		
		
		
	}

}
