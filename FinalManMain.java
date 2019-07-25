import java.io.*;
    class FinalMan{
        private FileWriter fw = null;
        public FinalMan(String filename) throws IOException{
            this.fw = new FileWriter(filename);
        }
        public void writeData(String str) throws IOException{
            this.fw.write(str);
        }
        protected void finalize() throws Throwable, IOException{
            if (this.fw != null){
                this.fw.close();
            }
            System.out.println("finalize()�� ���� �ݱ�");        
            super.finalize();
        }
    } //end of FinalMan

    public class FinalManMain{
        public static void main(String[] args) throws Exception{
            System.out.println("���α׷� ����");
            //�ܼ����
            {
                FinalMan fm = new FinalMan("finalize.dat");
                fm.writeData("�ȳ��ϼ���");
                fm.writeData("Hello");
                fm = null;
            }
            System.gc(); //������ �ݷ��� ����
            System.out.println("���α׷� ����");
        } //end of main
    } //end 
