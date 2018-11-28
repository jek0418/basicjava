package F_OOP2;

public class InnerEx01 {
	
	//인스턴스 클래스
	class InstanceInner{
		int iv = 100;
//		static int cv =iv;
		final static int CONST = 200;// 상수는 사용가능
	}
	
	static class StaticClass{
		static int cv = 500;
		int iv = 200;
	}
	
	void method(){
		//지역클래스
		class LocalClass{
			int iv = 200;
//			static int cv = 500; //사용불가
		}
	}
	
}


