//���� �Է��ؼ� �� ����ϱ�
		import java.util.Scanner;
		
		
		
		
		public class Sample1 {
			public static int plus(int a, int b) {
				return a+b;
			}
			

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int sum;
		
		Scanner sc= new Scanner(System.in);
			
		System.out.println("���ڸ� �Է��Ͻÿ�");
		a=sc.nextInt();
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
		b=sc.nextInt();
		
		
		//sum=a+b;
		System.out.println("�� ���� ���� : " + plus(a,b));
			
		sc.close();
	}

}
