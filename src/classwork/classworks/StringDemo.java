package classwork.classworks;

public class StringDemo {
    public static void main(String[] args) {
        String[] names= {"poxos","petros","martiros"};
StringBuilder stringBuilder= new StringBuilder();
        for (String name : names) {
            stringBuilder.append(name);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder);//ktpe toString() metodov




        }



//        String result = "";
//      for (String name : names) {
//            result += name +" ";
//
//        }
//        System.out.println(result);
//    }
}
