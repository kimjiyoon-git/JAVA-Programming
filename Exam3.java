

class Outer{
	private int x=100;
	private static int y=200;
	public Outer() {System.out.println("y ="+ x); }
	public void disp() {}
	class Inner{
		int a=10, b=20; //정적이라고 선언  x= 정적 변수 사용 불가 
		public void Inner() {}
			public void disp_in() {
			
			System.out.println("a ="+ a);
			System.out.println("b ="+ b);
			System.out.println("y ="+ x);
			System.out.println("y ="+ y);
			disp();
		}
	}
}


public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Outer aa= new Outer();
			Outer.Inner bb = aa.new Inner();
			bb.disp_in();
			System.out.println(bb.b);
			
	}

}

