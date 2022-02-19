// Given an integer array nums, handle multiple queries of the following type:

// Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
// Implement the NumArray class:

// NumArray(int[] nums) Initializes the object with the integer array nums.
// int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
class NumArray {
    public int[] preSum;
    public NumArray(int[] nums) {
        preSum = new int[nums.length+1];
        preSum[0] = 0;
        for(int i = 1; i < nums.length+1; i++){
            preSum[i]  = preSum[i-1] + nums[i-1];
        }
        for(int m = 0; m < preSum.length; m++){
            System.out.println(preSum[m]);
        }
    }
    
    public int sumRange(int left, int right) {
        return preSum[right+1] - preSum[left];
    }
}
