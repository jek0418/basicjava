package D_array;

public class Array_04 {
	public static void main(String[] args) {
		
		//1. 6명의 7과목을 저장할수 있는 변수 score를 선언 및 생성해주세요.
		String[] name=new String[]{"김재은","이진경","김미란","류대웅","정다혜","박연욱"};
		String[] sub =new String[]{"국어","수학","영어","사회","과학", "체육","음악"};
		int score[][]=new int[name.length][sub.length];
		//2. score의 각 방을 0~100점 사이의 랜덤한 정수값을 저장해주세요.
		
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				score[i][j]=(int)(Math.random()*101);
			}
		}
		
		int[] sum = new int[name.length];
		for(int i=0;i<name.length;i++){
			for(int j=0;j<sub.length;j++){
				sum[i]+=score[i][j];
			}
		}
		float [] average= new float[name.length];
		for(int i=0;i<name.length;i++){
			average[i]=(int)((float) sum[i]/sub.length*100)/100f;
		}
		
		int[] subsum = new int[sub.length];  
		for(int i=0;i<sub.length;i++){
			for(int j=0;j<name.length;j++){
				subsum[i]+=score[j][i];
			}
		}
		float[] subaver = new float[sub.length]; 
		for(int i=0;i<sub.length;i++){
			subaver[i]=(int)((float)subsum[i]/name.length*100)/100f;
		}
		
		int[] rank = new int[name.length];
		for(int i=0;i<name.length;i++){
			rank[i]++;
			for(int j=0;j<name.length;j++){
				if(sum[i]<sum[j]){
					rank[i]++;
				}
				
			}
		}
		
		
		//3. 아래와 같이 줄력해주세요.
	
		for(int i=0;i<sub.length;i++){
			System.out.print("\t"+sub[i]);
		}
		System.out.print("\t"+"합계");
		System.out.print("\t"+"평균");
		System.out.println("\t"+"석차");
		for(int i=0;i<score.length;i++){
			System.out.print(name[i]+" : ");
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.print(average[i]+"\t");
			System.out.println(rank[i]);
			
		}
		System.out.print("합계  : ");
		for(int i=0;i<subsum.length;i++ ){
			System.out.print(subsum[i]+"\t");
		}
		System.out.println("");
		System.out.print("평균 : ");
		for(int i=0;i<subaver.length;i++){
			System.out.print(subaver[i]+"\t");
		}
		
		System.out.println();
		System.out.println("=============================================================================================");
		
		
		
		
		
		
		
		
		for(int i=0;i<sub.length;i++){
			System.out.print("\t"+sub[i]);
		}
		System.out.print("\t"+"합계");
		System.out.print("\t"+"평균");
		System.out.println("\t"+"석차");
		for(int i=0;i<score.length;i++){
			System.out.print(name[i]+" : ");
			for(int j=0;j<score[i].length;j++){
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.print(average[i]+"\t");
			System.out.println(rank[i]);
			
		}
		System.out.print("합계  : ");
		for(int i=0;i<subsum.length;i++ ){
			System.out.print(subsum[i]+"\t");
		}
		System.out.println("");
		System.out.print("평균 : ");
		for(int i=0;i<subaver.length;i++){
			System.out.print(subaver[i]+"\t");
		}
		
		
	}
}
