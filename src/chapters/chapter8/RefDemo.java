package chapters.chapter8;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight weightBox= new BoxWeight(3,5,7,8.37);
        Box plainBox = new Box();
        double vol;
        vol= weightBox.volume();
        System.out.println(" vol weigthBox ==  "+ vol);
        System.out.println(" weihth of weigthBox== "+ weightBox.weight);
        System.out.println();
        plainBox=weightBox;
        vol=plainBox.volume();
        System.out.println("vol is plaonbox== "+ vol);
      //  System.out.println(((BoxWeight) plainBox).weight);
    }
}
