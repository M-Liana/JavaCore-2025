package chapters.chaper6;

public class BoxDemo {

    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        vol = myBox.width * myBox.depth * myBox.height;
        System.out.println(" vol is " + vol);


    }
}
