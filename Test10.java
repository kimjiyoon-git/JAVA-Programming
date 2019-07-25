import java.util.Arrays;
public class Test10 {
    public static void main(String[] args) {
        String test = "Hello Java! by JAVA";

        System.out.println(test);

        String a = test.substring(12);
        System.out.println(a);
        a = test.substring(0, 12);
        System.out.println(a);
 
        String[] arr = test.split(" ");
        for(String s : arr){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(arr)); //배열은 string과 object에서 가져와서 사용 

        boolean check = test.contains("JAVA");
        System.out.println(check);
        check = test.contains("JAVA!");
        System.out.println(check);

        check = test.equals("Hello Java! by JAVA");
        System.out.println(check);
        check = test.equals("Hello Java by JAVA");
        System.out.println(check);
 
        String valueof = String.valueOf(true);
        System.out.println(valueof);
        valueof = String.valueOf('a');
        System.out.println(valueof);
        valueof = String.valueOf(250);
        System.out.println(valueof);
        valueof = String.valueOf(250L);
        System.out.println(valueof);
        valueof = String.valueOf(250f);
        System.out.println(valueof);
        valueof = String.valueOf(250.25);
        System.out.println(valueof);
        valueof = String.valueOf(true); 
        System.out.println(valueof);
    }
}

 
