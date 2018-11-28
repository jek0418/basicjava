package Y.Chapter06;
//예제 6-14
//클래스 Data를 선언하고 정수형 인스턴스 변수 x 를 선언하세요.
class Data{
	int x;
}
public class ReferenceReturnEx {
	public static void main(String[] args) {
	//Data타입의 변수 d를 선언하고 인스턴스화 해주세요.
	Data d = new Data();
	//변수 d의  x에 10을 대입해주세요.
	d.x=10;
	//Data타입의 변수d2를 선언하고 인수값을 d 로 하여ReferenceReturnEx클래스의 메서드 copy를호출한 후 리턴값을 대입해주세요.
	Data d2=copy(d);
	//d.x값을 출력해주세요.
	System.out.println("d.x :"+d.x);
	//d2.x값을 출력해주세요.
	System.out.println("d2.x :"+d2.x);
		
	}
	
	//반환형이 Data이고 매개변수로 Data 타입의 변수 1개를 가지는  클래스 메서드 copy를 선언하세요.
	static Data copy(Data d){
		//Data 타입의 변수 tmp를 선언하고 인스턴스화 해 주세요.
		Data tmp = new Data();
		//tmp의x에 d의x값을 대입해주세요.
		tmp.x=d.x;
		//tmp를 반환해주세요.
		return tmp;
	}
	
}