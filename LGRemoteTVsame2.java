   /**
   �߻� Ŭ������ �����ϴ� ��
   **/
   public class LGRemoteTV extends RemoteTV{
       //�߻� �޼��� ������
       public void channelDown(){
           nChannel--; //nChannel�� protected�� ����
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
