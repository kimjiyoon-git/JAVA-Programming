public class Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0;
		
		while(true) {
			if(sum>100) {
				sum -= i;
				--i;
				break;
			}
			sum=sum+i;
			i++;
	    System.out.println("i="+ i); // 1~14�� �ϸ� �� 105�� ���� 
		System.out.println("sum ="+ sum);
	  

		
		
}
}
}