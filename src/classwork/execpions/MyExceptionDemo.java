package classwork.execpions;

public class MyExceptionDemo {
    public static void main(String[] args)  {

        try {
            meth();
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }
        public static void meth () throws MyException {
            throw new MyException();
        }



}
