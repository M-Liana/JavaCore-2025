package chapters.chaper5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("operator help");
            System.out.println(" 1. if ");
            System.out.println(" 2.switch ");
            System.out.println(" 3.while ");
            System.out.println(" 4.do-while ");
            System.out.println(" 5.for\n");
            System.out.println("select the disiered");
            choice = (char)System.in.read();
        } while (choice < '1' || choice > 5);
        System.out.println("\n");
        switch (choice){
            case 1:
                System.out.println("if:\n");
                System.out.println("if(usl)operator");
                System.out.println("else operator");
                break;
            case 2:
                System.out.println("switch\n");
                System.out.println("switch (virajenie ) {");
                System.out.println(" case constant");
                break;
        }
    }
}
