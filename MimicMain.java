class Mimic extends Object implements Cloneable{ //Cloneable ���
    private int id;
    private String name;
    public Mimic(int id, String name){
        this.id = id;   this.name = name;
    }
    //clone() �޼����� ������
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); //Object�� clone()�� �̿��� �޸� ����
    }
    //toString() �޼����� ������
    public String toString(){
        return this.id + ":" +  this.name;
    }
} //end of Mimic class


public class MimicMain{
    public static void main(String[] args) throws CloneNotSupportedException{
        Mimic m = new Mimic(1000, "ȣ����"); //��ü ����
        Mimic n = (Mimic)m.clone(); //���縦 ���� �޼��� ���
        System.out.println(m.hashCode() + " " + m); //������ ���
        System.out.println(n.hashCode() + " " + n); //������ ���
    } //end of main
} //end of MimicMain class
