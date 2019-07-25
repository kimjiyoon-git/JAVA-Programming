class People{
	public String name, ssn;
	public People(String name, String ssn) {
		this.name=name;
		this.ssn=ssn;
		
	}
	
}

class Student extends People{
	public int studentNo;
	public Student(String name, String ssn,int studentNo) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
		this.studentNo=studentNo;
	}
}
public class StudntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("ȫ�浿","123456-444445",10);
		System.out.println("name: "+ student.name);
		System.out.println("ssn: "+ student.ssn);
		System.out.println("studentNo: "+ student.studentNo);

	}

}
