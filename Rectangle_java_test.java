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
		
		System.out.println("너비를 입력하세요");
		width=sc.nextInt();
        System.out.println("높이를 입력하세요");
        height=sc.nextInt();
      

        System.out.println("총 넓이는 : "+getArea());
        sc.close();
	}
	
}
