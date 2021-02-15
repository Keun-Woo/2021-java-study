package e_oop;

public class OOP {

	public static void main(String[] args) {
	
		SampleClass sc = new SampleClass();
	
		System.out.println(sc.field);
	
		sc.method1();
	
		String returnValue = sc.method2(10);
	
		System.out.println(returnValue);
		
		
		sc.flowTest1();
	
	//방금 만든 클래스의 객체를 생성하고 변수에 저장해 주세요.
	ClassMaker cm = new ClassMaker();
	//객체가 저장된 변수를 통해 메서드를 호출 해주세요.
	cm.method();
	System.out.println(cm.method2());
	cm.method3(10);
	System.out.println(cm.method4(10,20));
	
	//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
	
	//리턴타입이 있는 메서드를 리턴받은 값을 출력해주세요.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
