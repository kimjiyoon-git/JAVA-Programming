/**
   인터페이스를 전부 구현하지 않아서 다시 추상 클래스가 되는 예제
   **/
   public abstract class RemoteTV implements IRemoteControl{
       protected int nChannel = 0;
       protected boolean bPower = false;
       public void powerOn(){ //추상 메서드 재정의
           bPower = true;
           System.out.println("TV 전원 On!");    
       }
       public void powerOff(){ //추상 메서드 재정의
           bPower = false;
           System.out.println("TV 전원 Off!");    
       } 	

       public void channelUp(){ //추상 메서드 재정의
           nChannel++;
           System.out.println("TV Channel Up " + nChannel);
       }
   } // end of RemoteTV abstract class

       