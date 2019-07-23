   /**
   추상 클래스를 구현하는 예
   **/
   public class LGRemoteTV extends RemoteTV{
       //추상 메서드 재정의
       public void channelDown(){
           nChannel--; //nChannel은 protected로 선언
           System.out.println("TV Channel Down " + nChannel);
       } 	
       public static void main(String[] args){
           LGRemoteTV tv = new LGRemoteTV();
           tv.powerOn();
           tv.channelUp();
           tv.channelDown();
           tv.powerOff();
       } //end of main
   } // end of LGRemoteTV class
