import java.util.Scanner;

abstract class Test1{
abstract int add(int a, int b); 

}

public class Sample3 extends Test1 {
public  int add(int a, int b) {
	return a+b; // �޼ҵ� 
	}
		
		
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	Sample3 s= new Sample3();
	int a;
	int b;
	int sum;
	System.out.println("���ڸ� �Է��Ͻÿ�");
	
	a=sc.nextInt();
	
	System.out.println("���ڸ� �Է��Ͻÿ�");
	b=sc.nextInt();
	
	//sum=a+b;
	
	System.out.println("�� ���� ����:" + s.add(a,b));

	sc.close();
	}

}