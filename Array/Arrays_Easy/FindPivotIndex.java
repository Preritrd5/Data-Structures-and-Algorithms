// Problem: Find pivot index where left sum equals right sum
// Time Complexity: O(n) :- We traverse the array twice
// Space Complexity: O(1) :- Constant extra space used
public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) total += num; // sum all elements (O(n))
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) { // O(n)
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums)); // Output: 3
    }
}

