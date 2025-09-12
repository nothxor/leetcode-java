package solved.problem_14_longest_common_prefix;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Shortest: '" + solution.longestCommonPrefix(new String[]{"flower","flow","flight"}) + "'");
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        char[][] chars = createCharArrays(strs);

        int shortest = Integer.MAX_VALUE;
        int temp;

        for (int index = 1; index < chars.length; index++) {
            temp = compareTwoCharArrays(chars[0], chars[index]);
            shortest = Math.min(shortest, temp);
        }

        return getPrefix(shortest, chars[0]);
    }

    private char[] createCharArray(String s) {
        return s.toCharArray();
    }

    private char[][] createCharArrays(String[] strings) {
        char[][] chars = new char[strings.length][];

        for (int index = 0; index < strings.length; index++) {
            chars[index] = createCharArray(strings[index]);
        }
        return chars;
    }

    private int compareTwoCharArrays(char[] first, char[] current) {
        int shortest = 0;
        for (int index = 0; index < first.length; index++) {
            try {
                if (first[index] == current[index]) {
                    shortest++;
                }
                else {
                    break;
                }
            }
            catch (Exception e) {
                break;
            }
        }
        return shortest;
    }

    private String getPrefix(int prefixLength, char[] first) {
        StringBuilder returnStr = new StringBuilder();

        if (prefixLength > 0) {
            for (int index = 0; index < prefixLength; index++) {
                returnStr.append(first[index]);
            }
            return returnStr.toString();
        }
        else {
            return "";
        }
    }
}