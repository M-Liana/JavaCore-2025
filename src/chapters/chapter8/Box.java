package chapters.chapter8;

public class Box {

    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box(){

    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(){
        return  width*height*depth;
    }
}
