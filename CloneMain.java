import java.util.Vector;

public class CloneMain {    
    public static void main(String[] args){
        Vector v = new Vector();
        v.addElement(new String("Hello World"));
        v.addElement(new String("원본의 글"));
        Vector s = (Vector)v.clone();
        s.addElement(new String("복사본에 추가")); // 배열식으로 2개고 s는 배열식으로 3개로 해쉬코드가 다르므로 밑에 16번째 줄이  false
        System.out.println("Vector v:" + v);
        System.out.println("Vector s:" + s);
        
        System.out.println(v.hashCode());
        System.out.println(v.elementAt(0).hashCode());
        System.out.println(v.elementAt(1).hashCode());
        
        
        System.out.println(s.hashCode());
        System.out.println(s.elementAt(0).hashCode());
        System.out.println(s.elementAt(1).hashCode());
        
        
        System.out.println(v.equals(s)); //  hashcode 같으면  true / 아니면  false
        
        
    } //end of main
} //end of CloneMain class
