class EX2{
    class InstanceInner{
        int a = 100;
	    
  	    final static int c = 100; // final static�� ���ÿ� ���� ������ ����̹Ƿ� ��밡�� 
    }
	static class StaticInner{
	    int a = 200;
        static int b = 200;  //����ƽ Ŭ����(static class)������  staitc������� ����
    }
    InstanceInner a = new InstanceInner(); // �ν��Ͻ� ��� ������ ���� ���ٰ���
    static  StaticInner b = new StaticInner(); // ����ƽ ��� ���� ���� ���� ����

    static void staticMethod(){ 
    
    StaticInner bb = new StaticInner();
    }

    void instanceMethod(){  //�ҹ���(��) l  �빮��(����) I 
    InstanceInner aa = new InstanceInner(); //�ν��Ͻ� ��� ���� ����
    StaticInner bb = new StaticInner();  //����ƽ ��� ���� ����
  
    }

    void myMethod(){
        class LocalInner{
 	        int a = 300;
	       
            final static int c = 300; // final static�� ���ÿ� ���� ������ ����̹Ƿ� ��밡��
	       }
	}
    public static void main(String args[]) {
        System.out.println(InstanceInner.c);
        System.out.println(StaticInner.b);
	}
}