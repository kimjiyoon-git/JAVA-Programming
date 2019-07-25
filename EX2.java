class EX2{
    class InstanceInner{
        int a = 100;
	    
  	    final static int c = 100; // final static가 동시에 붙은 변수는 상수이므로 사용가능 
    }
	static class StaticInner{
	    int a = 200;
        static int b = 200;  //스태틱 클래스(static class)에서만  staitc변수사용 가능
    }
    InstanceInner a = new InstanceInner(); // 인스턴스 멤버 간에는 서로 접근가능
    static  StaticInner b = new StaticInner(); // 스태틱 멤버 간에 서로 접근 가능

    static void staticMethod(){ 
    
    StaticInner bb = new StaticInner();
    }

    void instanceMethod(){  //소문자(엘) l  대문자(아이) I 
    InstanceInner aa = new InstanceInner(); //인스턴스 멤버 접근 가능
    StaticInner bb = new StaticInner();  //스태틱 멤버 접근 가능
  
    }

    void myMethod(){
        class LocalInner{
 	        int a = 300;
	       
            final static int c = 300; // final static가 동시에 붙은 변수는 상수이므로 사용가능
	       }
	}
    public static void main(String args[]) {
        System.out.println(InstanceInner.c);
        System.out.println(StaticInner.b);
	}
}