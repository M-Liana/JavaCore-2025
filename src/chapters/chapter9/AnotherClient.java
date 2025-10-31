package chapters.chapter9;

public class AnotherClient implements CallBack{

    @Override
    public void callback(int p) {
        System.out.println(" p == "+ (p*p));

    }
}
