package solved.problem_58_length_of_last_word;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitArray = s.split(" ");

        return splitArray[splitArray.length - 1].length();
    }
}