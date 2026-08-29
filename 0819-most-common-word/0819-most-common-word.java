class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        //converted whole string to lowercase and ignore punctuation
        String[] lowerCase  = paragraph.toLowerCase().split("[!?',;. ]+");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < lowerCase.length; i++){
            boolean block = false;
            for(int j = 0; j < banned.length; j++){
                if(lowerCase[i].equals(banned[j])){
                    block = true;
                    break;
                }
            }
            if(!block){
                map.put(lowerCase[i], map.getOrDefault(lowerCase[i], 0)+1);

            }
        }
        //initially we assigne answer a empty string
        String ans = " ";
        int max = 0;
        for(String word : map.keySet()){
            if(map.get(word) > max){
                max = map.get(word);
                ans = word;
            }
        }
        return ans;

    }
}