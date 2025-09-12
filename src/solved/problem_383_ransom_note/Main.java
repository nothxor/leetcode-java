package solved.problem_383_ransom_note;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("a", "b"));
        System.out.println(solution.canConstruct("a", "ab"));
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            mag.put(c, mag.getOrDefault(c, 0) + 1);
        }

        for (char r : ransomNote.toCharArray()) {
            if (mag.get(r) == null || mag.get(r) == 0) {
                return false;
            }
            mag.put(r, mag.get(r) - 1);
        }
        return true;
    }
}