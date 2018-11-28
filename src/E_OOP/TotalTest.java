package E_OOP;

public class TotalTest {
	// TotalTest 클래스가 method area 로 로드되며 class 변수 및 메서드가 함께 로드된다. 여기서 클래스 변수는 없고 클래스 매서드는 main 메서드가 method Area 로 로드된다.
	public static void main(String[] args) {// TotlaTest의 클래스 메서드인 main 메서드가 호출되어 콜스텍으로 올라온다. 

		TvMaker.color = "Blue"; 
		//대입 연산자가 있으면 왼쪽부터 진행하게 되는데 왼쪽에서 TvMaker 클래스가 method area 로 로드되고 TvMaker 클레스의 클래스 변수와 클래스 메서드가 method Area 로
		//함께 로드된다. TvMaker 의 클래스 변수는 color, inch 이며 전자는 기본값인 null, 후자는 0으로 초기화된다.  클래스 메서드는 없다. 
		//'.' 으로 인해 TvMaker클래스의 color 변수에  오른쪽 "blue"라는 스트링 값이'=' 연산자에 의해 대입된다. 
		TvMaker tm = new TvMaker();// 대입연산지 이므로 왼쪽부터 진행하여  우선 method area에 TvMaker 클래스가 로드 되어있는지 확인한다. 이전 라인에 의하여 TvMaker
		//클래스가 method area에 로드되어있는 상태이므로 다음으로 넘어간다. 5 라인에 의하여 main 메서드는 콜스텍에 호출되어있는 상태인데 tm 이라는 main메서드의 지역변수를
		//선언한 후  new 라는 연산자에 의해 TvMaker 타입의 객체의 인스턴스화가 진행된다. 먼저  tm의 주소가 할당되고 인스턴스 변수와 인스턴스 메서드, 생성자가 heap 영역에 로드된다.
		//TvMaker 의 인스턴스 변수들은 name, age 가 있으며 초기값으로 0, null 로 먼저 초기화 된다. TvMaker 의 생성자는 TvMaker(), TvMaker(String name, int age) 가
		//있으며 먼저 기본 생성자인 TvMaker()가 호출되어 콜스텍으로 올라간다. TvMaker()에서 this("man", 25)를 호출하여 콜 스텍에 올라가게 되면 
		//매개변수 값으로 'man',25를 전달받게 되고 메소드 오버로딩에 의하여 TvMaker(String name, int age) 를 호출하게 된다. 
		//여기서 메소드 오버로딩이란 같은 이름의 메서드를 매개변수의 타입과 갯수로 구분하여 호출하는 것으로 반환값과는 관계가 없는것을 말한다.
		//TvMaker(String name, int age) 가 콜스텍으로 로드되었을때 매개변수로 'man', '25'를 전달받게 되고 
		//TvMaker(String name, int age) 생성자에서 this.name, this.age 은 인스턴스 변수를 가리키며 대입연산자 왼쪽에 있는 변수들은 전달받은 매개변수이다. 
		//따라서 매개변수값을 인스턴스 변수에 대입하게 되어 name 은man으로 age는 25로 초기화 되게 된다. 중괄호에 의하여 생성자가 종료되고 TvMaker(String name, int age)
		//생성자가 종료된 후 TvMaker() 도 종료된다. 대입연산자의 오른쪽 부분이 끝나고 마지막으로 tm 참조변수에 tm의 주소값이 대입된다.

		tm.age = 30; 
		// 인스턴스 객체인 tm의 age라는 변수에 30을 대입한다.
		// 
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);
		// TvControll클래스의 클래스 변수인 channel을 출력해주는 문장이다. 
		//여기서 TvControll클래스가 먼자 MethodArea에 로드되었는지 확인하고 이전에 로드된 적이 없으므로  MethodArea에 로드되며 
		//클래스변수, 클래스 메소드가 함께 로드된다.
		TvControll.volumeDown();// TvControll 클래스의 volumeDown()메서드를 호출한다 메서드 호출시는 콜스텍으로 올라간다. 전달되는 매개변수는 없다.
		System.out.println(TvControll.channel);

		// 3.2
		TvControll tc; // 
		tc = new TvControll(); //
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);
		tc.volumeUp();
		System.out.println(tc.volume);

		//
		Calc cc = new Calc();
		System.out.println(cc.add(Integer.MAX_VALUE, 4));//cc 클래스의 add메서드를 호출하며 매개변수로Integer.MAX_VALUE, 4 를 전달한 후 출력
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {//TvMaker클래스를 선언하고 메인메서드에서 TvMaker클래스의 클래스 변수와 클래스 매서드가 호출되면 Method Area 로 로드된다.  
	// 1.
	// 1.1
	static String color;
	static int inch;
	//변수명 앞에 static 으로 선언된 변수는 클래스 변수로 클래스가 Mothod Area영역에 로드될때 같이 로드된다. 
	// 1.2
	String name = "";
	int age;
	//변수명 앞에 static키워드 없이 선언된 변수는 인스턴스 변수로 인스턴스화 할때 heap영역으로 로드된다.
	// 2.
	// 2.1
	TvMaker() { //클래스의 기본 생성자로 명시해 주지 않으면 자바 컴파일 시 자동 생성되나 이 경우에는 명시해준 경우에 해당된다.
		this("man", 25);// this()는 이 인스턴스라는 뜻으로
	}

	// 2.2
	TvMaker(String name, int age) {//클래스의 생성자로 매개변수로 String name, int age을 전달받는다. 매개변수는 TvMaker의 지역변수이다.
		this.name = name;//
		this.age = age;
		//
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;// 상수
	static final int MIN_CHANNEL = 1;//상수

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {// volumeup 이리는 메서드를 선언하며 메서드 메서드 선언 앞에는 반환타입을 명시해준다. 여기서는 volume 의 타입이 int이므로 메소드명 앞에 int 라 명시햐였다.
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {//TvControll클래스의 클래스 메서드
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {//
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}