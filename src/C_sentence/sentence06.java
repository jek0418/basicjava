package C_sentence;

import java.util.Scanner;

public class sentence06 {
	public static void main(String[] args) {
		/*
		 1. do - while
		 	- while 문의 변형으로 기본구조는 while과 비슷하다.
		 	  최소 1회는 블럭{}을 수행한다.
		 	-구조
		 	  do{
		 	  	수행될 문장;
		 	  }while(조건식);
		 
//		 */
//		int i = 0;
//		int sum =0;
//		do{
//			i++;
//			sum+= i;
//		}while(sum<100);
	//1. 문자를 입력받는다.
	//2. 문자를 출력한다.
	//3. 문제에 "x"를 입력하면 종료한다.
//		Scanner sc = new Scanner(System.in);
//		String str = "";
//		do{
//			System.out.println("문자를 입력해주세요.");
//			str =sc.next();
//			System.out.println("사용자가 입력한 문자 :"+str);
//	
//		}while(!str.equals("x"));
//		System.out.println("x를 눌러 프로그램이 종료됩니다.");
	/*
	 2. continue
	   - 반복문 재에서만 사용 가능하다.
	   - 반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.	
	   - for 문은 증감식으로 이동
	   - while문은 조건식으로 이동
	 */
	  
//		for(int i=0;i<11;i++){
//			if(i%2==1){
//				System.out.println(i);
//			}
//		}
//		
//		for(int i=0;i<11;i++){
//			if(i%2==0){
//				continue;
//			}
//			System.out.println(i);
//		}
//		
		
		int aa=1;
		int sum=0;
		while(true){
			sum+=aa;
			if(sum>=100){
				break;
			}
				
			aa++;;
		}
	}
}
