package chapters.chapter12;

public class EnumDemo {

    public static void main(String[] args) {
Apple ap;
ap=Apple.RedDel;
        System.out.println(" ap is :" + ap);
        System.out.println();
        ap = Apple.Golden;
        if (ap==Apple.Golden){
            System.out.println("ap is Golden");
        }
        switch (ap){
            case Jonathan :
                System.out.println("Jonathan is red");
            break;
            case Golden:
                System.out.println("golden is yellow");
                break;
            case Winesap:
                System.out.println("winesap is red");        }
    }
}
