import java.util.Scanner;
public class Rectangle1 {

	 int width;
     int height;
	
     public Rectangle1() {}
	 public int getArea() {
		return width*height;
	 }
     
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Rectangle1 rect=new Rectangle1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ʺ� �Է��ϼ���");
		rect.width=sc.nextInt();

        System.out.println("���̸� �Է��ϼ���");
        rect.height=sc.nextInt();
    

        System.out.println("�� ���̴� : "+rect.getArea());
        sc.close();
	}
	
}
