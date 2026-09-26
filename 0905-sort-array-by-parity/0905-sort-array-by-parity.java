class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        for(int find = 0; find < nums.length; find++){
            if(nums[find] % 2 == 0){
                int temp = nums[start];
                nums[start] = nums[find];
                nums[find] = temp;
                start++;
            }
        }
        return nums;
    }
}