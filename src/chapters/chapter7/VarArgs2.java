package chapters.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.println(msg + v.length + " content");
        for (int x : v) {
            System.out.print(x+" ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        vaTest("one parametr ",10);
        vaTest("three parametrs ", 1,2,3);
        vaTest("no parametrs");
    }
}
