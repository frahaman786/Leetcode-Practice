class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicetotal = 0;
        int bobTotal = 0;
        for(int i = 0; i < aliceSizes.length; i++){
            alicetotal += aliceSizes[i];
        }
        for(int j = 0; j < bobSizes.length; j++){
            bobTotal += bobSizes[j];
        }
        for(int i = 0; i < aliceSizes.length; i++){
            for(int j = 0; j < bobSizes.length; j++){
                int aliceNewSum = alicetotal - aliceSizes[i] + bobSizes[j];
                int bobnewsum = bobTotal - bobSizes[j] +aliceSizes[i];

                if(aliceNewSum == bobnewsum){
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
            
        }
        return new int[0];
    }
}