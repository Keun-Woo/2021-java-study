package CORDINGTEST;

public class middleword {

	public static void main(String[] args) {
		String s = "abcdef";
		String answer = "";
		int a = s.length();
		if(a%2==0){
		answer =s.substring(a/2-1,a/2+1);
		}
		else if(s.length()%2!=0){
		answer = s.substring(a/2,a/2+1);
		}
		System.out.println(answer);
	}

}
