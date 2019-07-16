import java.util.Scanner;
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fat;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 지방량을 입력하세요:");
		fat=scanner.nextInt();
		
		    if(fat>=40) {
			if(fat>=50)
			System.out.println(" A등급입니다 ");
			else 
			System.out.println(" B등급입니다 ");
		    }
		   
			else 
			if(fat>=30)
			System.out.println(" C등급입니다 ");
			else
			System.out.println(" D등급입니다 ");
			
			scanner.close();
		}
		

	}