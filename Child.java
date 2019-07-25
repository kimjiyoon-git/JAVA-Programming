
class Parent {
public String name;

public Parent(String name) {
	this.name=name; //
	
}
}

public class Child extends Parent {
	private int StudentNo;
	
	public Child(String name,int studentNo) {
		super(name);//원래는 this.name=name; 에러 =super(name)으로 생성 
		this.StudentNo=studentNo;
	}
}
