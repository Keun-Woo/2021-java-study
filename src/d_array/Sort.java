package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		 int[] arr = new int[10];
		 for(int i = 0; i <arr.length; i++){
		 arr[i] = (int)(Math.random()*100)+1;
		 }
		System.out.println(Arrays.toString(arr));

//		int[] rank = new int[arr.length];
//		for(int i = 0; i < rank.length; i++){
//			rank[i]=1;
//		}
//		for(int i = 0; i <arr.length; i++){
//			for(int j = 0; i<arr.length; j++){
//				if(arr[i]<arr[j]){
//					rank[i]++;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(rank));
		
//		
//		for(int i = 0; i<arr.length-1; i++){
//		for(int j = i+1; j<arr.length; j++){
//			{
//				int min =arr[i];
//				if(min>arr[j]){
//					min=arr[j];
//					arr[j]=arr[i];
//					arr[i]=min;	
//			}	
//			}
//		}
//		}
//	System.out.println(Arrays.toString(arr));
//		
//		int max =0;
//		for(int i=0; i<arr.length-1; i++){
//			boolean flag = false;
//		for(int j=0; j<arr.length-i-1; j++){
//			if(arr[j]>arr[j+1]){
//				 max =arr[j];
//				arr[j] =arr[j+1];
//				arr[j+1]=max;
//				flag = true;
//			}
//			if(flag == false){//!flag
//				break;
//			}
//		}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		
//		
//		
		
		
		for(int i =1; i<arr.length; i++){
			int min = arr[i];
			int j =0;
			for(j=i-1; j>-1; j--){
				
			if(arr[j]>min){
				arr[j+1] = arr[j];
			}else{
			break;}
				
			{
				
				
			}
			
			}
			arr[j+1]=min;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
