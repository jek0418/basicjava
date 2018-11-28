package F_OOP2;

import java.util.Arrays;
import java.util.Scanner;

public class DeckTest {
	public static void main(String[] args) {
		//Deck 객체를 만들어주세요

		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		
		//4,5,6,7번에서 만들어진 메서드를 호출해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("0~51 사이의 숫자를 입력해주세요.입력받은 방의 카드 반환하기 (4번 메서드)");
		int num=sc.nextInt();
		System.out.println(num+"번 방의 카드:"+d.pick(num));
		System.out.println();
		
		System.out.println("렌덤한 방의 카드 한장을 반환하는 메서드 호출(5번 메서드)");
		System.out.println(d.pick());
		System.out.println();
		
		System.out.println("카드를 섞습니다.(6번 메서드)");
		d.shuffle();
		System.out.println("d.shuffle() 메서드 호출후의 "+num+"번 방의 카드:"+d.pick(num));
		System.out.println();
		
	
		System.out.println("섞을횟수만큼 숫자를 입력해주세요.(7번 메서드)");
		int num2=sc.nextInt();
		d.shuffle(num2);
		System.out.println("d.shuffle(int num) 메서드 호출("+num2+"번 shuffle) 후의 "+num+"번 방의 카드:"+d.pick(num));
		
		//JVM 그리기
		
	}

}

class Card{
	static final int KIND_MAX=4;//카드 무늬수
	static final int NUM_MAX=13;//무늬별 카드수
	
    static final int SPADE=1;
	static final int DIAMOND=2;
	static final int HEART=3;
	static final int CLOVER=4;
	
	int kind;
	int number;
	
	//1. 매개변수가 두개인 생성자를 만들어 주세요.
	Card(int kind,int number){
		this.kind=kind;
		this.number=number;
	}
	//2. 기본생성자를 만들어주세요.
	//단 매개변수가 두개인 생성자를 이용하여 1,1로 만들어주세요.
	Card(){
		this(SPADE,1);
	}
	
	@Override
	public String toString(){
		String kind="";
		String number="";
		
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;

		default:
			kind="CLOVER";
			break;
		}
		
		switch (this.number) {
		case 1:
			number = "A";
			break;
			
		case 11:
			number = "J";
			break;
			
		case 12:
			number = "Q";
			break;
			
		case 13:
			number = "k";
			break;

		default:
			number+=this.number;
			break;
		}
		
		
		return kind+","+number;
	}
	
}

class Deck{
	//1. 카드의 수량을 저장할 수 있는 변수 CARD_NUM 선언 및 초기화해주세요
	// 단, 초기화시 Card클래스의 상수를 이용해주세요.
	final int CARD_NUM =  Card.KIND_MAX*Card.NUM_MAX;
	
	//2.카드 52장을 저장할 수 있는 변수 c를 선언 및 생성해 주세요
	// 단, CARD_NUM을 이용해주세요.
	Card c[] = new Card[CARD_NUM]; 
	
	//3. 기본생성자를 만들어주세요.
	// c의 각방을 카드로 채워주세요.
	Deck(){
		for (int i=0;i<Card.KIND_MAX;i++){
			for(int j=0;j<Card.NUM_MAX;j++){
				
			c[Card.NUM_MAX*i+j]= new Card(i+1,j+1);	
			
			}
		}
	}
	
	//4. 입력받은 방번호의 카드를 반환하는 메서드를 만드세요. (메서드명 pick)
	Card pick(int num){
		return c[num];
	}
	//5. 랜덤한 방의 카드 한장을 반환하는 메서드를 만들어주세요.(메서드명 pick)
	//단 4번에서 만든pick 메서드를 이용하세요.
	Card pick(){
		int num=(int)(Math.random()*52);
		return pick(num);
	}
	//6. 카드를 섞어주세요.
	//단, 연습문제 5-5의 형태로 섞어주세요.(메서드명 shuffle)
	void shuffle(){
		for(int i=0;i<c.length;i++){
			int j = (int)(Math.random() * c.length);
			Card tmp;
			tmp=c[i];
			c[j]=c[i];
			c[i]=tmp;
		}
	}

		 
	//7. 카드를 섞어주세요. (메서드명 shuffle)
	//단, 랜덤방 두개를 교환하는 방식으로 사용자로부터 입력받은 수만큼 반복해주세요.

	void shuffle(int num){
			for(int i=0;i<num+1;i++){
				int j = (int)(Math.random() * c.length);
				int k = (int)(Math.random() * c.length);
				Card tmp;
				tmp=c[j];
				c[j]=c[k];
				c[k]=tmp;
		}
	}
	
}
