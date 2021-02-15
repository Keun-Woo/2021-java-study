package a_variable;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("======== 회원가입 ========");
		System.out.println("아이디>");
		String ID = ab.nextLine();
		System.out.println("비밀번호(4자리숫자)>");
		int pas = Integer.parseInt(ab.nextLine());
		System.out.println("이름>");
		String name = ab.nextLine();
		System.out.println("나이>");
		int old = Integer.parseInt(ab.nextLine());
		System.out.println("키>");
		double tall = Double.parseDouble(ab.nextLine());
		System.out.println("========================");
		System.out.println("아이디 : "+ID);
		System.out.println("비밀번호 : "+pas);
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+old+"세");
		System.out.println("키 : "+tall+"cm");
		System.out.println("========================");
		
		
	
	}

}
