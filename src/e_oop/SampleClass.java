package e_oop;

public class SampleClass {
	public static void main(String[] args) {
		int local =10;//지역변수 : 메서드 안에서만 사용하는 변수
	}
	int field;//전역변수 : 클래스 전체 영역에서 사용하는 변수
	//초기화하지 않아도 기본값으로 초기화된다.
	
	boolean bool = false;
	String str = null;




void method1(){
	System.out.println("파라미터도 리턴타입도 없는 메서드");
	
}

String method2(int parameter){
	return parameter + "를받아 명령을 수행하고 결과물을 리턴하는 메서드";
}

void flowTest1(){
	System.out.println("flowTest1 시작 :1 ");
	flowTest3();
	System.out.println("flowTest1 종료 :6 ");
}

void flowTest2(){
	System.out.println("flowTest2 시작 :3 ");
	System.out.println("flowTest2 종료 :4 ");
}
void flowTest3(){
	System.out.println("flowTest3 시작 :2 ");
	flowTest2();
	System.out.println("flowTest3 종료 :5 ");
}














}