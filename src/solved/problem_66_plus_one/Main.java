package solved.problem_66_plus_one;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Simple case, no carry needed
        int[] test1 = {1, 2, 3};
        System.out.println("Input: [1,2,3]");
        System.out.println("Output: " + Arrays.toString(solution.plusOne(test1)));
        System.out.println("Expected: [1,2,4]\n");

        // Test case 2: Carry propagates once
        int[] test2 = {1, 2, 9};
        System.out.println("Input: [1,2,9]");
        System.out.println("Output: " + Arrays.toString(solution.plusOne(test2)));
        System.out.println("Expected: [1,3,0]\n");

        // Test case 3: All 9s, array needs to grow
        int[] test3 = {9, 9, 9};
        System.out.println("Input: [9,9,9]");
        System.out.println("Output: " + Arrays.toString(solution.plusOne(test3)));
        System.out.println("Expected: [1,0,0,0]\n");
    }
}

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}