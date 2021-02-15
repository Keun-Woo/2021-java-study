package f_game;

public class Character {

	String name;	//이름
	int maxHp;		//최대 체력
	int maxMp;		//최대 마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	int mag;		//마력
	int level;		//레벨
	int exp;		//경험치
	
	Item[] items;	//보유 아이템
	
	Character(String name, int hp, int mp, int att, int def ,int mag){
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.mag = mag;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo(){
		System.out.println("==========================");
		System.out.println("---------- 상태 -----------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("마력 : " + mag);
		System.out.println("---------- 아이템 ----------");
		for(int i = 0; i < items.length; i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		}
		System.out.println("==========================");
	}
	
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 공격으로 " + m.name + "에게"
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	void magic1(Monster m){
		int damage = (int)(mag*0.5+mp*0.3 - m.def);
		System.out.println("파이어볼!!!!!!");
		if(mp>20){
			mp -=20;
			System.out.println("마나를 20 소비하였습니다.");
		}
		if(mp<=20){
			System.out.println("마나가 부족하여 빗나갔습니다.");
			damage = 1;
		}
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 마법1로 " + m.name + "에게"
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	void magic2(Monster m){
		int damage = (int)(mag*0.5+mp*0.3 - m.def);
		System.out.println("★★★★★★썬 더 볼 트★★★★★★★");
		if(level>30){
		if(mp>50){
			mp -=50;
			System.out.println("마나를 20 소비하였습니다.");
		}
		if(mp<=50){
			System.out.println("마나가 부족하여 빗나갔습니다.");
			damage = 1;
		}
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 마법1로 " + m.name + "에게"
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
		System.out.println("레벨이 부족하여 사용할 수 없습니다.");
	}
	
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level++;
		maxHp += 5;
		maxMp += 5;
		mag += 2;
		att += 1;
		def += 1;
		hp = maxHp;
		mp = maxMp;
		System.out.println("LEVEL UP!!");
	}
	
	void getItem(Item item){
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
		mag += item.mag;
	}
	
}











