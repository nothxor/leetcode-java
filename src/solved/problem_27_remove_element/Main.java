package solved.problem_27_remove_element;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int write = 0;

        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}