package SelfStudy;

import java.util.Scanner;

public class TV_TEACHER {
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	
	final int MIN_CHANNEL = 1;//최대 최소 설정
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	TV_TEACHER(){// 전역변수 설정
		power = false;
		channel = 1;
		volume = 5;
	}
	
	void power(){//전원표시를 boolean을 통해 자동조건설정
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
	}
	
	void changeChannel(int channel){//채널에 입력값을 대입 this 
		if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
		if(power){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume();
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume();
		}
	}
	
	void showVolume(){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV_TEACHER tv = new TV_TEACHER();
		
		while(true){
			System.out.println("-------------------------------");
			System.out.println("1.전원  2.채널변경  3.채널업  4.채널다운");
			System.out.println("5.볼륨업  6.볼륨다운  0.종료");
			System.out.println("-------------------------------");
			System.out.print("번호 입력>");
			int input = Integer.parseInt(sc.nextLine());
			
			switch (input) {
			case 1: tv.power(); break;
				
			case 2:
				System.out.print("변경할 채널 입력>");
				int ch = Integer.parseInt(sc.nextLine());
				tv.changeChannel(ch);
				break;
				
			case 3: tv.channelUp(); break;
			case 4: tv.channelDown(); break;
			case 5: tv.volumeUp(); break;
			case 6: tv.volumeDown(); break;
				
			default:
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
}


