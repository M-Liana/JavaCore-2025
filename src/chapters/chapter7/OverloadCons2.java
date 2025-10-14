package chapters.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box myBox1= new Box(10,20,15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        Box myClone= new Box(myBox1);
      double  vol = myClone.volume();
        System.out.println("myClone vol == "+ vol);
    }
}
