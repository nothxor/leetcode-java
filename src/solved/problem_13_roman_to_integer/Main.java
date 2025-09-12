package solved.problem_13_roman_to_integer;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}

class Solution {
    public int romanToInt(String s) {
        char[] arr = getCharArray(s);
        return loopThroughArrayAndSum(arr);
    }

    private int getNumber(Character c) {
        LinkedHashMap<Character, Integer> romanMap = new LinkedHashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        return romanMap.get(c);
    }

    private char[] getCharArray(String s) {
        return s.toCharArray();
    }

    private int loopThroughArrayAndSum(char[] arr) {
        if (arr.length > 1) {
            int sum = getNumber(arr[arr.length - 1]);
            System.out.println("Getting all the numbers: ");
            for (int index = arr.length - 1; index > 0; index--) {
                sum += getComparison(getNumber(arr[index - 1]), getNumber(arr[index]));
            }

            return sum;
        }
        else {
            return getNumber(arr[0]);
        }
    }

    private int getComparison(int newNumber, int oldNumber) {
        return newNumber < oldNumber ? -newNumber : newNumber;
    }
}