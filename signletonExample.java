//��ü�Դϴ�.
public class signletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	
		
		Signleton obj1=Signleton.getInstance();
		Signleton obj2=Signleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
	}

}
