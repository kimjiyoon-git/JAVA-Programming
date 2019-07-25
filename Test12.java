public class Test12 {
    private static final String Null = null;

	public static void main(String[] args) {
        String string_value;

       Integer integer1= new Integer(10);
       Integer integer2= new Integer("20");
       
       Double double1 = new Double(10.5);
       Double double2 = new Double("20.5");
       
       Integer unboxing_integer;
       
       string_value=Double.toString(double1);
       System.out.println("string_value");
       System.out.println();
      
       string_value=Double.toString(double2);
       System.out.println("string_value");
       System.out.println();
       
       Integer integer3=Integer.parseInt(integer1.toString());
       System.out.println(integer3);
       System.out.println();
       
       string_value=integer2.toBinaryString(integer2);
       System.out.println("string_value");
       System.out.println();
      
       string_value=integer2.toOctalString(integer2);
       System.out.println("string_value");
       System.out.println();
       
       string_value=integer2.toHexString(integer2);
       System.out.println("string_value");
       System.out.println();
       
       unboxing_integer=55;
       
       Integer integer4=new Integer(integer1.valueOf(unboxing_integer+2));
       
       System.out.println(integer4);
       System.out.println();
       
       String bin=Null;
       
	System.out.println("2진수"+ Integer.valueOf(bin,2));
       String oct=Null;
	System.out.println("8진수"+ Integer.valueOf(oct,8));
       String hex=Null;
	System.out.println("16진수"+ Integer.valueOf(hex,16));
        
}
}