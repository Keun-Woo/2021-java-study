package c_statement;

import java.util.Scanner;

public class toy {

	public static void main(String[] args) {
		
		int a = 3;
		
		if(a==0){System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");}
		else if(a==1){System.out.println("a가 1인경우에 하고싶은것");}
		else if(a==2){System.out.println("a가 2인경우에 하고싶은것");}
		else if(a==3){System.out.println("a가 3인경우에 하고싶은것");}
		
		
		int score;
		
//		score = 79;
//		String grade = null;
//		if(90 <= score && score <= 100){grade ="A";}
//		else if (80 <= score ){grade ="B";}
//		else if (70 <= score ){grade ="C";}
//		else if (60 <= score ){grade ="D";}
//		else if (70 <= score ){grade ="E";}
//		else {grade ="F";}
//		System.out.println(grade);
	
		
		
//		score = 79;
//		String grade = null;
//		if(90 <= score && score <= 100){grade ="A";if(97<= score){grade +="+";}else if(score<=93){grade+="-";}}
//		else if (80 <= score ){grade ="B";if(87<= score){grade +="+";}else if(score<=83){grade+="-";}}
//		else if (70 <= score ){grade ="C";if(77<= score){grade +="+";}else if(score<=73){grade+="-";}}
//		else if (60 <= score ){grade ="D";if(67<= score){grade +="+";}else if(score<=63){grade+="-";}}
//		else if (70 <= score ){grade ="E";if(57<= score){grade +="+";}else if(score<=53){grade+="-";}}
//		else {grade ="F";}
//		System.out.println(grade);
		
		
		
		a= 1;
		switch(a){
		case 1:
			System.out.println("a가 1인 경우에 하고싶은 것");
			break;
		case 2:
			System.out.println("a가 2인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("a가 3인 경우에 하고싶은 것");
		}
		
		
		String b = "a";
		switch(b){
		case "a" : 
			System.out.println("b가\"a\"인 경우에 하고싶은것");
			break;
		case "b" :
			System.out.println("b가\"b\"인 경우에 하고싶은것");
			break;
		default:
			System.out.println("이외의 경우에 하고싶은것");
		}
		
		
		int mon =1;
		String season = null;
	switch(mon){	
	case 3:
	case 4:
	case 5:
		season = "봄";
		break;
	case 6:
	case 7:
	case 8:
		season = "여름";
		break;
	case 9:
	case 10:
	case 11:
		season = "가을";
		break;
	default:
		season = "겨울";}
		System.out.println(season);
	
		
		

// 숫자를 입력받아 그 숫자가 0 인지 0이 아닌지 출력해주세요.
		
		Scanner sc= new Scanner(System.in);		
	System.out.println("숫자를 입력하시오>");
	int x;
	x= Integer.parseInt(sc.nextLine());
	if (x%2 == 0){System.out.println("짝수");}
	else
	{System.out.println("홀수");}
		
		
	
	
	
//	점수 3개를 입력받아 총점 평균 등급을 출력해주세요
//	평균은 소수점 1자리 까지
	
	int num_1;
	int num_2;
	int num_3;
	int score1;
	int score_2;
	System.out.println("첫번째 점수>");
	num_1 =Integer.parseInt(sc.nextLine());
	System.out.println("두번째 점수>");	
	num_2 =Integer.parseInt(sc.nextLine());
	System.out.println("세번째 점수>");	
	num_3 =Integer.parseInt(sc.nextLine());	
	
	int sum = num_1+num_2+num_3;
	System.out.print("총점은"+sum+"입니다");
	double avg = (double)Math.round(10*(num_1+num_2+num_3)/3)/10;
	System.out.print("평균은"+avg+"입니다");
	
	
	
	//랜덤발생 
	int random = (int)(Math.random()*100)+1;
	System.out.println(random);
	
	//1~100사이의 랜덤한 수를 3개를 발생시키고 오름차순으로 출력해주세요.
	
	


	int random_1 =(int)(Math.random()*100)+1;
	int random_2 =(int)(Math.random()*100)+1;
	int random_3 =(int)(Math.random()*100)+1;
	System.out.println(">>>>>>>>>>>>>>>>>>>>");
    if (random_1 <=random_2 && random_2<= random_3){System.out.println(random_1+"<="+random_2+"<="+random_3);}
    else if (random_2 <=random_3 && random_3<= random_1){System.out.println(random_2+"<="+random_3+"<="+random_1);}
    else if (random_1 <=random_3 && random_3<= random_2){System.out.println(random_1+"<="+random_3+"<="+random_2);}
    else if (random_2 <=random_1 && random_1<= random_3){System.out.println(random_2+"<="+random_1+"<="+random_3);}
    else if (random_3 <=random_1 && random_1<= random_2){System.out.println(random_3+"<="+random_1+"<="+random_2);}
    else {System.out.println(random_3+"<="+random_2+"<="+random_1);}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
