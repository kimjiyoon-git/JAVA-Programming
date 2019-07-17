import java.util.Random;
public class packagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[10];
		int rannum = 0;
		boolean cheak;
		
		Random myrandom = new Random();
		for(int i =0; i<array.length; i++) {
			rannum=myrandom.nextInt(10);
			cheak = true;
			
			for(int j =0; j<i; j++) {
				if(array[j] == rannum) {
					i--;
					cheak = false; }
				
				
			}
			if(cheak)
				array[i]=rannum;
			}
		for(int i =0; i<array.length; i++)
			System.out.println(array[i]+ " ");
		  System.out.println();
		  
	}

}

