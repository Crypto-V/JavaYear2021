import static java.lang.Math.abs;

public class notepad {
    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(nums));


    }

    public static boolean arrayFront9(int[] nums) {
        for(int i = 0;i<=nums[:4];i++){
            if(nums[i] == 9) return true;
            break;
        }
        return false;
    }



}
