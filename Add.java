import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     
     int x,y;
     int sum;
     
     System.out.print("첫 번째 숫자를 입력하시오:");
     x=scanner.nextInt();
     
     System.out.print("두 번째 숫자를 입력하시오:");
     y=scanner.nextInt();
     
     sum=x/y;
     
     System.out.println(sum);
     System.out.println("나눈 값="+(x/y));
	}

}
