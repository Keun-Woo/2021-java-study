package Homework;





public class Score {
	
	public static void main(String[] args) {
		Student[] sc =new Student[10];
		String[] name = new String[sc.length];
		int[] math = new int[sc.length];
		int[] eng = new int[sc.length];
		int[] kor = new int[sc.length];
		int[] sum = new int[sc.length];
		double[] avg = new double[sc.length];
		int[] rank = new int[sc.length];
		for (int i =0; i<sc.length; i++){
			Student student = new Student();
			name[i] =student.name(i);
			math[i] =student.math(i);
	 		eng[i]=student.eng(i);
	 		kor[i]=student.kor(i);
	 		sum[i]=student.sum(i);
	 		avg[i]=student.avg(i);
	 	}
			
		for(int i=0; i<sc.length; i++){
			rank[i]=1;
			for(int j=0; j<sc.length; j++){
				if(sum[i]<sum[j]){
					rank[i]++;
				
			}
		}
	}
	for(int i =0; i<sc.length; i++){
	System.out.print(rank[i]);
	}
	
	}
}
