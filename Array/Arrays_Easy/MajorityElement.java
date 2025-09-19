
// Problem: Find element appearing more than n/2 times (Moore’s Voting)
// Time Complexity: O(n)
// Space Complexity: O(1)
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums)); // Output: 3
    }
}