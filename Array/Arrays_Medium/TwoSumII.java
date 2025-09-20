// Problem: Return indices of two numbers such that they add up to target
// Time Complexity: O(n) - Single pass using HashMap
// Space Complexity: O(n) - HashMap for complements

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // num -> index
        for (int i = 0; i < nums.length; i++) { // TC -> O(n)
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // SC -> O(n)
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: 0, 1
    }
}
