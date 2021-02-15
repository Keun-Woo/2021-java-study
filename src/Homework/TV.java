package Homework;

import java.util.Scanner;

public class TV {
		//과제. TV를 대상으로 클래스를 만들어주세요.
//	/ 전원(ON/OFF) / 채널 / 볼륨 /<<<변수
//             숫자입력/채널올리는메서드 /내리는메서드 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		REMOTE order = new REMOTE();
		
		System.out.println("명령하시오(전원=1,채널=2,볼륨=3)>");
		int str = Integer.parseInt(sc.nextLine());
		while(str!=4){
		if(str==1){
			System.out.println("ON/OFF");
			String str1 = sc.nextLine();
		System.out.println(order.power(str1));
	}
		else if(str==2){
			System.out.println("채널을 어떻게 옮기시겠습니까?(채널입력=1/'+'=2,'-'=3)");
			int cha = Integer.parseInt(sc.nextLine());
			if(cha==1){
				System.out.println("몇 채널로 옮기시겠습니까?");
				int chanum = Integer.parseInt(sc.nextLine());
				System.out.println(order.order(chanum));
			}
			else if(cha==2){
				System.out.println("얼마나 채널을 옮기시겠습니까?");
				int chanum = Integer.parseInt(sc.nextLine());
				System.out.println(order.plus(chanum));
			}
			else if(cha==3){
				System.out.println("얼마나 채널을 옮기시겠습니까?");
				int chanum = Integer.parseInt(sc.nextLine());
				System.out.println(order.minus(chanum));
			}
		}
		else if(str==3){
			System.out.println("음향 조절을 하시겠습니까?('+'=1,'-'=2)");
			int sou = Integer.parseInt(sc.nextLine());
			if(sou==1){
				System.out.println("얼마나 음향을 높이시겠습니까?");
				int sounum = Integer.parseInt(sc.nextLine());
				System.out.println(order.plus1(sounum));
			}
			else if(sou==2){
				System.out.println("얼마나 음향을 낮추시겠습니까?");
				int sounum = Integer.parseInt(sc.nextLine());
				System.out.println(order.minus1(sounum));
			}
		}
		
	
		System.out.println("명령하시오(전원=1,채널=2,볼륨=3)>");
		str = Integer.parseInt(sc.nextLine());
	
	
		}
	
	
	
	
	
	
	
}
}

class REMOTE{
	static int num=0;
	static int sou=0;
	String power(String x){
	return "전원을"+x+"했습니다.";
	}
	
	String order(int k){
		num = k;
		return "채널을"+num+"로 옮겼습니다.";
	}
	
	
	String plus(int i){
		num +=i;
		return "채널을" +num+"로 옮겼습니다.";
	}
	
	String minus(int i){
		num -=i;
		return "채널을" +num+"로 옮겼습니다.";
	}
	
	String plus1(int i){
		sou +=i;
		return "음향을" +sou+"로 높였습니다.";
	}
	
	String minus1(int i){
		sou -=i;
		return "음향을" +sou+"로 낮췄습니다.";
	}
	
	
	
	
	
	
	
	
}	
	

