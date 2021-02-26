package CORDINGTEST;

public class subaksu {

	public static void main(String[] args) {
		String su ="수";
		String bak = "박";
		int a = (int)(Math.random()*100);
		int b = a;
		int count =1;
		String answer ="";
		while(count <=a){
			if(count%2==1){
			answer +=su;
			}
			else {
				answer +=bak;
			
			}
			
			count +=1;
			b -=1;
		}
		System.out.println("a는"+a+"이고 답은 : "+answer );
		
	}
	
}

