public class StringEqualsMain{
    public static void main(String[] args){
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");
        //����� false�� �ȴ�.
        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s2="+s2);
        System.out.println("s2="+s1.hashCode());
        System.out.println("s2="+s2.hashCode());
        
        
        System.out.println("s1="+s1+"  "+s1.getClass());
        System.out.println("s2="+s1.getClass().getName()+"  "+s1.hashCode());
        System.out.println("s2="+s2.getClass().getName()+"  "+s2.hashCode());
        
        //����� true�� �ȴ�.
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
    } //end of main
} //end of StringEqualsMain
