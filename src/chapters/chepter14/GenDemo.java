package chapters.chepter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> Iob;
        Iob= new Gen<>(88);
        Iob.showType();
        int v = Iob.getOb();
        System.out.println("meaning  is : "+ v);

        Gen<String>strOb= new Gen<>("hello");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println(str);

    }
}
