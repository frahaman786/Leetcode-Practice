class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sol = new ArrayList<>();
        int n = nums.length;
        int start = 0;
        for(int i = 0; i < n; i++){
            if(i == n-1 || nums[i] + 1 != nums[i+1]){ //we use opposite condition so when condition true then i wil add other wise if i write == then if first element meet the condition then immediately add and leave
                if(start == i){
                    sol.add(String.valueOf(nums[start]));
                }else{
                    sol.add(nums[start]+ "->" + nums[i]);
                }
                start = i+1;
            }
            
        }
        return sol;
    }
}