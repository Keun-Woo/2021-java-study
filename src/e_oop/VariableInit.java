package e_oop;

public class VariableInit {
		int var;
		static int staticVar;
		
		//초기화 블럭
		{
			var =30;
		}
	
		static{
			staticVar =40;
		}
	
		
	VariableInit(){
		var=50;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	Init i = new Init();
	
	i.a = 10;
	i.b = 20;
	i.c = 30;
	
	Init i2 =new Init();
	i2.a =40;
	i2.b =50;
	i2.c =60;
	//귀찮다.......
	
	
	
	
	Init  i3 =new Init(70, 80, 90);

	}

}


class Init{
	int a ;
	int b;
	int c;
	
	
	
	Init(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	
	//오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	Init(){
		this(10,20,30);
	}
}



































