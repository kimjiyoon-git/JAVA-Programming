import java.util.Scanner;

class Calculator {
double areaCircle(double r) {
	System.out.println("Calculator ��ü��  areaCircle() ����");
	return 3.14159 * r * r;
}
}


class Computer extends Calculator {
double areaCircle(double r) {
	System.out.println("Calculator ��ü��  areaCircle() ����");
	return Math.PI* r * r;
}
}


public class ComputerExample3 {
	public static void main(String[] args) {
		
		int r=10,a;
		
		Calculator cc=new Calculator();
		Computer cp= new Computer();
		
		while(true) {
		System.out.println("����� ��ü�� �����ϼ��� (1.Calculator 2.Computer) : "+ "  ");
		
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		
		if(a==1) {
		
			System.out.println("������ :"+cc.areaCircle(r));
			System.out.println();
		}
		
		else if(a==2) {
			System.out.println("������ :"+cp.areaCircle(r));
			System.out.println();
		
		}
		else {
			System.out.println("�����Դϴ�.");
		
		}
		}
	}
}