package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
//		for(int i = 1; i <=10; i++){
//		System.out.println(i + "번째 반복");}
////		
//		int sum = 0;
//		sum = 0;
//		for(int b = 1; b<=10; b++){sum+=b;}
//		System.out.println(sum);
		
		//quiz
////		구구단 출력
//		for(int a = 1  ; a<=9;a++){for(int b = 2; b<=9; b++){
//		
//			
//			System.out.println(for(int b =1; b<=9; a++){a+"*"+b+"="+a*b});
////		}
//		
//		int a= 1; 
//		int count = 0;
//		while(a<1000){
//			a*=2;
//			count++;
//			System.out.println(count + " : " + a);
//		}
//		
		
		
//		//숫자맞추기 게임
//		int answer = (int)(Math.random()*100) +1; 
//		int input = 0;
//		Scanner sc	= new Scanner(System.in);
//		do{
//			System.out.println("1~100 사이의 수를 입력해주세요>");
//			input =Integer.parseInt(sc.nextLine());
//			
//			if(answer < input){System.out.println(input+"보다 작습니다.");}
//			else if(input < answer){System.out.println(input+"보다 큽니다.");}
//			else{System.out.println("정답입니다!!");}
//		}while(input != answer);
			
			
		
		
		
		//이름붙은 반복문
//		
//
//
//		//이름붙은 반복문
//		outer : for(int i = 2; i<=9; i++){for(int j = 1; j<=9; j++){
//		if(j==5){continue outer;}
//		System.out.println(i+"*"+j+"="+i*j);
//		}
//		System.out.println();
////		}
////
////		
////		
		for(int i = 1; i<=3; i++){
			for(int j = 1; j<= 5; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("-------------");
		
		
		for(int i = 5; i>=1; i--){
			for(int j = i; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
			}
	
		System.out.println("1-------------");
		
		for(int i = 1; i<=5; i++){
			for(int j = i; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
			}
		
		System.out.println("2-------------");
		
		for(int i =1; i<=5; i++){
			for(int j =i; j<=5; j++){
				System.out.print(" ");
			}
			System.out.println("*");
			}
		
		System.out.println("3-------------");
		
		for(int i =1; i<=5; i++){
			for(int j =i+1; j<=5; j++){
				System.out.print(" ");
			}
			System.out.println("*");
			}
		
		System.out.println("4-------------");
		
		for(int i = 1; i<=5; i++){
			for(int j = i; j<=5; j++){
				System.out.print("");
			}
			System.out.println("*");
			}
		
System.out.println("5-------------");
		
		for(int i = 1; i<=5; i++){
			for(int j =1; j<=5; j++){
				System.out.print("");
			}
			System.out.println("*");
			}
		
System.out.println("-------------");
		
for(int i = 5; i>=1; i--){
	for(int j=i; j>=2; j--){
		System.out.print(" ");//공백을 만들었다......그다음 어케하누 별을찍어야하는데?
	}
	for(int k=i; k<=5; k++){
		System.out.print("*");
	}
	System.out.println();
	}

System.out.println("-------------");

for(int i = 5; i>=1; i--){
	for(int j=i+1; j<=5; j++){
		System.out.print(" ");//공백을 만들었다......그다음 어케하누 별을찍어야하는데?
	}
	for(int k=i; k>=1; k--){
		System.out.print("*");
	}
	System.out.println();
	}

		
		
	}

}
