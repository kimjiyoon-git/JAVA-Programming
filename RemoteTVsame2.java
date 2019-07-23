/**
   �������̽��� ���� �������� �ʾƼ� �ٽ� �߻� Ŭ������ �Ǵ� ����
   **/
   public abstract class RemoteTV implements IRemoteControl{
       protected int nChannel = 0;
       protected boolean bPower = false;
       public void powerOn(){ //�߻� �޼��� ������
           bPower = true;
           System.out.println("TV ���� On!");    
       }
       public void powerOff(){ //�߻� �޼��� ������
           bPower = false;
           System.out.println("TV ���� Off!");    
       } 	

       public void channelUp(){ //�߻� �޼��� ������
           nChannel++;
           System.out.println("TV Channel Up " + nChannel);
       }
   } // end of RemoteTV abstract class

       