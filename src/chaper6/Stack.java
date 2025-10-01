package chaper6;

public class Stack {
    int[] array = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Sack is full");
        } else {
            array[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println(" stack is empty");
            return 0;

        }
        return array[tos--];
    }
}
