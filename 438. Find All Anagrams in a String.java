class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap();
        HashMap<Character, Integer> window = new HashMap();
        for(int i = 0; i < p.length(); i++){
            need.put(p.charAt(i), need.getOrDefault(p.charAt(i),0)+1);
        }
        System.out.println(need);
        int right = 0;
        int left = 0;
        int valid = 0;
        List<Integer> result = new ArrayList();
        while(right < s.length()){
            char current = s.charAt(right);
            right ++;
            if(need.containsKey(current)){
                window.put(current, window.getOrDefault(current, 0) + 1);
                if(window.get(current).equals(need.get(current))){
                    valid ++;
                }
            }
            while(right - left == p.length()){
                if(valid == need.size()){
                    result.add(left);
                }
                char currentLeft= s.charAt(left);
                left++;
                if(need.containsKey(currentLeft)){
                    if(need.get(currentLeft).equals(window.get(currentLeft))){
                        valid --;
                    }
                    window.put(currentLeft, window.getOrDefault(currentLeft, 0) -1);
                }
            }
        }
        return result;
        
    }
}