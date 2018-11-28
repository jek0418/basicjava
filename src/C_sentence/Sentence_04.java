package C_sentence;

import java.util.Scanner;

public class Sentence_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//if(abc.equals("*")

		for(;;){
			System.out.println("첫번째 정수를 입력하세요.");
			int i = sc.nextInt();
			System.out.println("사칙연산(+,-,*,/ 중 하나를 입력하세요. x를 입력하면 종료)");
			String j= sc.next();
			if(j.equals("x")||j.equals("X")){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else{
				System.out.println("두번쨰 정수를 입력하세요."); 
				int k = sc.nextInt();
				switch(j) {
				case "+" : 
					System.out.println(i+"+"+k+"="+(i+k));
					break;
				case "-" :
					System.out.println(i+"-"+k+"="+(i-k));
					break;
				case "*" :
					System.out.println(i+"*"+k+"="+(i*k));
					break;
				case "/" :
					System.out.println(i+"/"+k+"="+(float)(i/k));
					break;	
				}
			}                                                             
				
		}
	}
}