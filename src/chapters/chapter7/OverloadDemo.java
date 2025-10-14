package chapters.chapter7;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ov= new Overload();
        int i=88;
        double result;
        ov.test();
        ov.test(10);
        ov.test(10,20);
        result= ov.test(125.5);
        System.out.println("result "+result);
        ov.test(i);
        ov.test(i);
    }
}
