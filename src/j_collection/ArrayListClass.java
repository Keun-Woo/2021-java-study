package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {
	public static void main(String[] args) {
		//List, Map, Set
		
		/*
		 *boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다
		 *void add(int index, Object obj) : 지정된 위치에 객체를 추가한다
		 *Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다
		 *Object get(int index) : 지정된 위치의 객체를 반환한다
		 *int size() : 저장된 객체의 수를 반환한다
		 *boolean remove(int index) : 저장된 위치의 객체를 제거한다
		 */
		
		ArrayList sample = new ArrayList();
		sample.add("");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		//제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다
		//따라서 제네릭의 사용이 권장된다
		//지정된 타입의 값만 입/출력이 가능하다
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(20);
		System.out.println(list.add(30));
		System.out.println("1 : "+list);
		
		list.add(1,40);
		System.out.println(list);
		
		Integer before = list.set(2,50); //2번 인덱스에 값을 저장하고 기존 값을 반환
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.get(i));
//			list.remove(i);
//		}
//		System.out.println(list);
		//for문을 이용해 값을 제거하기 위해서는 뒤에서부터 제거해야 한다.
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		
		
		
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list2.add(list);
//		System.out.println("1536 : " +list);
//		System.out.println("1536 : " +list2);
		
		list =new ArrayList<>();
		list2.add(list);
		list.add(40);
		list.add(50);
//		System.out.println("1537 : " +list);
//		System.out.println("1537 : " +list2);

		list.add(60);
//		System.out.println("1538 : " +list2);
		
		//0번인덱스에 70을 추가하고싶다면...
		list2.get(0).add(70);
		
		
		for(int i =0; i < list2.size(); i++){
			ArrayList<Integer> li=list2.get(i);
			for(int j =0; j<li.size(); j++){
				System.out.print(li.get(j)+ "\t");
			}
			System.out.println();
		}
		
		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.get(i).size(); j++) {
				System.out.print(list2.get(i).get(j)+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println(list2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

