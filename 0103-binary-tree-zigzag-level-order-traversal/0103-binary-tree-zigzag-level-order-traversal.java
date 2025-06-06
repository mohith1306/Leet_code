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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if(root == null) return ans;
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> sub = new ArrayList<>();
            for(int i = 0;i<size;i++){
                TreeNode node;
                if(level % 2 != 0){
                    node = queue.pollLast();
                    sub.add(node.val);
                    if(node.right != null) queue.offerFirst(node.right);
                    if(node.left!=null) queue.offerFirst(node.left);
                }
                else if(level % 2 == 0){
                    node = queue.pollFirst();
                    sub.add(node.val);
                    if(node.left != null) queue.offerLast(node.left);
                    if(node.right!=null) queue.offerLast(node.right);
                }
            }
            ans.add(sub);
            level++;
        }
        return ans;
    }
}