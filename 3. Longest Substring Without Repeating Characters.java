class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        HashMap<Character, Integer> window = new HashMap();
        int result = 0;
        while(right < s.length()){
            char current = s.charAt(right);
            right ++;
            window.put(current, window.getOrDefault(current, 0) + 1);
           
            while(window.get(current) > 1){
                char currentLeft = s.charAt(left);
                window.put(currentLeft, window.get(currentLeft) - 1);
                left++;
            }
             if(right - left > result){
                result = right - left;
            }
                
            }
          
            
        return result;
    
        
    }
}