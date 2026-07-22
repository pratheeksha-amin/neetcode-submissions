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
        List<Integer>lst=new LinkedList<>();
        postorder(root,lst);
        return lst;
        
    }
    private void postorder(TreeNode root,List<Integer>lst)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left,lst);
        postorder(root.right,lst);
        lst.add(root.val);
    }
}