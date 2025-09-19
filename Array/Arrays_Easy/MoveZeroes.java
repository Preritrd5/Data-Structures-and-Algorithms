// Problem: Move all zeros to the end while maintaining order
// Time Complexity: O(n) :- We traverse the array once
// Space Complexity: O(1) :- We modify the array in-place
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int index = 0; // index to place non-zero element
        for (int num : nums) { // O(n)
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) { // fill rest with zeros
            nums[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) System.out.print(num + " "); // Output: 1 3 12 0 0
    }
}
