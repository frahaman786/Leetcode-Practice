class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");
        Map<String, Integer> count = new HashMap<>();
        int maxL = Math.max(word1.length, word2.length);
        for(int i = 0; i < maxL; i++){
            //assuming word1 is highest length
            if(i < word1.length){
                String s = word1[i];
                count.put(s, count.getOrDefault(s, 0)+1);
            }
            //if some values left
            if(i < word2.length){
                String s = word2[i];
                count.put(s, count.getOrDefault(s, 0)+1);
            }
        }
        //now check is it twice or single
       List<String> sol = new ArrayList<>();
        for(String k : count.keySet()){
            
                if(count.get(k) == 1){
                    sol.add(k);
                }
            
        }
        return sol.toArray(new String[0]);

    }
}