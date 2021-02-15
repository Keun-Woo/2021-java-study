package e_oop.score;


public class UserDefineDataType {

	public static void main(String[] args) {
		//기본형
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//배열
		int[] scores;
		int[] sum2;
		double[] avg2;
		String name2;
		
		//클래스
		Student student;
		student = new Student();
		student.kor =80;
		student.eng =90;
		student.math =70;
		student.sum =student.kor+student.eng+student.math;
		student.avg =student.sum / 3.0;
		student.name ="홍길동";
		
		System.out.println(student.name);
		System.out.println(student.avg);
		
	}

}


