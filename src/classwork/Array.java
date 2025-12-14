package classwork;

public class Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 7, 8, 6, 10};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println(nums[0]);
        System.out.println(nums.length);

        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }

        }
        System.out.println(min);

        if (nums.length <= 2) {
            System.out.println("cannot print middle val");
        }
        if (nums.length % 2 == 0) {
            System.out.println(nums[nums.length / 2] + " " + nums[nums.length / 2 - 1]);
        }
        if (nums.length % 2 != 0) {
            System.out.println(nums.length / 2);
        }
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            }

        }
        System.out.println(evenCount);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j - 1];

                }

            }

        }
        String name = "poxos";
        String name1 = "petros";
        name = name1;
        System.out.println(name.equals(name1));
    }
}
