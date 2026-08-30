class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> sol = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(sol.containsKey(ch)){
                left = Math.max(left, sol.get(ch) + 1);
            }
            sol.put(ch, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}