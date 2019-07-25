class Air{
	public void land() {
		System.out.println("����");
	}
	public void fly() {
		System.out.println("�Ϲ� ����");
	}
}

class SuperAir extends Air{
	public static final int NORMAL =1;
	public static final int SUPER=2;
	public int flyMode=NORMAL;
	public void fly() {
		if(flyMode==SUPER) {
			System.out.println("�����Ӻ���");
		}
		else {
			super.fly();
		}
	}
}
public class SuoerAirExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperAir sa= new SuperAir();
		sa.flyMode=sa.NORMAL;
		sa.fly();
		sa.flyMode=sa.SUPER;
		sa.fly();
		sa.land();
	}

}
