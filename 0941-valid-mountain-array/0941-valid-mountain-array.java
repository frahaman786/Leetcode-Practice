class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3) return false;
        //for increasing
        int i = 0;
        for(; i < n-1; i++){
            //if increasing continue
            if(arr[i] < arr[i+1]){
                continue;
            }else{
                break;
            }
            

        }
        //checking peek value if it n-1 means 2,5,5 so here peek 5 is n-1 so it it not possible valid mountain
        if( i == 0 || i == n-1){
                return false;
        }
        // fro decreasing 
        for(; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;

    }
}