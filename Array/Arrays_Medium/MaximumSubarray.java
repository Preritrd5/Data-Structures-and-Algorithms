// # Sliding Window / Subarray Sums 
// # leetcode Problem No :- 53
// ## Problem Description
// Find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// ## Approach
// This is an implementation of Kadane’s Algorithm using a sliding window approach.

// Time Complexity: O(n) - Single pass through the array
// Space Complexity: O(1) - Constant space
class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element
        int currentSum = 0;

        for (int num : nums) { // O(n)
            currentSum += num; // Add the current number to currentSum

            if (currentSum > maxSum) {
                maxSum = currentSum; // Update maxSum if currentSum is greater
            }

            if (currentSum < 0) {
                currentSum = 0; // Reset currentSum if it becomes negative
            }
        }

        return maxSum;
    }
}
