class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
            
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < st.size(); i++) { 
            result.append(st.get(i)); 
        } 
        return result.toString();
    }
}