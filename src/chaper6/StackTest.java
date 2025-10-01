package chaper6;

public class StackTest {

    public static void main(String[] args) {
        Stack myStck = new Stack();

        myStck.push(5);
        myStck.push(3);
        myStck.push(9);
        System.out.println(myStck.pop());
        myStck.pop();
        System.out.println(myStck.pop());
        System.out.println(myStck.pop());
    }
}
