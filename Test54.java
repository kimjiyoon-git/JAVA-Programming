import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour;
		int pay;
		int money;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ð��� �Է��ϼ��� ");
		hour=scanner.nextInt();
		
		System.out.print("�ñ��� �Է��ϼ��� ");
		money=scanner.nextInt();
		
		
		if(hour>0) {
		
		pay= money*hour;
		System.out.printf("�� ������ ���� : "+pay);

	}
		else
			System.out.println("�ð��� �߸� �ԷµǾ����ϴ�.");

		scanner.close();
}
	
}

