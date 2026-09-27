class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length()-1;
        StringBuilder sol = new StringBuilder(s);
        while(start < end){
            if(!Character.isLetter(sol.charAt(start))){
                start++;
            }
            else if(!Character.isLetter(sol.charAt(end))){
                end--;
            }else{
                Character temp = sol.charAt(start);
                sol.setCharAt(start, sol.charAt(end));
                sol.setCharAt(end, temp);
                start++;
                end--;


            }
        }
        return sol.toString();
    }
}