package i_api;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*
		^ : 뒷 문자로 시작
		$ : 앞 문자로 시작
		. : 임의의 문자(줄바꿈제외)
		* : 앞 문자가 0개 이상
		+ : 앞 문자가 1개 이상
		? : 앞 문자가 없거나 1개
		[] : 문자의 집합이나 범위([a-z]: a부터 z까지 , [^a-z]:a부터 z가 아닌것)
		{} : 앞 문자의 갯수 ({2} : 2개 , {2,4} : 2개 이상 4개 이하)
		() : 그룹화 (1개의 문자처럼 인식)
		| : OR 연산
		\s : 공백 , 탭 , 줄바꿈
		\S : 공백 , 탭 , 줄바꿈이 아닌 문자
		\w : 알파벳이나 숫자
		\W : 알파벳이나 숫자가 아닌 문자
		\d : 숫자
		\D : 숫자가 아닌 문자
		(?i) : 뒷 문자의 대소문자 구분 안함
		\ : 정규표현식에서 사용되는 특수문자 표현
		*/
		
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";//a-z까지 3개, 0~9까지 1개~3개
//		String regex = "[a-z0-9]+"; //a~z,0~9까지 문자가1개이상온다
		String regex = "\\w*"; //알파벳이나 숫자가 0개이상온다
		
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
//		Scanner sc = new Scanner(System.in);
//		String input;
//		System.out.println("입력하시오>");
//		input = sc.next
//		
		
		//아이디, 전화번호, 이메일 주소의 유형성을 검사하는 정규표현식을 만들어 주세요.
		String id = "aalsda123123";
		String num ="010-7435-9099";
		String passward = "lsdfja124!@#";
		String email = "rjsdnsla2244@naver.co.kr";
		String regexid = "[a-z0-9]{6,30}";
		String regexnum = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		String regexemail = "[a-z0-9]{6,30}@[a-z]{1,15}[.+a-z]{1,8}";
		String regexpassward = ".{8,30}";
		
		Pattern p4 = Pattern.compile(regexid);
		Matcher m4 = p4.matcher(id);
		System.out.println("아이디는"+m4.matches());
		
		
		Pattern p1 = Pattern.compile(regexemail);
		Matcher m1 = p1.matcher(email);
		System.out.println("이메일은"+m1.matches());
		
		Pattern p3 = Pattern.compile(regexnum);
		Matcher m3 = p3.matcher(num);
		System.out.println("전화번호는"+m3.matches());
		
		
		Pattern p2 = Pattern.compile(regexpassward);
		Matcher m2 = p2.matcher(passward);
		System.out.println("비밀번호는"+m2.matches());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
