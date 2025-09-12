package solved.problem_1342_number_of_steps_to_reduce_a_number_to_zero;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfSteps(123));
    }
}

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}