package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int _int = 10;
		long _long = 100L;
		_long =_int + _long;
		_int = _int + (int)_long;
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short;
		System.out.println(result3);
		
		char _char ='a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println("문자"+ _int);
	
		byte b = 127;
		b++;
		System.out.println(b);

		
		int a = 123456;
		long b_ = 654321;
		long result = a+b_;
		System.out.println("1>" + result);
		long result2 = result *a;
		System.out.println("2>" + result2);
		long result4 = result2 /a;
		System.out.println("3>" + result4);
		long result5 = result4 -b;
		System.out.println("4>" + result5);
		long result6 = result5 %a;
		System.out.println("5>" + result6);
		
		
//		3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		int x = 10 ;
		int y = 123;
		int z = 141;

		int sum = x+y+z;
		double avg = (Math.round(x+y+z))/3;


		System.out.println("12\"안녕하세요\"합계="+sum+"\t평균="+avg);


		
		
		
	}

}
