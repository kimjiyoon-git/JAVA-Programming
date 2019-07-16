import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		char ch;
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		
		grade=scanner.nextInt();
		
		if(grade==100)
			System.out.println("A+");
		
		else if(grade>=90)
			System.out.println("A");
		
		else if(grade>=80)
			System.out.println("B");
		
		else if(grade>=70)
			System.out.println("C");
		
		else if(grade>=60)
			System.out.println("D");
		
		else 
			System.out.println("F");
	}

}
