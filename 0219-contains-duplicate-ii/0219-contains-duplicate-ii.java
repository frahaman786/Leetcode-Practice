class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /* int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j] && j-i <= k){
                    return true;
                }
            }
        }
        return false; */
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int oldIndex = map.get(nums[i]);
                if( i - oldIndex <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}