package SelfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class _210123 {

	public static void main(String[] args) {
//	 이름,나이를 입력받아 나타내어보시오-2일차
//		Scanner sc = new Scanner(System.in);
//		String name;
//		int age;
//		System.out.println("당신의 이름을 저장하시오>");
//		name = sc.nextLine();
//		System.out.println("당신의 나이를 저장하시오>");
//		age = Integer.parseInt(sc.nextLine());
//		System.out.println("당신의 이름은 : "+name+"\t당신의 나이는 : "+age);
//	
		
//		//3일차
//		double silsu = Math.random()*100;//0<Math.random()<1
//		double ans = (double)Math.round(silsu*10)/10;
//		double ans_2 = silsu*10/10;
//		System.out.println("실수는"+silsu+"\nans는"+ans+"\nans_2는"+ans_2);
//		
//		//두개의 숫자를 입력받고 더 큰 숫자를 출력하라.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째숫자입력>");
//		int num_1 = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째숫자입력>");
//		int num_2 = Integer.parseInt(sc.nextLine());
//		int k;
//		k = num_1>num_2 ? num_1 : num_2;
//		System.out.println(k);
//		
//		//주민등록번호를 입력받아 남자면 남자 여자면 여자를 출력하고 확인이 안될시 확인불가를 출력하라.
//		System.out.println("주민등록번호 뒷자리 7자리를 입력해주세요.");
//		int num = Integer.parseInt(sc.nextLine());
//		String gender = num/1000000 ==3||num/1000000 ==1 ? "남자" : (num/1000000 ==2||num/1000000 ==4 ? "여자" : "확인불가");
//		System.out.println("당신의 성별은 "+gender+" 입니다");
//		
		//랜덤한 0~100사이의 점수를 생성하여 등급을 매겨라.
//		int random = (int)(Math.random()*101);
//		System.out.println(random);
//		
//		char score;
//		char score_1;
//		if(random<= 100&&random>=90){
//		score = 'A';
//		}
//		else if(random<90&&random>=80){
//			score = 'B';
//		}
//		else if(random<80&&random>=70){
//			score = 'C';
//		}
//		else if(random<70&&random>=60){
//			score = 'D';
//		}
//		else if(random<60&&random>=50){
//			score = 'E';
//		}
//		else{
//			score = 'F';
//		}
//		if(random%10<=3){
//			score_1 ='-';
//		}
//		else if(random%10>=7){
//			score_1 ='+';
//		}
//		else{
//			score_1='0';
//		}
//		System.out.println("당신의 등급은 :"+score+score_1);
////		
//	별찍기 (5,5) 4방향 돌리기
		for(int i=0; i<5; i++){
			for(int j=i; j<5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int i=0; i<5; i++){
			for(int j=i+1; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		
		for(int i=0; i<5; i++){
			for(int j=i; j>0; j--){
				System.out.print(" ");
			}
			for(int k=i; k<5; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for(int i=0; i<5; i++){
			for(int j=i+1; j<5; j++){
				System.out.print(" ");
			}
			for(int k=i+1; k>0; k--){
				System.out.print("*");
			}
			System.out.println();
		}
		
//		//석차구하기 >>>>>>>>> 각 수를 서로 비교한후 크기가 작은 index에 +1하기 2-2
//		int[] score = new int[10];
//		int[] rank = new int[10];
//		
//		for(int i=0; i<score.length; i++){
//			score[i]=(int)(Math.random()*101);
//			rank[i]=1;
//		}
//		System.out.println(Arrays.toString(score));
//		for(int j=0; j<score.length; j++){
//			for(int k=0; k<score.length; k++){
//				if(score[j]<score[k]){
//					rank[j]++;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(rank));

		//선택정렬 
//		첫번째 인덱스와 나머지 인덱스를 비교하여 가장 작은수를가진인덱스와 첫번째인덱스를 교환해주는것
//		int[] score = new int[10];
//		for(int i=0; i<score.length; i++){
//			score[i]=(int)(Math.random()*101);
//		}
//		System.out.println(Arrays.toString(score));
//		int min = 0;
//		for(int a=0; a<score.length-1; a++){
//			
//			for(int b=a+1; b<score.length; b++){
//				min =score[a];
//				if(min>score[b]){
//					score[a]=score[b];
//					score[b]=min;
//					min = score[b];
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(score));
//		
//		//버블정렬
////		인접한 인덱스의 수와 비교하여 클경우 자리를 바꾼다.
//		int[] score = new int[10];
//		for(int i=0; i<score.length; i++){
//			score[i]=(int)(Math.random()*101);
//		}
//		System.out.println(Arrays.toString(score));
//		for(int a=0; a<score.length-1; a++){
//			int max =0;
//			for(int b=0; b<score.length-1-a; b++){
//				if(score[b]>score[b+1]){
//				max= score[b];
//				score[b]=score[b+1];
//				score[b+1]=max;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(score));
		
		
		
		
		//삽입정렬
////		1번인덱스에서 시작하여 앞의 수들과 비교하여 작을경우 그사이에 넣는다. /단, 작지않을경우 그인덱스의 정렬은 그만둔다.
//		int[] score = new int[10];
//		for(int i=0; i<score.length; i++){
//			score[i]=(int)(Math.random()*101);
//		}
//		System.out.println(Arrays.toString(score));
//		int min =0;
//		for(int j=1; j<score.length; j++){
//			boolean f =true;
//			for(int k=j; k>0; k--){
//				if(score[k-1]>score[k]){
//					min=score[k];
//					score[k]=score[k-1];
//					score[k-1]=min;
//					f =false;
//					}
//				if(f==true){
//					break;
//					}
//				
//					}
//			
//				}
//			
//		
//		
//		
//		
//		System.out.println(Arrays.toString(score));
//		
//		int money = (int)(Math.random()*500)*10;
//		int[]coin = {500,100,50,10};
//		//동전갯수를 최소화하여 사용하는 방법은?
//		
//		System.out.println("거스름돈: "+ money);
//		
//		int[]count =new int[coin.length];
//		for(int i=0; i<coin.length; i++){
//			count[i]=money/coin[i];
//			money %=coin[i];
//			System.out.print(coin[i]+"짜리\t"+count[i]+"개\n");
//		}
//		
//		
//		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
