class Data {
}

class DataObject extends Object {
}

public class DataObjectMain {
    public static void main(String[] args){
        Data d = new Data();
        DataObject d2 = new DataObject();
        System.out.println("Data:" + d.toString());
        System.out.println("DataObject" + d2.toString());
    }
}
