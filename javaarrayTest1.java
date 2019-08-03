


import java.util.Scanner;
public class javaarrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a[]= new int[10];
		System.out.println("숫자 10개를 입력하세요");
		
	
		int i;
		for(i=0; i<a.length;i++) {
		a[i]=sc.nextInt();
		
		}
		for(i=0; i<a.length;i++) {
			if(a[i]%3==0)
				System.out.println(a[i]);
		}
	}
}


