package chapters.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 myBox1= new BoxWeight1(10,20,15,34.3);
        BoxWeight1 myBox2= new BoxWeight1(2,3,4,0.076);
        BoxWeight1 myBox3= new BoxWeight1();
        BoxWeight1 myCube= new BoxWeight1(3,2);
        BoxWeight1 myClone = new BoxWeight1(myBox1);
        double vol;
        vol= myBox1.volume();
        System.out.println(" myBox1 . vol =="+ vol);
        vol= myClone.volume();
        System.out.println(" myClone.vol == "+ vol);
    }
}
