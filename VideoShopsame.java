
   /**
   IQueue�� Shop�� ���ÿ� ����ϰ� ������ ��
   **/
   public class VideoShop extends Shop implements IQueue{
       public void enQueue(String video){
           System.out.println(video + "�ݳ�");
           this.store.addElement(video);    
       }
       public String deQueue(){
           return (String)this.store.remove(0);
       }
   } //end of VideoShop class

