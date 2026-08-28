class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> sol = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sol.put(ch, sol.getOrDefault(ch, 0)+1);
        }
        int freq = sol.values().iterator().next();
        for(int values : sol.values()){
            if(values != freq){
                return false;
            }
        }
        return true;
    }
}