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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        int size = 0;
        
        if(root == null){
            return result;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            size = queue.size();
            List<Integer> list = new ArrayList();
            for(int i = 0; i < size; i++){
            TreeNode current = queue.poll();
            list.add(current.val);
            if(current.left != null){
                 queue.add(current.left);
            }
            if(current.right != null){
                 queue.add(current.right);
            }
            }
            result.add(list);
        }
        return result;
    }
}