package chapters.chapter7;

public class Stack {
    private int stck[];
    private int tos;

    Stack(int size){
        stck=new int[size];
        tos=-1;
    }
    void push(int item){
        if (tos==stck.length-1){
            System.out.println("Stack is full");
        }else{
            stck[++tos]=item;
        }
    }
    int pop(){
        if (tos<0){
            System.out.println("stack is empty");
            return -1;
        }
        return stck[tos--];
    }
}
