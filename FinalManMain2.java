import java.io.FileWriter;
import java.io.IOException;

class FinalMan{
    private FileWriter fr = null;
    public FinalMan(String filename) throws IOException{
        fr = new FileWriter(filename);    }
    public void writeData(String str) throws IOException{
        this.fr.write(str);    }
    protected void finalize() throws Throwable, IOException{
        //finalize()가 속한 스레드의 정보 출력
        Thread t = Thread.currentThread();
        System.out.println("finalize()의 스레드: " + t );
        if (fr != null){
            fr.close();
        }        System.out.println("finalize()의 파일 닫기");
        super.finalize();        
    } //end of main
} //end of FinalMan

public class FinalManMain2{
    public static void main(String[] args) throws Exception{
        System.out.println("프로그램 시작");
        {
            FinalMan fm = new FinalMan("finalize.dat");
            fm.writeData("안녕하세요");
            fm.writeData("Hello");
            fm = null;
        }
        //main()이 속한 스레드의 정보 출력
        Thread t = Thread.currentThread();
        System.out.println("main()의 스레드: " + t );
        System.gc(); //수동으로 가비지 콜렉터 구동시키기
        System.out.println("프로그램 종료");
    } //end of main
} //end of FinalManMain2 c

