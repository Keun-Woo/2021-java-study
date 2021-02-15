package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
	System.out.println(10|15); // | : 둘다 0인경우 0 그렇지않다면 1
	//10 : 00001010
	//15 : 00001111

	
	
	
	
int x = 10;
int y = 20;
int result = x<y ? x: y;
System.out.println(result);



int regNo =1;
String gender = regNo == 1 ? "남자" : "여자";
System.out.println("당신의 성별은 " + gender + " 입니다.");


gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
System.out.println("당신의 성별은 " + gender + " 입니다.");

//2개의 숫자를 입력받고 , 둘 중 더 큰 숫자를 출력해주세요.
int a;
int b;
Scanner sc = new Scanner(System.in);
System.out.println("첫번째 숫자>");
a = Integer.parseInt(sc.nextLine());
System.out.println("두번째 숫자>");
b =Integer.parseInt(sc.nextLine());

int t;
t= a>b ? a : b;
System.out.println(t);






//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
//그외의 숫자를 입력하면 확인불가를 출력해주세요.


int id;
System.out.println("숫자를 입력해주세요>");
id = Integer.parseInt(sc.nextLine());
gender=id==1||id==3 ? "남자" : (id==2||id==4 ? "여자" : "확인불가");
System.out.println(gender);


































	}

}
