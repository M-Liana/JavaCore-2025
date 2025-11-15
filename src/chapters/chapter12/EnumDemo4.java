package chapters.chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
    Apple ap,ap2,ap3;
        System.out.println("All apples");
        for (Apple a  : Apple.values()) {
            System.out.println(a + " "+ a.ordinal());

        }
        ap=Apple.RedDel;
        ap2=Apple.Golden;
        ap3=Apple.RedDel;
        System.out.println();
        if (ap.compareTo(ap2)>0){
            System.out.println(ap +"preceded " +ap2);
        }
        if (ap.compareTo(ap3)==0){
            System.out.println(ap+" == "+ap3);
        }
        if (ap.equals(ap3)){
            System.out.println(ap + " == "+ap3);
        }
    }
}
