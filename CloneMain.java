import java.util.Vector;

public class CloneMain {    
    public static void main(String[] args){
        Vector v = new Vector();
        v.addElement(new String("Hello World"));
        v.addElement(new String("������ ��"));
        Vector s = (Vector)v.clone();
        s.addElement(new String("���纻�� �߰�")); // �迭������ 2���� s�� �迭������ 3���� �ؽ��ڵ尡 �ٸ��Ƿ� �ؿ� 16��° ����  false
        System.out.println("Vector v:" + v);
        System.out.println("Vector s:" + s);
        
        System.out.println(v.hashCode());
        System.out.println(v.elementAt(0).hashCode());
        System.out.println(v.elementAt(1).hashCode());
        
        
        System.out.println(s.hashCode());
        System.out.println(s.elementAt(0).hashCode());
        System.out.println(s.elementAt(1).hashCode());
        
        
        System.out.println(v.equals(s)); //  hashcode ������  true / �ƴϸ�  false
        
        
    } //end of main
} //end of CloneMain class
