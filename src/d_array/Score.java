package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		int[][] arr = new int[22][7];//22명의 학생 7개의과목
		String[] name = {"김민지","서주형","최윤성","변형균","김두환","현유진","김현슬","이광렬"
				 ,"박예진","강건우","명민호","박상영","이휘로","김현태","최영준","정영인","정유진",
				 "공슬기","김이현","전윤주","전재수","유은지"};
	
		
	
		for(int i =0; i<arr.length; i++){
		for(int j =0; j<arr[i].length; j++){
		arr[i][j]= (int)(Math.random()*101);
		}
		//arr[i]={국어,영어,수학,사회,과학,오라클,자바}
		
		}
		System.out.print("이름\t"+"국어\t"+"영어\t"+"수학\t"+"사회\t"+"과학\t"+"Oracle\t"+"Java\t"+"합계\t"+"평균\t"+"석차\t");
		
		int sum[] =new int[arr.length];
		double avg[] = new double[arr.length];
		for (int i = 0;i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				sum[i] += arr[i][j];
			}
		
			avg[i] = (double)(Math.round(sum[i]*100/arr[i].length))/100;//arr[i].length = 7 , 
			
				
		}	
				
			
			
			
		
		int[] rank = new int[arr.length];
		for( int a = 0; a<arr.length; a++){
			rank[a]=1;
			for(int b=0; b<arr.length; b++){
				if(sum[a]<sum[b]){
					rank[a]++;
				}
			}
		}
		
		int sum1[] = new int[7];
		double avg1[] = new double[7];
		for (int d = 0; d < arr[d].length; d++) {
			for (int e = 0; e < arr.length; e++) {
				sum1[d] += arr[e][d];
				avg1[d] = (double) (Math.round(sum1[d] * 100 / arr.length)) / 100;
			}
		}

		for (int c = 0; c < arr.length; c++) {
			System.out.print("\n" + name[c] + "\t" + arr[c][0] + "\t"
					+ arr[c][1] + "\t" + arr[c][2] + "\t" + arr[c][3] + "\t"
					+ arr[c][4] + "\t" + arr[c][5] + "\t" + arr[c][6] + "\t"
					+ sum[c] + "\t" + avg[c] + "\t" + rank[c] + "\t");

		}
		System.out.print("\n과목합계\t" + sum1[0] + "\t" + sum1[1] + "\t"
				+ sum1[2] + "\t" + sum1[3] + "\t" + sum1[4] + "\t"
				+ sum1[5] + "\t" + sum1[6] + "\t");
		System.out.print("\n과목합계\t" + avg1[0] + "\t" + avg1[1] + "\t"
				+ avg1[2] + "\t" + avg1[3] + "\t" + avg1[4] + "\t"
				+ avg1[5] + "\t" + avg1[6] + "\t");
	}
}
