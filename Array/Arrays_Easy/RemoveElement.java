// Problem: Remove all instances of val from the array in-place
// Time Complexity: O(n) :- We traverse the array once
// Space Complexity: O(1) :- We modify the array in-place
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index for next valid element
        for (int num : nums) { // O(n)
            if (num != val) {
                nums[k++] = num;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val)); // Output: 2
    }
}
