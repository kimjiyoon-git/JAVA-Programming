import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     
     int x,y;
     int sum;
     
     System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�:");
     x=scanner.nextInt();
     
     System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�:");
     y=scanner.nextInt();
     
     sum=x/y;
     
     System.out.println(sum);
     System.out.println("���� ��="+(x/y));
	}

}
