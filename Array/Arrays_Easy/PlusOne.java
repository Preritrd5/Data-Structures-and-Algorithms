
// Problem: Plus One - Increment an integer represented as an array by one
// Time Complexity: O(n) - Traverse digits array once from the end
// Space Complexity: O(n) - Possible new array if all digits are 9
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) { // O(n)
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // If all digits were 9, create new array with extra length
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        for (int num : result) System.out.print(num + " "); // Output: 1 0 0 0
    }
}



















