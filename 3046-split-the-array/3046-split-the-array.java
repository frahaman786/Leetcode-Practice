class Solution {
    public boolean isPossibleToSplit(int[] nums) {
         int n = nums.length;
        
            HashMap<Integer, Integer> freq = new HashMap<>();
            for(int j = 0; j < n; j++){
                freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
            }
            for(int x : freq.keySet()){
                if(freq.get(x) > 2){
                    return false;
                }
            }
        
        
        return true;
    }
}