package Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int quantityOfZeros = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - quantityOfZeros + 1){
                break;
            }
            if(nums[i] == 0) {
                for (int j = i; j < nums.length - quantityOfZeros - 1; j++) {
                    swap(nums, j, j + 1);
                }
                quantityOfZeros++;
                i = i - 1;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
}
