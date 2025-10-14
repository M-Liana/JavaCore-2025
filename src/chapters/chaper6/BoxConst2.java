package chapters.chaper6;

public class BoxConst2 {

    double width;
    double height;
    double depth;

    BoxConst2(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;

    }

    double volume() {
        return width * height * depth;
    }
}
