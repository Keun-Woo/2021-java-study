package SelfStudy;

import java.util.Arrays;




public class Method {

	public static void main(String[] args) {
		
		int A = (int)(Math.random()*100)+1;//1~100까지 수 
		//3진법을 표현하라.
		//B = 1*a+10*b+100*c+1000*d
		//B = a*1+b*3+c*3*3+c*3*3*3+d*3*3*3*3
	A=1;

		
		int answer = 0;
		int B=A;
	  	int count = 0;
		do{
			B/=3;
			count++;
		}
		while(B>0);
		System.out.println(A+"<<A \t" + count+"<<<카운트");
		
       int count1= 0;
		int[] number = new int[count];
		do{
			number[count1]=A%3;
			
//			System.out.println(Arrays.toString(number));
//			System.out.println(A);
			A/=3;
			count1++;
		}
		
		while(A>0);
//		System.out.println(Arrays.toString(number));
		//배열0번 인덱스부터 1의자리
        int x=1;
		for (int i = number.length-1; i >=0 ; i--) {
			answer+=number[i]*x;
			x*=3;
			
		}

		System.out.println(answer);
		
		
		
		
		
		
		
		
		
		
		
	}

}
