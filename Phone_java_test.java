import java.util.Scanner;
public class Phone{
    private String name, tel; 
    public Phone(String name, String tel) {
      this.name=name;
      this.tel = tel;
    }
    public String getName(){
      return name;
    }
    public String getTel(){
      return tel;
    }
    
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//ù ��° ��� 
    	System.out.println("�̸��� ��ȭ ��ȣ�� �Է��ϼ��� ");
    	Phone oneperson = new Phone(sc.next(),sc.next());
    	
    	//�ι�° ���
    	System.out.println("�̸��� ��ȭ ��ȣ�� �Է��ϼ��� ");
    	Phone twoperson = new Phone(sc.next(),sc.next());
    	
    	System.out.println(oneperson.name+"�� ��ȣ��"+oneperson.tel );
    	System.out.println(twoperson.name+"�� ��ȣ��"+twoperson.tel );
    }
}