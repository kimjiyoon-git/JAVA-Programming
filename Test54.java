import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour;
		int pay;
		int money;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요 ");
		hour=scanner.nextInt();
		
		System.out.print("시급을 입력하세요 ");
		money=scanner.nextInt();
		
		
		if(hour>0) {
		
		pay= money*hour;
		System.out.printf("총 월급의 값은 : "+pay);

	}
		else
			System.out.println("시간이 잘못 입력되었습니다.");

		scanner.close();
}
	
}

