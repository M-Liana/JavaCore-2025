package chapters.chapter8;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figureF;

        figureF=r;
        System.out.println(" area == "+ figureF.area());
        figureF=t;
        System.out.println(" area == "+ figureF.area());
        f=r;
        System.out.println(f.area());

    }
}
