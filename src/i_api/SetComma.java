package i_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {
	 //숫자를 입력받아(문자) 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를입력하시오>");
		String input = sc.nextLine();
		int length = input.length();
		String output = "";
		
		
		for (int i = length-1; i >= 0; i--) {
			output += input.charAt(i);
		}
		int count =0;
		String change ="";
		
		for (int i = 0; i < output.length(); i++) {
			count ++;
			change += output.charAt(i);
			if(count%3==0&&i!=output.length()-1){
				change+=",";
			}
			
		}
		
		String answer ="";
		for (int i = change.length()-1; i >= 0; i--) {
			answer += change.charAt(i);
		}
		
		System.out.println(answer);
		
	}

}
