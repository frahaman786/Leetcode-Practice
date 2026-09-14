class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int low = 1;
        int high = x;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            long sqr = (long)mid*mid;
            if(sqr == x){
                return mid;
            }
            if(sqr > x){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return high;
    }
}