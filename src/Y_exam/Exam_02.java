package Y_exam;

public class Exam_02 {
	public static void main (String[] args){
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
				1byte	2byte	4byte	8byte
		-------------------------------------------------		
		논리형   boolean
		-------------------------------------------------	
		문자형			char	
		-------------------------------------------------
		정수형	byte	short	int		long
		-------------------------------------------------
		실수형					flot	double
		-------------------------------------------------
		
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
		(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
		초기화 하는 한 줄의 코드를 적으시오.
		- 주민등록 번호를 숫자로 저장하려면 13자리 정수를 저장해야 한다. 
		- 정수 자료형 중 int는 저장할 수 있는 값의 범위가 -2^31~2^31-1(약 +-20억-10자리까지 저장가능) 이므로 저장할 값의 범위를 벗어나게 된다.(overflow)
		- 따라서 주민등록 번호를 저장할 자료형의 크기는 int 보다 큰 자료형 이어야 한다. 
		- 정수형 자료형 long은 저장 범위가 -2^-63~2^-1이므로 13자리 주민등록 번호를 저장할 수 있다. 
		*/
		long regNo = 8604182488654L;
		/*
		
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
		int i = 100;
		long l =100L;
		final float PI = 3.14f;
		- 리터럴 : 100, 100L, 3.14f
		- 변수 : i, l
		- 키워드 : int, long, final, float
		- 상수 : PI
		
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은? (b)
		a. int
		b. Byte
		c. double
		d. boolean
		- 자바는 대소문자를 구분한다.  
		- Byte 의 경우 앞 글자가 대문자이기 때문에 기본형 byte 와는 의미가 다르며 기본형이 아니다.
		
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
		- +연산자는 문자형의 경우 서로다른 두 리터럴의 문자혹은 문자열의 결합을 의미하며 정수나 실수형의 경우 두 리터럴의 덧샘 결과를 출력한다.
		- java 에서는 + 연산자로 서로다른 두 리터럴을 연산할 경우 두 리터럴의 자료형 타입 중 표현범위가 더 넓은 타입으로 형 변환하여 타입을 일치시킨 후 연산을 수행한다.
		- ''으로 감싸진 값은 char형 이며 ""로 감싸진 리터럴은 string 형 이다.
		- 문자형인char은 java내부적으로 정수(유니코드)로 저장하기 때문에 정수형과 연산이 가능하며 jvm은 연산시 피연산자의 타입이 int보다 작은 타입이면 int type로 변환된다.
		
		System.out.println(“1” + “2”) → (12) - 1과 2 모두 string형으로 저장되었으며 + 연산자로 문자열이 결합되어 string type인12가 출력된다. 
		System.out.println(true + “”) → (true)- true 는 boolean type 이고 ""는string type의 리터럴이다. 
											  -true가 표현 범위가 더 넓은 string type으로 형 변환되어 string type 의 true 라는 문자열이 출력된다. 
		System.out.println(‘A' + 'B') → (131) - A의 유니코드는 65, B의 유니코드는 66 이며 + 연산자에 의해 덧샘 연산되어 정수인 131로 출력된다.
		System.out.println('1' + 2) → (51) -  1의 유니코드는 49이며 int type과 연산이 가능하다. 49+2 가 되어 51이 출력된다.
		System.out.println('1' + '2') → (99) - 1의 유니코드는 49이며 2의 유니코드는 50이다. + 연산자에 의해 덧샘 연산되어 정수인 99가 출력된다.
		System.out.println('J' + “ava”) → (java) - j는 char type이고 ava는 string type 이며 
												    표현 범위가 더 넓은 string type으로 형 변환되어 string type 의 true 라는 문자열이 출력된다.
		System.out.println(true + null) → (오류)- true는 boolean type이고 null은 모든 참조형의 기본값이기 때문에 type을 특정할 수 없어 연산이 불가능하다.
		
		
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)(b,c,d,e)
		a. if
		b. True
		c. NULL
		d. Class
		e. System
		- 자바는 대소문자를 구분하며 True, Null, Class, 는 대문자로 시작하며 예약어가 아니다. 
		- System 은 예약어가 아니다.
		- if 는 예약어이다.
		
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)(a,d,e,g)
		a. $ystem  - 변수명에사용될 수 있는 특수문자는 $과 _ 이며 $ystem 은 변수 이름으로 사용 가능하다.
		b. channel#5 - 변수명에사용될 수 있는 특수문자는 $과 _ 이며 channel#5 은 변수 이름으로 사용할 수 없다.
		c. 7eleven - 변수명은 숫자로 시작해서는 안되며 따라서 7eleven는 변수 이름으로 사용할 수 없다.
		d. If - 대문자로 변수명을 시작하는것은 규칙에 어긋나는 것은 아니며 사용 가능하다.
		e. 자바- 자바프로그래머의 암묵적 약속에는 어긋나지만 한글도 변수명으로 사용할 수 있다.
		f. new - new는 예약어로서 변수명으로 사용 불가능하다.
		g. $MAX_NUM - 변수명에사용될 수 있는 특수문자는 $과 _ 이며 $MAX_NUM는 변수명으로 사용할 수 있다. 
					- $MAX_NUM 은 프로그래머의 암묵적 약속에 의하여 대문자로 표시되었으며 두 문자 이상은 언더바로 구분한 상수명이다.
		h. hello@com 변수명에사용될 수 있는 특수문자는 $과 _ 이며 hello@com 은 변수 이름으로 사용할 수 없다.
		
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)(a,d)
		- 참조형 변수는 4byte 이며 4byte 크기의 자료형은 a. int, d.float 이다.
		a. int 
		b. long
		c. short
		d. float
		e. double
		
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) (d,e)
		byte b = 10; 
		char ch = 'A';
		int i = 100;
		long l = 1000L; 
		
		- byte-> short->int->long->float->double
						^
						|
				char ---|
				
		a. b = (byte)i;  - int type 에서 byte type으로 형변환 이므로 반드시 형변환이 필요하다.
		b. ch = (char)b; - byte type에서 char 타입으로 형변환으로 byte type은 1byte이지만  음수까지 표현 가능하고 char type는
			          문자형 자료형으로 음수 표현이 불가능하며 표현 범위가 다르다. 따라서 형변환이 꼭 필요하다.
		c. short s = (short)ch;- char type에서 short type의 형 변환으로 두 자료형 모두 크기가 2byte 이지만 
				     b번 보기와 와 마찬가지로 표현 범위가 달라 반드시 형 변환이 필요하다.
		d. float f = (float)l; - long type 에서 float type 으로의 형 변환으로 float type자료형은 실수형으로 
				long type의 자료형 보다 표현 범위가 크기때문에 형 변환이 생략 가능하다.
		e. i = (int)ch; - char type 자료형에서 int type 자료형으로의 형 변환으로 범위가 작은 자료형에서 큰 자료형으로의
			       변환으로 형변환 생략이 가능하다
		
		
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오) (65535)
		- char type은 1byte 크기를 사용하며 문자형 이므로 부호에 사용되는 bit 는 없다. 
		- 따라서 표현 범위는 0~2^16 -1 까지 이며 이를 계산하여 10진수로 나타내면 65535이다.
		
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)(a, b, c, d)
		a. byte b = 256; - byte 자료형은 1byte크기로 자료 저장 범위가 -2^7 ~ 2^7-1이므로 양수는 127까지 저장 가능하다.
		b. char c = ''; - char 자료형은 2byte 크기이며 공백은 저장하지 않는다.
		c. char answer = 'no'; -char 자료형은 문자1자만 저장하며 문자 열은 string type에 저장한다.
		d. float f = 3.14 - 문장에서 ; 이 빠져있으며 float type 으로 선언한 경우 숫자뒤에f를 써주어야 한다.
		e. double d = 1.4e3f; - double type으로 선언한 경우 리터럴 뒤에 접미사를 생략할 수 있으며 접미사를 쓰는 경우에 d를 쓴다.
							  - 1.4e3f 는 float 자료형보다 표현 범위가 작아 double 자료형 변수에 초기화 할 수 있다.
	
		
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)(c,e,f)
		a. boolean - false 
		b. char - '\u0000'
		c. float - 0.0 - float type 의 기본값은 0.0f 이다.
		d. int - 0
		e. long - 0 - logn type의 기본값은 0.0L이다.
		f. String - "" -String type은 기본값이 null 이고 ""은 공백 자체로 문자열 데이터를 의미한다. 
		
		 */
	}
		}
	
