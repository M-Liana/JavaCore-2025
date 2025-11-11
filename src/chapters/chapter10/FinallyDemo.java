package chapters.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println(" in body of meth");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("block op finally in meth procA");
        }
    }

    static void procB() {
        try {
            System.out.println(" in the body of procB");
            return;
        } finally {
            System.out.println("Blol op in finally procB");

        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }catch (Exception e){
            System.out.println("the ex is find");
        }
        procB();
    }
}