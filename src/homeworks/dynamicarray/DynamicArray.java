package homeworks.dynamicarray;



public class DynamicArray {
    private int[] array = new int[10];
    int index;
    int size = 0;


    public void deleteByIndex(int index) {

        if (index < 0 || index > size) {
            System.out.println("there isn't index which you want");
            return;
        }

        for (int i = index; i < size - 1; i++) {
               array[i] = array[i + 1];
        }
        size--;


    }


    public void set(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("index is wrong");
        }
        array[index] = value;
    }


    public void add(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("index is empty");

        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];

        }
        array[index] = value;
        size++;
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {

            if (array[i] == value) {
                return true;
            }

        }
        return false;
    }


    public int getIndexByValue(int value) {
        if (index < 0 || index > size) {
            System.out.println("index is wrong");
        }
        for (int i = 0; i < size; i++) {
            if (value==array[i]){
                return index;
            }

        }
        return -1;
    }


    public void add(int value) {

        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("wrong index");
            return 0;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
}


