package SelfStudy.EnhanceGame;

import e_oop.ScanUtil;
import f_game.Item;
import f_game.Monster;



public class Game {
		Weapon c;
		Game(){
		c = new Weapon("길가다가 주운 나뭇가지", 100.0 , 5.0 , 5.0 , 5.0 , 0 , 50 );
		}
	public static void main(String[] args) {
		new Game().start();
	}
	
	void start(){
		int input = 0;
		while(true){
			System.out.println("1.내정보  2.금고털기  3.강화하기  4.보스  5.종료");
			c.showmoney();
			input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				c.showInfo();
				break;
				
			case 2:
				c.attack();
				break;
			
			case 3:
				System.out.println("1.한번강화하기\t 2.많이강화하기");
				input = ScanUtil.nextInt();
				if (input==1){
					c.enhance(1);
					break;
				}
				else{
					System.out.println("얼마나 강화하시겠습니까?");
					input = ScanUtil.nextInt();
					c.enhance(input);
				break;
				}
			case 4:
				System.out.println("1.돼지 저금통\t2.ATM기\t3.은행금고");
				input = ScanUtil.nextInt();
				if(input==1){
					hunt1();
					break;
				}
				else if(input==2){
					hunt2();
					break;
				}
					else{
						hunt3();
						break;
					}
					
			case 5:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}



void hunt1(){
	Boss1 m = new Boss1("돼지 저금통", 0, 100, 0, 0 );
	System.out.println(m.name + "을 털기 시작합니다.");
	c.attack1(m);
	}

void hunt2(){
	Boss2 m = new Boss2("ATM기", 200, 100, 15, 10 );
	System.out.println(m.name + "를 털기 시작합니다.");	
	c.attack2(m);
}		

void hunt3(){
	Boss3 m = new Boss3("은행금고", 1000, 50000, 100, 200 );
	System.out.println(m.name + "를 털기 시작합니다.");
	c.attack3(m);
}

}
