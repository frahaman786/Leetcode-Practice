class Solution {
    public void reverseString(char[] s) {
        int i  = 0;
        int end = s.length-1;
        while(i < end){
        
            char temp = s[i];
            s[i] = s[end];
            s[end] = temp;
            i++;
            end--;
        }
    }
}