package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
	//List에 1부터 100까지 랜덤값을 10개 저장해주세요.
		ArrayList sample = new ArrayList();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0; i<10; i++){
			int random = (int)(Math.random()*100)+1;
			list.add(random);
			
		}
		System.out.println(list);
		int a = 0;
		double b= 0;
		for(int i =0; i<list.size(); i++){
			a +=list.get(i);
			
		}
		b = (double)a/list.size();
		System.out.println(a+"\n"+b);
		
		
		
		
		//최소값 . 최댓값을 구해주세요.
		int min =list.get(0);
		for(int i =0 ; i<list.size(); i++){
			if(min>list.get(i)){
				min=list.get(i);
		}
	}
		int max =list.get(0);
		for(int i =0 ; i<list.size(); i++){
			if(max<list.get(i)){
				max=list.get(i);
		}
	}
		System.out.println("최솟값 : "+min+ "최댓값 : "+ max);
		
		//list 를 오름차순으로 정렬해주세요.
		for(a =0; a<list.size()-1; a++){
			min =list.get(a);
			for(int c=a; c<list.size(); c++){
			if(min > list.get(c)){
				list.set(a,list.get(c));
				list.set(c,min);
				min= list.get(a);
				
			
			}
			}
		}
		System.out.println(list);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
