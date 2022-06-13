class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap();
        return helper(s,wordDict, map);
    }
    public boolean helper(String s, List<String> wordDict, HashMap<String, Boolean> map){
        if(s.length() == 0){
            return true;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        List<String> list = getPossibleEnd(s, wordDict);
        for(int i = 0; i < list.size(); i++){
            if(s.length() - list.get(i).length() < 0){
                continue;
            }
            String newString = s.substring(0, s.length() - list.get(i).length());
            boolean result = helper(newString, wordDict, map);
            if(result){
                map.put(s, result);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }
    
    public List<String> getPossibleEnd(String s, List<String> wordDict){
        List<String> result = new ArrayList();
        for(int i = 0; i < wordDict.size(); i++ ){
           String currentString = wordDict.get(i);
            if(s.endsWith( currentString)){
                result.add(currentString);
            }
        }
        return result;
    }
    
}