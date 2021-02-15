package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
//		//2차원
//		int[][] array2;
//
//		//3차원
//		int[][][] array3;
//
//		int[][] arr = new int[2][3]; 
//		
//		
//		System.out.print(Arrays.toString(arr));
//
//int[][] arr4 = new int[3][]; // 가변배열
//arr4[0] = new int[3];
//arr4[1] = new int[5];
//arr4[2] = new int[7];
//
//		
//		
//		System.out.println(arr[0][1]);
//		
////		arr[0]=10;
////		
////		
////		System.out.println(arr.length);
////		//1차원 배열의 길이
////		System.out.println(arr[0].length);
////		//2차원 배열의 길이
////		System.out.println(arr[1].length);
////		
//		int[][] arr = new int[][];
//		for(int i = 0 ; i <arr.length; i++){
//			for(int j = 0; j<arr[i].length; j++){
//				System.out.println(arr[i][j]);
//			}
//		}
//		
//		
//		
//		
		int[][] scores =new int[3][5];
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];
		
		for(int i = 0; i<scores.length; i++){
			for(int j = 0; j<scores[i].length; j++){
				scores[i][j]= (int)(Math.random()*101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		
		for (int i = 0 ; i<scores.length; i++){
			for(int j = 0 ; j<scores[i].length; j++){
				sum[i] +=scores[i][j];
				
			}
			avg[i] =(double)(Math.round(sum[i]*10)/scores[i].length)/10;
		
		}
				System.out.println("합계"+Arrays.toString(sum));
				System.out.println("평균"+Arrays.toString(avg));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
