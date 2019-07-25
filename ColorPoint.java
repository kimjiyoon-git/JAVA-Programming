class Point {
	private int x, y;
	public Point(int x , int y) {
		this.x=x; this.y=y; 
	}
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x=x; this.y=y;}
}

public class ColorPoint extends Point{
 String color;
 ColorPoint(int x , int y, String color){
	 super(x,y);
		// TODO Auto-generated constructor stub
	}
 void setPoint(int x,int y) {
	 move(x,y);
 }
 void setColor(String color) {
	 this.color=color;
 }
	


	public void show() {
		
		System.out.println(color+"»öÀ¸·Î ("+ getX()+","+getY()+")"); }
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			ColorPoint cp = new ColorPoint(5,5,"Yellow");
			cp.setPoint(10,20);
			cp.setColor("Green");
			cp.show();

	}

}
