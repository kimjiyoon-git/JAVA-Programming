import java.util.Scanner;
public class MAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ù ��° ���ڸ� �����ּ���");
		x=scanner.nextInt();
		System.out.print("���� �� ��° ���ڸ� �����ּ���");
	    y=scanner.nextInt();
		
		if(x>y) 
			System.out.println("X�� �� Ů�ϴ�");
			else
			System.out.println("Y�� �� Ů�ϴ�");
				
		
		
		System.out.println(x>y? "X�� ũ��" : "Y�� ũ�� ");
		
		scanner.close();
	}

}
