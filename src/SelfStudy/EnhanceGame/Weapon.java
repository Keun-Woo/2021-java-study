package SelfStudy.EnhanceGame;

import f_game.Monster;

public class Weapon {
	String name;		//이름
	double att;			//공격력
	double crtper;		//치명타
	double crtdam;		//치명타피해
	double deplgn;		//방어력무시
	int time;			//강화횟수
	static	int gold;
	
	Weapon(String name, double att, double crtper, double crtdam, double deplgn ,int time ,int gold){
		this.name = name;
		this.att = att;
		this.crtper = crtper;
		this.crtdam = crtdam;
		this.deplgn = deplgn;
		this.time = time;
		this.gold = gold;
	}
	
	void showmoney(){
		System.out.println("보유한골드 : " + gold);
	}
	void showInfo(){
		System.out.println("==========================");
		System.out.println("---------- 상태 -----------");
		System.out.println("이름 : " + name+"[+"+time+"]");
		System.out.println("공격력 : " + (double)((Math.round(att)*10)/10));
		System.out.println("치명타확률 : " + (double)((Math.round(crtper)*10)/10)+"%" );
		System.out.println("치명타피해 : " + (double)((Math.round(crtdam)*10)/10));
		System.out.println("방어력무시 : " + (double)((Math.round(deplgn)*10)/10));
		System.out.println("보유한골드 : " + gold);
		System.out.println("==========================");
	}
	void attack(){
		double random = Math.random()*101;
		int damage=0;
		if(random>crtper){
			damage += (int)(att);//치명x
		}
		else if(random<crtper&&crtper<100){
			damage += (int)(att*(200.0+crtdam)/100);//치명o 치명< 100
		}
		else{
			damage += (int)(att*(200.0+crtdam+(crtper-100))/100);// 치명o 치명>=100
		}
		System.out.println(name+"[+"+time+"]로 근처 자판기에서 "+damage+"만큼 훔쳤습니다." );
		gold +=damage;
	}
	
