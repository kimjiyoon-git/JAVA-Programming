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
		
		System.out.println("너비를 입력하세요");
		rect.width=sc.nextInt();

        System.out.println("높이를 입력하세요");
        rect.height=sc.nextInt();
    

        System.out.println("총 넓이는 : "+rect.getArea());
        sc.close();
	}
	
}
