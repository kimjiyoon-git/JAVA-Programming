public class SwitchStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(5); f(6); f(7); f(8);
	}
	
	static void f(int i) {
		switch(i%5)
		{
			case 0: case 1:
				System.out.println("5�� ��� Ȥ�� +1");
				break;
			
		     case 2:
				System.out.println("5�� ��� + 2");
			break;
				
			  default:
			  System.out.println("defalut");
		}
	}

}
