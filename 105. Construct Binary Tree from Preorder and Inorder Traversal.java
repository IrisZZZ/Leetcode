class Solution {
    int preIndex = 0;
    public TreeNode helper(int[] preorder, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map){
        
        if(inStart > inEnd)
            return null;
        int curr = preorder[preIndex++];
        TreeNode tNode = new TreeNode(curr);
        if(inStart == inEnd)
            return tNode;
        int inIndex = map.get(curr);
        tNode.left = helper(preorder, inorder, inStart, inIndex - 1, map);
        tNode.right = helper(preorder, inorder, inIndex + 1, inEnd, map);
        return tNode;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++)
            map.put(inorder[i], i);
        return helper(preorder, inorder, 0, len - 1, map);
    }
}