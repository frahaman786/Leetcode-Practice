class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sol = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sol.put(s.charAt(i), sol.getOrDefault(s.charAt(i), 0) + 1);

        }
        for(int k = 0; k < t.length(); k++){
            char ch = t.charAt(k);
            if(sol.containsKey(ch)){
                int count = sol.get(ch);
                if(count == 1){
                    sol.remove(ch);
                }else{
                    sol.put(ch, count -1);
                }
            }else{
                return ch;
            }




        }
        return ' ';
    }
}