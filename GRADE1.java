import java.util.Scanner;
public class GRADE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		char s1,s2;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		
		grade=scanner.nextInt();
		
		
		if(grade>=90)
			s1='A'; //System.out.println("A");
		
		
		else if(grade>=80)
			s1='B';//System.out.println("B");
		
		else if(grade>=70)
			s1='C'; //System.out.println("C");
		
		else if(grade>=60)
			s1='D'; // System.out.println("D");
		
		else 
			s1='F'; //System.out.println("F");
			
		if(grade<60)
			s2=' ';
		
		 if(grade%10>=5 || grade/100==1)
				s2='+';
			else
				s2='o';
			
			System.out.println("당신의 학점은 "+s1+s2);
			System.out.printf("당신의 학점은 %c%c ",s1,s2);
			
			scanner.close();
	}

}