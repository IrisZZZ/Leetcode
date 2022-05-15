class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList();
        helper(root, targetSum, result, new ArrayList());
        return result;
        
    }
    public void helper(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> path){
         if(root == null){
            return;
        }
         if(root.right== null && root.left == null && targetSum == root.val){
            List<Integer> newPath = new ArrayList(path);
             newPath.add(root.val);
             result.add(newPath);
            return;
        }
        path.add(root.val);
        helper(root.left, targetSum - root.val, result, path);
        helper(root.right, targetSum - root.val, result, path);
        path.remove(path.size() - 1);
        
    }
}