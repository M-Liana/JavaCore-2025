package chapters.chapter8;

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb= new A();
        B subOb= new B();
        superOb.i = 10;
        superOb.j=20;
        System.out.println(" superOb.i and superOb.j  "+ superOb.i +" " +superOb.j);
        superOb.showij();
        System.out.println();
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("subOb.i and subOb.j"+" "+ subOb.i +" "+subOb.j);
        subOb.showK();
        System.out.println();
        subOb.sum();
    }
}
