package c_statement;

import java.util.Scanner;

public class Baseball_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = (int)(Math.random()*9) +1; 
		int B = (int)(Math.random()*9) +1; 
		int C = (int)(Math.random()*9) +1;//변수ABC를 추출하고싶은데.....?
		while(A==B || B==C || A==C){
		A = (int)(Math.random()*9) +1; 
		B = (int)(Math.random()*9) +1; 
		C = (int)(Math.random()*9) +1;}
		
		int reS=0; 
		int reB=0;
		int reO=0;
		
		
		
		while(reS!=3){
			reS=0; 
			reB=0;
			reO=0;
		System.out.println("첫번째숫자를 말씀하시오.");
		int ans1=Integer.parseInt(sc.nextLine());
		System.out.println("두번째숫자를 말씀하시오.");
		int ans2=Integer.parseInt(sc.nextLine());
		System.out.println("세번째숫자를 말씀하시오.");
		int ans3=Integer.parseInt(sc.nextLine());
//		추출한 변수가 입력한 숫자와 같은지
		
		if (ans1 == A) {
			reS++;
		} else if (ans1 == B || ans1 == C) {
			reB++;
		} else {
			reO++;
		}
		
		
		if (ans2 ==B) {
			reS++;
		} else if (ans2 == A || ans2 == C) {
			reB++;
		} else {
			reO++;
		}
		
		if (ans3 ==C) {
			reS++;
		} else if (ans3 == A || ans3 == B) {
			reB++;
		} else {
			reO++;
		}
		
		System.out.println(reS+"S"+"   "+reB+"B"+"   "+reO+"O");
		if( reS==3){System.out.println("축하드립니다!!!!!!!!");}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
