class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length()- needle.length(); i++){
            for(int j = 0; j < needle.length(); j++){
                char ch1 = haystack.charAt(i+j);
                char ch2 = needle.charAt(j);
                if(ch1 != ch2){
                    break;
                }
                if( j == needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}