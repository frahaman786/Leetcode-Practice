class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] word = text.split(" ");
        int count  = 0;
        for(int i = 0; i < word.length; i++){
            boolean canType = true;
            for(int j = 0; j < brokenLetters.length(); j++){
                if(word[i].indexOf(brokenLetters.charAt(j)) != -1){
                    canType = false;
                    break;
                }
            }
            if(canType){
                count++;
            }
        }
        return count;
    }
    
}