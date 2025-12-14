package chapters.chepter14;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T>
    boolean IsIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Integer[]nums={1,2,3,4,5};
        if (IsIn(2,nums)){
            System.out.println("2 is in the nums");
        }
        if (!IsIn(7,nums)){
            System.out.println("in the nums there is not 7");
        }
    }
}

