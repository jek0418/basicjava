package Y.Chapter06;
//예제 6-6
public class MyMathTest {
	public static void main(String[] args) {
		//MyMath 클래스의 인스턴스mm 을 선언하고 인스턴스화 하세요.
		MyMath mm= new MyMath();
		//인스턴스mm의 메서드 add 를 호출하고 매개변수를 5L, 3L로 하여 호출하고 결과를 변수result1에 저장하세요.(1)
		long result1=mm.add(5L, 3L);
		//인스턴스mm의 메서드 subtract  를 호출하고 매개변수를 5L, 3L로 하여 호출하고 결과를 변수result2에 저장하세요.(2)
		long result2=mm.subtract(5L,3L);
		//인스턴스mm의 메서드 multiply  를 호출하고 매개변수를 5L, 3L로 하여 호출하고 결과를 변수result3에 저장하세요.(3)		
		long result3=mm.multiply(5L, 3L);		
		//인스턴스mm의 메서드 divide를 호출하고 매개변수를 5L, 3L로 하여 호출하고 결과를 변수result4에 저장하세요.(4)		
		double result4=mm.divide(5L, 3L);		
		//(1)의 결과를 출력하세요. (result1를 출력)
		System.out.println("mm.add(5L, 3L) : "+result1);
		//(2)의 결과를 출력하세요. (result2 를 출력)
		System.out.println("mm.subtract(5L,3L) :"+result2);		
		//(3)의 결과를 출력하세요. (result3 를 출력)
		System.out.println("mm.multiply(5L, 3L) : "+result3);
		//(4)의 결과를 출력하세요. (result4 를 출력)	
		System.out.println("mm.divide(5L, 3L) :"+result4);		
	}
	
}

//클래스 MyMath를 선언해주세요.
class MyMath{
//클래스 안에 long 타입 두정수를 매개변수로 하고  결과값으로 두 매개변수를 더하여 long 타입으로 반환하는 메서드를 정의하세요. (메서드명 add)
	long add(long num1, long num2){
		return num1+num2;
	}
//클래스 안에 long 타입 두정수를 매개변수로 하고  결과값으로 첫번째 매개변수에서 두번째 매개변수를 빼서 long 타입으로 반환하는 메서드를 정의하세요. (메서드명 subtract)
	long subtract(long num1, long num2){
		return num1-num2;
	}
//클래스 안에 long 타입 두정수를 매개변수로 하고  결과값으로 두 매개변수를 곱하여 long 타입으로 반환하는 메서드를 정의하세요. (메서드명 multiply)
	long multiply(long num1, long num2){
		return num1*num2;
	}
//클래스안에 double 타입 두실수를 매개변수로 하고  결과값으로 첫번째 매개변수를 두번째 매개변수로 나누어 double 타입으로 반환하는 메서드를 정의하세요. (메서드명 divide)
	double divide(double num1,double num2){
		return num1/num2;
	}
}	
