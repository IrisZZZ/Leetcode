class Solution {

    public int rob(int[] nums) {
       int[] table = new int[nums.length];
        table[0] = nums[0];
        for(int i = 0; i < nums.length; i++){
            int max = 0;
            for(int j = 0 ; j < i; j++){
                int current = 0; 
                if(j == i-1){
                     current = nums[i];
                 }else{
                     current = table[j] + nums[i];
                 }
                
                if(current >  max){
                    max = current;
                }
            }
            if(max == 0){
                table[i] = nums[i];
            }else{
                table[i] = max;
            }
        }
        
        int result = 0;
        for(int i = 0; i < table.length; i++){
            if(table[i] > result){
                result = table[i];
            }
        }
        return result;
    }
    

}