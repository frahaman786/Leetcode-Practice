class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < t.length(); i++){
            char temp = t.charAt(i);
            if(!map.containsKey(temp) || map.get(temp) == 0){
                return false;
            }
            map.put(temp, map.get(temp) -1);
        }
        return true;
    }
}