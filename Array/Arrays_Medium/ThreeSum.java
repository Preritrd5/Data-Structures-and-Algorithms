// Problem: Find all unique triplets in the array which gives the sum of zero.
// Time Complexity: O(n^2) - Sorting takes O(n log n), and the two-pointer search takes O(n^2) overall.
// Space Complexity: O(k) - For storing the result triplets, where k is the number of unique triplets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums); // TC -> O(n log n)

        for (int i = 0; i < nums.length - 2; i++) { // TC -> O(n^2)
            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) { // TC -> O(n) total per i → O(n²) overall
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move pointers and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Need larger number
                } else {
                    right--; // Need smaller number
                }
            }
        }
        return result;
    }
}
