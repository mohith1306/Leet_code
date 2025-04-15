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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        postorderHelper(root,ans);
        return ans;
    }
    private void postorderHelper(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        postorderHelper(root.left,ans);
        postorderHelper(root.right,ans);
        ans.add(root.val);
    }
}