package practice;

public class practice2 {
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
			int tmp=answer[i];
			   counter[tmp-1]+=1;	
 		}
		for(int i=0; i < counter.length;i++) {
			int j=counter[i];
			System.out.print(j);
			for (int k=0;k<j;k++){
			System.out.print("*");
			}
			System.out.println();
		}
	} // end of main
} // end of class
