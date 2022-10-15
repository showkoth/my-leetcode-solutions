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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return preOrder(root, k, set);
    }
    
    private boolean preOrder(TreeNode root, int k, Set<Integer> set){
        if(root == null){
            return false;
        }
        int complement = k - root.val;
        if(set.contains(complement)){
            return true;
        }
        set.add(root.val);
        return preOrder(root.left, k, set) || preOrder(root.right, k, set);
    }
}