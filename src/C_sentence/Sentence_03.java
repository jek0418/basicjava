package C_sentence;

public class Sentence_03 {
	public static void main(String[] args) {
		
	int i=0;
	int j=0;
	
		System.out.println(2+ "*" +1+ "=" +2*1);
		System.out.println(2+ "*" +2+ "=" +2*2);
		System.out.println(2+ "*" +3+ "=" +2*3);
		System.out.println(2+ "*" +4+ "=" +2*4);
		System.out.println(2+ "*" +5+ "=" +2*5);
		System.out.println(2+ "*" +6+ "=" +2*6);
		System.out.println(2+ "*" +7+ "=" +2*7);
		System.out.println(2+ "*" +8+ "=" +2*8);
		System.out.println(2+ "*" +9+ "=" +2*9);
	
		System.out.println(3+ "*" +1+ "=" +3*1);
		System.out.println(3+ "*" +2+ "=" +3*2);
		System.out.println(3+ "*" +3+ "=" +3*3);
		System.out.println(3+ "*" +4+ "=" +3*4);
		System.out.println(3+ "*" +5+ "=" +3*5);
		System.out.println(3+ "*" +6+ "=" +3*6);
		System.out.println(3+ "*" +7+ "=" +3*7);
		System.out.println(3+ "*" +8+ "=" +3*8);
		System.out.println(3+ "*" +9+ "=" +3*9);
		
		System.out.println(4+ "*" +1+ "=" +4*1);
		System.out.println(4+ "*" +2+ "=" +4*2);
		System.out.println(4+ "*" +3+ "=" +4*3);
		System.out.println(4+ "*" +4+ "=" +4*4);
		System.out.println(4+ "*" +5+ "=" +4*5);
		System.out.println(4+ "*" +6+ "=" +4*6);
		System.out.println(4+ "*" +7+ "=" +4*7);
		System.out.println(4+ "*" +8+ "=" +4*8);
		System.out.println(4+ "*" +9+ "=" +4*9);
		
		System.out.println(5+ "*" +1+ "=" +5*1);
		System.out.println(5+ "*" +2+ "=" +5*2);
		System.out.println(5+ "*" +3+ "=" +5*3);
		System.out.println(5+ "*" +4+ "=" +5*4);
		System.out.println(5+ "*" +5+ "=" +5*5);
		System.out.println(5+ "*" +6+ "=" +5*6);
		System.out.println(5+ "*" +7+ "=" +5*7);
		System.out.println(5+ "*" +8+ "=" +5*8);
		System.out.println(5+ "*" +9+ "=" +5*9);
		
		System.out.println(6+ "*" +1+ "=" +6*1);
		System.out.println(6+ "*" +2+ "=" +6*2);
		System.out.println(6+ "*" +3+ "=" +6*3);
		System.out.println(6+ "*" +4+ "=" +6*4);
		System.out.println(6+ "*" +5+ "=" +6*5);
		System.out.println(6+ "*" +6+ "=" +6*6);
		System.out.println(6+ "*" +7+ "=" +6*7);
		System.out.println(6+ "*" +8+ "=" +6*8);
		System.out.println(6+ "*" +9+ "=" +6*9);
		
		System.out.println(7+ "*" +1+ "=" +7*1);
		System.out.println(7+ "*" +2+ "=" +7*2);
		System.out.println(7+ "*" +3+ "=" +7*3);
		System.out.println(7+ "*" +4+ "=" +7*4);
		System.out.println(7+ "*" +5+ "=" +7*5);
		System.out.println(7+ "*" +6+ "=" +7*6);
		System.out.println(7+ "*" +7+ "=" +7*7);
		System.out.println(7+ "*" +8+ "=" +7*8);
		System.out.println(7+ "*" +9+ "=" +7*9);
		
		System.out.println(8+ "*" +1+ "=" +8*1);
		System.out.println(8+ "*" +2+ "=" +8*2);
		System.out.println(8+ "*" +3+ "=" +8*3);
		System.out.println(8+ "*" +4+ "=" +8*4);
		System.out.println(8+ "*" +5+ "=" +8*5);
		System.out.println(8+ "*" +6+ "=" +8*6);
		System.out.println(8+ "*" +7+ "=" +8*7);
		System.out.println(8+ "*" +8+ "=" +8*8);
		System.out.println(8+ "*" +9+ "=" +8*9);
		
		System.out.println(9+ "*" +1+ "=" +9*1);
		System.out.println(9+ "*" +2+ "=" +9*2);
		System.out.println(9+ "*" +3+ "=" +9*3);
		System.out.println(9+ "*" +4+ "=" +9*4);
		System.out.println(9+ "*" +5+ "=" +9*5);
		System.out.println(9+ "*" +6+ "=" +9*6);
		System.out.println(9+ "*" +7+ "=" +9*7);
		System.out.println(9+ "*" +8+ "=" +9*8);
		System.out.println(9+ "*" +9+ "=" +9*9);
		
		for(i=1;i<=9;i++){
			System.out.println(2+"*"+i+"="+ 2*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(3+"*"+i+"="+ 3*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(4+"*"+i+"="+ 4*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(5+"*"+i+"="+ 5*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(6+"*"+i+"="+ 6*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(7+"*"+i+"="+ 7*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(8+"*"+i+"="+ 8*i);
		}
		for(i=1;i<=9;i++){
			System.out.println(9+"*"+i+"="+ 9*i);
		}
		
		for(i=2;i<10;i++){
			System.out.println("  ");
			if(i%2==0){
				for(j=1;j<10;j++){
					if(j%2==1){
						System.out.println(i+"*"+j+"=" +i*j);
					}				
				}
			}	
		}
//<과제>
//1. 숫자를 입력받는다.
//2. 사칙연산을 입력받는다.
//3. 숫자를 입력받는다.
//4. 결과를 출력한다.
//5. 단 2번에서 x를 입력시 종료하세요.if(abc.equals("*")) 사용		
		
		
	}
}
