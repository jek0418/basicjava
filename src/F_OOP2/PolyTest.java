package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. 스마트 Tv 3대 저정하세요.
		
		SmartTv[] t1 = new SmartTv[3];
		for(int i=0;i<t1.length;i++){
			t1[i]=new SmartTv();
		}
		
	
		//2. ThreeDTv 2대 저장하세요.
		ThreeDTv[] t2 = new ThreeDTv[2];
		for(int i=0;i<t2.length;i++){
			t2[i]=new ThreeDTv();
		}
		//3. AfreecaTv 4대 저장하세요.
		AfreecaTv[] t3 = new AfreecaTv[4];
		for(int i=0;i<t3.length;i++){
			t3[i]=new AfreecaTv();
		}
	
		Tv[] t = new Tv [9];
		t[0] = (Tv)new SmartTv();//(Tv)는 생략가능 up-casting
		t[1] = new SmartTv();
		t[2] = new ThreeDTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
		
		SmartTv st4=(SmartTv)t[2];//(SmartTv)는 생략불가 down-casting
		
		//*down-casting 주의점..
		//SmartTv tt = new Tv(); 불가능함.. Tv 가 아직 인스턴스화 하지 않았기 때문에 자손타입 인스턴스인tt 가 생성될 수 없다. tt는 TV 인스턴스를 상속받아 생성되기 때
		
	
	
	}
	

}
class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void internet(){
		
	}
}

class ThreeDTv extends Tv{
	void threeD(){
		
	}
}

class AfreecaTv extends Tv{
	void starBallon(){
		
	}
}


