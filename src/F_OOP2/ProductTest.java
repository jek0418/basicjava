package F_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv2 t2= new Tv2("LGTV", 700);
		NoteBook nb = new NoteBook("Mac",400);
		MicroWave mw = new MicroWave("LG렌지",200);
		Buyer b = new Buyer("김재은",10000);
		
		b.buy(nb);
		b.buy(nb);
		b.buy(nb);
		b.buy(mw);
		
		b.summary();
		
		//고객님의 잔여금은 xxx이고 보너스 포인트는 xxx입니다. 
		System.out.println("처음산 물품"+b.item.get(0));
		System.out.println("");
		
		System.out.println(b.name+"님의 남은돈은"+b.money+"이고 보너스 포인트는"+b.bonusPoint+"입니다.");
		System.out.println("");
		b.refund(nb);
		b.summary();
		
	}
}

class Product{
	
	String name;
	int price;
	int bonusPoint;
	
	
	Product(String name, int price){
		this.name= name;
		this.price = price;
		bonusPoint = price/10;
	}
	
}

class Tv2 extends Product{
	Tv2(String name, int price){
		super(name, price);
		
	}
@Override	
public String toString(){
	return name;
	}
}

class NoteBook extends Product{
	NoteBook(String name, int price){
		super(name, price);
		
	}
@Override	
public String toString(){
	return name;
	}
}

class MicroWave extends Product{
	MicroWave(String name, int price){
		super(name, price);
		
	}
@Override	
public String toString(){
	return name;
	}
}

class Buyer{
	
	String name;
	int money;
	int bonusPoint;
	int tsum;
	Vector<Product> item = new Vector<Product>();
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	void buy(Product p){
		if(money<p.price){
			System.out.println("가진돈보다 비쌉니다.");
			return;
		}else{
			money-=p.price;
			bonusPoint+=p.bonusPoint;
			System.out.println(p+"구매하셨습니다.");
			item.add(p);
			System.out.println("고객님의 남은돈 : "+money);
			System.out.println("고객님의 포인트 : "+ bonusPoint);
			System.out.println("");
			
		}
		
	}
	//1. 반품 refund 메서드 만들기.
		//  구매물품이 없으면 "구매하신 물품이 없습니다."
		//  구매물품은 있으나 우리매장에서 산게 아니다.
	
	void refund(Product p){
		System.out.println( name + "고객님깨서 문의하신"+p+"제품의 반품결과입니다.");
		if(item.isEmpty()==true){
			System.out.println("구매하신 물품이 없습니다.");
			System.out.println("");
		}else if(!(item.contains(p))){
			System.out.println("우리 매장에서 산 물건이 아닙니다.");
			System.out.println("");
		}else{
			item.remove(p);
			bonusPoint-=p.price/10;
			money+=p.price;
			System.out.println(p+"의 반품이 완료되었습니다.");
			System.out.println("");
		}
	}
	
		
//		if(item.contains(p)){//반품하려고 하는 객체를 포함하고 있으면 true
//			for (int i = 0;item.size();i++){
//				if(item.get(i)==p){
//					Product p2 =(Product)item.remove(i);
//					money+= p2.price;
//					bonusPoint-= p2.bonusPoint;
//					System.out.println(p2+"를 반품하셨습니다.");
//					return;
//				}
//			}
//			if(item.remove(p)){
//				money += p.price;
//				bonusPoint-=p.bonusPoint;
//				System.out.println(p+"를 반품하셨습니다.");		
//				return;
//			}else{
//				System.out.println("그런물건 사신 적 없습니다");
//			
//			}
	
//			if(item.contains(p)){
//				item.remove(p);
//				bounsPoint -= p.bounsPoint;
//				System.out.println(p+"를 반품하셨습니다.");
//				return;
//			}
//	}
	
	
	//2. 영수증 summary
	/*
	 
	 			영	수	증
	 	
	 	구매물품  LGTV		700만원
	 			Mac			400만원
	 			LG전자렌지	200만원
	 	총 구매 금액			1300만원
	 	고객님의 남은돈		8700만원
	 			포인트		130만점
	 
	 	또 오십시오 고객님~
	 	
	 	*/
	 	
	void summary(){
		System.out.println("\t영\t수\t증");
		System.out.println("				");
		System.out.print("구매물품");
	
		for(int i = 0;i<item.size();i++){
			System.out.print("\t"+ item.get(i).name);
			System.out.println("\t"+item.get(i).price+"만원");
			tsum +=item.get(i).price;
		
		}
	
		System.out.println("총 구매 금액\t"+ tsum+"만원");
		System.out.println("고객님의 남은돈\t"+ money + "만원");
		System.out.println("고객님의 포인트 \t"+ bonusPoint + "만점");
		System.out.println("");
		System.out.println("\t또 오십시오 고객님.");
	}
}

//3. 사람 여러명을 관리할 수 있는 클래스를 작성해주세요.
// 사람은 이름으로 구분
	
class Buyers{
	Vector<Buyer> mem = new Vector<Buyer>();
	void inputData(Buyer b){
		mem.add(b);
		
	}
}
//4. 물품을 관라할수있는 클래스를 만드세요.(재고관리)