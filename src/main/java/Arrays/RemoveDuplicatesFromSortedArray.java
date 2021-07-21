package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(num);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
