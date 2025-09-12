package solved.problem_412_fizz_buzz;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(15));
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returnList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                returnList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                returnList.add("Fizz");
            } else if (i % 5 == 0) {
                returnList.add("Buzz");
            }
            else {
                returnList.add(String.valueOf(i));
            }
        }
        return returnList;
    }
}