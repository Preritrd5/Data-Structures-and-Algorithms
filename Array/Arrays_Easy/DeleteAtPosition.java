// Problem: Delete an element at the Xth position in an array (shifting left)
// Time Complexity: O(n) - Shifting elements
// Space Complexity: O(n) - Return new array due to Java arrays fixed size
public class DeleteAtPosition {
    public static int[] deleteAt(int[] nums, int position) {
        if (position < 0 || position >= nums.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        int[] newArr = new int[nums.length - 1];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i != position) {
                newArr[j++] = nums[i];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = deleteAt(nums, 2);
        for (int num : result) System.out.print(num + " "); // Output: 1 2 4 5
    }
}