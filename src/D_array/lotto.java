package D_array;

public class lotto {
	public static void main(String[] args) {
// <과제> 로또 추첨번호 뽑기.
		int[] lo= new int [45];
		for(int k=0;k<5;k++){
			System.out.print((k+1)+"번째 게임 : ");
			for(int i=0;i<lo.length;i++){
				lo[i]=i+1;
			}
		
			for(int i=0;i<10000;i++){
				int j=(int)(Math.random()*45);
				int tmp = lo[0];
				lo[0]= lo[j];
				lo[j]= tmp;
			}
			for(int i=0;i<6;i++){
				System.out.print(lo[i]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}	
	}		
}

