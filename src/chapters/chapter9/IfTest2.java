package chapters.chapter9;

public class IfTest2 {
    public static void main(String[] args) {
        DynStack myStack= new DynStack(5);
        DynStack myStack1= new DynStack(8);
        for (int i = 0; i < 12; i++) {
            myStack.push(i);

        }
        for (int i = 0; i < 20; i++) {
           myStack1.push(i);

        }
        System.out.println(" stack in myStck is ");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack.pop());
        }

        System.out.println("stack in myStack1 is ");
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack1.pop());
        }

    }
}
