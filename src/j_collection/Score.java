package j_collection;

import java.util.ArrayList;
import java.util.Set;

public class Score {

	public static void main(String[] args) {



		String[] name = {"김민지","서주형","최윤성","변형균","김두환","현유진","김현슬","이광렬"
		 ,"박예진","강건우","명민호","박상영","이휘로","김현태","최영준","정영인","정유진",
		 "공슬기","김이현","전윤주","전재수","유은지"};
		
		ArrayList<String> Name = new ArrayList<>();
		for (int i = 0; i < name.length; i++) {
			Name.add(name[i]);
		}
//		System.out.println(Name);
		
		//학생이름
		ArrayList<ArrayList<Integer>> list= new ArrayList<>();//학생정보
		
		ArrayList<String> Subject = new ArrayList<>();//과목정보
		
		Subject.add("국어");
		Subject.add("영어");
		Subject.add("수학");
		Subject.add("사회");
		Subject.add("과학");
		Subject.add("오라클");
		Subject.add("java");
//		System.out.println(Subject);
		
		//과목점수
		ArrayList<Integer> list2 = new ArrayList<>();
		
		
		for (int i = 0; i < Name.size(); i++) {	
			list2 =new ArrayList<>();
			list.add(list2);
			for (int j = 0; j <Subject.size(); j++) {
				
				list2.add((int)(Math.random()*101));
			}	
			
		}
		System.out.println(list);
	
		//합계
		ArrayList<Double> sum = new ArrayList<>();
		    for (int i = 0; i < Name.size(); i++) {
			
			int score=0;
			for (int j = 0; j < Subject.size(); j++) {
				score +=list.get(i).get(j);
				
			}
			sum.add((double)score);
			
		}
		
//	System.out.println(list);
//	System.out.println(list.get(22));
	
		//평균double 이라 "따로"
		ArrayList<Double> avg = new ArrayList<>();
		for (int i = 0; i < Name.size(); i++) {
			avg.add((double)Math.round(sum.get(i)*100/Subject.size())/100);
		}
//		System.out.println(avg);
		
		
		//석차
		ArrayList<Integer> rank = new ArrayList<>();
		for (int i = 0; i < Name.size(); i++) {
		rank.add(1);
		}
		for (int i = 0; i < Name.size(); i++) {
			for (int j = 0; j < Name.size(); j++) {
				if(sum.get(i)<sum.get(j)){
					rank.set(i,rank.get(i)+1);
				}
			}
		}
		//석차에따른 오름차순
		ArrayList<ArrayList<Integer>> Arraytemp = new ArrayList<>();
		for (int a = 0; a < Name.size(); a++) {
			Arraytemp.add(list.get(a));
		}
		
		for(int a =0; a<Name.size()-1; a++){
			int temp =rank.get(a);
			double sumtemp	= sum.get(a);
			double avgtemp = avg.get(a);
		
			for(int c=a; c<list.size(); c++){
			if(temp > rank.get(c)){
				rank.set(a,rank.get(c));
				rank.set(c,temp);
				temp= rank.get(a);//랭크
				sum.set(a,sum.get(c));
				sum.set(c,sumtemp);
				sumtemp= sum.get(a);//합계
				avg.set(a,avg.get(c));
				avg.set(c,avgtemp);
				avgtemp= avg.get(a);//평균
				list.set(a,list.get(c));
				list.set(c,Arraytemp.get(a));
				Arraytemp.set(a,list.get(a));//점수
			}}
		}	
		//과목합계
		ArrayList<Double> Subsum = new ArrayList<>();
		for (int i = 0; i < Subject.size(); i++) {
			double sum1=0;
			for (int j = 0; j < Name.size(); j++) {
				sum1 += list.get(j).get(i);
		}
			Subsum.add(sum1);
		}
		
		//과목평균
		ArrayList<Double> Subavg = new ArrayList<>();
		for (int i = 0; i < Subsum.size(); i++) {
			Subavg.add((double)Math.round(Subsum.get(i)*100/Name.size())/100);
			
		}
		System.out.println("학생이름\t국어\t영어\t수학\t사회\t과학\t오라클\tJAVA\t합계\t평균\t석차");
		for (int i = 0; i < Name.size(); i++) {
			System.out.print(Name.get(i)+"\t");
			for (int j = 0; j < Subject.size(); j++) {
				System.out.print(list.get(i).get(j)+"\t");
			}
			System.out.print(sum.get(i)+"\t"+avg.get(i)+"\t"+rank.get(i)+"\n");
		}
		System.out.print("과목합계\t");
		for (int i = 0; i < Subject.size(); i++) {
			System.out.print(Subsum.get(i)+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for (int i = 0; i < Subject.size(); i++) {
			System.out.print(Subavg.get(i)+"\t");
	}
	
			}
	


}
			
