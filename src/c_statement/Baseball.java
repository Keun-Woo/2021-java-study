package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
	
// 135 생각
// 123 예측 : 1>>>>같은라인,같은숫자 :스트라이크 :1S  3>>>다른라인,같은숫자 : 볼 : 1B 2>>>없는숫자 : 1O
		Scanner sc = new Scanner(System.in);
		
		int A = (int)(Math.random()*9) +1; 
		int B = (int)(Math.random()*9) +1; 
		int C = (int)(Math.random()*9) +1;//변수ABC를 추출하고싶은데.....?
		while(A==B || B==C || A==C){
		A = (int)(Math.random()*9) +1; 
		B = (int)(Math.random()*9) +1; 
		C = (int)(Math.random()*9) +1;}
		
		
		
		System.out.println("첫번째숫자를 말씀하시오.");
		int ans1=Integer.parseInt(sc.nextLine());
		System.out.println("두번째숫자를 말씀하시오.");
		int ans2=Integer.parseInt(sc.nextLine());
		System.out.println("세번째숫자를 말씀하시오.");
		int ans3=Integer.parseInt(sc.nextLine());
//		추출한 변수가 입력한 숫자와 같은지
		int reS=0; 
		int reB=0;
		int reO=0;
		if (ans1 == A) {
			reS++;
		} else if (ans1 == B || ans1 == C) {
			reB++;
		} else {
			reO++;
		}
		
		
		if (ans2 ==B) {
			reS++;
		} else if (ans2 == A || ans1 == C) {
			reB++;
		} else {
			reO++;
		}
		
		if (ans3 ==C) {
			reS++;
		} else if (ans3 == A || ans1 == B) {
			reB++;
		} else {
			reO++;
		}
		
		System.out.println(reS+"S"+"   "+reB+"B"+"   "+reO+"O");
//      
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
