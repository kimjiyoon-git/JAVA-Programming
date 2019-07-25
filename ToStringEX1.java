import java.util.Arrays;

class Point3{
	private int x,y;
	int arr[]= {1,2,3,4,5};
	int arr2[][]= {{1,2,3,4,5},{6,7,8,9,10}};
	public Point3(int x, int y) {
		this.x=x; this.y=y;
	}
	 public String toString() {
		 return "Point("+x+","+y+")";
	 }
}
public class ToStringEX1 {

	public static void main(String[] args) {
		
		Point3 a = new Point3(2,3);
		System.out.println(a.arr.toString());
		System.out.println(a.toString());
		System.out.println(Arrays.toString(a.arr));
		System.out.println(Arrays.deepToString(a.arr2));

	}

}
