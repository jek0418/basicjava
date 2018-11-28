package Y_exam;

public class Exam_03 {
	public static void main (String[] args){
/*	[3-1] 다음 연산의 결과를 적으시오.
	[연습문제]/ch3/Exercise3_1.java
	class Exercise3_1 {
	public static void main(String[] args) {
	int x = 2;
	int y = 5;
	char c = 'A'; // 'A'의 문자코드는 65
	System.out.println(1 + x << 33); //연산자 우선순위에 의하여 1+x는 3, <<33은 <<1과 같으므로 3<<1은 6이다.  
	System.out.println(y >= 5 || x < 0 && x > 2);//  x < 0는 false, x > 2는 false,  y >= 5는 false이다.
														(T||F&&F)이고 연산자 우선순위에 의해&&먼저 시행되고 연산결과는 T가 나온다.
	System.out.println(y += 10 - x++);//y는 15, 15-2 해서 출력되는 값은 13이고 x++연산에 의해서 x값은 3으로 1증가한다. 
	System.out.println(x+=2);//앞 행의 x의 현재 값은 3 이며 누적연산자 x+=에 의하여 출력된값은 5이다.
	System.out.println( !('A' <= c && c <='Z') );//'A' <= c && c <='Z'부분은 true이므로 ! 연산에 의해 false가 출력된다.
	System.out.println('C'-c);//67-65=2
	System.out.println('5'-'0');// 5
	System.out.println(c+1); //65+1 char 형에서 int 로 형변환66
	System.out.println(++c); //B 단항 연산자는 타입의 일치를 위한 산술 변환이 일어나지 않는다(P 92)
	System.out.println(c++); //B
	System.out.println(c); // 위 두라인에 연산 결과에 의하여 c에 67의 값이 저장되고 char 타입이므로 C 가 출력된다.
		}
	}
	 
	[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
	사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
	가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_2.java
	class Exercise3_2 {
	public static void main(String[] args) {
	int numOfApples = 123; // 사과의 개수
	int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수) 
	int numOfBucket = (  (1)  ); // 모든 사과를 담는데 필요한 바구니의 수
	System.out.println("필요한 바구니의 수 :"+numOfBucket);
		}
	}
	[실행결과]
	13
	
	(1)  numOfApples%sizeOfBucket==0?numOfApples/sizeOfBucket:numOfApples/sizeOfBucket+1
	 // numOfApples/sizeOfBucket +( numOfApples%sizeOfBucket ?0:1);
	
	[3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
	자를 이용해서 (1)에 알맞은 코드를 넣으시오.
	[Hint] 삼항 연산자를 두 번 사용하라.
	[연습문제]/ch3/Exercise3_3.java
	class Exercise3_3 {
	public static void main(String[] args) {
	int num = 10;
	System.out.println( (1)  ); 
		}
	}
	[실행결과]
	양수
	
	(1) num == 0? "0":( num>0? "양수":"음수")
	
	
	[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
	의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
	시오.
	[연습문제]/ch3/Exercise3_4.java
	class Exercise3_4 {
	public static void main(String[] args) {
	int num = 456;
	System.out.println( (1) ); 
			}
		}
	
	(1) num-num%100	
	
	[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
	값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_5.java
	class Exercise3_5 {
	public static void main(String[] args) {
	int num = 333;
	System.out.println( (1) );
		}
	}

	[실행결과]
	400
	[실행결과] 
	331
	
	(1)num-num%10+1 
	
	[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
	뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
	다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
	수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
	[Hint] 나머지 연산자를 사용하라.
	[연습문제]/ch3/Exercise3_6.java
	class Exercise3_6 {
	public static void main(String[] args) {
	int num = 24;
	System.out.println( (1) );
		}
	}
	
	(1) (num+(10-(num%10))-num -> 10-(num%10)
		(num/10*10)+10-num , (num/10+1)*10-num
		
		
	
	[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
	5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
	셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
	[연습문제]/ch3/Exercise3_7.java
	class Exercise3_7 {
	public static void main(String[] args) {
	int fahrenheit = 100;
	float celcius = ( (1) );
	System.out.println("Fahrenheit:"+fahrenheit);
	System.out.println("Celcius:"+celcius);
		}
	}
	[실행결과]
	6
	[실행결과]
	Fahrenheit:100
	Celcius:37.78
	
	(1) (float)((int)((float)5/9 * (fahrenheit - 32)*100 + 0.5))/100
	  (int)(5f/9*(fa-32)*100+0.5)))/100f
	
	[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
	[연습문제]/ch3/Exercise3_8.java
	class Exercise3_8 {
	public static void main(String[] args) {
	byte a = 10;
	byte b = 20;
	byte c = a + b; // byte -> int 로 변환 , 또는 (byte)(a+b)로 변환
	char ch = 'A';
	ch = ch + 2;	//(char)(ch + 2);
	float f = 3 / 2; //(float)3 / 2; 로 변환 
	long l = 3000 * 3000 * 3000; // (long)3000 * 3000 * 3000;//3000*3000*3000L;로 변환(int 표현범위 넘어섬)
	float f2 = 0.1f;
	double d = 0.1;
	boolean result = d==f2;  // double d =0.1f 나 (float)0.1 로 변경, result = !=f2로 변경, //System.out.println("result!="+result)로 변경
	System.out.println("c="+c);
	System.out.println("ch="+ch);
	System.out.println("f="+f);
	System.out.println("l="+l);
	System.out.println("result="+result);
		}
	}
	[실행결과]
	c=30
	ch=C
	f=1.5
	l=27000000000
	result=true
	
	[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
	의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_9.java
	class Exercise3_9 {
	public static void main(String[] args) {
	char ch = 'z';
	boolean b = ( (1)  );
	System.out.println(b);
		}
	}

	[실행결과]
	true
	
	(1) '0'<=ch&&ch<='9'||'a'<=ch&&ch<='z'||'A'<=ch&&ch<='Z'
	
	
	[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
	인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
	들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
	[연습문제]/ch3/Exercise3_10.java
	class Exercise3_10 {
	public static void main(String[] args) {
	char ch = 'A';
	char lowerCase = ( (1)  ) ? ( (2) ) : ch;
	System.out.println("ch :"+ch);
	System.out.println("ch to lowerCase:"+lowerCase);
		}
	}
	
	
	[실행결과]
	ch:A
	ch to lowerCase:a
	
	
	(1) 'A'<=ch&&ch<='Z'  (2) (char)(ch+32)
	 */
	}
}
