package chapters.chaper6;

public class BoxDemo6 {

    public static void main(String[] args) {

        BoxConstructor bc = new BoxConstructor();
        BoxConstructor bc1 = new BoxConstructor();
        double vol ;
        vol = bc.volume();
        System.out.println(" vol bc == "+ vol);
        System.out.println("bc1 vol is "+bc1.volume());
        System.out.println(bc.volume());


    }
}
