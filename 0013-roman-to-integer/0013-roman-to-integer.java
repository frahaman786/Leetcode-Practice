class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for(int i = 0; i < s.length()-1; i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if(map.get(first) >= map.get(second)){
                result += map.get(first);
            }else{
                result -= map.get(first);
            }
        }
        result += map.get(s.charAt(s.length() - 1));
        return result;
    }
}