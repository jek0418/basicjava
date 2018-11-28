package E_OOP;

public class Cartest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("red","auto",2);
		Car c3 = new Car("yellow","auto");
		
	}
	
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";
		gearType = "stick";
		door = 4;
	}
	
	Car(String color, String gearType){
		this();//생성자의 가장 윗부분에 쓸 수 있다.
		this.color = color;
		this.gearType = gearType;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;//this. 은 이 인스턴스의 라는 뜻..(인스턴스변수)
		this.gearType = gearType;
		this.door = door;
	}
	
	
}
