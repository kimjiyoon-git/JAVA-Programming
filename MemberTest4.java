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

public class MemberTest4 {
public static void main(String[] args){
	
MemberService memberservice = new MemberService();
Scanner sc=new Scanner(System.in);

System.out.println("�α����� �Ͻǰǰ���?(1:��, 2: �ƴϿ�)");
String a = sc.next();


System.out.println("id�� �Է��ϼ���");
String inputid=sc.next();

System.out.println("password�� �Է��ϼ���");
String inputpw=sc.next();



boolean result =  memberservice.login(inputid,inputpw);
if(result) {
	System.out.println("�α��� �Ǿ����ϴ�");
	memberservice.logout("hong");
}else {
		System.out.println("�α��ο� �������� ���Ͽ����ϴ�.");
	}
}

}

	
