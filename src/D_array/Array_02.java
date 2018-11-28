package D_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {
	/* 
	 1. 정렬
	  - 어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터들을 가지런히 나열하는 작업
	  - 버블정렬, 삽입정렬, 선택정렬
	  
	  2. 버블정렬(bubble sort
	  - 인접한 데이터간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
	  - 한 회전이 진행됨에 따라 가장 큰 값이 뒤로 보내진다.
	 */
	//	1. 5,2,3,1,4 숫자 5개를 저장 할 수 있는 변수를 선언 및 생성하세요.
//		int[] bubble={5,2,3,1,4}; 
	//  2. 1회전만 진행하세요.
	
//		for(int j=0;j<bubble.length-1;j++){
//			System.out.println("<"+(j+1)+"회전"+">");
//			for(int i=0;i<bubble.length-1;i++){
//				int tmp=0;
//				if(bubble[i]>bubble[i+1]){
//					tmp=bubble[i];
//					bubble[i]=bubble[i+1];
//					bubble[i+1]=tmp;
//				}
//			for(int k=0;k<bubble.length;k++){
//				System.out.print(bubble[k]+" ");
//				
//				}
//				System.out.println(" ");
//			}
//			
//			for(int i=0;i<bubble.length;i++){
//				System.out.print(bubble[i]+" ");
//			}
//			System.out.println(" ");
//		}
		
//		int[]a = new int[]{5,2,3,1,4};
//		for(int k=0;k<a.length-1;k++){
//			System.out.println(k+1+"회전");
//			for(int i=0;i<a.legth-1-k;i++){
//				if(a[i]>a[i+1]){
//					int tmp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=tmp;
//				}
//				for(int j=0;j<a.length;j++){
//					System.out.println(a[j]+" ");
//				}
//				System.out.println();
//			}
//		}
		 
		/* 3. 선택정렬(Select sort)
		  	- 정렬의 대상에서 최솟값을 찾아서 맨앞의 내용과 교체하는 방식이다.
		  	- 회전이 진행됨에 따라 가장 작은값이 앞에 획정된다.
		 */
//		int[]a=new int[]{5,2,3,1,4};
//		for(int i=0;i<a.length;i++){
//			int tmp=0;
//			int min=0;
//			for(int j=0;j<a.length-i;j++){
//				if(a[0]>a[j]){
//					
//					min=j;
//				}
//				tmp=a[i];
//				a[i]=a[j];
//				a[j]=tmp;
//						
//				
//			}
//			
//			System.out.print(a[i]+" ");
//		}
		
		int[] arr={5,2,3,1,4};
		for(int k=0;k<arr.length-1;k++){
			System.out.print((k+1)+"회전 : ");
			int min= arr[k];
			int minBang =k;
			for(int i =k+1; i<arr.length;i++){
				if(min>arr[i]){
					min = arr[i];
					minBang =i;	
				}
			}
			int temp =arr[k];
			arr[k]=arr[minBang];
			arr[minBang] = temp;
			System.out.println(Arrays.toString(arr));
			
		}
	}
}



