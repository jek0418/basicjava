package Y.Chapter06;
	//예제 6-19
	//클래스 MyMath2를 선언하고 long 타입의 인스턴스 변수 a,b를 선언하세요.
class MyMath2{
	long a;
	long b;

	//long 타입의 리턴값을 가지는 메서드add를 선언하고 리턴값으로 인스턴스 변수들의 합a+b를 반환하세요.
	long add(){
		return a+b;
	}
	//long 타입의 리턴값을 가지는 메서드subtract를 선언하고 리턴값으로 인스턴스 변수들의 차a-b를 반환하세요.
	long subtract(){
		return a-b;
	}
	//long 타입의 리턴값을 가지는 메서드multiply를 선언하고 리턴값으로 인스턴스 변수들의 곱 a*b를 반환하세요.
	long multiply(){
		return a*b;
	}
	//double 타입의 리턴값을 가지는 메서드divide를 선언하고 리턴값으로 인스턴스 변수 a를 b로 나눈값 a/b 를 반환하세요.
	double divide(){
		return a/b;
	}
	//long 타입의 리턴값을 가지고 매개변수로 long타입의 매개변수 2개를 가지는 클래스 메서드add를 선언하고 리턴값으로 매개변수들의 합a+b를 반환하세요.
	static long add(long a, long b){
		return a+b;
	}
	//long 타입의 리턴값을 가지고 매개변수로 long타입의 매개변수 2개를 가지는 클래스 메서드subtract를 선언하고 리턴값으로 매개변수들의 차a-b를 반환하세요.
	static long subtract(long a, long b){
		return a-b;
	}
	//long 타입의 리턴값을 가지고 매개변수로 long타입의 매개변수 2개를 가지는 클래스 메서드 multiply를 선언하고 리턴값으로 매개변수들의 곱a*b를 반환하세요.
	static long multiply (long a, long b){
		return a*b;
	}
	//double 타입의 리턴값을 가지고 매개변수로 double타입의 매개변수 2개를 가지는클래스 메서드divide를 선언하고 리턴값으로 인스턴스 변수 a를 b로 나눈값 a/b 를 반환하세요.
	static double divide(double a, double b){
		return a/b;
	}

}
public class MyMathTest2 {
	public static void main(String[] args) {
	//매개변수를 200L, 100L로 하여 MyMath2의 클래스 메서드 add를 호출하고 출력하세요.
		System.out.println(MyMath2.add(200L,100L));
	//매개변수를 200L, 100L로 하여 MyMath2의 클래스 메서드 subtract를 호출하고 출력하세요.
		System.out.println(MyMath2.subtract(200L,100L));
	//매개변수를 200L, 100L로 하여 MyMath2의 클래스 메서드 multiply를 호출하고 출력하세요.
		System.out.println(MyMath2.multiply(200L,100L));
	//매개변수를 200.0, 100.0로 하여 MyMath2의 클래스 메서드 divided를 호출하고 출력하세요.
		System.out.println(MyMath2.divide(200.0,100.0));
	//MyMath2클래스의 객체 mm 을 만들고 인스턴스화 해주세요.
		MyMath2 mm= new MyMath2();
	//mm의 변수 a에 200L을 저장해주세요.
		mm.a=200L;
	//mm의 변수 b에 100L을 저장해주세요.
		mm.b=100L;
	//mm의 인스턴스 메서드 add를 호출하고 결과를 출력해주세요.
		System.out.println(mm.add());
	//mm의 인스턴스 메서드  subtract를 호출하고 결과를 출력해주세요.
		System.out.println(mm.subtract());
	//mm의 인스턴스 메서드 multiply를 호출하고 결과를 출력해주세요.
		System.out.println(mm.multiply());
	//mm의 인스턴스 메서드 divided를 호출하고 결과를 출력해주세요.
		System.out.println(mm.divide());
		
		
	}

}
