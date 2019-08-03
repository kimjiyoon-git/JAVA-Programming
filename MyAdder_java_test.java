public class MyAdder implements AdderInter{


	public int adder(int x, int y){
		int result=x+y;
		return x+y;
		
	}


	  public static void main(String[] args) {
      MyAdder adder = new MyAdder(); 
		   System.out.println(adder.adder(20,30));
		  }
}