package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        for(int c:nums){
            System.out.print(c + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        if(k % nums.length == 0){
            return;
        }
        k = k % nums.length;
        for(int i = 0; i < k; i++){
            rotateIter(nums);
        }
    }

    public static void rotateIter(int[] nums){
        int lastElement = nums[nums.length - 1];
        for(int i = nums.length - 1; i > 0; i--){
            nums[i] = nums[i - 1];
        }
        nums[0] = lastElement;
    }
}
