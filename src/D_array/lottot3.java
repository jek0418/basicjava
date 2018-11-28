package D_array;

public class lottot3 {
	public static void main(String[] args){
		int[] lo = new int [45];
		for(int k=0;k<5;k++){
			System.out.print((k+1)+"번쨰  :"); 
  			for(int i=0;i<lo.length;i++){
   					lo[i]=i+1;
			}
			for(int j=0;j<6;j++){
				int tmp =(int)(Math.random()*45+1);
					while(true){
						if(lo[tmp-1]==0){
							tmp=(int)(Math.random()*45+1);
						}else{
							lo[tmp-1]=0;
							break;
						}
					}
					System.out.print(tmp+ " ");
				}
			System.out.println(" ");
		}
	}
}


