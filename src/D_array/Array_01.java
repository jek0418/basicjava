package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		

	/*
	 1. 배열(array)이란?
	 	- 같은 타입의 여러 변수를 하나의 묶음으로 다루는것.
	 	 ex) 5명의 점수
	 	 	int score1 = 100;
	 	 	int score2 = 50;
	 	 	int score3 = 30;
	 	 	int score4 = 40;
	 	 	int score5 = 63;
	 
	 2. 배열의 선언
	 	- 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임은 의미하는 []를 붙여준다.
	
		int[] a;
		int a2[];

	 */
		
	/*
	 3. 배열의 생성
	   - 배열을 선언한 다음에는 배열을 생성해야 한다.
	   - 배열생성 위해서는 'new'와 함께 배열의 타입과 크기를 지정해 주면된다.
	 */
//		int[] a = new int[3];
//		int[] a2= new int[]{3,4,5};
//		int[] a2;
//		a2= new int[]{3,4,5};
//		int[] a3= {3,4,5};
//	
//		int[] score= new int[4];
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		
//		for(int i=0;i<score.length;i++){
//			System.out.println(score[i]);
//		}
		
		//1. score의 0번째 방에 10을 저장해주세요.
//		score[0] = 10;
		//2. score의 1번째 방에 20을 저장해주세요.
//		score[1] =20;
		//3. score의 2번째 방에 30을 저장해주세요.
//		score[2] =30;
		//4. score의 3번째 방에 40을 저장해주세요.
//		score[3] =40;	
		
//		for(int i=0;i<score.length;i++){
//			score[i]=(i+1)*10;
//		}
		
		//1. 207호의 자바 초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요.
		int[] js = new int[17];
		//2. 각 사람의 점수를 0~100점 사이의 랜덤한 점수값으로 저장해 주세요.
//		js[0]=(int)(Math.random()*101)+0;
//		js[1]=(int)(Math.random()*101)+0;
//		js[2]=(int)(Math.random()*101)+0;
//		js[3]=(int)(Math.random()*101)+0;
//		js[4]=(int)(Math.random()*101)+0;
//		js[5]=(int)(Math.random()*101)+0;
//		js[6]=(int)(Math.random()*101)+0;
//		js[7]=(int)(Math.random()*101)+0;
//		js[8]=(int)(Math.random()*101)+0;
//		js[9]=(int)(Math.random()*101)+0;
//		js[10]=(int)(Math.random()*101)+0;
//		js[11]=(int)(Math.random()*101)+0;
//		js[12]=(int)(Math.random()*101)+0;
//		js[13]=(int)(Math.random()*101)+0;
//		js[14]=(int)(Math.random()*101)+0;
//		js[15]=(int)(Math.random()*101)+0;
//		js[16]=(int)(Math.random()*101)+0;
//		
//		//2.5 각 사람의 점수를 출력해 주세요.
//		System.out.println(js[0]);
//		System.out.println(js[1]);
//		System.out.println(js[2]);
//		System.out.println(js[3]);
//		System.out.println(js[4]);
//		System.out.println(js[5]);
//		System.out.println(js[6]);
//		System.out.println(js[7]);
//		System.out.println(js[8]);
//		System.out.println(js[9]);
//		System.out.println(js[10]);
//		System.out.println(js[11]);
//		System.out.println(js[12]);
//		System.out.println(js[13]);
//		System.out.println(js[14]);
//		System.out.println(js[15]);
//		System.out.println(js[16]);
		
		
		//3. 모든 사람의 합계를 구해주세요.(출력)
//		int sum=0;
//		sum+=js[0];
//		sum+=js[1];
//		sum+=js[2];
//		sum+=js[3];
//		sum+=js[4];
//		sum+=js[5];
//		sum+=js[6];
//		sum+=js[7];
//		sum+=js[8];
//		sum+=js[9];
//		sum+=js[10];
//		sum+=js[11];
//		sum+=js[12];
//		sum+=js[13];
//		sum+=js[14];
//		sum+=js[15];
//		sum+=js[16];

//		int sum=0;
//		for(int i=0;i<17;i++){
//			js[i]=(int)(Math.random()*101)+1;
//			System.out.println((i+1)+"번의 점수는"+js[i]+"점 입니다.");
//			sum+=js[i];
//		}
//		System.out.println("");
//		System.out.println("모든 학생들의 점수 합계는"+sum+"입니다.");
//		
		//1. 사용자로부터 7개의 정수를 입력받아 저장할 수 있는 변수 input을 선언 및 생성해 주세요.
		int[] input = new int[7];
		//2. input 변수의 각각의 방을 사용자로부터 입력받아 저장 해 주세요.
		Scanner sc = new Scanner(System.in);	
		for(int i=0;i<input.length;i++){
			System.out.println((i+1)+"번째 정수를 입력해주세요.");
			input[i]=sc.nextInt();
		}
		//3. 배열 안에 있는 내용을 출력하세요.
		for (int i=0;i<input.length;i++){
			System.out.println("배열"+i+"번째 인덱스에 있는 값은"+input[i]+"입니다.");
			
		}
		//4. 배열 안에 있는 값들의 합계를 구하세요.
		int sum2=0;
		for(int i=0;i<input.length;i++){
			sum2+=input[i];	
		}
		
		System.out.println("배열 안에 있는 값들의 총합은"+sum2+"입니다.");
		
		//5. 배열에 입력된 값의 평균을 구하세요. (소수점 셋째자리에서 반올림 하세요.)
		
		float av=0;
		av=(int)((float)sum2/input.length*100+0.5)/100f;
		System.out.println("배열안에 있는 값의 평균은"+av+"입니다.");
		
		//6. 배열의 최대값
		int max=input[0];
		for(int i=1;i<input.length;i++){
			
			if(max<input[i]){
				max=input[i];
			}
		}System.out.println("이 배열의 최대값은"+max+"입니다.");
		
		//7.배열의 최소값
		int min=input[0];
		for(int i=1;i<input.length;i++){
			if(min>input[i]){
				min=input[i];
			}
		}System.out.println("이 배열의 최소값은"+min+"입니다.");
	//________________________________________________________________________________________________________________________________
	
	
	}
}
