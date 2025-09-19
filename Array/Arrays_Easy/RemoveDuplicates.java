// Problem: Remove duplicates from sorted array in-place
// Time Complexity: O(n) :- We traverse the array once
// Space Complexity: O(1) :- We modify the array in-place
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1; // index for next unique element
        for (int i = 1; i < nums.length; i++) { // O(n)
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums)); // Output: 2
    }
}
