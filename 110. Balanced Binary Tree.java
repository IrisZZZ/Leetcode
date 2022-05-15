public class IsBalancedBinaryTree{
    boolean isBalanced;
    int depth; 
    IsBalancedBinaryTree(boolean isB, int d){
        this.isBalanced = isB;
        this.depth = d;
    }
    
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        IsBalancedBinaryTree result= helper(root);
        return result.isBalanced;
    }
    public IsBalancedBinaryTree helper(TreeNode root){
        if(root == null){
            return new IsBalancedBinaryTree(true, 0);
        }
        IsBalancedBinaryTree left = helper(root.left);
        IsBalancedBinaryTree right = helper(root.right);
        
        return new IsBalancedBinaryTree(left.isBalanced && right.isBalanced && Math.abs(right.depth - left.depth)<= 1, Math.max(right.depth, left.depth) + 1);
    }
}