class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int result = -1;
        while(left < right - 1){
            int mid = left + (right - left)/2;
            if(nums[mid]< target){
                left = mid;
            }else if(nums[mid] > target){
                right = mid;
            }else if(nums[mid] == target){
                return mid;
            }
        }

    if(nums[left] == target){
        return left;
    }else if(nums[right] == target){
        return right;
    }else{
        return -1;
    }
    }
}