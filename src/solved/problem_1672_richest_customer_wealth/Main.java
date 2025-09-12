package solved.problem_1672_richest_customer_wealth;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(solution.maximumWealth(accounts));
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSum = 0;

        for (int i = 0; i < accounts.length; i++) {
            int tempMax = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tempMax += accounts[i][j];
            }
            if (tempMax > maxSum) {
                maxSum = tempMax;
            }
        }
        return maxSum;
    }
}