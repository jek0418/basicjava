package E_OOP;

public class Membercall {
	int iv = 10;
	static int cv=100;
	
	int iv2 = iv;
	int iv3 = cv;
	
	static int cv2 = cv;
//	static int cv3 = iv; - cv3 생성 시점에 인스턴스화가 진행되지 않아 안됨.
	
	static void method(){
		cv = 500;
//		iv=500;
	}
	
	void method2(){
		cv=1000;
		iv=1000;
		
	}
	
	static void method3(){
		method();
//		method2();// 인스턴스 메서드가 로드되어 있지 않은 시점이라  호출 안됨.
	}
	
	void method4(){
		method();
		method2();
	}
	
}
