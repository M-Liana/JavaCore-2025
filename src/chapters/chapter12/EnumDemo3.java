package chapters.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println(Apple.Winesap.getPrice());
        System.out.println("price of All apples");
        Apple[] apples = Apple.values();
        for (Apple apple : apples) {
            System.out.println(apple.getPrice() + " ");

        }
        for (Apple apple : Apple.values()) {
            System.out.print(apple + " "+ apple.getPrice());
            System.out.println(apple.ordinal());


        }
        System.out.println();
    }
}
