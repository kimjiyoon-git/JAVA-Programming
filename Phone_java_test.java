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
    	
    	//첫 번째 사람 
    	System.out.println("이름과 전화 번호를 입력하세요 ");
    	Phone oneperson = new Phone(sc.next(),sc.next());
    	
    	//두번째 사람
    	System.out.println("이름과 전화 번호를 입력하세요 ");
    	Phone twoperson = new Phone(sc.next(),sc.next());
    	
    	System.out.println(oneperson.name+"의 번호는"+oneperson.tel );
    	System.out.println(twoperson.name+"의 번호는"+twoperson.tel );
    }
}