class Cell{
	String model, color;
	
	Cell(String model) {
	this.model=model;
	//this.color=color;
	}

	void powerOn() {
    System.out.println("전원을 켭니다");
}
	
	void powerOff() {
	    System.out.println("전원을 끕니다");
	}
}
	
	class CellPhone extends Cell {
		int channel;
		CellPhone(String model, String color, int channel) {
			//this.model=model;
			super(model);
			this.color=color;
			
			this.channel=channel;
			
		}
		void turnOnDmb() {
			System.out.println("채널"+channel+"번 DMB 방송");
		}
	}
	
public class PhoneEx1 {
	public static void main(String[] args) {
		CellPhone dmb= new CellPhone("아이폰","검정",40);
		System.out.println("모델:"+dmb.model);
		System.out.println("색깔:"+dmb.color);
		System.out.println("채널:"+dmb.channel);
		dmb.powerOn();
		dmb.turnOnDmb();
		
	}
	

}
