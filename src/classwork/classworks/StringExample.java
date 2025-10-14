package classwork.classworks;


import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input numbers.(ex 1,2,3)");
        String numbersStr = scanner.nextLine();
        String[] numbersArrStr = numbersStr.split(",");
        int[] array = new int[numbersArrStr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersArrStr[i]);

        }
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("max == " + max);




//        System.out.println("please input lemgth of array");
//        int length = Integer.parseInt(scanner.nextLine());
//        int[] array = new int[length];
//
//        System.out.println("please input "+length + " numbers");
//        for (int i = 0; i < length; i++) {
//            String numberStr = scanner.nextLine();
//            int number = Integer.parseInt(numberStr);
//            array[i] = number;
//        }

//        String s= "54.8";
//        double d = Double.parseDouble(s);
//        System.out.println(d);
//        String a = "54";
//        Integer b = 20;
//        int[] array = new int[5];
//        int n = Integer.parseInt(a);
//        int m = Integer.parseInt(a);
//        array[4] = m;
//        array[0] = n;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        System.out.print(array[0] + " ");

    }
}
