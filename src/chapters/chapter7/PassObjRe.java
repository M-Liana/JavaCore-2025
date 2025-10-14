package chapters.chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b  մինչև կանչելը  " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ab.b օբեկտի կանչելուց հետո " + ob.a+" "+ ob.b);

    }
}
