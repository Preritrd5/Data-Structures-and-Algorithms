
// Problem: Find element that appears only once (using XOR)
// Time Complexity: O(n)
// Space Complexity: O(1)
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums)); // Output: 4
    }
}
