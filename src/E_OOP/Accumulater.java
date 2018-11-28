package E_OOP;

import java.util.Scanner;

public class Accumulater {
	public static void main(String[] args) {
		Accum ac = new Accum(); 
		Scanner sc = new Scanner(System.in);
		ac.title(); 
		ac.memu();
		while(true){
			System.out.println("Menu를 선택해서 입력하세요.(모든 Menu: m ):");
			String cho= sc.next();
			if (cho.equals("+")||cho.equals("-")||cho.equals("*")||cho.equals("/")){
				System.out.println("연산할 값(숫자)를 입력하세요.:");
				int num=sc.nextInt();
				switch(cho) {
				case "+" : 
					ac.add(num);
					System.out.println("현재 누적된 값은"+ac.getvalue()+"입니다.");
					break;
				case "-" :
					ac.sub(num);
					System.out.println("현재 누적된 값은"+ac.getvalue()+"입니다.");
					break;
				case "*" :
					ac.multiply(num);
					System.out.println("현재 누적된 값은"+ac.getvalue()+"입니다.");
					break;
				case "/" :
					ac.divide(num);
					System.out.println("현재 누적된 값은"+ac.getvalue()+"입니다.");
					break;	
				}
				
			}else if (cho.equals("m")){
				ac.memu();
			}
			
			else if (cho.equals("r"))
			{
				System.out.println("누산기의 값을 0으로 리셋합니다.");
				ac.reset();
				System.out.println("누적값:"+ac.getvalue());
			}
			else if (cho.equals("v"))
			{
				System.out.println("현재 누적된 값은"+ac.getvalue()+"입니다.");
			}
			else if (cho.equals("e"))
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				
		}
		
	}
		
}



class Accum{
	float value=0;
	
	void reset(){
		value=0;
	}
	
	void title(){
		System.out.println("\t"+"##########################################");
		System.out.println("\t"+"###                                    ###");
		System.out.println("\t"+"###             누산기  프로그램             ###");
		System.out.println("\t"+"###                                    ###");
		System.out.println("\t"+"##########################################");
	}
	
	void memu(){
		System.out.println("\t"+"##########################################");
		System.out.println("\t"+"###                                    ###");
		System.out.println("\t"+"###             < Menu >               ###");
		System.out.println("\t"+"###                                    ###");
		System.out.println("\t"+"###          +:누적값과 입력값 더하기        ###");
		System.out.println("\t"+"###          -:누적값에서 입력값 빼기        ###");
		System.out.println("\t"+"###          *:누적값에 입력값 곱하기        ###");
		System.out.println("\t"+"###          /:누적값을 입력값으로 나누기    ###");
		System.out.println("\t"+"###           (소수 셋쨰자리에서 반올림 )   ###");
		System.out.println("\t"+"###                                    ###");
		System.out.println("\t"+"###          m :메뉴                         ###");
		System.out.println("\t"+"###          r :누적값 0으로 리셋            ###");
		System.out.println("\t"+"###          v :현재 누적값 확인             ###");
		System.out.println("\t"+"###          e :종료                         ###");
		System.out.println("\t"+"###                                    ###");
		System.out.println("\t"+"##########################################");
		
	}
	
	void add(int num){
		value = (float)value + num;
		System.out.println("누적값에서"+num+"을(를) 더합니다");
		
	}
	void sub(int num){
		value = (float)value - num;
		System.out.println("누적값에서"+num+"을(를) 뺍니다.");
	}
	void multiply(int num){
		value = (float)value * num;
		System.out.println("누적값에서"+num+"을(를)곱합니다.");
	}
	
	void divide (int num){
		value =(int)((float) value/num*100+0.5)/100f;
		System.out.println("누적값에서"+num+"을 나눕니다.");
		
	}
	float getvalue() {
		return value;
	}
	
	
	
}