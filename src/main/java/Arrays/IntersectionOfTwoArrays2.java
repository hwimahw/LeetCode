package Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays2 {

    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        intersect(num1, num2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> listResult = new ArrayList<>();
        Map<Integer, Integer> num1ElementQuantityMap = makeMap(nums1);
        Map<Integer, Integer> num2ElementQuantityMap = makeMap(nums2);
        for (Map.Entry<Integer, Integer> entry : num1ElementQuantityMap.entrySet()) {
            Integer num1Key = entry.getKey();
            Integer num1Value = num1ElementQuantityMap.get(num1Key);
            Integer num2Value = num2ElementQuantityMap.get(num1Key);
            if (num2Value != null) {
                if (num1Value < num2Value) {
                    for (int i = 0; i < num1Value; i++) {
                        listResult.add(num1Key);
                    }
                } else {
                    for (int i = 0; i < num2Value; i++) {
                        listResult.add(num1Key);
                    }
                }
            }
        }
        int[] result = new int[listResult.size()];
        for(int i = 0; i < listResult.size(); i++){
            result[i] = listResult.get(i);
        }
        return result;
    }

    public static Map<Integer, Integer> makeMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer quantity = map.get(nums[i]);
            if(quantity == null){
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], ++quantity);
            }
        }
        return map;
    }
}
