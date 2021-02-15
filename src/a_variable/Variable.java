package a_variable;//클래스의 위치

import java.util.Scanner;

public class Variable {//클래스

	public static void main(String[] args) {
		byte b = 1;
		short s = 3;
		int i = 5;
		long l = 11235651L;
		float f = -123.5123f;
		double d = 3.14159;
		char c = '눈';
		char ch = '코';
		boolean bo = false;
		c='비';
		b = 14;
		s=2;
		i=3;
		l=15;
		f=1;
		d=0;
		ch='내';
		bo=false;
		String k ="가나다라마바사아자차카타파하";
		k="아니요";
		int small = 10;
		long big = 10L;
		small = (int)big;
		big = small;
		final int MAX_NUMBER = 10;
		System.out.println("줄 바꿈을 한다");
		System.out.println("줄 바꿈을 한\t다.");
		System.out.println("줄 바꿈을 한다.");
		System.out.print("줄 바꿈을 한\n다.");
//Scanner sc = new Scanner(System.in);//입력받기 위한 클래스
//	System.out.println("아무거나 입력해주세요");
//	String str2 = sc.nextLine();
//	System.out.println("입력받은 내용 : " + str2);
	//입력을 받게되면 사용자가 입력 할 때까지 프로그램이 멈추게 된다.
	//내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
	
	//숫자 입력
//	System.out.println("Int 입력>");
//	int number = Integer.parseInt(sc.nextLine());
//	System.out.println(number);
		Scanner sc = new Scanner(System.in);
//자신의 이름을 저장할 변수를 선언해 주세요.
			String name;
//			위에서 선언한 변수를 초기화 하기 위해 입력받아주세요.
			System.out.println("이름을 입력해주세요>");
			name = sc.nextLine();
			
//			자신의 나이를 저장할 변수를 선언해주세요.
			int old;
			System.out.println("나이를 입력해주세요>");
			 old = Integer.parseInt(sc.nextLine());
			System.out.println("이름: "+ name + " / 나이 : " + old);
	}

}
