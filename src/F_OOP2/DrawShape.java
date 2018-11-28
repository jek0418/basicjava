package F_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Scanner;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		DrawShape ds2 = new DrawShape("nextfroever");
	//	ds.paint(new Graphics());
		
	}
	@Override
	public void paint(Graphics g){
		//1. 원 객체를 만드세요(매개변수 2개짜리 생성자를 이용해주세요.)
		//150,150, 50
		Circle c1= new Circle(new Point(150,150),50);
		//2. 원을그려주세요
	
		g.drawOval(c1.center.x, c1.center.y, c1.r*2, c1.r*2);
			
		//3.삼각형 객체를 만드세요
		//매개변수 하나짜리 생성자를 이용해주세요
		//100,100  200,200  200,100 (직각삼각형)
		Triangle t1 = new Triangle(	new Point[] {new Point(100,100),new Point(200,200),new Point(200,100)});
		
		//4. 삼각형을 그려주세요
		
		g.drawLine(t1.p[0].x,t1.p[0].y,t1.p[1].x,t1.p[1].y);
		g.drawLine(t1.p[1].x,t1.p[1].y,t1.p[2].x,t1.p[2].y);
		g.drawLine(t1.p[2].x,t1.p[2].y,t1.p[0].x,t1.p[0].y);
		
		
		//5.jvm 그리기 
	}
	
	DrawShape(){
		setTitle("The dreamer");
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.green);
		setResizable(false);
		
	}

	DrawShape(String title){
		setTitle(title);
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.CYAN);
		setResizable(false);
		
	}
}

class Point{
	
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
}

class Circle{
	//1. 점 하나를 저장할 수 있는 변수 center를 선언하세요.
		Point center;//포함관계 (Point를 포함하고 있다.)
	
	//2. 반지름(정수)을 저장할 수 있는 변수 r을 선언하세요.
		int r;
	
	//3. 매개변수가 두개인 생성자를 만드세요
	//   단 매개변수 두개로 center 와 r을 초기화 해주세요.
		Circle(Point center, int r){
			this.center=center;
			this.r=r;		
		}
	
	//4. 기본생성자를 만들어주세요
	// 단 매개변수가 두개인 생성자를 이용하여 점(50,50으로)반지름은 100으로 만들어주세요.
		Circle(){
	
			 this(new Point(50,50),100);
			
		}
		
}
		
class Triangle{
	//1. 점 세개를 저장할 수 있는 변수 p를 선언하세요.
		Point[] p;
	
	//2. 매개변수가 하나인 생성자를 만드세요.
	//	단 매개변수의 값으로 p를 초기화해주세요.
		Triangle(Point[] p){
			this.p=p;
		};
	
	//3. 매개변수가 세게인 생성자를 만드세요.
	// 단 매개변수 세개로 p를 초기화해 주세요.
		Triangle(Point p1, Point p2, Point p3){
			this.p = new Point[3];
			p[0]=p1;
			p[1]=p2;
			p[2]=p3;
		}
		
		
}
			
		
		
