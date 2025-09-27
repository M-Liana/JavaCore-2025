package chapters.chaper5;

public class StringSwitch {

    public static void main(String[] args) {
        String stringValue= "two";
        switch (stringValue){
            case"one":
                System.out.println("one");
                break;
            case"two":
                System.out.println("str before " + stringValue);
                stringValue ="poxos";
                System.out.println("changed str value " + stringValue);
                break;
            case "three":
                stringValue="three";
                System.out.println(stringValue);
                break;
            default:
                System.out.println("it doesn't match");
                break;
        }
    }
}
