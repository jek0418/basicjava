package A_varibleBasic;

public class VariableType {
		/* 
		 변수의 타입
		 
		 1. 기본형 타입(primitive type)
		 - boolean, char, byte, short, int, long, float, double
		 2. 참조형 타입(reference type)
		 - 주소를 저장한다.(4byte)
		 3. 종류
		 - 논리형 : true와 false 만을 값으로 갖는다. 조건식과 논리적 계산에 많이 사용한다. ex)boolean
		 - 문자형 : 문자를 하나 저장하는데 사용된다. ex) char 
		 - 정수형 : 정수값을 저장하는데 사용한다. ex) byte, short, int, long
		 - 실수형 : 실수값을 저장하는데 사용한다. ex)float, double
		 4. 크기 (1byte = 8bit)
		 	- 1byte : boolean, byte, 
		 	- 2byte : char, short
		 	- 4byte : int, float
		 	- 8byte : long, double
		5. 논리형 - boolean(기본값 false)
		  - boolean형 변수는 true fales중 하나의 값을 저장 할 수 있다.
		  - 대답(yes,No), 스위치(on/off)등의 논리구현에 주로 사용한다.
		  - 1byte의 크기를 가진다.
		  */
	//	변수의 선언
	// [변수의 타입][변수명];
	//true의 값을 저장 할 수 있는 변수 power를 선언 및 초기화 해주세요.
	public static void main(String[] args){
		boolean power = true;
		boolean of=false;
		/* 문자형 - char('\u0000')
		  - 문자 하나를 저장하는 용도로 사용된다.
		  - java는 Unicode 문자 체계를 이용한다.
		  - 2byte의 크기를 가진다.
		  */
		// code라는 변수에 'A'를 저장해주세요.
		
		char code = 'A';
		char code2 = '\u0041';
		char code3 = 65;
		
		System.out.println(code);
		System.out.println(code2);
		System.out.println(code3);
		
		/*
		 7. 정수형 - byte, short, int, long
		 	- 기본자료형은 int 형이다.
		 	- 변수에 저장하고자 하는 정수값의 범위에 따라 4개중 하나를 선택해야 한다.
		 */
		//byte 타입의 변수 b1에 100의 값을 저장해주세요.
		
		byte b1 = 100;
		//9508312111111
		
		long a1 = 950812111111L;
		/*
		 8. 실수형 - float, double
		 - 실수형 값을 지정하는데 사용된다.
		 - float : 1+8+23
		 - double : 1+11+52
		 */
		//3.14159254863
		double d1 = 3.14159254863;
		float f1 = 3.14159254863f;

		System.out.println(d1);
		System.out.println(f1);
		
		double d2 = 0.5;
		float f2 = 0.5f;
		
		System.out.println(0.1 == 0.1f);
		/*
		 9. 문자열 - String (참조형.. 기본형 처럼 사용)
		 
		 */
		String str = "";//(공백 가능, 주소 있음)
		String str2 = null;//(주소 없음)
		//String str3 = "\\sldkfjlskldjlfslkdjfslkdj"//길이 무제한 역슬러시 쓸때는 두개씩 씀..
			
		String str4 = "=========\t----------"; //(\t는 tab 키 역할)
		System.out.println(str4);
	/*
	 	10. overflow
	 */
		byte b2 = 126;
		System.out.println(b2);//126
		b2++;
		System.out.println(b2);//127
		b2++;
		System.out.println(b2);//-128
		b2++;
		System.out.println(b2);//-127
		b2++;
		
		/*
		 11. 형변환(casting)
		 - 기본형 간에는 다른 타입으로 변환이 가능하다.
		 - byte->short-> int-> long-> float> double
		 				  ^
		 				  |
		 		    char---  	
		 */
		int a2 = 40000;
		byte b3 = (byte)a2;
		System.out.println(b3);
		
		int a3 = 65;
		char c3 = (char)a3;
		System.out.println(c3);
		
		char c4='B';
		int i4 = c4; //casting 연산자 생략 가능

		long aa = 180;
		short ff = (short)aa;
		/*
		 12. 문자열 결함
		 */
		System.out.println(55+10); //65 (큰 타입을 따라감)
		System.out.println("하이"+55);//"하이" + "55" => 하이55
		System.out.println("45"+20);//"45" + "20"
		System.out.println("56"+"32");//"56"+"32"
		System.out.println(""+ 45);//""+"45"
		System.out.println(true+"34");//"true" +"34"
		System.out.println('T'+"G"+45);//(더하기 연산은 왼쪽에서 오른쪽으로 "T"+"G"+45 -> "TG"+"45 ->"TG45"
		System.out.println('A'+4+"44");//65+4+"44"->69+"44"->"6944"
	}
		
}
