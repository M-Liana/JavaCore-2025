package chapters.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        Apple[] apples = Apple.values();
        for (Apple apple : apples) {
            System.out.println(apple + " ");

        }

ap= Apple.valueOf("Winesap");
        System.out.println("ap is "+ap);
    }
}
