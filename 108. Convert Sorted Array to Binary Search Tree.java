class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(0, nums.length-1, nums);
        
    }
    public TreeNode helper(int start, int end, int[] nums){
        if(start > end){ return null;}
        int mid = start + (end - start)/2;
        TreeNode current = new TreeNode(nums[mid]);
        TreeNode left = helper(start, mid - 1, nums);
        TreeNode right = helper(mid+1, end, nums);
        current.left = left;
        current.right = right;
        return current;
        
    }
}