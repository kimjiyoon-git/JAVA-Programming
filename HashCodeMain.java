class HashMan{
    //내용없음
} //end of HashMan 

    public class HashCodeMain {
    public static void main(String[] args){
        HashMan h1 = new HashMan();
        HashMan h2 = new HashMan();
        System.out.println(h1 + ": " + h1.hashCode());
        System.out.println(h2 + ": " + h2.hashCode());
    } //end of main
} //end of HashCodeMain
