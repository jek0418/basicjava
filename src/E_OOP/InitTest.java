package E_OOP;

public class InitTest {
	public static void main(String[] args) {
		
		System.out.println(Init.action);//0 =>55
										//명시적 초기화 => 클래스초기화 블럭
		Init it = new Init();//15=>20//명시적초기화=>인스턴스초기화블럭=> 생성자를 이용한 초기화
		System.out.println(it.action2);//20
		
	}
}

class Init{
	
	static int action;
	int action2 = 15;//명시적초기화
	int action3;//명시적 초기화
	Init(){
		action2 = 20;
	}
	
	static{// 메서드가아니므로 콜스텍에 올라가지 않는다. 
		//많은수식
		action=55;
		
	}
	{//초기화 블럭이 어러개 있으면 위에서부터 초기화됨.
		//많은수식
		action2 = 100;
	}
	{
		//많은 수식
		action3 = 150;
	}
}
