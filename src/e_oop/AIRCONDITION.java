package e_oop;

import java.util.Scanner;

public class AIRCONDITION {
	boolean power;
	int heat;
	int cool;
	int wind;
	
	final int max_heat =50;
	final int min_heat =20;
	final int max_cool =30;
	final int min_cool =0;
	final int max_wind =10;
	final int min_wind =0;
	
	AIRCONDITION(){
		power =false;
		heat = 25;
		cool = 25;
		wind = 1;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "냉난방기 켜짐" : "냉난방기 꺼짐");
	}
	
	void plusheat(){
		if(power){
			if(heat<max_heat){
				heat++;
			}
		}
	}
	void minusheat(){
		if(power){
			if(heat>min_heat){
				heat--;
			}
		}
	}
	void pluscool(){
		if(power){
			if(cool<max_cool){
				cool++;
			}
		}
	}
	void minuscool(){
		if(power){
			if(cool>min_cool){
				cool--;
			}
		}
	}
	
	void pluswind(){
		if(power){
			if(wind<max_wind){
				wind++;
			}
			showwind();
		}
	}
	void minuswind(){
		if(power){
			if(wind>min_wind){
				wind--;
			}
			showwind();
		}
	}
	void showwind(){
		System.out.print("풍속. ");
		for(int i = min_wind + 1; i <= max_wind; i++){
			if(i <= wind){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	AIRCONDITION air = new AIRCONDITION();
	


	}

}
