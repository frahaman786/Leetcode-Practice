class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> sol = new HashMap<>();
        int res = 0;
       
        for(int i : nums){
            sol.put(i, sol.getOrDefault(i, 0) + 1);
        }
        for(int i : sol.keySet()){
            if(sol.containsKey(i+1)){
                res = Math.max(res, sol.get(i) + sol.get(i+1));
            }
        }
        return res;
    }
}