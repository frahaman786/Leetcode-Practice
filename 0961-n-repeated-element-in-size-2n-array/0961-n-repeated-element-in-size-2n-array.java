class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int maxInt = 0;
        int maxCount = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > maxCount){
                maxCount = e.getValue();
                maxInt = e.getKey();
            }
        }
        return maxInt;

    }
}