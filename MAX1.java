import java.util.Scanner;
public class MAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("비교할 첫 번째 숫자를 적어주세요");
		x=scanner.nextInt();
		System.out.print("비교할 두 번째 숫자를 적어주세요");
	    y=scanner.nextInt();
		
		if(x>y) 
			System.out.println("X가 더 큽니다");
			else
			System.out.println("Y가 더 큽니다");
				
		
		
		System.out.println(x>y? "X가 크다" : "Y가 크다 ");
		
		scanner.close();
	}

}
