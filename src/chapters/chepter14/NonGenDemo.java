package chapters.chepter14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen ob;
        ob= new NonGen(88);
        ob.showType();
        int  v= (Integer) ob.getOb();
        System.out.println(v);

    }
}
