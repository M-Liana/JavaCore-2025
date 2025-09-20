package homework1.homework4;

public class ArrayHomeWork4 {

    public static void main(String[] args) {
        //1
        int[] array = {1, 6, 6, 1, 55, 87, 24, 77, 4, 9, 10, 10};
        int n = 6;
        int nCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                nCount++;
            }
        }
        System.out.println(" nCount ==  " + nCount);
        System.out.println();

        //2
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        //3

      /*  int dubCount = 0;
       for (int i = 0; i < array.length; i++) {

           for (int j = 1; j <array.length-1 ; j++) {
               boolean isAlreadyCalculated = false;

           }
            if(array[i]==n) {
                    isAlreadyCalculated = true;
                }
            }
            if (!isAlreadyCalculated){
                for (){
                    dubCount++;
                }
            }
            System.out.print(dubCount + " ");
            return;*/

        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'h'};
        char[] chars1 = {'ա', 'օ', 'ո', 'ւ', 'ի', 'է', 'ե'};
        for (int i = 0; i < chars.length; i++) {


        }

    }
}


