
public class helloex {
	public static void main(String[] args) throws CloneNotSupportedException{ // 이게 없음 디버그 불가능! 밑에 두 줄과 관련 있음
		
		hello h = new hello();
		hello i=(hello)h.clone(); // hello는 형변환.
	}
}
