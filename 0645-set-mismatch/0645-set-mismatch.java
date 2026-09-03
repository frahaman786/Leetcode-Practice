class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> sol = new HashMap<>();
        int n = nums.length;
        int missing = -1;
        int duplicate = -1;
        for(int i : nums){
            sol.put(i, sol.getOrDefault(i, 0)+1);
        }
        for(int i = 1; i <= n; i++){
            if(sol.containsKey(i)){
                if(sol.get(i) == 2){
                    duplicate = i;
                }
            }else{
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
    }
}