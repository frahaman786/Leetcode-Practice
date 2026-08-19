class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        StringBuilder res = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
           char temp = res.charAt(0);
           res.deleteCharAt(0);
           res.append(temp);

           if(res.toString().equals(goal)){
                return true;
           }
        }
        return false;
    }
}