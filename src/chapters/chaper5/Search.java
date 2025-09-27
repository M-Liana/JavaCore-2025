package chapters.chaper5;

public class Search {

    public static void main(String[] args) {
        int []nums={1,5,9,6,7};
        int val=5;
        boolean found=false;
        for (int num : nums) {
            if (num== val){
                found = true;
                break;
            }

        }
        if(found)
            System.out.println(" val is founded");
    }
}
