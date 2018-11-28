package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour);//4
		
		t.setMinute(150);
		int minute = t.getMinute();
		hour = t.getHour();
		System.out.println(t.getHour()+" : "+minute);//6:30
		
		t.setSeconds(10000);
		hour = t.getHour();
		minute = t.getMinute();
		int seconds = t.getSeconds();
		System.out.println(t.getHour()+" : "+t.getMinute()+" : "+seconds);//9:16:40
	}

}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour){
		this.hour = (getHour()+hour)%24;
	}
	void setMinute(int minute){
		setHour((getMinute()+minute)/60);
		this.minute=(getMinute()+minute)%60;
		//this.minute= minute%60;
		//setHour(hour+minute/60);
		
	}
	
	void setSeconds(int second){
		setMinute((getSeconds()+second)/60);
		this.second=(getSeconds()+second)%60;
		//this.second = second%60;
		// setMinute(minute+second/60);
		
	}
	
	int getHour(){
		return hour;
	}
	
	int getMinute(){
		return minute;
	}
	
	int getSeconds(){
		return second;
	}
}