import java.util.Vector;

public class ShallowCloneMain {    
    public static void main(String[] args){
        Vector v = new Vector();
        v.addElement(new String("Hello World"));
        v.addElement(new String("원본의 글"));
        Vector s = (Vector)v.clone();
        System.out.println("v-0 참조값:" + v.elementAt(0).hashCode());
        System.out.println("v-1 참조값:" + v.elementAt(1).hashCode());
        System.out.println("s-0 참조값:" + s.elementAt(0).hashCode());
        System.out.println("s-1 참조값:" + s.elementAt(1).hashCode());
        
        
        
        System.out.println(v.equals(s));
    } //end of main
} //end of ShallowCloneMain class
