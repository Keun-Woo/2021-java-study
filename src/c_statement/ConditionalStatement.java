package c_statement;

public class ConditionalStatement {

	public static void main(String[] args) {
	int a = 1;
	if(a == 1){
	System.out.println("조건식의 연산결과가 ture이면 수행된다.");
	}
	
	if(a==0){System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");}
	else if(a==1){System.out.println("a가 1인경우에 하고싶은것"+1+2);}
	else if(a==2){System.out.println("a가 2인경우에 하고싶은것");}
	else if(a==3){System.out.println("a가 3인경우에 하고싶은것");}

	}

}
