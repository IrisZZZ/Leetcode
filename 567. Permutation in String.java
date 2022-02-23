class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap();
        HashMap<Character, Integer> window = new HashMap();
        int valid = 0;
        int left = 0;
        int right = 0;
        for(int i = 0; i < s1.length(); i++){
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i), 0)+1);
        }
        while(right < s2.length()){
            char current = s2.charAt(right);
            right++;
            if(need.containsKey(current)){
                window.put(current, window.getOrDefault(current, 0)+1);
                if(need.get(current).equals(window.get(current))){
                    valid ++;
                }
            }
            while(right - left == s1.length()){
                if(valid == need.size()){
                    return true;
                }
                char currentLeft = s2.charAt(left);
                if(need.containsKey(currentLeft)){
                    if(window.get(currentLeft).equals(need.get(currentLeft))){
                        valid --;
                    }
                    window.put(currentLeft, window.getOrDefault(currentLeft, 0) - 1);
                }
                left++;
            }
            
        }
        return false;
        
    }
}