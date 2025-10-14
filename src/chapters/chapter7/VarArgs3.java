package chapters.chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {

        System.out.println(" vaTest(int...) :"+" counts of arguments: "+ v.length+" content");
        for (int x : v) {
            System.out.print(x+" ");
            System.out.println();

        }

    }
    static void vaTest(boolean...v){
        System.out.print("boolean  ...v  :"+ " counts of arguments "+ v.length+" content");
        for (boolean b : v) {
            System.out.print(b + " ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        vaTest(1,1,3);
        vaTest(false,false,true);
    }
}