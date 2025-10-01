package chaper6;

public class BoxConstructor {
    double width;
    double height;
    double depth;

    BoxConstructor() {
        System.out.println(" constructor is ");
        width = 10;
        height = 20;
        depth = 15;
    }
    double volume(){
        return  width*height*depth;
    }
}
