package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	
		try{
			int result =10/0;
			System.out.println(result);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(NullPointerException | IndexOutOfBoundsException e){
			//NullPointerException
			String str=null;
			System.out.println(str.equals(""));
			//>>그 줄의 변수에 null 이 있구나 하고 생각하면됨.
			//IndexOutOfBoundsException
			int[] arr =new int [10];
			System.out.println(arr[10]);
			
		}catch(Exception e){
			
		}
			
		
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		
				
		test1();
	}
		
		
		private static void test1(){
			test2();
		}
		
		
		private static void test2(){
//			System.out.println(10/0);
		
		
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		}
	
	}
