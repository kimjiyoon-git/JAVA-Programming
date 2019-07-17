
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] score= {{60,70,80},{70,80,90},{100,100,100}};
		int[] student= new int[3];
		int []subject=new int[3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				student[i]=student[i]+score[i][j];
			}
				System.out.println("ÃÑÁ¡Àº"+student[i]);
			}
		}
	}

