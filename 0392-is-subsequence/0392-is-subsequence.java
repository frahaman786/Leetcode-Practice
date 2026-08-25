class Solution {
    public boolean isSubsequence(String s, String t) {
        int k = 0;
        int m = 0;
        
        while(m < t.length()){
            if( k == s.length()){
                return true;
            }
            else if(s.charAt(k) == t.charAt(m)){
                k++;
                m++;
            }else{
                m++;
            }
        }
        return k == s.length();
    }
}