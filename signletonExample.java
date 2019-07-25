//객체입니다.
public class signletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	
		
		Signleton obj1=Signleton.getInstance();
		Signleton obj2=Signleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
	}

}