	void enhance(int a){
		if(gold>=100*a){
		for(int i=0; i<a; i++){
		att+=(double)(Math.random()*10-2.5);
		crtper+=(double)(Math.random()*2-0.7);
		crtdam+=(double)(Math.random()*4-1.2);
		deplgn+=(double)(Math.random()*1-0.3);
		time+=1;
		gold-=100;
		}
		System.out.println(time+"번 강화하여 "
				+ "공격력"+(double)((Math.round(att)*10)/10)+
				", 치명타확률"+(double)((Math.round(crtper)*10)/10)+"%\n"+
				", 치명타피해"+(double)((Math.round(crtdam)*10)/10)+
				", 방어력무시"+(double)((Math.round(deplgn)*10)/10)+"\n");
		}
		else{
			System.out.println("\"100 gold\"가 부족합니다.");
		}
		}
	
	
	void attack1(Boss1 m){
		if(deplgn>100){
			double random = Math.random()*101;
			double damage=0;
			if(random>crtper-m.defcrtper){
				damage += (int)(att);//치명x
			}
			else if(random<crtper-m.defcrtper&&crtper-m.defcrtper<100){
				damage += (int)(att*(200.0+crtdam-m.defcrtdam)/100);//치명o 치명< 100
			}
			else if(crtper-m.defcrtper>=100){
				damage += (int)(att*(200.0+crtdam-m.defcrtdam+crtper-m.defcrtper-100)/100);// 치명o 치명>=100
			}
			if(damage>m.hp){
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name +"을 신속히 털었습니다.!!");
			gold +=500;
			crtper +=5;
			deplgn +=1;
			System.out.println("500gold,치명타확률5퍼,방어력무시1퍼를 획득하였습니다.");
			}
			else{
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name+"을 털다가 적발되어 도망갔습니다.");
			}
		}
		else{
			if(deplgn<=100){
		
			double random = Math.random()*101;
			double damage=0;
			if(random>crtper-m.defcrtper){
				damage += (int)(att-m.def*(100-deplgn)/100);//치명x
			}
			else if(random<crtper-m.defcrtper&&crtper-m.defcrtper<100){
				damage += (int)((att-m.def*(100-deplgn)/100)*(200.0+crtdam)/100);//치명o 치명< 100
			}
			else if(crtper-m.defcrtper>=100){
				damage += (int)((att-m.def*(100-deplgn)/100)*(200.0+crtdam-m.defcrtdam+crtper-m.defcrtper-100)/100);// 치명o 치명>=100
			}
			if(damage>m.hp){
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name +"을 신속히 털었습니다.!!");
			gold +=500;
			crtper +=5;
			deplgn +=1;
			System.out.println("500gold,치명타확률5퍼,방어력무시1퍼를 획득하였습니다.");
			}
			
			else{
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name+"을 털다가 적발되어 도망갔습니다.");
		}
	
	

	}

}
	}
	void attack2(Boss2 m){
		if(deplgn>100){
			double random = Math.random()*101;
			double damage=0;
			if(random>crtper-m.defcrtper){
				damage += (int)(att);//치명x
			}
			else if(random<crtper-m.defcrtper&&crtper-m.defcrtper<100){
				damage += (int)(att*(200.0+crtdam-m.defcrtdam)/100);//치명o 치명< 100
			}
			else if(crtper-m.defcrtper>=100){
				damage += (int)(att*(200.0+crtdam-m.defcrtdam+crtper-m.defcrtper-100)/100);// 치명o 치명>=100
			}
			if(damage>m.hp){
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name +"을 신속히 털었습니다.!!");
			gold +=1000;
			crtper +=10;
			crtdam +=20;
			deplgn +=10;
			System.out.println("1000gold,치명타확률10퍼,치명타데미지20퍼,방어력무시10퍼를 획득하였습니다.");
			}
			else{
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name+"을 털다가 적발되어 도망갔습니다.");
			}
		}
		else{
			if(deplgn<=100){
		
			double random = Math.random()*101;
			double damage=0;
			if(random>crtper-m.defcrtper){
				damage += (int)(att-m.def*(100-deplgn)/100);//치명x
			}
			else if(random<crtper-m.defcrtper&&crtper-m.defcrtper<100){
				damage += (int)((att-m.def*(100-deplgn)/100)*(200.0+crtdam)/100);//치명o 치명< 100
			}
			else if(crtper-m.defcrtper>=100){
				damage += (int)((att-m.def*(100-deplgn)/100)*(200.0+crtdam-m.defcrtdam+crtper-m.defcrtper-100)/100);// 치명o 치명>=100
			}
			if(damage>m.hp){
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name +"을 신속히 털었습니다.!!");
				gold +=1000;
				crtper +=10;
				crtdam +=20;
				deplgn +=10;
			System.out.println("1000gold,치명타확률10퍼,치명타데미지20퍼,방어력무시10퍼를 획득하였습니다.");
			}
			
			
			else{
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name+"을 털다가 적발되어 도망갔습니다.");
		}
	
	

			}

}
	}
	void attack3(Boss3 m){
		if(deplgn>100){
			double random = Math.random()*101;
			double damage=0;
			if(random>crtper-m.defcrtper){
				damage += (int)(att);//치명x
			}
			else if(random<crtper-m.defcrtper&&crtper-m.defcrtper<100){
				damage += (int)(att*(200.0+crtdam-m.defcrtdam)/100);//치명o 치명< 100
			}
			else if(crtper-m.defcrtper>=100){
				damage += (int)(att*(200.0+crtdam-m.defcrtdam+crtper-m.defcrtper-100)/100);// 치명o 치명>=100
			}
			if(damage>m.hp){
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name +"을 신속히 털었습니다.!!");
				System.out.println(time+"번 강화하여 최고의 도둑이 되었습니다.");
			}
			else{
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name+"을 털다가 적발되어 도망갔습니다.");
			}
		}
		else{
			if(deplgn<=100){
		
			double random = Math.random()*101;
			double damage=0;
			if(random>crtper-m.defcrtper){
				damage += (int)(att-m.def*(100-deplgn)/100);//치명x
			}
			else if(random<crtper-m.defcrtper&&crtper-m.defcrtper<100){
				damage += (int)((att-m.def*(100-deplgn)/100)*(200.0+crtdam)/100);//치명o 치명< 100
			}
			else if(crtper-m.defcrtper>=100){
				damage += (int)((att-m.def*(100-deplgn)/100)*(200.0+crtdam-m.defcrtdam+crtper-m.defcrtper-100)/100);// 치명o 치명>=100
			}
			if(damage>m.hp){
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name +"을 신속히 털었습니다.!!");
				System.out.println(time+"번 강화하여 최고의 도둑이 되었습니다.");
			}
			
			else{
				System.out.println("데미지"+damage+"를 주었습니다.!!");
				System.out.println(m.name+"을 털다가 적발되어 도망갔습니다.");
		}
	
	

			}

}
	}
	
}