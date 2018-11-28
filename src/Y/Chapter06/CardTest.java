package Y.Chapter06;
//예제 6-5
public class CardTest {
	public static void main(String[] args) {
		//Card 클래스의 클래스변수를 이용해서 카드의 너비를 출력해주세요.
		System.out.println("카드의 너비:"+Card.width);
		//Card 클래스의 클래스변수를 이용해서 카드의 높이를 출력해주세요.
		System.out.println("카드의 높이:"+Card.height);
		//Card 클래스의 인스턴스 c1을 생성하고 인스턴스화 해주세요.
		Card c1= new Card();
		//c1의 카드 종류를 "Heart"로 변경해주세요.
		c1.kind="heart";
		//c1의 카드 숫자를 7로 변경해주세요.
		c1.number=7;
		//Card 클래스의 인스턴스 c2을 생성하고 인스턴스화 해주세요.
		Card c2= new Card();
		//c2의 카드 종류를 "Spade"로 변경해주세요.
		c2.kind="Spade";		
		//c2의 카드 숫자를 4로 변경해주세요.
		c2.number=4;
		//c1의 종류와 숫자를 카드의 크기를출력해주세요.
		System.out.println("c1의 종류: "+c1.kind+"c1의 숫자:"+c1.number+" c1의 크기("+c1.width+","+c1.height+")");
		//c2의 종류와 숫자를 카드의 크기를출력해주세요.
		System.out.println("c2의 종류: "+c2.kind+"c2의 숫자:"+c2.number+" c2의 크기("+c2.width+","+c2.height+")");
		//"c1의 width와 height를 각각 50,80으로 변경합니다." 를 출력해주세요.
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		//c1의 width값을 50, height 값을 80으로 변경해주세요.
		c1.width=50; 
		c1.height=80;
		//c1의 종류와 숫자를 출력해주세요.
		System.out.println("c1의 종류: "+c1.kind+" c1의 숫자: "+c1.number+" c1의 크기("+c1.width+","+c1.height+")");
		//c2의 종류와 숫자를 출력해주세요.
		System.out.println("c2의 종류: "+c2.kind+" c2의 숫자: "+c2.number+" c2의 크기("+c2.width+","+c2.height+")");
		
	}

}
//Card 클래스를 정의하고 카드의 종류(kind)와 카드의 숫자(number) 를 인스턴스 변수로 추가해주세요.
class Card{
	String kind;
	int number;
	//card 클래스 안에 카드의 너비(width)와 높이(height)를 나타내는 변수를 정수형 클래스 변수로 추가하고 너비를 100 높이를 250으로 대입해주세요.
	static int width=100;
	static int height=250;
}


