// Problem: Check if array contains any duplicates

import java.util.HashSet;

// Time Complexity: O(n) :- We traverse the array once
// Space Complexity: O(n) :- We use a HashSet to store seen elements
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); // O(n) space
        for (int num : nums) { // O(n)
            if (seen.contains(num)) { // O(1)
                return true;
            }
            seen.add(num); // O(1)
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums)); // Output: true
    }
}
