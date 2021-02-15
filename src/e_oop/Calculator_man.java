package e_oop;

public class Calculator_man {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result = cal.add(123456, 654321);
		result = cal.multiply(result, 123456);
		result = cal.divide(result,123456);
		result = cal.subtract(result, 654321);
		result = cal.mod(result,123456);
		System.out.println(result);

	}

}
