class Solution {
    public int numDecodings(String s) {
        HashMap<String, Integer> map = new HashMap();
        return helper(s,  map);
    }
    public int helper(String s,  HashMap<String, Integer>  map){
        if(map.containsKey(s)){
            return map.get(s);
        }
        if(s.length() == 0){
            return 1;
        }
        if(s.equals("0")){
            return 0;
        }
        
        int sum = 0;
        if(! s.substring(s.length() -1).equals("0")){
            sum += helper(s.substring(0, s.length()-1), map);
        }
        
        if(s.length() >= 2 && Integer.valueOf(s.substring(s.length() - 2)) <= 26 && !s.substring(s.length() - 2, s.length() - 1).equals("0")){
            sum += helper(s.substring(0, s.length() - 2), map);
        }
        
        map.put(s, sum);
        return sum;
        
    }
}