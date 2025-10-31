package chapters.chapter9;

public class IfTest {
    public static void main(String[] args) {
        FixedStack myStck = new FixedStack(5);
        FixedStack myStck1= new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            myStck.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStck1.push(i);
        }
        System.out.println(" stackin myStck is  ");

        for (int i = 0; i < 5; i++) {
            System.out.println(myStck.pop());

        }
        System.out.println("stack in myStck1 is ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStck1.pop());
        }
    }
}
