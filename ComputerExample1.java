
class Calculator {
double areaCircle(double r) {
	System.out.println("Calculator 객체의  areaCircle() 실행");
	return 3.14159 * r * r;
}
}


class Computer extends Calculator {
double areaCircle(double r) {
	System.out.println("Calculator 객체의  areaCircle() 실행");
	return Math.PI* r * r;
}
}

public class ComputerExample1 {
	public static void main(String[] args) {
		int r=10;
		
		Calculator cc=new Calculator();
		System.out.println("원면적 :"+cc.areaCircle(r));
		System.out.println();
		
		Computer cp= new Computer();
		System.out.println("원면적 :"+cp.areaCircle(r));
	}
}
