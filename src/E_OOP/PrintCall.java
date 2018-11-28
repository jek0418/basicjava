package E_OOP;

public class PrintCall {

	int a1 = 3;
	int b1 = 5;
	
	long a2 = 6L;
	long b2 = 8L;
	
	//1.메서드명 add
	//매개변수 int 한개
	//매개변수와 a1의 합계를 반환하는 메서드를 만드세요.
	
	int add(int num){
		int result = a1+num;
		return result;
	}
	//2. 메서드명 add
	//매개변수 long 하나
	//매개변수와 a2의 합을 반환하는 메서드
	long add(long num){
		long result =num+a2;  
		return result;
	}
	//3. 메서드명 add
	//매개변수 int 두개
	//매개변수 두개와 a1, b1의 합계를 반환하는 메서드
	
	int add(int num, int num2){
		int result = num+num2+a1+b1;
		return result;
	}
	//4. 메서드명 add
	//매개변수 int 하나 long하나
	//매개변수 두개의 합을 반환햐는 매서드
	long add(int num, long num2){
			long result =(long) num+num2;
			return result;
		}
	//5. 메서드명 add
	//매개변수 int 두개 
	//매개변수 두개와 b2의 합을 반환하는 메서드
//	long add(int a, int b){
//		long result = a+b+b2;
//		return result;
//	}

}
