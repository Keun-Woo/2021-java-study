package kakao;

class kakao {
    public int[] solution(int[] numbers) {
    int[] answer = {};
           
        int[] ans = new int[(numbers.length)*2];//더한 배열
		int count =0;
		for(int k=0; k<numbers.length-1; k++){
			for(int j=k+1; j<numbers.length; j++ ){
				
				ans[count]=numbers[k]+ numbers[j];//각배열의 값
				count++;
			}
		}
		
		
		
		int[] test= new int[count];// 새로운배열
		int plus = 0;
		for(int a = 0; a<ans.length; a++){
			boolean flag = true;
			for (int b= 0; b<test.length; b++){
				if(ans[a]==test[b]){
					
					flag = false;
				}
			}
			if(flag == true){
				test[plus]=ans[a];
				plus++;
			
			}
		}
		
		int count_1 =0;
		for(int c =0; c<test.length; c++){
			if(test[c]==0){
				count_1++;
			}
		}
		answer = new int[test.length-count_1];
		for(int d=0; d<answer.length;d++){
			answer[d]=test[d];
		}
		int i=0;
		int j=0;
		for(i=0;i<answer.length-1; i++){
			for(j=i+1; j<answer.length; j++){
				int min =answer[i];
				if(min>answer[j]){
					min=answer[j];
					answer[j]=answer[i];
					answer[i]=min;
              
				}
					
			}	
		}
           return answer;
    }
}