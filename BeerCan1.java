abstract class EmptyCan{
	public abstract void printContent();
	public abstract void printName();
	
}

public class BeerCan1 extends EmptyCan {
	
public void printContent(){
    System.out.println("�����");
}
//EmptyCan�� printName() ����
public void printName(){
    System.out.println("����ĵ�Դϴ�.");
}
//���ο� ��� �޼��� �߰�
public void sayHello(){
    System.out.println("�ȳ��ϼ��� 26�Ͽ� ���� �ܼ�Ʈ ���ϴ�.");
}

public static void main(String args[]){
    BeerCan1 b = new BeerCan1();
    b.printContent();
    b.printName();
    b.sayHello();
} 




}
