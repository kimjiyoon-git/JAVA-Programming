
/**
   VideoShop Ŭ������ �׽�Ʈ�ϴ� ��
   **/
   public class VideoShopMain{
       public static void main(String[] args){
           String temp;
           VideoShop vs = new VideoShop(); //���� ���� ����
           System.out.println("������ ���� ������ " + vs.getCount());
           //1. 3���� ���� �ݳ�
           vs.enQueue("��Ʈ����1"); //���� �ݳ�
           vs.enQueue("��Ʈ����2"); //���� �ݳ�
           vs.enQueue("��Ʈ����3"); //���� �ݳ�
           System.out.println("������ ���� ������ " + vs.getCount());

         //2. 3���� ���� ���� ��
           temp = vs.deQueue(); System.out.println(temp + " ����");
           temp = vs.deQueue(); System.out.println(temp + " ����");
           temp = vs.deQueue(); System.out.println(temp + " ����");
           System.out.println("������ ���� ������ " + vs.getCount());
       } //end of main
   } //end of VideoShopMain class
