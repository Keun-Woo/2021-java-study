package e_oop.score;



public class Score {

	public static void main(String[] args) {
		Student[] students =new Student[10];
		
		for (int i =0; i<students.length; i++){
			Student student = new Student();
			student.name = "학생"+(i+1);
			student.rank = 1;
			student.kor=(int)(Math.random()*101);
			student.eng =(int)(Math.random()*101);
			student.math =(int)(Math.random()*101);
			student.sum = student.kor+student.eng+student.math;
			student.avg = (double)Math.round(student.sum*100/3.0)/100;
			students[i] =student;
	 		}
			
			for(int j=0; j<students.length; j++){
				for(int k=0; k<students.length; k++){
					if(students[j].sum<students[k].sum){
						students[j].rank++;
					}
				}
			}
			int sumkor=0;
			int sumeng=0;
			int summath=0;
			for(int d=0; d<students.length; d++){
				sumkor +=students[d].kor;
				sumeng +=students[d].eng;
				summath +=students[d].math;
			}
		double avgkor=(double)Math.round(sumkor*100/3.0)/100;
		double avgeng=(double)Math.round(sumeng*100/3.0)/100;
		double avgmath=(double)Math.round(summath*100/3.0)/100;

		System.out.print("학생이름\t 국어\t 수학\t 영어\t 합계\t 평균\t 석차\n");
		for(int a=0; a<students.length; a++){
		System.out.print(students[a].name+"\t"+students[a].kor+"\t"+students[a].math+"\t"
		+students[a].eng+"\t"+students[a].sum+"\t"+students[a].avg+"\t"+students[a].rank+"\n");
		}
		System.out.println("과목합계\t"+sumkor+"\t"+summath+"\t"+sumeng+"\t");
		System.out.println("과목평균\t"+avgkor+"\t"+avgmath+"\t"+avgeng+"\t");
		System.out.print("---------------------석차별 정렬-------------------------\n");
		String minname="0";
		int minkor=0;
		int minmath=0;
		int mineng=0;
		int minsum=0;
		double minavg=0.00;
		int min=0;
		
		for(int b= 0; b<students.length-1; b++){
			min= students[b].rank ;
			for(int c=b; c<students.length; c++){
				if(min>students[c].rank){
					min=students[c].rank;
					students[c].rank=students[b].rank;
					students[b].rank=min;
					minkor=students[c].kor;
					students[c].kor=students[b].kor;
					students[b].kor=minkor;
					minmath=students[c].math;
					students[c].math=students[b].math;
					students[b].math=minmath;
					mineng=students[c].eng;
					students[c].eng=students[b].eng;
					students[b].eng=mineng;
					minsum=students[c].sum;
					students[c].sum=students[b].sum;
					students[b].sum=minsum;
					minavg=students[c].avg;
					students[c].avg=students[b].avg;
					students[b].avg=minavg;
					minname=students[c].name;
					students[c].name=students[b].name;
					students[b].name=minname;
//					하나하나 할필요없이
//					for(int b= 0; b<students.length-1; b++){
//					min= students[b].rank ;
//					for(int c=b; c<students.length; c++){
//						if(min>students[c].rank){
//							Student min=students[c];
//							students[c]=students[b];
//							students[b]=Student min;
				}
			}
		}
		
		System.out.print("학생이름\t 국어\t 수학\t 영어\t 합계\t 평균\t 석차\n");
		for(int a=0; a<students.length; a++){
		System.out.print(students[a].name+"\t"+students[a].kor+"\t"+students[a].math+"\t"
		+students[a].eng+"\t"+students[a].sum+"\t"+students[a].avg+"\t"+students[a].rank+"\n");
		}
		System.out.println("과목합계\t"+sumkor+"\t"+summath+"\t"+sumeng+"\t");
		System.out.println("과목평균\t"+avgkor+"\t"+avgmath+"\t"+avgeng+"\t");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
