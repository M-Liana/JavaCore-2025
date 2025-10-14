package chapters.chapter7;

public class CallMyByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15;
        int b = 20;
        System.out.println(" a  and b " + a + " " + b);
        ob.meth(a, b);
        System.out.println(" a  and b " + a + " " + b);

    }
}
