class Solution {
    public String reverseVowels(String s) {
        char [] sol = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            //for left we are checking is it vowel or not if vowel then check 2nd condition otherwise
            while(start < end && !isVowel(sol[start])){
                start++;
            }
            //for right portion we are checking same
            while(start < end && !isVowel(sol[end])){
                end--;
            }
            char temp = sol[start];
            sol[start] = sol[end];
            sol[end] = temp;
            start++;
            end--;
        }
        return new String(sol);
    }
    public boolean isVowel(char ch){
        return ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}