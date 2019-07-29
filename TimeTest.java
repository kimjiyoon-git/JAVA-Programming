
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start,finish;
		
		start=System.nanoTime();
		int sum=0;
		int i;
		
		
		for(i=1;i<=100;i++)
			sum=sum+i;
		
		System.out.println(sum);
		finish=System.nanoTime();
		System.out.println((double)(finish-start)/1000000000);
	}

}
 