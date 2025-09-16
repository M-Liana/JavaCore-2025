package homework1.homework3;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(numbers[0]);
        System.out.println(numbers.length - 1);
        System.out.println(numbers.length);
        System.out.println();
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min =" + min);
        System.out.println();

        if (numbers.length <= 2) {
            System.out.println(" can't print middle valuse");
        }
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2] + " " + numbers[numbers.length / 2 - 1]);
        }
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[numbers.length / 2]);
        }
        System.out.println();
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }

        }
        System.out.println(" evenCount is " + evenCount);
        System.out.println();
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }

        }
        System.out.println("oddCount is " + oddCount);
        System.out.println();
        //sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];


        }
        System.out.println(" sum is " + sum);
        //Average
        int avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg = sum / numbers.length;

        }
        System.out.println(" avg ==" + avg);
    }

}



