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
    List<List<Integer>> solutions = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return new ArrayList<>();
        queue.add(root);
        while(queue.size() != 0){
            int sz = queue.size();
            List<Integer> solution = new ArrayList<>();
            for(int i = 0; i < sz; i++){
                TreeNode node = queue.remove();
                solution.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            solutions.add(solution);
        }
        return solutions;
    }
}