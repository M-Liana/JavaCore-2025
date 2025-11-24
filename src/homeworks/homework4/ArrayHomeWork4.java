package homeworks.homework4;

public class ArrayHomeWork4 {

    public static void main(String[] args) {
        //1
        int[] array = {1, 6, 6, 1, 1, 55, 87, 24, 77, 4, 9, 10, 10};
        int n = 6;
        int nCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                nCount++;
            }
        }
        System.out.println(" nCount ==  " + nCount);

        System.out.println();
        System.out.println();
        //classWork
        int lastIndex = array.length - 1;
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[lastIndex];
            array[lastIndex] = tmp;
            lastIndex--;

        }
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();

        //2
       /* for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }*/
        //3
//        int[] duplicateArray= new int[array.length];
//        int duplicateArrayIndex=0;
//        int repeatableCount = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//               boolean duplicateFound=false;
//                if (array[i] == array[j]) {
//                    for (int i1 : duplicateArray) {
//                        if (array[i]==duplicateArray){
//                            duplicateFound=true;
//                            break;
//
//                        }
//
//
//                    }
//if (!duplicateFound){
//    repeatableCount++;
//    duplicateArray[duplicateArrayIndex++]=array[i];
//}
//                }
//            }
//
//        }
//        System.out.println(repeatableCount);
//

        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'h'};
        char[] vowels = {'ա', 'օ', 'ո', 'ւ', 'ի', 'է', 'ե', 'ը', 'և'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'ա':
                    vowelsCount++;
                    break;
                case 'օ':
                    vowelsCount++;
                    break;
                case 'ո':
                    vowelsCount++;
                    break;
                case 'ւ':
                    vowelsCount++;
                    break;
                case 'ի':
                    vowelsCount++;
                    break;
                case 'է':
                    vowelsCount++;
                    break;
                case 'ե':
                    vowelsCount++;
                    break;
                case 'ը':
                    vowelsCount++;
                    break;
                case 'և':
                    vowelsCount++;
                    break;
            }

        }
        System.out.println(" vowelsCount " +vowelsCount);


//        int vowelCount = 0;
//        for (int i = 0; i < chars.length; i++) {
//
//            for (int j = 0; j < vowels.length; j++) {
//                if (chars[i]==vowels[j]){
//                    vowelCount++;
//                    break;
//                }
//
//            }
//
//        }
//        System.out.println("vowelsCount "+vowelCount);

    }
}


