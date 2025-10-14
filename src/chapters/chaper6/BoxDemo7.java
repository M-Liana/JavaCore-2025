package chapters.chaper6;

public class BoxDemo7 {

    public static void main(String[] args) {
        BoxConst2 bc2 = new BoxConst2(10,20,15);
        BoxConst2 bc3 =new BoxConst2(3,6,9);
        double vol ;
        vol=bc2.volume();
        System.out.println("bc2 vol is "+ vol);
        System.out.println( "bc3 vol is " + bc3.volume());
    }
}
