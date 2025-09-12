package solved.problem_20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("([)]"));
    }
}

class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }

        char[] chars = s.toCharArray();

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : chars) {
            if (ShouldPush(c)) {
                stack.push(c);
            }
            else {
                switch (c) {
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop() != '{') {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean ShouldPush(char c) {
        return "([{".contains(String.valueOf(c));
    }
}