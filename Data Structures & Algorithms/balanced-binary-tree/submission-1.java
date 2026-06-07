/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    static boolean isBalanced = true;
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left, right;
        left = dfs(root.left) + 1;
        right = dfs(root.right) + 1;

        int val = left > right ? left-right : right-left;
        if(val > 1)
            isBalanced = false;
        return Math.max(left, right); 
    }

    public boolean isBalanced(TreeNode root) {
        isBalanced = true;
        dfs(root);
        return isBalanced;
    }
}
