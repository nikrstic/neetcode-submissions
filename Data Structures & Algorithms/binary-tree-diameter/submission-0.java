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
    static int max = 0;
    public int dfs(TreeNode root){
        int left, right;
        if(root == null){
            return 0;
        
        }
        left = dfs(root.left);

        right = dfs(root.right);
        max = Math.max(left+right, max);
        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        dfs(root);
        return max;
    }
}
