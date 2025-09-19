

// Problem: Find third maximum number, or max if less than 3 distinct
// Time Complexity: O(n)
// Space Complexity: O(1)
public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Long max1 = null, max2 = null, max3 = null;
        for (Long num : java.util.Arrays.stream(nums).mapToObj(Long::valueOf).toList()) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) continue;
            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }
        return max3 == null ? max1.intValue() : max3.intValue();
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums)); // Output: 1
    }
}

