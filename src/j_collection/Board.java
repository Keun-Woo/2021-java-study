package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
	
		
		//ArrayList 와 HashMap을 사용해 게시판 테이블을 만들고,
		//조회 등록 수정 삭제가 가능한 게시판을 만들어 주세요.
		
		//번호(PK) , 제목 , 내용 , 작성자 , 작성일
		//------------------------------------
		//번호        제목         작성자         작성일
		//1     안녕하세요        홍길동         2/9
		//1     안녕하세요        홍길동         2/9
		//1     안녕하세요        홍길동         2/9
		//1     안녕하세요        홍길동         2/9
		//1     안녕하세요        홍길동         2/9
		//1     안녕하세요        홍길동         2/9
		//-------------------------------------
		//1.조회              2.등록               3.종료
		
		//조회 후 수정 , 삭제 가능
		ArrayList<HashMap<String,Object>> Board = new ArrayList<>();
		HashMap<String, Object> task = new HashMap<>();
		task.put("번호", "번호");
		task.put("시간", "시간");
		task.put("할일", "할일");
		task.put("작성자", "작성자");
		task.put("작성일", "작성일");
	
		Board.add(task);
		String input2 ="";
		int input = 0;
		int input3 = 0;
		String[] key ={"번호","작성자","할일","시간","작성일"};
		int count =1;
		while(true){
			System.out.println("1.조회\t2.등록\t3.종료");
			input = ScanUtil.nextInt();
			
			switch(input){	
		
			case 1:
				System.out.println("-----------------------------------------");
				for (int i = 0; i < Board.size(); i++) {
					for (int j = 0; j < key.length; j++) {
					System.out.print(Board.get(i).get(key[j])+"\t");
				}      
					System.out.println();
				}
				System.out.println("\n-----------------------------------------");
				System.out.println("1.삭제\t2.수정\t3.뒤로가기");
				input = ScanUtil.nextInt();
				switch(input){
				case 1:
					System.out.println("삭제할 번호를 입력하시오>");
					input = ScanUtil.nextInt();
					if(input<Board.size()){
					for (int i = 1; i < Board.size(); i++){
						if(input<(int)Board.get(i).get("번호")){
							Board.get(i).put("번호",(int)Board.get(i).get("번호")-1);
						
						}
					}
					
					Board.remove(input);
					count--;
					System.out.println("삭제 되었습니다.");
					}
					else{
						System.out.println("입력한 번호는 존재하지 않습니다.");
					}
					break;
				case 2:
					System.out.println("수정할 번호를 입력하시오>");
					input = ScanUtil.nextInt();
					System.out.println("1.작성자\t2.할일\t3.시간\t4.작성일\t5.뒤로가기");
					input3 = ScanUtil.nextInt();
					if(input3!=5){
					System.out.println("현재 : " + Board.get(input).get(key[input3+1])+".........수정하시오>");
					input2 = ScanUtil.nextLine();
					Board.get(input).put(key[input3+1], input2);
					break;
					}
					if(input3==5){
						break;
					}
					break;
				case 3:
					break;
				
					}
				break;
					
			case 2:
				
				HashMap<String, Object> task1 = new HashMap<>();
				task1.put("번호", count);
				count++;
				System.out.println("현재시간을 입력하시오>");
				input2 = ScanUtil.nextLine();
				task1.put("시간", input2);
				System.out.println("할일을 적으시오>");
				input2 = ScanUtil.nextLine();
				task1.put("할일", input2);
				System.out.println("작성자를 적으시오>");
				input2 = ScanUtil.nextLine();
				task1.put("작성자", input2);
				System.out.println("작성일을 적으시오>");
				input2 = ScanUtil.nextLine();
				task1.put("작성일", input2);
				Board.add(task1);
				break;
			case 3:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

//System.out.println("??" + task.get("번호"));


//for(HashMap<String,Object> u : Board){
//	for(String key : u.keySet()){
//		System.out.println(key + " : " + u.get(key));
//	}
//}


