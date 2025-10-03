package homework1.homework2;

public class FigurePainter {

    public void figureOne(char c ,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( c +" ");

            }
            System.out.println();
        }
    }

    public void figureTwo(char c ,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(c +" ");

            }
            System.out.println();
        }
    }

    public void figureThree(char c , char c1,int m,int n) {
        for (int i = 0; i < n; i++) {       //n=5
            for (int j = m; j > i; j--) {          //j=4
                System.out.print(c1);           //c1=" "
                 }
            for (int k = 0; k <= i; k++) {
                System.out.print(c);

            }
            System.out.println();
        }
    }

    public void figureFour() {
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public void figureFive() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");


            }
            for (int k = 0; k < i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}





