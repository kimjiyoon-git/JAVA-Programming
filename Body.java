import java.util.Scanner;
public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fat;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���淮�� �Է��ϼ���:");
		fat=scanner.nextInt();
		
		  
			if(fat>=50)
			System.out.println(" A����Դϴ� ");
			else if (fat>=40)
			System.out.println(" B����Դϴ� ");
			else if(fat>=30)
			System.out.println(" C����Դϴ� ");
			else
			System.out.println(" D����Դϴ� ");
			
			scanner.close();
		}
		

	}


