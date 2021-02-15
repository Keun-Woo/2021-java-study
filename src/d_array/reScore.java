package d_array;

public class reScore {

	public static void main(String[] args) {
	int[][] arr = new int[22][7];//22명의 학생의 7개의 과목점수
	System.out.print("학생이름\t수학\t영어\t과학\t사회\t국어\tJAVA\tOracle\t합계\t평균\t석차");
	String[] name = {"213","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123","123"};
	int[] sum = new int[arr.length];
	
	double[] avg = new double[arr.length];
	for(int i=0; i<arr.length; i++){
		for(int j=0; j<arr[i].length; j++){
		arr[i][j]=(int)(Math.random()*101);
		 sum[i]+=arr[i][j];
		
		}
		avg[i]=(double)(Math.round(sum[i]*100/arr[i].length))/100;	
	}
	// 등수매기기
		int[] rank = new int[22];
		for(int a=0; a<rank.length; a++){
			rank[a]=1;
			for(int b=0; b<rank.length; b++){
				if(sum[a]<sum[b]){
					rank[a]++;
				}
			}
		}
		
		int[] sum1 = new int[avg.length];
		double[] avg1 = new double[avg.length];
		for(int d=0; d<7; d++){
			for(int c=0; c<arr.length; c++){
		
		sum1[d] += arr[c][d];
			}
		avg1[d] =(double)(Math.round(sum1[d]*100/arr[d].length))/100;
		}
		
		
		
		
		
		
		for(int z=0; z<arr.length; z++){
		System.out.print("\n"+name[z]+"\t"+arr[z][0]+"\t"+arr[z][1]+"\t"+arr[z][2]+"\t"+arr[z][3]+"\t"+arr[z][4]+"\t"+arr[z][5]+"\t"+arr[z][6]+"\t"+sum[z]+"\t"+avg[z]+"\t"+rank[z]);
		}
		System.out.print("\n"+"총점수"+"\t"+sum1[0]+"\t"+sum1[1]+"\t"+sum1[2]+"\t"+sum1[3]+"\t"+sum1[4]+"\t"+sum1[5]+"\t"+sum1[6]);
		System.out.print("\n"+"총점수"+"\t"+avg1[0]+"\t"+avg1[1]+"\t"+avg1[2]+"\t"+avg1[3]+"\t"+avg1[4]+"\t"+avg1[5]+"\t"+avg1[6]);
		
		
		
		
	}

}
