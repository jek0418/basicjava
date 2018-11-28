package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
	/*
	 1. while문 
	 	- 반복횟수를 모를 때 사용한다.
	 	- 조건식과 수행해야될 블럭{}으로 구성되어 있다.
	 	- 구조
	 	  while(조건식){
	 	  }
	 	  
	 */
		
	//1. 3~33까지의 합계를 구하세요.
		int i=3;
		int sum=0;
		while(i<34){
			sum+=i;
			i++;
		}
		System.out.println("3~33까지 합계는"+sum+"입니다.");
		
	//2. 3~33까지의 합계 중 짝수의 합계를 구하세요.
		int j=3;
		int sum2=0;
		while(j<34){
			if(j%2==0){
				sum2+=j;
			}
			j++;
		}
		System.out.println("3~33까지의 수 중 짝수의 합계는"+sum2+"입니다.");
	//3. for 문으로 구구단을 출력해주세요.
//		for(int k=2;k<10;k++){
//			System.out.println(" ");
//			for(int l=1;l<10;l++){
//				{
//					System.out.println(k+"*"+l+"="+k*l);
//				}
//			}
//		}
	//4. 3번의 for문을 while문으로 변경해주세요. 
		 
//		int k=2;
//		while(k<10){
//			int l=1;
//			System.out.println(" ");
//			while(l<10){
//				System.out.println(k+"*"+l+"="+k*l);
//				l++;
//			}
//			k++;
//		}
		
	//5. 짝수단의 홀수 곱만 출력하세요.
		int k=2;
		while(k<10){
			int l= 1;
			System.out.println(" ");
				while(l<10){
					if(k%2==0&&l%2==1){
						System.out.println(k+"*"+l+"="+k*l);
						}
					l++;
				}
			
			k++;
		}
		
	//3.1~?더했을때 100이상이 되는가?
		int sum1=0;
		int i1=0; 
		while(sum1<100){			
			i1++;
			sum1+= i1;
			
		}
		
		System.out.println(i1);
	
	//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요. 시작하는 숫자부터 끝나는 숫자 중 5의 배수의 합계를 구하세요.
	//단, while문을 이용하세요. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자(정수)를 입력해주세요.(단 시작숫자가 끝나는 숫자보다 작아야함.)");
		int m = sc.nextInt();
		System.out.println("끝나는 숫자(정수)를 입력해주세요.");
		int n = sc.nextInt();
		int st=m;
		int sum3=0;
		while(m<n+1){
			if(m%5==0){
				sum3+=m;
			}
			m++;
		}
		System.out.println(st+"부터"+n+"까지의 숫자 중 5의 배수를 모두 더한 값은"+sum3+"입니다.");
		
		
	}
}
