class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
            int lowerCount = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            
            if(Character.isUpperCase(ch)){
                upperCount++;
            }
            else if(Character.isLowerCase(ch)){
                lowerCount++;
            }
            
        } 
        //if all uppercase
        if(word.length() == upperCount){
            return true;
        } 
        //if all small 
        if (word.length() == lowerCount) {
            return true;
        
        }

        //for first chaaracter capital and other side small then this will run
        if(Character.isUpperCase(word.charAt(0)) && lowerCount == word.length() - 1){
            return true;
        }
        return false;
    }
}