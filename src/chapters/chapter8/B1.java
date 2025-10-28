package chapters.chapter8;

public class B1 extends A1{
    int i;
    B1(int a,int b){
        super.i=a;
        i=b;
    }
    void show(){
        System.out.println(" i from super class is "+ super.i);
        System.out.println("i from sub  class is "+ i);
    }
}
