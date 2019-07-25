class Outer02{
				
	private static int x=100;
	private static int y=200;
	public Outer02() { }
	public void disp() {}
	static class Inner1{
		private int a=10;
		static int  b=20; //정적이라고 선언  x= 정적 변수 사용 불가 
		public void Inner1() {}
		public void disp_in() {					
			System.out.println("a ="+ a);
			System.out.println("b ="+ b);
			System.out.println("y ="+ x);
			System.out.println("y ="+ y);
		}
	}
}
			
public class Exam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer02.Inner1 bb= new Outer02.Inner1();
		bb.disp_in();
		System.out.println(bb.b);
		System.out.println(Outer02.Inner1.b);					
	}
}


