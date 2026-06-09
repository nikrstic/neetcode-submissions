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
    public boolean isSame(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.val != subRoot.val){
            return false;
        }
        
        
        return isSame(root.right, subRoot.right) && isSame(root.left, subRoot.left);
    }
    public TreeNode dfs(TreeNode root, TreeNode subRoot){
       
        if(root == null){
            return null;
        }
        if(root.val == subRoot.val){
            if(isSame(root, subRoot)){
                return root;
            }
            
        }
        TreeNode leftResult = dfs(root.left, subRoot);

        if(leftResult != null){
            return leftResult;
        }
        
        return dfs(root.right, subRoot);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode rootPart = dfs(root, subRoot);
        
        return rootPart != null;
    }
}
