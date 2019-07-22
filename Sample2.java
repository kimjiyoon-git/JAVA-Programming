//숫자 입력해서 합 출력하기
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
			
		System.out.println("숫자를 입력하시오");
		a=sc.nextInt();
		
		System.out.println("숫자를 입력하시오");
		b=sc.nextInt();
		
		
		//sum=a+b;
		System.out.println("두 수의 합은 : " + plus(a,b));
			
		sc.close();
	}

}
