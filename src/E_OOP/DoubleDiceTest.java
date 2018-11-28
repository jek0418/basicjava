package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		DoubleDice dice = new DoubleDice();
		int k = dice.throwDice();//throwDice메서드를 호출
		System.out.println("총"+k+"칸 움직입니다.");//출력문
		
	}

}

class DoubleDice{//인스턴스 메서드 throwDice
	int throwDice(){
		int d1 = (int)(Math.random()*6+1);
		System.out.println("첫번째 주사위:"+d1);
		int d2 = (int)(Math.random()*6+1);
		System.out.println("두번째 주사위 :"+d2);
		int result=d1+d2;
		if(d1==d2){
			result+=throwDice();
		}
		
		return result;
		
		
	}
}