//다른 객체입니다.

class Singleton {
	
	
}
public class SignletonExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	Singleton obj1= new Singleton();
	Singleton obj2= new Singleton();
		
		
	
		
		if(obj1 == obj2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
	}

}

