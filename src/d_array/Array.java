package d_array;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		int[] array;
//		array = new int[5]; 
//		
////		int[] x;
////		x = new int[4];
//		
//		int[] array2= {1,2,3,4,5};
//		
//		System.out.println(array2[0]);
//		System.out.println(array2[1]);
//		System.out.println(array2[2]);
//		System.out.println(array2[3]);
//		System.out.println(array2[4]);
//		
//		
//		array[0] = 10;
//		array[1] = 50;
//		array[2] = 40;
//		array[3] = 30;
//		array[4] = 20;
//		
//		
////		for(int i = 0; i<array.length; i++){
////			System.out.println(array[i]);
////		}
////		
//		
//		for(int i = 0; i< array.length; i++){
//		System.out.println("array["+i+"]"+"="+10*(i+1));
//		}
//		
//		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
//		
//		int[] x;
//		x = new int[10];
//		
//		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
//		
//		for (int i=0; i<x.length; i++)
//		{x[i]=(int)(Math.random()*100)+1;}
//		
//		System.out.println(Arrays.toString(x));
//		
//		
//		int sum = 0;
//		for(int i = 0; i<x.length; i++)
//		{
//		sum += x[i];}
//		
//		System.out.println("합계는"+sum);
//		
//		double avg = (double)sum/x.length;
//	
//		System.out.println("평균은"+avg);
//		
//		
//		int min=x[0];
//		int max=x[0];
//		int i= 0;
//		for(i=0; i < x.length; i++){
//			if(min > x[i]){
//			 min=x[i];
//			}
//		}
//		for(i=0; i < x.length; i++){
//				if(max<x[i]){
//					max= x[i];
//				}
//			}	
//		
//		
//		System.out.println("최소값은"+min+"최댓값은"+max);
//		
//		
//		
//		
//		
//		
//		int[] shuffle = new int[10];
//		for(int t = 0; t < shuffle.length; t++){
//			shuffle[t] = t+1;
//		}
//			System.out.println(Arrays.toString(shuffle));
//		
//			for(i=0; i<10; i++){
//			int ran = 0;
//			int k =0;
//			ran = (int)(Math.random()*10);
//			k=	shuffle[0];
//			shuffle[0]=shuffle[ran];
//			shuffle[ran]=k;
//			System.out.println("------------------------------");
//			System.out.println(Arrays.toString(shuffle));
//			}
//		
	 int[] count = new int[10];
	 int i = 0;
	 int k = 0;
		//1~10 사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
			
			for (i=0; i<500; i++){
				int x = (int)(Math.random()*10)+1;
			
					count[x-1 ]++;
			
				
			}
				
				
				
				
				
				
				
		
		System.out.println(Arrays.toString(count));
		
		
		
		
		
		
		
		
		
		
		
	}

	}

