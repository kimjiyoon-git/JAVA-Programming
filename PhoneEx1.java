class Cell{
	String model, color;
	
	Cell(String model) {
	this.model=model;
	//this.color=color;
	}

	void powerOn() {
    System.out.println("������ �մϴ�");
}
	
	void powerOff() {
	    System.out.println("������ ���ϴ�");
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
			System.out.println("ä��"+channel+"�� DMB ���");
		}
	}
	
public class PhoneEx1 {
	public static void main(String[] args) {
		CellPhone dmb= new CellPhone("������","����",40);
		System.out.println("��:"+dmb.model);
		System.out.println("����:"+dmb.color);
		System.out.println("ä��:"+dmb.channel);
		dmb.powerOn();
		dmb.turnOnDmb();
		
	}
	

}
