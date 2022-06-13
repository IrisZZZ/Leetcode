class Solution {
    public int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> targetToCombinations = new HashMap();
        return helper(nums,target,targetToCombinations);
    }
    public int helper(int[] nums, int target, HashMap<Integer, Integer> map){
        if(target < 0){
            return 0;
        }
        if(target == 0){
            return 1;
        }
        if(map.containsKey(target)){
            return map.get(target);
        }
        
    
        int sum = 0;
        for(int i = 0; i < nums.length; i ++ ){
            sum += helper(nums, target - nums[i], map);
        }
        map.put(target, sum);
        return sum;
    }
}