package F_OOP2;

import E_OOP.ProtetectedTest03;


public class ProtetectedTest01 extends ProtetectedTest03{//01은 03의 다른패키지에 있는 자손이 됨.
	public static void main(String[] args) {
		ProtetectedTest02 pt2 = new ProtetectedTest02();
		ProtetectedTest03 pt3 = new ProtetectedTest03();
		ProtetectedTest01 pt1 = new ProtetectedTest01();
	}
}
