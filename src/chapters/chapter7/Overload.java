package chapters.chapter7;

public class Overload {
  void test(){
      System.out.println(" there is no parametrs");
  }
        void test(int a){
            System.out.println("a "+ a);
        }
        void test (int a, int b ){
            System.out.println("a and b "+ a+" "+ b);
        }
        double test(double a){
            System.out.println("a "+ a);
            return a*a;
        }

//        String name = "poxos";
//        System.out.println(name.substring(3));

}
