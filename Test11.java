import java.util.Scanner;
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fat;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���淮�� �Է��ϼ���:");
		fat=scanner.nextInt();
		
		    if(fat>=40) {
			if(fat>=50)
			System.out.println(" A����Դϴ� ");
			else 
			System.out.println(" B����Դϴ� ");
		    }
		   
			else 
			if(fat>=30)
			System.out.println(" C����Դϴ� ");
			else
			System.out.println(" D����Դϴ� ");
			
			scanner.close();
		}
		

	}