package Y.Chapter06;
//6-3
	//Tv 클래스를 정의하고 Tv의속성(색상, 전원상태 on/off, 채널)을 인스턴스변수로 추가하세요.
	class Tv{
		String color;
		boolean power;
		int channel;
	//Tv 클래스 안에 Tv의 기능을 메서드로 추가하세요.
	//Tv를 켜거나 끄는 기능을 하는 메서드 매서
		void power(){
			power=!power;
		}
	//Tv의 채널을 높이는 기능을 하는 매서드
		void channelUp(){
			++channel;
		}
	//Tv의 채널을 낮추는 기능을 하는 매서드
		void channelDown(){
			--channel;
		}
	}

public class TvTest3 {
	public static void main(String[] args) {
		//Tv 클래스의 인스턴스 t1을 생성하고 인스턴스화 하세요.
		Tv t1= new Tv();
		//Tv 클래스의 인스턴스 t2를 생성하고 인스턴스화 하세요.
		Tv t2 = new Tv();
		//t1의 channel값을 출력하세요.
		System.out.println("T1의 channel:"+t1.channel);
		//t2의 channel값을 출력하세요.
		System.out.println("T2의 channel:"+t2.channel);	
		//t1이 저장하고 있는 값(주소)를 t2에 저장해주세요.
		t2=t1;
		//t1의 channel의 값을 7로 변경해주세요.
		t1.channel=7;
		//"t1의 channel 값을 7로 변경하였습니다."를 출력해주세요.
		System.out.println("t1의 channel 값을 7로 변경하였습니다");
		//t1의 channel값을 출력해주세요.
		System.out.println("T1의 channel:"+t1.channel);
		//t2의 channel값을 출력해주세요.
		System.out.println("T2의 channel:"+t2.channel);	
		
	}
}
