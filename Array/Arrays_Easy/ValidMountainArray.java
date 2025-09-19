
// Problem: Check if array forms a valid mountain
// Time Complexity: O(n) - Single pass
// Space Complexity: O(1) - No extra space
public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        
        int i = 0;

        // Climb up
        while (i + 1 < n && arr[i] < arr[i + 1]) i++;

        // Peak can't be first or last
        if (i == 0 || i == n - 1) return false;

        // Climb down
        while (i + 1 < n && arr[i] > arr[i + 1]) i++;

        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr)); // Output: true
    }
}








