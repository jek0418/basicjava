package Y.Chapter06;
//예제 6-4
public class TvTest4 {
	public static void main(String[] args) {
		//길이가 3인 Tv 객체 배열TvArr을 선언하고 초기화해주세요.
		Tv2[] tvArr= new Tv2[3];
		//Tv 객체를 생성해서 Tv 객체 배열의 각요소에 저장하고 모든방 객채의 channel에 객채의 방 번호+10을 저장해주세요.
		for(int i=0;i<tvArr.length;i++){
			tvArr[i] = new Tv2();
			tvArr[i].channel=i+10;
		}
		//배열의 모든 방 객채의 channelUp메서드를 호출해서 각 방의 채널을 1 증가시켜주세요.
		for(int i=0;i<tvArr.length;i++){
			tvArr[i].channelUp();
			//배열 각 방의 채널을 출력해주세요.
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
		
	
	}
}
//Tv클래스를 선언하세요.
class Tv2{
	//색상을 나타내는 String 형 인스턴스변수 color를 선언하세요.
	String color;
	//전원상태를 나타내는 boolean 인스턴스변수 power를 선언하세요.
	boolean power;
	//채널을 나타내는 정수형 인스턴스 변수 channel을 선언하세요.
	int channel;	
	//반환값과 매개변수가 없는 인스턴스 메서드 power를 선언하고 전원상태on/off 동작을 표현해주세요.
	void power(){
		power=!power;
	}
	//반환값과 매개변수가 없는 인스턴스 메서드 channelUp을 선언하고 호출시 channel 변수가 가지고 있는 값을 1 더해주세요.
	void channelUp(){
		++ channel;
	}
	//반환값과 매개변수가 없는 인스턴스 메서드 channelDown을 선언하고 호출시 channel 변수가 가지고 있는 값을 1 빼주세요.
		
	void channelDown(){
		--channel;
	}
}

	
