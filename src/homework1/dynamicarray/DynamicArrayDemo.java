package homework1.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
DynamicArray dy = new DynamicArray();
dy.add(1);
dy.add(2);
dy.add(33);
dy.add(33);
dy.add(33);
dy.add(55);
dy.add(56);
dy.add(88);
dy.add(88);
dy.add(8899);
dy.print();
        System.out.println();
        dy.add(8899);
        dy.add(8899);
        dy.add(8899);
        dy.print();

    }
}
