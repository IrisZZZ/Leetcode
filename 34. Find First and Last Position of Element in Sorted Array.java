class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{-1,-1};
        }
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        while(left <right - 1){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                left= mid;
            }else if(nums[mid] >= target){
                right = mid;
            }
        }
        if(nums[left] == target){
            result[0] = left;
        }else if(nums[right] ==target){
            result[0] = right;
        }else{
            result[0] = -1;
        }
        
         left = 0; 
        right = nums.length - 1;
        while(left < right - 1){
            int mid = left + (right - left)/2;
            if(nums[mid]<= target){
                left = mid;
            }else if(nums[mid] > target){
                right = mid;
            }
        }
         if(nums[right] == target){
            result[1] = right;
        }else if(nums[left] == target){
            result[1] = left;
        }else{
            result[1] = -1;
        }
        return result;
        
    }
}