package Homework;
public class Student {
	String name;
	int sum;
	int kor;
	int eng;
	int math;
	double avg;
	
	String name(int x){
		return name= x+1+"번째학생";
	}
	
	int kor(int x){
	return kor=	(int)(Math.random()*101);
	}
		
	int eng(int x){
		return eng=	(int)(Math.random()*101);
		}
		
	int math(int x){
		return math=(int)(Math.random()*101);
		}	
		
	int sum(int x){
		return sum=kor+eng+math;
		}	
		
	double avg(int x){
		return avg= (double)(Math.round(sum*100/3)/100);
		}	
		
	
		
		
		
		
		
}

