package classwork.classworks;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input name");
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        System.out.println("welcome "+ name +" " +surname);
    }

}
