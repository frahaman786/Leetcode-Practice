class Solution {
    public String reverseWords(String s) {
        StringBuilder sol = new StringBuilder(s);
        
        int start = 0;
        for(int i = 0; i < sol.length(); i++){
            if(sol.charAt(i) == ' '){
                int end = i-1;
                reverse(sol, start, end);
                start = i+1;
            }
        }
        reverse(sol, start, sol.length() - 1);
        return sol.toString();
    }
    private void reverse(StringBuilder sol, int left, int right){
        while(left < right){
            char temp = sol.charAt(left);
            sol.setCharAt(left, sol.charAt(right));
            sol.setCharAt(right, temp);
            left++;
            right--;
        }
}   }