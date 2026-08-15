class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> sol = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(sol.contains(nums[i])){
                return true;
            }
            sol.add(nums[i]);
        }
        return false;
    }
}