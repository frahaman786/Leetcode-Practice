class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int allow = n/2;
        
        Set<Integer> map = new HashSet<>();
        for(int i = 0; i < n; i++){
            map.add(candyType[i]);
        }
        return Math.min(map.size(), allow);

        
    }
}