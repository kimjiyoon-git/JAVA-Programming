import java.util.Scanner;



public class Sample6 {

	public static int plus(int a, int b) {
		return a+b; // 메소드 
	}
		
		public static int min(int a , int b) {
			return a-b; // 메소드 
		}
		
		public static int mul(int a , int b) {
			return a*b; // 메소드 
		}
		
		public static int div(int a , int b) {
			return a/b; // 메소드 
		}
	
	
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int a,b;
	int c;
	

	System.out.println("숫자를 입력하시오");
	
	a=sc.nextInt();
	
	System.out.println("숫자를 입력하시오");
	b=sc.nextInt();
	
	System.out.println("계산 할 연산자를 고르세요");
	 c=sc.nextInt();
	
	
	if(c==1) {
	System.out.println("두 수의 합은:" + plus(a,b));
	}
	
	if(c==2) {
	System.out.println("두 수의 합은:" + min(a,b));
	}
	if(c==3) {
	System.out.println("두 수의 합은:" + mul(a,b));
	}
	if(c==4) {
	System.out.println("두 수의 합은:" + div(a,b));
	}
	

	sc.close();
	}

}
