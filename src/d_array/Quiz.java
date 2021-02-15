package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		int money = (int)(Math.random()*500)*10;
//		int[] coin = {500,100,50,10};
//		
//		System.out.println("거스름돈: "+ money);
//		
//
//		
//		for(int i=0; i<coin.length; i++){
//		int count = money / coin[i];
//		money = money % coin[i];
//			
//		
//		System.out.println(coin[i]+"원 : " + count + "개");
//		}
//			
//			
//			int[] arr = new int[20];
//			for(int i = 0; i< arr.length; i++){
//				
//				arr[i]=(int)(Math.random()*5)+1;
//			}
//			System.out.println(Arrays.toString(arr));
//			
//			
//			for(int k =1; k<6; k++){
//				int count =0;
//				System.out.print(k+" : ");
//			for(int i =0; i<arr.length; i++){
//				if(arr[i]==k){
//					System.out.print("*");
//					count++;
//				}
//			}
//			System.out.print(" "+count);
//			System.out.println();
//			}
//		
//		
		
		int[] arr = new int[10];
		for(int i = 0; i <arr.length; i++){
			arr[i] = (int)(Math.random()*5)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int i=0;
		for(i=0; i<arr.length; i++){
			for(int k=i+1; k<arr.length; k++){
				if(arr[i]==arr[k]){
					arr[k]=0;
				}
			}
		}
		int count = 0;
	for(i=0; i<arr.length; i++){
		if(arr[i]==0){
				count++;
	}}
	System.out.println(Arrays.toString(arr));
	
	
	
				int[] ans = new int[arr.length-count];
				for(int k=0; k<ans.length; k++){
					for(i=0; i<arr.length; i++){
						if(arr[i]==ans[k]){
						
					
						
							
						}
					}
				}
				
		System.out.println(Arrays.toString(ans));
		
		
		
		
//		
//		
//		
//		
//		
//		
//		for()
//		int[] ans = new int[k];
//		ans[k]=
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
