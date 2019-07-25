import java.io.FileWriter;
import java.io.IOException;

class FinalMan{
    private FileWriter fr = null;
    public FinalMan(String filename) throws IOException{
        fr = new FileWriter(filename);    }
    public void writeData(String str) throws IOException{
        this.fr.write(str);    }
    protected void finalize() throws Throwable, IOException{
        //finalize()�� ���� �������� ���� ���
        Thread t = Thread.currentThread();
        System.out.println("finalize()�� ������: " + t );
        if (fr != null){
            fr.close();
        }        System.out.println("finalize()�� ���� �ݱ�");
        super.finalize();        
    } //end of main
} //end of FinalMan

public class FinalManMain2{
    public static void main(String[] args) throws Exception{
        System.out.println("���α׷� ����");
        {
            FinalMan fm = new FinalMan("finalize.dat");
            fm.writeData("�ȳ��ϼ���");
            fm.writeData("Hello");
            fm = null;
        }
        //main()�� ���� �������� ���� ���
        Thread t = Thread.currentThread();
        System.out.println("main()�� ������: " + t );
        System.gc(); //�������� ������ �ݷ��� ������Ű��
        System.out.println("���α׷� ����");
    } //end of main
} //end of FinalManMain2 c

