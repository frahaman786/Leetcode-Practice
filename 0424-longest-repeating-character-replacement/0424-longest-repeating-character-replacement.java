class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        //we use this method for count because the all letter is upppercase and it aslo faster instead of hashmap
        int left = 0;
        int maxL = 0;
        int maxF = 0;
        for(int right = 0; right < s.length(); right++){
            int index = s.charAt(right) - 'A';
            freq[index]++;
            maxF = Math.max(maxF, freq[index]);
            while((right - left + 1) - maxF > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxL = Math.max(maxL, right - left + 1);
        }
        return maxL;
    }
}