package solved.problem_2236_root_equals_sum_of_children;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
 }

class Solution {
    public boolean checkTree(TreeNode root) {
        return (root.val) == (root.left.val + root.right.val);
    }
}