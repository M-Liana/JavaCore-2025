package chapters.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("del na 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ex in  array " + e);
        }
        System.out.println(" after try catch");
    }
}
