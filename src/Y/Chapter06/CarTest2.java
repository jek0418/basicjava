package Y.Chapter06;
//예제 6-25
	//클래스 Car를 선언해주세요.
class Car{
	//자동차의 색상을 나타낼 String 타입 인스턴스 변수 color 을 선언해주세요.
	String color;
	//변속기의 종류를 나타낼 String 타입  인스턴스 변수 gearType을 선언해주세요.
	String gearType;
	//문의 개수를 저장할 정수형 인스턴스 변수 door를 선언해주세요.
	int door;	
	//기본생성자를 선언하고 그 안에 매개변수로 white, auto, 4 를 전달하는 이 클래스의 다른 생성자를 호출하세요.
	Car(){
		this("White","auto",4);
	}
	//매개변수로 color를 전달하는 생성자를 선언하고 그 안에 전달받는 매개변수를 이용하여  매개변수를 3개로 하는 이 클래스의 다른 생성자를 호출하세요.(다른 매개변수로 auto, 4를 전달)
	Car(String color){
		this(color,"auto",4);
	}
	//매개변수로 color와 gearType, door갯수를 나타내는 변수를 전달받는 생성자를 선언하세요.
	//생성자 안에서 이 클래스의 인스턴스 변수 color, gearType,door 를 전달받은 매개변수로 초기화하세요.
	Car(String color,String gearType, int door){
		this.color= color;
		this.gearType=gearType;
		this.door = door;
	}
}
	

public class CarTest2 {
	public static void main(String[] args) {
		//Car클래스의 인스턴스 c1을 선언하고 기본생성자를 이용하여 인스턴스화 해 주세요.
		Car c1 = new Car();
		//Car클래스의 인스턴스 c2를 선언하고 매개변수 값이 하나인 생성자를 이용하여 인스턴스화 해 주세요. 매개변수 값으로는 blue를 전달해주세요.
		Car c2 = new Car("blue");
		//c1의 color와 gearType, door 개수를 출력해주세요.
		System.out.println("c1의 color:"+c1.color+" gearType : "+c1.gearType+" door"+c1.door);
		//c2의  color와 gearType, door 개수를 출력해주세요.
		System.out.println("c2의 color:"+c2.color+" gearType : "+c2.gearType+" door"+c2.door);	
			
	}
	
}
