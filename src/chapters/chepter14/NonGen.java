package chapters.chepter14;

public class NonGen {

    Object ob;
    NonGen(Object o){
        ob= o;
    }
    Object getOb(){
        return ob;
    }
     void showType(){
         System.out.println(" obj is type of "+ ob.getClass().getName());
     }
}
