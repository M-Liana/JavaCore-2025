package chapters.chaper6;

public class Box {

    double width;
    double height;
    double depth;

//    void volume() {
//        System.out.print(" vol == ");
//        System.out.println((width * height * depth));
//    }
    double volume(){
        return width *height*depth;
    }
    void setDim(double w,double h,double d){
        width = w;
        height= h;
        depth= d;
    }
}
