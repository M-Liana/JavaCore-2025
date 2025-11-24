package homeworks.homework6;

public class Stack {
    private int[] array = new int[10];
    private int size;

    Stack() {
        size = -1;

    }

    public void push(int item) {
        if (size == array.length-1) {
            System.out.println("Stack is full");
        }
        array[++size] = item;
    }

    public int pop() {
        if (size == -1 ) {
            System.out.println("Stack is empty");
         return -1;
        } else {
            return array[size--];
        }

    }
}
