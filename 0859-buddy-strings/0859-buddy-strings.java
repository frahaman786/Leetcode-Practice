class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;

        }
        int first = -1;
        int second = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(first == -1){
                    first = i;
                }else if(second == -1){
                    second = i;
                }else{
                return false;
                }
            }
        }
        //for 0 mismatch
        if(first == -1){
            int[] sol = new int[26];
            for(int i = 0; i < s.length(); i++){
                sol[s.charAt(i) - 'a']++;
                if(sol[s.charAt(i) - 'a'] >= 2){
                    return true;
                }
            }
            return false;
        }
        //for 1 mismatch
        if(second == -1){
            return false;
        }
        //swap possibile
        return s.charAt(first) == goal.charAt(second) && goal.charAt(first) == s.charAt(second);

    }
}