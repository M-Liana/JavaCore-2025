package chapters.chepter14;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj= new TwoGen<>(88,"Gen ");
        tgObj.showType();
        Integer ob1 = tgObj.getOb1();
        System.out.println(ob1);
        String ob2 = tgObj.getOb2();
        System.out.println(ob2);
    }
}
