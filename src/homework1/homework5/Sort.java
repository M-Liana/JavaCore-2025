package homework1.homework5;

public class Sort {

    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <array.length ; j++) {
                if (array[j]<array[j-1]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;

                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }

        }


    }

