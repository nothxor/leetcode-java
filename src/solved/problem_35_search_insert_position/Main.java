package solved.problem_35_search_insert_position;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Target exists in array
        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Array: [1,3,5,6], Target: 5");
        System.out.println("Result: " + solution.searchInsert(nums1, 5));
        System.out.println("Expected: 2\n");

        // Test case 2: Target should be inserted in middle
        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Array: [1,3,5,6], Target: 2");
        System.out.println("Result: " + solution.searchInsert(nums2, 2));
        System.out.println("Expected: 1\n");

        // Test case 3: Target should be inserted at end
        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Array: [1,3,5,6], Target: 7");
        System.out.println("Result: " + solution.searchInsert(nums3, 7));
        System.out.println("Expected: 4\n");

        // Test case 4: Target should be inserted at beginning
        int[] nums4 = {1, 3, 5, 6};
        System.out.println("Array: [1,3,5,6], Target: 0");
        System.out.println("Result: " + solution.searchInsert(nums4, 0));
        System.out.println("Expected: 0\n");

        // Test case 5: Single element array
        int[] nums5 = {1};
        System.out.println("Array: [1], Target: 1");
        System.out.println("Result: " + solution.searchInsert(nums5, 1));
        System.out.println("Expected: 0\n");
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int current;

        while (left <= right) {
            current = left + (right - left) / 2;
            if (nums[current] == target) {
                return current;
            }
            else if (nums[current] < target) {
                left = current + 1;
            }
            else {
                right = current - 1;
            }
        }

        return left;
    }
}