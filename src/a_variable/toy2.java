package a_variable;

import java.util.Scanner;

public class toy2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a;
		String b;
		String c;
		String d;
		String e;
		String f;
		String g;
		String h;
		String i;
		String j;
	
		int ans=0;
		System.out.println("질문에 답하시오(Y/N)");
		System.out.println("질문1.>");
		a = sc.nextLine();
		switch(a){
		case "Y" :
			ans++;
			break;
		}
		System.out.println("질문2.>");
		b = sc.nextLine();
		switch(b){
		case "Y" :
			ans++;
			break;
		}
		System.out.println("질문3.>");
		c = sc.nextLine();
		switch(c){
		case "Y" :
			ans++;
			break;
		}
		System.out.println("질문4.>");
		d = sc.nextLine();
		switch(d){
		case "Y" :
			ans++;
			break;
		}
		System.out.println("질문5.>");
		e = sc.nextLine();
		switch(e){
		case "Y" :
			ans++;
			break;
		}
		System.out.println("질문6.>");
		f = sc.nextLine();
		switch(f){
		case "Y" :
			ans++;
			break;
		}
		System.out.println("질문7.>");
		g = sc.nextLine();
		switch(g){
		case "Y" :
			ans++;
			break;
		}
		
		System.out.println("질문에 답하시오(Y/N)");
		System.out.println("질문8.>");
		h = sc.nextLine();
		switch(h){
		case "Y" :
			ans++;
			break;
		}
		
	
		System.out.println("질문에 답하시오(Y/N)");
		System.out.println("질문9.>");
		i = sc.nextLine();
		switch(i){
		case "Y" :
			ans++;
			break;
		}

		System.out.println("질문에 답하시오(Y/N)");
		System.out.println("질문10.>");
		j = sc.nextLine();
		switch(j){
		case "Y" :
			ans++;
			break;
		}
		
		
		
		System.out.println("Y의 갯수는"+ans+"개입니다.");
		if(ans>=7){System.out.println("당신은 중독입니다.");}
		else if(ans<4){System.out.println("당신은 잘하고계시군요.");}
		else{System.out.println("당신은 위험합니다.");}
		
		
		
		
		
		
		
		
		
}
}