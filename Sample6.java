import java.util.Scanner;



public class Sample6 {

	public static int plus(int a, int b) {
		return a+b; // �޼ҵ� 
	}
		
		public static int min(int a , int b) {
			return a-b; // �޼ҵ� 
		}
		
		public static int mul(int a , int b) {
			return a*b; // �޼ҵ� 
		}
		
		public static int div(int a , int b) {
			return a/b; // �޼ҵ� 
		}
	
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int a,b;
	int c;
	

	System.out.println("���ڸ� �Է��Ͻÿ�");
	
	a=sc.nextInt();
	
	System.out.println("���ڸ� �Է��Ͻÿ�");
	b=sc.nextInt();
	
	System.out.println("��� �� �����ڸ� ������");
	 c=sc.nextInt();
	
	
	if(c==1) {
	System.out.println("�� ���� ����:" + plus(a,b));
	}
	
	if(c==2) {
	System.out.println("�� ���� ����:" + min(a,b));
	}
	if(c==3) {
	System.out.println("�� ���� ����:" + mul(a,b));
	}
	if(c==4) {
	System.out.println("�� ���� ����:" + div(a,b));
	}
	

	sc.close();
	}

}
