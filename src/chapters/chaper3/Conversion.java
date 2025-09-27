package chapters.chaper3;

public class Conversion {
    public static void main(String[] args) {
        byte b ;
        int i =257;
        double d=323.142;
        System.out.println("\n conversion int to byte");
        b= (byte) i;
        System.out.println("i and b  :"+ i +" " + b);
        System.out.println("double conversion to byte");
        b=(byte)323.142;
        System.out.println("b and d is"+" "+ b+" "+d);
    }
}
