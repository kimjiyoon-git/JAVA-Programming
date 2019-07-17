import operator.add. *;
import operator.sub. *;
import operator.div. *;
import operator.mul. *;

public class Calculation {

	public static void main(String[] args) {
		double num1 =3.14;
		double num2=5.5;
		
		double result;
		
		add Add=new add();
		sub Sub = new sub();
		mul Mul=new mul();
		div Div=new div();
		
		result= Add.add_cal(num1,num2);
		System.out.println(result);
		
		result= Sub.sub_cal(num1,num2);
		System.out.println(result);
		
		result= Mul.mul_cal(num1,num2);
		System.out.println(result);
		
		
		result= Div.div_cal(num1,num2);
		System.out.println(result);
		
		
		
		
	}
}
