package homework1.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dy =new DynamicArray();
        dy.add(44);
        dy.add(98);
        dy.add(55);
        dy.add(66);
        dy.print();

//        dy.print();
//
//        System.out.println(dy.getByIndex(1));
//        System.out.println(dy.exists(66));
//        System.out.println(dy.exists(56));
//        dy.set(1,999);
//        dy.add(1,10);

        dy.print();
        dy.deleteByIndex(1);
        dy.print();

    }
}
