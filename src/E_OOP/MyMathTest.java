package E_OOP;

import java.util.Scanner;

public class MyMathTest {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
//		MyMath.add();
//		
		MyMath mm = new MyMath();
//		mm.add2(10);//인자값
//		
//		MyMath.add3(3, 3.14f);
//		
//		mm.add4(1, 2, 'A');
//		
//		int result=MyMath.add5(7);
//		System.out.println(result);
//		
//		int result2=mm.add6(15,5);
//		System.out.println(result2);
//		
//		long multiply = mm.multiply(300000000, 3000);
//		System.out.println(multiply);
//		
//		float divide = mm.divide(5, 3);
//		System.out.println(divide);

		for(;;){
			System.out.println("첫번째 정수를 입력하세요.");
			int i = sc.nextInt();
			System.out.println("사칙연산(+,-,*,/ 중 하나를 입력하세요. x를 입력하면 종료)");
			String j= sc.next();
			if(j.equals("x")||j.equals("X")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else{
				System.out.println("두번쨰 정수를 입력하세요."); 
				int k = sc.nextInt();
				switch(j) {
				case "+" : 
					mm.add7(i, k);
					break;
				case "-" :
					mm.add6(i, k);
					break;
				case "*" :
					mm.multiply(i, k);
					break;
				case "/" :
					mm.divide(i,k);
					break;	
				}
			}
		}
	}
}



class MyMath{
	
	static int number=50;
	
	static void add(){
		System.out.println(number*2);
	}
	void add2(int a){//매개변수
		System.out.println(number*a);
	}
	static void add3(int a, float c){
		
	}	
	void add4(int c, int d, char e){
		System.out.println(c+d+e);//
	}
	
	//클래스 메서드명은 add5
	//메개변수는 int 하나
	//수행내용 매개변수와 number의 합을 반환
	static int add5(int a){
		int result=number+a;
		return result;
	}
	int add7(int a, int b){
		int reult=a+b;
		System.out.println(a+"+"+b+"="+(a+b));
		return  reult;
	}
	
	//메서드명 add6
	//메게변수 int 두개
	//앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요.
	
	int add6(int a, int b){
		int result=a-b;
		System.out.println(a+"-"+b+"="+(a-b));
		return result;
	}
	
	//multiply
	//int 값 두개
	//두개의 수를 곱해서 반환해 주세요
	//단. overflow 고려해주세요.
	long multiply(int a, int b){
		long result=(long)a*b;
		System.out.println(a*b);
		return result;
	}
	
	//인스턴스 메서드 divide
	//int 값 두개
	//앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	//단, 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요.
	
	float divide(int a, int b){
		float result =(int)((float) a/b*100+0.5)/100f;
		System.out.println(a+"/"+b+"="+(float)(a/b));
		return result;
	 
	}
}