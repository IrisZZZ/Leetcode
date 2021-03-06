class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, sum0_i = 0;
        HashMap<Integer, Integer> map = new HashMap();
        HashSet<Integer> set = new HashSet();
        map.put(0,1);
      for (int i = 0; i < nums.length; i++) {
        sum0_i += nums[i];
        int sum0_j = sum0_i - k;
        if (map.containsKey(sum0_j)){
            res += map.get(sum0_j);

        }
            
        map.put(sum0_i,
            map.getOrDefault(sum0_i, 0) + 1);
}
        return res; }
 
    
}