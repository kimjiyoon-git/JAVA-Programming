public class Pitcher1 implements BodySign1 {
       //�������̽��� �߻� �޼��� ����
       public void throwBall(int how){
           if(how == BodySign1.CENTER){
               System.out.println("Center�� �����ϴ�.");
           }else if(how == BodySign1.LEFT){
               System.out.println("Left�� �����ϴ�.");
           }else if(how == BodySign1.RIGHT){
               System.out.println("Right�� �����ϴ�.");
           }else if(how == BodySign1.DOWN){
               System.out.println("Down���� �����ϴ�.");
           }else if(how == BodySign1.UP){
               System.out.println("Up���� �����ϴ�.");
           }else{
               System.out.println("�̻��� ���Դϴ�.");           }

       }
           public static void main(String[] args){
               Pitcher1 p = new Pitcher1(); //��ü ����
               //1. static final ������ �̿�
               p.throwBall(BodySign1.CENTER); //final static ������ ���
               p.throwBall(BodySign1.LEFT); //final static ������ ���
               p.throwBall(BodySign1.RIGHT); //final static ������ ���
               p.throwBall(BodySign1.DOWN); //final static ������ ���
               p.throwBall(BodySign1.UP); //final static ������ ���

               //2. ��� ��ü�� �̿��ϴ� ��
               p.throwBall(1);
               p.throwBall(2);
               p.throwBall(3);
               p.throwBall(4);
               p.throwBall(5);
               p.throwBall(1000); //������ ���� �̿�
           } //end of main
       } //end of Pitcher class
