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
    
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftVal = 0;
        int rightVal = 0;
        
        leftVal += dfs(root.left) + 1;
        rightVal += dfs(root.right) + 1;
            
        
        return leftVal > rightVal ? leftVal : rightVal;
    }
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
}
