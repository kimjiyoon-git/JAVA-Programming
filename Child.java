
class Parent {
public String name;

public Parent(String name) {
	this.name=name; //
	
}
}

public class Child extends Parent {
	private int StudentNo;
	
	public Child(String name,int studentNo) {
		super(name);//������ this.name=name; ���� =super(name)���� ���� 
		this.StudentNo=studentNo;
	}
}
