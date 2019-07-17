public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0;
		
		while(true) {
		if(sum>100) {
			break;

		}
			i++;
			sum=sum+i;
		}
	
	    System.out.println("i="+ i); // 1~14번 하면 값 105가 나옴 
		System.out.println("sum ="+ sum);
	  

		
		
}
}

