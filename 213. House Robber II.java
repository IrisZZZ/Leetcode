class Solution {
    public int rob(int[] nums) {
        int[] table1 = new int[nums.length];
        int[] table2 = new int[nums.length];
        table1[0] = nums[0];
        table2[0] = 0;
        int result = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 1; i < nums.length; i++){
            int currentMax1 = 0;
            int currentMax2 = 0;
            for(int j = 0; j < i; j++){
                int current1 = 0;
                int current2 = 0;
                if(i - 1 == j){
                    current1 = nums[i];
                    current2 = nums[i];
                }else{
                    current1 = table1[j] + nums[i];
                    current2 = table2[j] + nums[i];   
                }
                
                if(current1 > currentMax1){
                    currentMax1 = current1;
                }
                if(current2 > currentMax2){
                    currentMax2 = current2;
                }
            }
            
       
            table1[i] = currentMax1;
            table2[i] = currentMax2;
        }
        for(int i = 0; i < nums.length-1; i++){
            if(table1[i] > result ){
                result = table1[i];
            }
        }
        if(table2[nums.length-1] > result ){
            return table2[nums.length - 1];
        }else{
            return result;
        }
        
    }
}