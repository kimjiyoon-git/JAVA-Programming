import java.util.Scanner;
public class Rectangle {

	 static int width;
     static int height;
	
    
	
     public static int getArea() {
		return width*height;
	 }
     
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Rectangle rect=new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ʺ� �Է��ϼ���");
		width=sc.nextInt();
        System.out.println("���̸� �Է��ϼ���");
        height=sc.nextInt();
      

        System.out.println("�� ���̴� : "+getArea());
        sc.close();
	}
	
}
