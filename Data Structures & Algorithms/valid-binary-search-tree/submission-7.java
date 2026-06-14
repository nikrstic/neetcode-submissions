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

    public boolean dfs(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.val <= min){
            return false;
            //min = root.val;
        }
        if(root.val >= max){
            return false;
            //max = root.val;
        }

        // if(root.left != null && root.left.val >= max || root.right != null && root.right.val <= min){
        //     return false;
        // }
        

        return dfs(root.left, min, root.val) && dfs(root.right, root.val, max);

    }

    public boolean isValidBST(TreeNode root) {
        
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
