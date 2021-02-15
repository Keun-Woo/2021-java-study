package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);		
		double x;
		double y;
		String cal;	
		String z;
		
		System.out.println("앞에 숫자를 입력하시오>");
		x=Double.parseDouble(sc.nextLine());
		System.out.println("뒤에 숫자를 입력하시오>");
		y=Double.parseDouble(sc.nextLine());
		System.out.println("연산을 입력하시오(+,-,*,&,/)>");
		z = sc.nextLine();
		System.out.println(x+y+z);
	
		
		cal=z.equals("+") ?  x+y+"" : 
			(z.equals("-") ? x-y+"" : 
			(z.equals("*") ? x*y+"" : 
			(z.equals("/") ? x/y+"" :
			(z.equals("%") ? x%y+"" :  "오류"))));
		System.out.println(cal);

	}

}
