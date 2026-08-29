class Solution {
    public String toLowerCase(String s) {
        StringBuilder sol = new StringBuilder(s);
        for(int i = 0; i < sol.length(); i++){
            char ch = sol.charAt(i);
            if(Character.isUpperCase(ch)){
                char lower = Character.toLowerCase(ch);
                sol.setCharAt(i, lower);
                
            }
        }
        return sol.toString();
    }
}