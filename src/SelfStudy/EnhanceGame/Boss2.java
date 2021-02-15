package SelfStudy.EnhanceGame;

public class Boss2 {
	String name; // 이름
	double def; //방어력
	double hp; // 체력
	double defcrtdam; //치명타피해감소
	double defcrtper; //치명타확률감소

	Boss2(String name, double def, double hp, double defcrtdam, double defcrtper) {
		this.name = name;
		this.def = def;
		this.hp = hp;
		this.defcrtdam = defcrtdam;
		this.defcrtper = defcrtper;
		}
	
}
