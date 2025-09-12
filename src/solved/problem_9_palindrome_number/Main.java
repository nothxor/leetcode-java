package solved.problem_9_palindrome_number;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(122));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] charArr = s.toCharArray();
        int end = charArr.length - 1;
        for (int start = 0; start < s.length(); start++) {
            if (charArr[start] != charArr[end]) {
                return false;
            }
            end--;
        }
        return true;
    }
}