package homework1.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dy =new DynamicArray();
        dy.add(44);
        dy.add(98);
        dy.add(55);
        dy.add(66);
        dy.add(66);
        dy.add(66);
        dy.add(28);
        dy.print();
        System.out.println();
        dy.add(28);
        dy.add(28);
        dy.add(99);
        dy.add(99);
        dy.add(100);
        dy.print();
        System.out.println();
        System.out.println(dy.getByIndex(6));
        System.out.println(dy.getByIndex(466));



    }
}
