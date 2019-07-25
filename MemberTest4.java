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
	System.out.println("로그아웃 되었습니다");
}
}

public class MemberTest4 {
public static void main(String[] args){
	
MemberService memberservice = new MemberService();
Scanner sc=new Scanner(System.in);

System.out.println("로그인을 하실건가요?(1:네, 2: 아니요)");
String a = sc.next();


System.out.println("id를 입력하세요");
String inputid=sc.next();

System.out.println("password를 입력하세요");
String inputpw=sc.next();



boolean result =  memberservice.login(inputid,inputpw);
if(result) {
	System.out.println("로그인 되었습니다");
	memberservice.logout("hong");
}else {
		System.out.println("로그인에 성공하지 못하였습니다.");
	}
}

}

	
