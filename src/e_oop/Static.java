package e_oop;

public class Static {
	static int var;
	
	public static void main(String[] args) {
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		철수.saveDateMoney(200000);
		영희.saveDateMoney(200000);

	
//	System.out.println("문자열 입력>");
//	String str = ScanUtil.nextLine();
//	System.out.println("입력받은 문자열 : "+ str);
//	
//	System.out.println("숫자 입력>");
//	int num = ScanUtil.nextInt();
//	double num1 = ScanUtil.nextDouble();
//	System.out.println("입력받은 숫자 : "+ num);
//	System.out.println("입력받은 숫자 : "+ num1);
	}
}



class Human{
	int account;//계좌 <<<<인스턴스의 변수를 사용했을때
	
	void saveMoney(int money){//저축하는 메서드
		account +=money;
		System.out.println("통장 잔고 : "+ account);
	}
	
	
	
	static int dateAccount;
	
	void saveDateMoney( int money){
		dateAccount += money;
		System.out.println("데이트 통장 잔고 : "+ dateAccount);
	}
}