package D_array;

public class lottot2 {
	public static void main(String[] args) {
		int[]lo=new int[6];
		for (int i=0;i<lo.length;i++){
			lo[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++){
				if(lo[i]==lo[j]){
					lo[i]=(int)(Math.random()*45+1);
					j=-1;                   
				}
			}
			System.out.print(lo[i]+" ");
		}	
	}//main
}//class
