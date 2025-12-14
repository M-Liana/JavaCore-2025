package chapters.chepter14;

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[]inums= {1,2,3,4,5};
        Character[]chs={'b','r','p','w'};

        MyClass<Integer>iob= new MyClass<>(inums);
        MyClass<Character>cob=new MyClass<>(chs);
        System.out.println(iob.max());
        System.out.println(iob.min());
        System.out.println(cob.max());
        System.out.println(cob.min());
    }
}
