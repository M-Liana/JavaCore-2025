package chapters.chapter9;

public class Client implements CallBack{
    @Override
    public void callback(int p) {
        System.out.println("meth callBack() ,"+" vizivaemi so znacheniu " + p);
    }
    void nonIfaceMeth(){
        System.out.println(" there can decided another elements");
    }
}
