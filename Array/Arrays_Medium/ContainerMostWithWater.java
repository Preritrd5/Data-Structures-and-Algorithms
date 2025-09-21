// Problem :- Container With Most Water
// 	Max area using two pointers
// Time Complexity: O(n) - Single pass with two pointers
// Space Complexity: O(1) - Constant space

public class ContainerMostWithWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) { // O(n)
            int h = Math.min(height[left], height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
