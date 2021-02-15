package f_game;

public class Item {

	String name;	//이름
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int mag;		//마력
	
	Item(String name, int hp, int mp, int att, int def ,int mag){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.att = att;
		this.def = def;
		this.mag = mag;
	}
	
	String itemInfo(){
		String info = name + " :";
		if(0 < hp) info += " 체력+" + hp;
		if(0 < mp) info += " 마나+" + mp;
		if(0 < att) info += " 공격+" + att;
		if(0 < def) info += " 방어+" + def;
		if(0 < mag) info += " 마력+" + mag;
		return info;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}










