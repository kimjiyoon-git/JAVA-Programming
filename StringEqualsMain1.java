public class StringEqualsMain1{
    public static void main(String[] args){
        String s1 = new String("Hello World");
        String s2 = new String("Hello World");
        //결과는 false가 된다.
        System.out.println("s1 == s2 : " + (s1 == s2));
        //결과는 true가 된다.
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
    } //end of main
} //end of StringEqualsMain
