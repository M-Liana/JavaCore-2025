package chapters.chapter10;

public class Ex1 {
    public static void main(String[] args) {

        try {
                int d = 0;
                int a = 10 / d;
                System.out.println("this is not run ");
            } catch (ArithmeticException e) {
                System.out.println(" delenie na 0");
            }

            System.out.println("after catch");
        }
    }

