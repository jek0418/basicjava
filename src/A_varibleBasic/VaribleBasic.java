package A_varibleBasic;


/**
 * doc 주석
 * @author pc05
 * @since 2018.10.30
 */
public class VaribleBasic {
	public static void main(String[] args){
		//	 한줄주석 ctrl + shift+c
		
//		한
//		줄
//		주
//		석
		/*
		 *여 
		 *러
		 *줄
		 *주
		 *석
		 */
		/*여	
		  러
		  줄
		  주 
		  석
		   */	
		 
		 /*
		  1. 변수란?
		   - 단 하나의 값을 저장할 수 있는 공간이다.
		  */
//		변수의 선언
//		기본형 참조형
//		[변수타임] [변수명];
		
		int jae;
		jae =10;
		
		System.out.println(jae);
		
		//명명규칙
		//1. 대소문자를 구분을 하며 길이의 제한이 없다.
		int asd;
		int aSd;
		//2. 예약어(key word, reserved word)는 사용할 수 없다.
		//int class; //사용불가
		
		//3. 숫자로 시작해서는 안된다.
		//int 10top;
		int t10op;
		
		//4.특수문자 '_', '$' 만 사용 가능하다.
		int $harp;
		//int s#arp;
		
		// 필수는 아니지만 자바프로그래머의 암묵적 약속(가독성 향상)
		//1. 클래스명은 대문자로 시작해야 된다.
		//2. 여러단어로 이루어진 경우 첫 번째 이후 단어의 첫글자는 대문자로 쓴다.
		// lastIndexOf
		//3. 상수의 명칭은 모두 대문자로 써야 한다. 두 단어 이상은 언더바(_)로 구분한다.
		//MAX_VALUE
		//4. 한글은 사용하지 않는다.
	

		System.out.println('j' + "ava");
		
	}

}
