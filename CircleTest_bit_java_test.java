class Circle {
  private int radius;
  public Circle(int radius) {
    this.radius =radius;
  }
  public int getRadius() {
    return radius;
}
}
  
  public class CircleTest extends Circle { 
	 	private String name; 
	  	public CircleTest(int radius, String name) { 
	  		super(radius); 
	   		this.name = name; 
	   	} 
	  	public void show() { 
	  		System.out.println(name + ", " + "¹ÝÁö¸§ = " + getRadius()); 
	  	} 
	 	public static void main(String[] args) { 
	 		CircleTest w = new CircleTest(5, "Waffle"); 
	 		w.show(); 
	 	} 
	  } 

