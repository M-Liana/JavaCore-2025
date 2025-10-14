package chapters.chapter7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;

    }
    Test(int i){
        a=i;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    Test incrByTen(){
        Test temp =new Test(a+10);
        return temp;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else
            return false;

    }

    public void meth(Test o) {
        o.a *=2;
        o.b /= 2;
    }
}
