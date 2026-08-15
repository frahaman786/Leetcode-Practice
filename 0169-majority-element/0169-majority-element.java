class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> sol = new HashMap<>();
        for(int i = 0; i < n; i++){
            sol.put(nums[i], sol.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer>entry : sol.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}