import java.util.Scanner;
class MemberService {
	boolean login(String id, String Password ) {
		if(id.equals("hong") && Password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
       void logout(String id){
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
}

public class MemberTest2 {
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	MemberService memberservice = new MemberService();
	System.out.println("id : ");
	String intid=sc.next();
	
	System.out.println("password: ");
	String inpassword=sc.next();
	
	boolean result =  memberservice.login("hong","12345");
	if(result) {
		System.out.println("�α��� �Ǿ����ϴ�");
		memberservice.logout("hong");
	}else {
			System.out.println("�α��ο� �������� ���Ͽ����ϴ�.");
		}
	}
	
}
